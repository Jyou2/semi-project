package com.kh.common.code;

public enum ErrorCode {

	GR01("그룹정보를 입력하는 도중 에러가 발생하였습니다."),
	GR02("그룹에 가입하는 도중 에러가 발생하였습니다."),
	GR03("그룹 가입 거절 도중 에러가 발생하였습니다."),
	GR04("그룹 정보를 수정 중 에러가 발생하였습니다."),
	MR01("그룹 매칭 도중 에러가 발생하였습니다.","back"),
	MR02("매칭된 그룹에 등록하는 도중 에러가 발생하였습니다.","back"),
	MR03("그룹의 매칭정보를 변경하는 도중 에러가 발생하였습니다.","back"),
	MR04("해당 조건을 만족하는 그룹을 찾지 못하였습니다.","back"),
	MR05("매칭 정보를 조회하는 도중 에러가 발생하였습니다."),
	MR06("매칭 정보를 수정하는 도중 에러가 발생하였습니다."),
	SSC01("서비스 코드를 조회하는 도중 에러가 발생하였습니다."),
	SG01("그룹정보를 조회하는 도중 에러가 발생하였습니다."),
	SG02("그룹 대기 정보를 조회하는 도중 에러가 발생하였습니다."),
	SM01("회원정보를 조회하는 도중 에러가 발생하였습니다.", "/member/login"),
	SM02("ID 혹은 PW가 틀렸습니다.", "/member/login"),
	IM01("회원정보를 입력하는 도중 에러가 발생하였습니다.", "/member/join"),
	UM01("회원정보를 수정하는 도중 에러가 발생하였습니다."),
	DM01("회원정보를 삭제하는 도중 에러가 발생하였습니다."),
	IB01("게시판 정보를 입력하는 중 에러가 발생하였습니다.", "/index"),
	SB01("게시판 정보를 조회하는 중 에러가 발생하였습니다."),
	UB01("게시판을 수정하던 중 에러가 발생하였습니다."),
	DB01("게시판을 삭제하던 중 에러가 발생하였습니다."),
	PB01("게시판 페이지를 처리하던 중 에러가 발생하였습니다."),
	IR01("신고 정보를 입력하는 중 에러가 발생하였습니다."),
	UR01("신고 정보를 수정하는 중 에러가 발생하였습니다."),
	IF01("파일 정보를 입력하는 중 에러가 발생하였습니다.", "/index"),
	SF01("파일 정보를 조회하는 중 에러가 발생하였습니다."),
	PR01("프로시저를 실행하는 중 에러가 발생하였습니다."),
	AUTH01("접근 권한이 없는 페이지 입니다."),
	AUTH02("인증 기간이 만료 되었습니다"),
	MAIL01("이메일 발송 중 에러가 발생하였습니다"),
	HTTP01("Http 통신 중 에러가 발생하였습니다"),
	CD_404("존재하지 않는 경로 입니다"),
	KAKAO01("카카오 로그인 중 에러가 발생하였습니다.");
	
	public String errMsg;
	public String url = "/index";
	
	//에러 발생시 index로 이동
	ErrorCode(String errMsg){
		this.errMsg = errMsg;
	}
	
	//에러 발생시 지정한 url페이지로 이동
	ErrorCode(String errMsg,String url){
		this.errMsg = errMsg;
		this.url = url;
	}
}