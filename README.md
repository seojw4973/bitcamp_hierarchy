# (주)위계질서

FEAT. 동치미회사

Welcome to 동치미회사 👋

## 기획 의도

![view](images/projectBackground.png)

## 팀원 소개

| 김융&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                    | 유민진&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                  | 서주원                                                                                                                                                                                                     | 이경석                                                                                                                                                                                                                                                                                                          | 안슬기 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | 최병민 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 프론트엔드                                                                                                                                                   | 프론트엔드                                                                                                                                                                  | 백엔드                                                                                                                                                                                                     | 백엔드                                                                                                                                                                                                                                                                                                          | 프론트엔드<br> 백엔드                                                                                                     | 백엔드                                                                                                                                                                                                                                          |
| 1. 화면 구현 <br> - 결재 메인 <br> - 신청서 <br> - 결재 대기 목록 <br> 2. JS 작업 <br> 3. 프론트 연동 작업 <br> - 마이페이지 <br> - 사원등록 <br> - 로그아웃 | 1. 전반적 퍼블리싱 제작 <br> 2. 화면구현 <br> - 로그인 <br> - 사원 등록 <br> - 내 정보 <br> - 내 정보 수정 <br> - 쪽지 모달 <br> 3. 모달 페이지 관련 JS <br> 4. 로고 디자인 | 1. Spring Security를 활용한 로그인, 로그아웃 기능 <br> 2. 마이페이지 및 내 정보 수정 기능 <br> 3. 사원 회원 가입 기능 <br> 4. 프론트/백 연동 작업 <br> - 마이페이지 <br> - 사원등록 <br> - 로그인/로그아웃 | 1. DB ERD 설계 및 DB서버 구축 <br> 2. FrontEnd Node.js 서버 구축 <br> 3. 결재 시스템 기능 구현(JS 포함) <br> - 결재 문서 작성 <br> - 상세 페이지 조회 <br> - 결재, 반려 기능 <br> - 임시 저장 시스템 <br> 4. 네이버 클라우드 활용 프로필 이미지 삽입 <br> 5. 백엔드 프론트엔드 네이버 클라우드 플랫폼 서버 배포 | 1. 프론트 공통 퍼블리싱 제작 <br> 2. 나의 신청 목록 기능 백, 프론트 담당 <br> 3. 대기중인 목록 기능 백, 프론트 담당       | 1. 조직도 그래프 API <br> 2. 나의 부서 연락망 <br> 3. 쪽지 관련 기능 <br> - 결재 문서 작성 기능 <br> - 받은/보낸 쪽지함 <br> - 무한 스크롤 <br> - 쪽지 내용 가져오기 <br> - 쪽지 확인 및 삭제 <br> - 새로운 쪽지 알림 <br> 4. 쪽지 관련 연동 JS |

## 프로젝트 구조

![view](images/projectStructure.png)

-   node.js 18.04

-   Java 17
-   Spring boot 3.2.5

-   mongoDB 4.2
-   mariaDB ver..

## ERD

### MariaDB ERD

![view](images/mariaERD.png)

-   User : 사용자 정보 테이블
-   Message : 쪽지 내역 테이블
-   Ref : 문서 결재 완료, 참조, 반려 정보 테이블
-   TaskProgress : Ref 테이블과 데이터는 같으나 결재가 진행 중인 정보. 삭제와 삽입이 반복되는 특징을 가져서 테이블 분리
-   Document : 결재 문서 메타 데이터 테이블

### MongoDB ERD

![view](images/mongoERD.png)

-   휴가, 출장, 보고서, 경비 결재 문서가 각기 다른 스키마로 한 컬렉션 내부에 저장됨

### 페이지 설계

![view](images/figma.png)

## 페이지 구성
