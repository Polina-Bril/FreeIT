package lesson2;

//���� ����������� 4������� �����. ����� ��, ��� ��� ����� ����� ��������?

public class Homework5book {

	public static void main(String[] args) {
		
		int n = 1994;
		if ((n/1000)%10==(n/100)%10||(n/1000)%10==(n/10)%10||(n/1000)%10==n%10||(n/100)%10==(n/10)%10||(n/100)%10==n%10||(n/10)%10==n%10)
			System.out.println("� ����� ���� ���������� �����");
		else
			System.out.println("��� ����� ����� ��������");

	}

}
