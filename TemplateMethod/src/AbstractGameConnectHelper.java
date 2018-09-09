
/**
 * 게임 접속 관련 추상클래스.
 * 
 * requestConnection을 참고하여
 * 
 * doSecurity, authentication, authorization, connection을 적절하게 
 * 구현 할것.
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
	 * 템플릿 메소드
	 * 
	 * 핵심 : 공통적인 프로세스를 묶어주는 메소드.
	 * @param str
	 * @return
	 */
	public String requestConnection(String encodedInfo) {
		
		// 보안 과정 -> 암호화 된 문자열을 복호화
		String decodedInfo = doSecurity(encodedInfo);
		
		// 인증 과정 -> 반환 된 문자열을 가지고 아이디, 암호를 할당한다.
		String id = "";
		String password = "";
		
		if(!authentication(id, password)) {
			throw new Error("인증 실패");
		}
		
		String userName = "";
		int auth = authorization(userName);
		
		switch(auth) {
			case -1:
				throw new Error("미성년자는 접속 셧다운");
			case 0: // 게임 매니저
				break;
			case 1: // 유료 회원
				break;
			case 2: // 무료 회원
				break;
			case 3: // 권한 없음
				break;
			default: // 기타 상황
				break;
		}
		
		
		return connection(decodedInfo);
	}
	

}
