
public class DefaultGameConnectHelper extends AbstractGameConnectHelper {

	@Override
	protected String doSecurity(String str) {
		System.out.println("��ȭ�� �˰������� �̿��� ���ڵ�");
		return str;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("���̵�/��ȣ Ȯ�� ����");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("���� Ȯ��");
		// �������� �����̸� ������ ���̸� �� �� �ִ�.
		// ���̸� Ȯ���ϰ� �ð��� Ȯ���ϰ� ������ �ƴϰ� 10�ð� �����ٸ�
		// ������ ���� ������ �Ѵ�.
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("������ ���Ӵܰ�");
		return info;
	}

}