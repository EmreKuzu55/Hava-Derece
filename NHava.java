package sa;

import java.util.Scanner;

public class Not {

	public static void main(String[] args) {

		int temp;

		Scanner input = new Scanner(System.in);
		System.out.print("Bugünün sıcaklık değerini giriniz :");
		temp = input.nextInt();

		if (temp < 5) {
			System.out.println("Kayak yapabilirsiniz");
		} else if (temp <= 25) {
			if (temp <= 15) {
				System.out.println("Sinemaya gidebilirsiniz");
			}
			if (temp >= 10) {
				System.out.println("Pikniğe gidebilirsiniz");
			}

		} else {
			System.out.println("Yüzmeye gidebilirsiniz");
		}

	}

}
