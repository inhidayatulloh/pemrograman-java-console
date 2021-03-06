/* Programmer			: Indra Hidayatulloh
   Tanggal dibuat		: 25 Maret 2020
   Github/Youtube/Twitter/FB/IG	: inhidayatulloh
*/

import java.util.Scanner;

public class GanjilGenap1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bilangan = 0;
		char yT;
		boolean ulangA = true, ulangB = true;
		
		while(ulangA) {
			ulangB = true;
			while(ulangB) {
				System.out.print("Masukkan bilangan: ");
				if(scan.hasNextInt()) {
					bilangan = scan.nextInt();
					ulangB = false;
				} else {
					System.out.println("Masukan tidak valid (bukan bilangan bulat).\n");
					scan.nextLine();
				}
			}
			
			if(bilangan % 2 == 0) {
				System.out.println("Hasil: " + bilangan + " merupakan bilangan Genap.");
			} else {
				System.out.println("Hasil: " + bilangan + " merupakan bilangan Ganjil.");
			}
			
			ulangB = true;
			while(ulangB) {
				System.out.print("Apakan anda ingin memasukkan bilangan lainnya(y/t)?");
				yT = scan.next().charAt(0);
				scan.nextLine();
				
				yT = Character.toLowerCase(yT);
				if(yT == 'y') {
					ulangB = false;
					System.out.println("");
				} else if(yT == 't') {
					ulangB = false;
					ulangA = false;
				} else {
					System.out.println("\nMohon maaf, pilihan jawaban tidak valid.");
				} 
			}
		}
	}
}
