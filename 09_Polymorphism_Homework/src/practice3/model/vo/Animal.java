package practice3.model.vo;

//abstract �߻� �޼��带 ����ϱ� ���ؼ��� class�� �߻� Ŭ�������� ��
public abstract class Animal {
//�ʵ�
	private String name;
	private String kinds;
//�޼���
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	//Getter
	public String getName() {
		return name;
	}
	public String getKinds() {
		return kinds;
	}
	//������(�⺻)
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	//������(�ʼ�)
	public Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}
	//toString
	@Override
	public String toString() {
		return "���� �̸��� " + name + " �̰�, ������ " + kinds + " �Դϴ�.";
	}
	//abstract
	public abstract void speak();
}
