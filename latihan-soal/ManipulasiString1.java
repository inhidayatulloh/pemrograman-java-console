import java.util.Scanner;

public class ManipulasiString1 {
	
	static String hapusHurufVokal1(String paramTeks) {
		String teksBaru = "";
		
		for(int i=0; i<paramTeks.length(); i++) {
			if(paramTeks.charAt(i) != 'a' && paramTeks.charAt(i) != 'A' && 
			   paramTeks.charAt(i) != 'i' && paramTeks.charAt(i) != 'I' &&
			   paramTeks.charAt(i) != 'u' && paramTeks.charAt(i) != 'U' && 
			   paramTeks.charAt(i) != 'e' && paramTeks.charAt(i) != 'E' && 
			   paramTeks.charAt(i) != 'o' && paramTeks.charAt(i) != 'O') {
				
				teksBaru += paramTeks.charAt(i);
			}
		}
		
		return teksBaru;
	}
	
	static String hapusHurufVokal2(String paramTeks) {
		String teksBaru = "";
		
		for(char c : paramTeks.toCharArray()) {
			if(c != 'a' && c!= 'A' &&
			   c != 'i' && c!= 'I' && 
			   c != 'u' && c!= 'U' && 
			   c != 'e' && c!= 'E' &&
			   c != 'o' && c!= 'O') {
				teksBaru += c;
			}
		}
		
		return teksBaru;
	}
	
	static String hapusHurufVokal3(String paramTeks) {
		return paramTeks.replaceAll("[aAiIuUeEoO]", "");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String teks = "";
		char yT;
		boolean ulangA = true, ulangB = true;
		while(ulangA) {
			System.out.print("Masukkan teks: ");
			teks = scan.nextLine();
			
			System.out.println("Hasil Fungsi hapusHurufVokal1: " + hapusHurufVokal1(teks));
			System.out.println("Hasil Fungsi hapusHurufVokal2: " + hapusHurufVokal2(teks));
			System.out.println("Hasil Fungsi hapusHurufVokal3: " + hapusHurufVokal3(teks));
			
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
