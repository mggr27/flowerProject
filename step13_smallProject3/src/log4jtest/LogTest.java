package log4jtest;

import org.apache.log4j.Logger;
   
public class LogTest {
	//�ټ��� �޼ҵ���� �α� ����� ���� ������ ���� ��� ������ �α� ��� ��ü ����
	//�� ��ü�� Ȱ���ϱ� ���ؼ��� �޼ҵ��� �Ķ���ͷ� ��Ű����.class���� �����ؼ� �ش� class���� �α� ���
	static Logger logger = Logger.getLogger("log4jtest.LogTest");
	
	
	//id�� �����ϴ� ������ �޼ҵ�� ����, id�� master�� �ƴ϶�� warn(���)�޽���
	//id�� master��� �����ڿ��� master�� �α��� �ߴٴ� �޽���
	
	public static void loginCheck(String id) {
		if(id.equals("master")){ //������ �޼ҵ�� ������ Ȯ���ϴ� ���
			// ..end user���� ���� �޽��� ��� ������ �ִٰ� �����ϰ�
			logger.trace("trace - master �α��� �ߴ�~~");
			logger.debug("debug - master �α��� �ߴ�~~");
			logger.info("info - master �α��� �ߴ�~~");
			logger.warn("warn - master �α��� �ߴ�~~");
			logger.error("error - master �α��� �ߴ�~~");
		}else {
			//���� ���
			logger.warn("warn - user�� �߸� �Է� Ȥ�� ��Ŀ? Ȯ�� �غ���");
		}
	}
	
	public static void main(String[] args) {
		LogTest.loginCheck("master");

	}


	

}
