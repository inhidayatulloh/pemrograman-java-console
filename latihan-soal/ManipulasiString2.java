import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ManipulasiString2 {
	
	static Character[] arrHurufVokal = {'a', 'A', 'i', 'I', 'u', 'U', 
										'e', 'E', 'o', 'O'};
	static ArrayList<Character> arrListHurufVokal = 
		   new ArrayList<Character>(Arrays.asList(arrHurufVokal));
	
	static boolean apakahAlfabet(char huruf) {
		boolean alfabet = false;
		
		if((huruf >= 'a' && huruf <= 'z') || 
		   (huruf >= 'A' && huruf <= 'Z')) {
			alfabet = true;
		}
		
		return alfabet;
	}
	
	static String hapusHurufKonsonan1(String paramTeks) {
		String teksBaru = "";
		
		for(int i=0; i<paramTeks.length(); i++) {
			if(apakahAlfabet(paramTeks.charAt(i))) {
				if(arrListHurufVokal.contains(paramTeks.charAt(i))) {
					teksBaru += paramTeks.charAt(i);
				}
			} else {
				teksBaru += paramTeks.charAt(i);
			}
		}
		
		return teksBaru;
	}
	
	static String hapusHurufKonsonan2(String paramTeks) {
		return paramTeks.replaceAll("[^aAiIuUeEoO0-9\\W]+", "");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String teks = "";
		boolean ulangA = true, ulangB = true;
		char yT = ' ';
		
		while(ulangA) {
			System.out.print("Masukkan teks: ");
			teks = scan.nextLine();
			
			System.out.println("Hasil fungsi hapusHurufKonsonan1: " + 
								hapusHurufKonsonan1(teks));
			System.out.println("Hasil fungsi hapusHurufKonsonan2: " + 
								hapusHurufKonsonan2(teks));
								
			ulangB = true;
			while(ulangB) {
				System.out.print("Apakah anda ingin memasukkan teks lainnya (y/t)?");
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
