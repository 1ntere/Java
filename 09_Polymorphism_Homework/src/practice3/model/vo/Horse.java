package practice3.model.vo;

public class Horse extends Animal {
//�ʵ�
	private String location;
	private String color;
//�޼���
	//Setter
	public void setLocation(String location) {
		this.location = location;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//Getter
	public String getLocation() {
		return location;
	}
	public String getColor() {
		return color;
	}
	//������(�⺻)
	public Horse() {
		
	}
	//������(�ʼ�)
	public Horse(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}
	//@Override
	@Override
	public void speak() {
		System.out.println(super.toString()
				+ " " + location + " �� �����ϸ� , ������ " + color + " �Դϴ�.");
	}
}