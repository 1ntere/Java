package practice3.model.vo;

//���� �߻�Ŭ���� ��������
public class Dog extends Animal {
//�ʵ�
	public static final String PLACE = "�ְ�ī��";
	private int weight;
//�޼���
	//Setter
		//Setter�� ������ ���� �ٲ��ִ� ����
		//PLACE�� ������� Setter�� ����
	public void setWeight(int weight) {
		this.weight = weight;
	}
	//Getter
	public static String getPlace() {
		return PLACE;
	}
	public int getWeight() {
		return weight;
	}
	//������ (�⺻) : ctrl + space -> enter
	public Dog() {
		
	}
	//������ (�ʼ�) : alt + shift + s -> o
	public Dog(String name, String kinds, int weight) {
		super(name, kinds); //Animal �ؿ� �̹� �����ϴ� �ʵ��� name�� kinds�� �ٶ󺸰� �ϱ� ���ؼ�
		this.weight = weight;
	}
	//@Override speak : ctrl + space
	@Override
	public void speak() {
		System.out.println(super.toString()+" �����Դ� "+weight+" kg �Դϴ�.");
	}
}
