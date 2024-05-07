package com.kh.IteratorEx;

import java.util.*;//java ���� �ؿ� util ���� �Ʒ� �ִ� ��� ������ �ҷ���
/*���� ��ġ�� ������ ��
������ ���� ��ġ���� ���� ������ ������ ���� * �� ����ؼ� ��� �������⸦ ���ش�.
* : ��ü����

��뿹��
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Iterator;
	
	=> import java.util.*
		(�ڵ尡 3�ٿ��� 1�ٷ� ����)
*/

public class IteratorPre {

	public static void main(String[] args) {
		//100, 10, 20, 30, 50, 70
		
		//���ڸ� �߰��ϴ� ��� 1 - Arrays.asList();
		ArrayList<Integer> ���ڵ� = new ArrayList<>(Arrays.asList(100, 10, 20, 30, 50));
		
		//���ڸ� �߰��ϴ� ��� 2 - add();
		���ڵ�.add(70);
		
		//Iterator ����
		Iterator<Integer> �ݺ��ϱ� = ���ڵ�.iterator();
		
		//while�� ����ؼ� hasNext()�� ���� ��Ұ� �ִ��� Ȯ���ϰ� next()�� ����ϱ�
		while (�ݺ��ϱ�.hasNext()) {
			System.out.println(�ݺ��ϱ�.next());
		}
	}
}
