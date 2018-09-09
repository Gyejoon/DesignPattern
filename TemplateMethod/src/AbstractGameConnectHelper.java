
/**
 * ���� ���� ���� �߻�Ŭ����.
 * 
 * requestConnection�� �����Ͽ�
 * 
 * doSecurity, authentication, authorization, connection�� �����ϰ� 
 * ���� �Ұ�.
 * 
 * @author KJY
 *
 */
public abstract class AbstractGameConnectHelper {
	
	protected abstract String doSecurity(String str);
	
	protected abstract boolean authentication(String id, String password);
	
	protected abstract int authorization(String userName);
	
	protected abstract String connection(String info);
	
	/**
	 * ���ø� �޼ҵ�
	 * 
	 * �ٽ� : �������� ���μ����� �����ִ� �޼ҵ�.
	 * @param str
	 * @return
	 */
	public String requestConnection(String encodedInfo) {
		
		// ���� ���� -> ��ȣȭ �� ���ڿ��� ��ȣȭ
		String decodedInfo = doSecurity(encodedInfo);
		
		// ���� ���� -> ��ȯ �� ���ڿ��� ������ ���̵�, ��ȣ�� �Ҵ��Ѵ�.
		String id = "";
		String password = "";
		
		if(!authentication(id, password)) {
			throw new Error("���� ����");
		}
		
		String userName = "";
		int auth = authorization(userName);
		
		switch(auth) {
			case -1:
				throw new Error("�̼����ڴ� ���� �˴ٿ�");
			case 0: // ���� �Ŵ���
				break;
			case 1: // ���� ȸ��
				break;
			case 2: // ���� ȸ��
				break;
			case 3: // ���� ����
				break;
			default: // ��Ÿ ��Ȳ
				break;
		}
		
		
		return connection(decodedInfo);
	}
	

}
