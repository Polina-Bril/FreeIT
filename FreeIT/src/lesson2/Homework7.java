package lesson2;

// � ���������� ����������� ���������� �������������. � ����������� �� ���������� ������������� 
//���������� ������� ��������� ���������. ����.: � 2 ������������ � 1 ����������� � 10 ������������� � � �.�.

public class Homework7 {

	public static void main(String[] args) {
		
		int n=9;
		if (n%10==1&&n!=11)
			System.out.println(n+" �����������");
		else if(n%10>=2&&n%10<=4&&n!=11&&n!=13&&n!=14)
			System.out.println(n+" ������������");
		else 
			System.out.println(n+" �������������");

	}

}
