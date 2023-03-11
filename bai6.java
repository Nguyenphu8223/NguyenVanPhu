package bai2;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, gt = 1;
		do {
			System.out.println("Nhap so nguyen duong: ");
			a = sc.nextInt();
		}while (a<0);
		for (int i = 1; i<=a; i++) {
			gt *= i;
		}
		System.out.println("giai thua cua " +a+ " la:"+gt);
		
				
	}

}
