import { initAsnc, getApproveList, getReferenceList } from './applyCommon.js';
import { applyService } from '../apis/applyAPI.js';

const element = {
    submit: document.querySelector('#submit'),
    title: document.querySelector('#title'),
    startDate: document.querySelector('#startDate'),
    endDate: document.querySelector('#endDate'),
    reason: document.querySelector('#reason'),
};

element.submit.addEventListener('click', () => {
    const references = getReferenceList();
    const approves = getApproveList();

    const template = {
        type: 'VACATION',
        title: element.title.value,
        startDate: element.startDate.value,
        endDate: element.endDate.value,
        reason: element.reason.value,
        refList: references,
        approverList: approves,
    };

    applyService.createTemplate(template, () => {
        alert('결재 신청이 완료되었습니다.');
        location.href = 'http://localhost:3200/approve/main';
    });
});

initAsnc();
