package lesson3;

public class Task17book {

//	Создать двухмерный квадратный массив, и заполнить его «бабочкой»,

	public static void main(String[] args) {
		int n = 5;
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length / 2 + 1; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((j < i) || (j >= (arr[i].length - i)))
					arr[i][j] = 0;
				else
					arr[i][j] = 1;
			}
		}
		for (int i = arr.length - 1; i >= arr.length / 2; i--) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((j < (arr[i].length - 1 - i)) || (j > i))
					arr[i][j] = 0;
				else
					arr[i][j] = 1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(" ");
		}

	}
}
