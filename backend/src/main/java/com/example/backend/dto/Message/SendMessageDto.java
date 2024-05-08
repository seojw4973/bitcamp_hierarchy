package com.example.backend.dto.Message;

import com.example.backend.entity.maria.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SendMessageDto {

    @NotEmpty
    private String message;

    @NotEmpty
    private String senderEmail;

    @NotEmpty
    private String receiverEmail;

    @NotEmpty
    private String receiverName;
}
