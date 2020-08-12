package lesson5;

import java.util.Scanner;

public class Tictactoe {

	static String game[][] = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
	static int count = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Игрок 1, выберите, чем вы будете играть. Нажмите 1 - если Х. Нажмите 2 - если О");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("Игрок 2, вы будете играть 0. Х ходит первым!");
		} else {
			System.out.println("Игрок 2, вы будете играть Х. Х ходит первым!");
		}
		hodX();
		for (int i = 1; i <= 4; i++) {
			hodO();
			check("O");
			if (count == 3)
				break;
			hodX();
			check("X");
			if (count == 3)
				break;
		}
		if (count == 0) {
			System.out.println("Ничья. Никто не выиграл.");
		}
		System.out.println("Конец игры!");
		sc.close();
	}

	static void hodX() {
		System.out.println("Х - сделайте ваш ход. Выберите и введите ячейку, куда хотите поставить Х");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(game[i][j] + " ");
			}
			System.out.println();

		}
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		switch (k) {
		case 1:
			if (game[0][0] == "O") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodX();
			} else {
				game[0][0] = "X";
			}
			break;
		case 2:
			if (game[0][1] == "O") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodX();
			} else {
				game[0][1] = "X";
			}
			break;
		case 3:
			if (game[0][2] == "O") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodX();
			} else {
				game[0][2] = "X";
			}
			break;
		case 4:
			if (game[1][0] == "O") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodX();
			} else {
				game[1][0] = "X";
			}
			break;
		case 5:
			if (game[1][1] == "O") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodX();
			} else {
				game[1][1] = "X";
			}
			break;
		case 6:
			if (game[1][2] == "O") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodX();
			} else {
				game[1][2] = "X";
			}
			break;
		case 7:
			if (game[2][0] == "O") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodX();
			} else {
				game[2][0] = "X";
			}
			break;
		case 8:
			if (game[2][1] == "O") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodX();
			} else {
				game[2][1] = "X";
			}
			break;
		case 9:
			if (game[2][2] == "O") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodX();
			} else {
				game[2][2] = "X";
			}
			break;
		default:
			System.out.println("Неправильно введен номер ячейки");
			hodX();
		}
	}

	static void hodO() {
		System.out.println("0 - сделайте ваш ход. Выберите и введите ячейку, куда хотите поставить 0");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(game[i][j] + " ");
			}
			System.out.println();

		}
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		switch (l) {
		case 1:
			if (game[0][0] == "X") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodO();
			} else {
				game[0][0] = "O";
			}
			break;
		case 2:
			if (game[0][1] == "X") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodO();
			} else {
				game[0][1] = "O";
			}
			break;
		case 3:
			if (game[0][2] == "X") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodO();
			} else {
				game[0][2] = "O";
			}
			break;
		case 4:
			if (game[1][0] == "X") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodO();
			} else {
				game[1][0] = "O";
			}
			break;
		case 5:
			if (game[1][1] == "X") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodO();
			} else {
				game[1][1] = "O";
			}
			break;
		case 6:
			if (game[1][2] == "X") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodO();
			} else {
				game[1][2] = "O";
			}
			break;
		case 7:
			if (game[2][0] == "X") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodO();
			} else {
				game[2][0] = "O";
			}
			break;
		case 8:
			if (game[2][1] == "X") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodO();
			} else {
				game[2][1] = "O";
			}
			break;
		case 9:
			if (game[2][2] == "X") {
				System.out.println("Эта ячейка уже занята! Выберите другую!");
				hodO();
			} else {
				game[2][2] = "O";
			}
			break;
		default:
			System.out.println("Неправильно введен номер ячейки");
			hodO();
		}
	}

	static void check(String symbol) {
		if ((game[0][0] == symbol && game[0][1] == symbol && game[0][2] == symbol)
				|| (game[1][0] == symbol && game[1][1] == symbol && game[1][2] == symbol)
				|| (game[2][0] == symbol && game[2][1] == symbol && game[2][2] == symbol)
				|| (game[0][0] == symbol && game[1][0] == symbol && game[2][0] == symbol)
				|| (game[0][1] == symbol && game[1][1] == symbol && game[2][1] == symbol)
				|| (game[0][2] == symbol && game[1][2] == symbol && game[2][2] == symbol)
				|| (game[0][0] == symbol && game[1][1] == symbol && game[2][2] == symbol)
				|| (game[0][2] == symbol && game[1][1] == symbol && game[2][0] == symbol)) {
			System.out.println(symbol + " выиграл!!! Поздравляем!!!");
			count = 3;
		}
	}
}
