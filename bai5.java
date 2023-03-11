package bai2;
 
import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, tong = 0;
		while (tong < 100) {
		System.out.println("Nhap so nguyen");
		a = sc.nextInt();
		tong += a;
		}
		System.out.println("Tong cua cac so vua nhap la:" + tong);
	}
		
}
