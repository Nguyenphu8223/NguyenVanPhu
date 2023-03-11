package bai2;

import java.util.Scanner;

public class bai8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, arr[], tong=0;
		float tbc;
		do {
		System.out.println("nhap so phan tu cua day");
		a = sc.nextInt();
	}while(a<0);
		arr= new int[a];
		for(int i = 0;i < a;i++) {
			System.out.println("Nhap phan tu thu " + (i+1) + " :");
			arr[i] = sc.nextInt();
			tong += arr[i];
			
		}
		tbc = (float) tong/a;
		System.out.printf("Trung binh cong la: %.2f\n", tbc);
}
}
