import java.util.Scanner;
import java.text.DecimalFormat;

public class KonverterSuhu {
	
	static float konversiSuhu(String paramArahKonversi, float paramDerajatSuhuAsal) {
		float derajatHasilKonversi = 0f;
		switch(paramArahKonversi) {
			case "C-F":
				derajatHasilKonversi = (paramDerajatSuhuAsal * (9f/5f)) + 32f;
				break;
			case "C-K":
				derajatHasilKonversi = paramDerajatSuhuAsal + 273.15f;
				break;
			case "F-C":
				derajatHasilKonversi = (paramDerajatSuhuAsal - 32f) * (5f/9f);
				break;
			case "F-K":
				derajatHasilKonversi = ((paramDerajatSuhuAsal - 32f) * (5f/9f)) + 273.15f;
				break;
			case "K-C":
				derajatHasilKonversi = paramDerajatSuhuAsal - 273.15f;
				break;
			case "K-F":
				derajatHasilKonversi = (paramDerajatSuhuAsal - 273.15f) * (9f/5f) + 32f;
				break;
			default:
				
		}
		return derajatHasilKonversi;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char skalaSuhuAsal = ' ', skalaSuhuTarget = ' ', yT = ' ';
		float derajatSuhuAsal = 0f;
		String arahKonversi = "";
		boolean ulangA = true, ulangB = true;
		
		final String pattern = "###.##";
		final DecimalFormat df = new DecimalFormat(pattern);
		
		System.out.println("############   PROGRAM KONVERTER SUHU   ############");
		System.out.println("\t\t\t----\t----------");
		System.out.println("\t\t\tKode\tSkala Suhu");
		System.out.println("\t\t\t----\t----------");
		System.out.println("\t\t\tC\tCelcius");
		System.out.println("\t\t\tF\tFahrenheit");
		System.out.println("\t\t\tK\tKelvin");
		System.out.println("====================================================");
		
		while(ulangA) {
			while(ulangB) {
				System.out.print("Masukkan skala suhu asal\t: ");
				skalaSuhuAsal = scan.next().charAt(0);
				skalaSuhuAsal = Character.toUpperCase(skalaSuhuAsal);
				scan.nextLine();
				if(skalaSuhuAsal != 'C' && skalaSuhuAsal != 'F' &&  
				   skalaSuhuAsal != 'K') {
					System.out.println("Mohon maaf, skala suhu asal harus C/F/K.");
				} else {
					ulangB = false;
					System.out.println("");
				}
			}
			
			ulangB = true;
			while(ulangB) {
				System.out.print("Masukkan derajat suhu Asal\t: ");
				if(scan.hasNextFloat()) {
					derajatSuhuAsal = scan.nextFloat();
					ulangB = false;
					System.out.println("");
				} else {
					System.out.println("Mohon maaf, masukan harus bilangan (bulat/riil)).");
					scan.nextLine();
				}
			}
			
			ulangB = true;
			while(ulangB) {
				System.out.print("Masukkan skala suhu target\t: ");
				skalaSuhuTarget = scan.next().charAt(0);
				skalaSuhuTarget = Character.toUpperCase(skalaSuhuTarget);
				scan.nextLine();
				
				if(skalaSuhuTarget != 'C' && skalaSuhuTarget != 'F' &&  
				   skalaSuhuTarget != 'K') {
					System.out.println("Mohon maaf, skala suhu target harus C/F/K.");
				} else if(skalaSuhuTarget == skalaSuhuAsal) {
					System.out.println("Mohon maaf, skala suhu target dan asal tidak boleh sama.");
				} else {
					ulangB = false;
					System.out.println("");
				}
			}
			
			arahKonversi = skalaSuhuAsal + "-" + skalaSuhuTarget;
			System.out.println("Hasil konversi " + derajatSuhuAsal + " derajat " + 
								skalaSuhuAsal + " ke " + skalaSuhuTarget + " adalah " + 
								df.format(konversiSuhu(arahKonversi, derajatSuhuAsal)));
			
			ulangB = true;
			while(ulangB) {
				System.out.print("Apakah anda ingin mengkoversi suhu lainnya (y/t)?");
				yT = scan.next().charAt(0);
				yT = Character.toLowerCase(yT);
				scan.nextLine();
				
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
