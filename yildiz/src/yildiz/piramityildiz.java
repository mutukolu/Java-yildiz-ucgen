package yildiz;

import java.util.Scanner;

public class piramityildiz {
	public static void main(String[] args) {
	
	Scanner scan =  new Scanner(System.in);
	System.out.print("İstenilen satir sayısını giriniz = ");
	int sayi = scan.nextInt();
	
	for (int satir = 0 ; satir<sayi ; satir++) {
		
		for (int aralik =0 ; aralik<sayi-(satir+1) ; aralik++) {
			System.out.print(" ");
			
		}
		
		for (int yildiz =0 ; yildiz<1+(satir*2) ; yildiz++) {
			System.out.print("*");
			
	}
		System.out.println();
	}
	
	}

}
