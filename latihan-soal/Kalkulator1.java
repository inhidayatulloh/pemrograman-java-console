/* Programmer			: Indra Hidayatulloh
   Tanggal dibuat		: 30 Maret 2020
   Github/Youtube/Twitter/FB/IG	: inhidayatulloh
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Kalkulator1 {
	
	static double penjumlahan(double paramBil1, double paramBil2) {
		return paramBil1 + paramBil2;
	}
	
	static double pengurangan(double paramBil1, double paramBil2) {
		return paramBil1 - paramBil2;
	}
	
	static double perkalian(double paramBil1, double paramBil2) {
		return paramBil1 * paramBil2;
	}
	
	static double pembagian(double paramBil1, double paramBil2) {
		return paramBil1 / paramBil2;
	}
	
	public static void main(String[] args) {
		final String format = "###.###";
		final DecimalFormat df = new DecimalFormat(format);
		
		Scanner scan = new Scanner(System.in);
		double bilangan1 = 0.0, bilangan2 = 0.0, hasil = 0.0;
		char operator = ' ', yT = ' ';
		boolean ulangA = true, ulangB;
		
		while(ulangA) {
			ulangB = true;
			while(ulangB) {
				System.out.print("Masukkan bilangan ke-1: ");
				if(scan.hasNextDouble()) {
					bilangan1 = scan.nextDouble();
					ulangB = false;
					System.out.println("");
				} else {
					System.out.println("Masukan tidak valid (bukan bilangan).");
					scan.nextLine();
				}
			}
			
			ulangB = true;
			while(ulangB) {
				System.out.print("Masukkan operator (+,-,x,/): ");
				operator = scan.next().charAt(0);
				scan.nextLine();
				
				operator = Character.toLowerCase(operator);
				if(operator == '+' || operator == '-' ||  
				   operator == 'x' || operator == '/') {
					ulangB = false;
					System.out.println("");
				} else {
					System.out.println("Operator tidak valid.");
				}
			}
			
			ulangB = true;
			while(ulangB) {
				System.out.print("Masukkan bilangan ke-2: ");
				if(scan.hasNextDouble()) {
					bilangan2 = scan.nextDouble();
					ulangB = false;
					System.out.println("");
				} else {
					System.out.println("Masukan tidak valid (bukan bilangan).");
					scan.nextLine();
				}
			}
			
			hasil = 0;
			switch(operator) {
				case '+':
					hasil = penjumlahan(bilangan1, bilangan2);
					break;
				case '-':
					hasil = pengurangan(bilangan1, bilangan2);
					break;
				case 'x':
					hasil = perkalian(bilangan1, bilangan2);
					break;
				case '/':
					hasil = pembagian(bilangan1, bilangan2);
					break;
			}
			
			System.out.println("Hasil dari " + df.format(bilangan1) + " " + operator + " " + 
							   df.format(bilangan2) + " = " + df.format(hasil));
			
			ulangB = true;
			while(ulangB) {
				System.out.print("Apakah anda ingin melakukan perhitungan lagi (y/t)?");
				yT = scan.next().charAt(0);
				scan.nextLine();
				
				yT = Character.toLowerCase(yT);
				if(yT == 'y') {
					System.out.println("");
					ulangB = false;
				} else if(yT == 't') {
					ulangB = false;
					ulangA = false;
				} else {
					System.out.println("\nMohon maaf, pilihan tidak valid.");
				}
			}
		}
	}
}
