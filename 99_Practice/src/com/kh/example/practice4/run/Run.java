package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		//�л� ��ü ����
		Student st = new Student();
		
		st.setGrade(3);
		st.setClassroom(6);
		st.setName("ȫ�浿");
		st.setHeight(200);
		st.setGender('��');
		
		//void information
		st.information();
	}
}
