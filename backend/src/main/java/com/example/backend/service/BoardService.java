package com.example.backend.service;

import com.example.backend.dto.board.MyListDto;
import com.example.backend.dto.board.WaitDto;
import com.example.backend.dto.template.TemplateResponseDto;
import com.example.backend.entity.maria.User;
import com.example.backend.entity.maria.enumData.DocState;
import com.example.backend.entity.maria.enumData.DocType;
import com.example.backend.entity.mongo.AccountingExpense;
import com.example.backend.entity.mongo.Template;
import com.example.backend.entity.mongo.TypeData;
import com.example.backend.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class BoardService {

    private final DocumentRepository documentRepository;
    private final TemplateRepository templateRepository;
    private final UserRepository userRepository;

    public Slice<MyListDto> getMyList(User user, Pageable pageable){

        return documentRepository.findByWriter(user, pageable);
    }

    public Slice<WaitDto> getRefList(User user, Pageable pageable, DocState state){

        List<DocState> stateList = Arrays.asList(DocState.REFERENCE, DocState.DENY, DocState.COMPLETE);

        return documentRepository.findByState(user, pageable, stateList);
    }

    public Slice<WaitDto> getApproveList(User user, Pageable pageable, DocState state){

        List<DocState> stateList = Arrays.asList(DocState.PROCESS_1, DocState.PROCESS_2, DocState.PROCESS_3);

        return documentRepository.findByStateIn(user, pageable, stateList);
    }

    /**
     * 문서를 찾아서 ResponseDto로 변환하여 반환
     * @param documentId 문서 ID 값
     * @return 문서를 Dto로 전환하여 반환
     */
    public TemplateResponseDto<? extends TypeData> getTemplateResponseDto(String documentId) {

        Template<? extends TypeData> template = templateRepository.findById(documentId).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 문서입니다."));

        log.info(template);
        TemplateResponseDto<? extends TypeData> templateResponseDto = chgTemplateResonseDto(template);

        log.info(templateResponseDto);
        
        return templateResponseDto;

    }

    public TemplateResponseDto<? extends TypeData> chgTemplateResonseDto(Template<? extends TypeData> template) {

        String writer = formatName(userRepository.findById(template.getWriter()).orElseThrow(() -> new IllegalArgumentException("error")));


        List<String> refs = userRepository.findAllById(template.getRefList())
                .stream().map((user) -> formatName(user)).toList();

        log.info(refs);

        List<String> approvers = userRepository.findAllById(template.getApproverList())
                .stream().map((user) -> formatName(user)).toList();

        log.info(approvers);

        return template.toTemplateResponseDto(writer, refs, approvers);
//        if(type == DocType.ACCOUNTINGEXPENSE)
//            templateResponseDto = template.toTemplateResponseDto();
//        if(type == DocType.BUSSINESSTRIP)
//            null;
//        if(type == DocType.REPORT)
//            null;
//        if(type == DocType.VACATION)
//            null;
//        return null;
    }

    public String formatName(User user) {
        return user.getName() + " " + user.getPosition();
    }
    
    
}
