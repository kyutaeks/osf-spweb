package com.osf.web.controller;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Exam {
	// private final static log log = logFactory.getlog(Exam.class);
	public String str;

	/*
	 * Log4j level 순서 
	 * 1. TRACE : 상세한정보 
	 * 2. DEBUG : 개발할때 필요한 정보 
	 * 3. INFO : 말그대로 정보 서버가 켜지면 몇초만에 켜졌다. 어떤 프로젝트가 돌아가고있다. 등등.. 
	 * 4. WARN : 위험! 동작은 하지만 뭔가 위험해!! 
	 * 5. ERROR : 말그대로 에러 500에러라던지 500에러같은 500에러 
	 * 6. FATAL : 치명적인 에러 서버가 갑자기 중단되거나 할때 나타나는 메시지
	 */
	public static void main(String[] args) {
		String str = null;

		if ("홍길동".equals(str)) {
			log.info("나는 홍길동이야!");
		} else {
			log.debug("안녕하세요 : 저는 디버그입니다.");
			log.info("나는 홍길동이 아니야!");
			log.warn("나는 매우 위험한 경고야!");
		}
	}
}
