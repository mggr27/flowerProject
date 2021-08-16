package log4jtest;

import org.apache.log4j.Logger;
   
public class LogTest {
	//다수의 메소드들이 로그 기록을 위한 설정을 위해 멤버 변수로 로그 기록 객체 생성
	//이 객체를 활용하기 위해서는 메소드의 파라미터로 패키지명.class명을 적용해서 해당 class에서 로그 기록
	static Logger logger = Logger.getLogger("log4jtest.LogTest");
	
	
	//id를 검증하는 로직의 메소드라 가정, id가 master가 아니라면 warn(경고)메시지
	//id가 master라면 관리자에게 master가 로그인 했다는 메시지
	
	public static void loginCheck(String id) {
		if(id.equals("master")){ //이퀄스 메소드는 같은지 확인하는 기능
			// ..end user에게 정상 메시지 출력 로직이 있다고 가정하고
			logger.trace("trace - master 로그인 했다~~");
			logger.debug("debug - master 로그인 했다~~");
			logger.info("info - master 로그인 했다~~");
			logger.warn("warn - master 로그인 했다~~");
			logger.error("error - master 로그인 했다~~");
		}else {
			//오류 출력
			logger.warn("warn - user가 잘못 입력 혹시 해커? 확인 해보자");
		}
	}
	
	public static void main(String[] args) {
		LogTest.loginCheck("master");

	}


	

}
