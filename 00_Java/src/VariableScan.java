import java.util.Scanner;

public class VariableScan {

	public static void main(String[] args) {
		// ����ڿ��� �Է¹��� ������ ����
		// Scanner�� �̿��ؼ� �Է¹��� ������ ��ǻ�Ϳ� ǥ������
		// System.in�� ����ؼ� Ű���� �Է��� �о�� �� ���
		// Scanner �ڷ��� �ڸ��� int�� String�̳� �Ǽ� boolean����
		// Ȯ����� ��Ÿ�� �� ���� ������ �ʱ⿡�� Scanner��� ���
		
		// nextLine() : ���� �Ǵ� ���͸� ġ�� �������� ���� ��ü�� �Է� �޴´�.
		// �Էµ� ���ڸ� ��� �� �����´�. (����, Ư������ �� ��� ������)
				
		Scanner sc = new Scanner(System.in);
		//����ڰ� ��ǻ�Ϳ� �Է��� �� �ְ� ��ǻ�Ϳ� ���ο� ������ ����
		System.out.println("������� �̸��� �Է��ϼ���.");//����ڰ� �̸��� �Է��ϰ� ��
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("������� ��� ���� �Է��ϼ���.");
		String live = sc.nextLine();
		System.out.println(live);
		
		System.out.println("������� �ڵ��� ��ȣ�� �Է��ϼ���.");
		String phoneNumber = sc.nextLine();
		System.out.println(phoneNumber);
		
		// Scanner String�� ����ؼ�
		// ������� Ű, ������� ����, ������� �г����� �Է¹ޱ�
		
		// ������� Ű String height
		// ������� ���� String age
		// ������� �г��� String nickName
		
		//Scanner sc = new Scanner(system.in);
		
		System.out.println("������� Ű�� �Է��ϼ��� : ");
		String height = sc.nextLine();
		System.out.println(height);
		
		System.out.println("������� ���̸� �Է��ϼ��� : ");
		String age = sc.nextLine();
		System.out.println(age);
		
		System.out.println("������� �г����� �Է��ϼ��� : ");
		String nickName = sc.nextLine();
		System.out.println(nickName);
	}

}
