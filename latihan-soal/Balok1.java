/* Programmer			: Indra Hidayatulloh
   Tanggal dibuat		: 22 April 2020
   Github/Youtube/Twitter/FB/IG	: inhidayatulloh
*/

import java.util.Scanner;

public class Balok1 {
	
	private Scanner scan = new Scanner(System.in);
	private float panjang, lebar, tinggi;
	private boolean ulang;
	
	public Balok1() {
		ulang = true;
		while(ulang) {
			System.out.print("Masukkan Panjang: ");
			if(scan.hasNextFloat()) {
				panjang = scan.nextFloat();
				if(panjang > 0) {
					ulang = false;
					System.out.println("");
				} else {
					System.out.println("Panjang harus lebih dari nol (0).");
				}
				scan.nextLine();
			} else {
				System.out.println("Masukan tidak valid (bukan bilangan).");
				scan.nextLine();
			}
			
		}
		
		ulang = true;
		while(ulang) {
			System.out.print("Masukkan Lebar\t: ");
			if(scan.hasNextFloat()) {
				lebar = scan.nextFloat();
				if(lebar > 0) {
					ulang = false;
					System.out.println("");
				} else {
					System.out.println("Lebar harus lebih dari nol (0).");
				}
				scan.nextLine();
			} else {
				System.out.println("Masukan tidak valid (bukan bilangan).");
				scan.nextLine();
			}
			
		}
		
		ulang = true;
		while(ulang) {
			System.out.print("Masukkan Tinggi\t: ");
			if(scan.hasNextFloat()) {
				tinggi = scan.nextFloat();
				if(tinggi > 0) {
					ulang = false;
				} else {
					System.out.println("Tinggi harus lebih dari nol (0).");
				}
				scan.nextLine();
			} else {
				System.out.println("Masukan tidak valid (bukan bilangan).");
				scan.nextLine();
			}
			
		}
	}
	
	private float hitungKeliling() {
		return 4 * (panjang + lebar + tinggi);
	}
	
	private float hitungLuas() {
		return 2 * ((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
	}
	
	private float hitungVolume() {
		return panjang * lebar * tinggi;
	}
	
	public static void main(String[] args) {
		System.out.println("\n###### PROGRAM HITUNG KELILING, LUAS, DAN VOLUME BALOK ######");
		System.out.println("\n1. Form Input Balok Kecil");
		Balok1 balokKecil = new Balok1();
		
		System.out.println("\n2. Form Input Balok Sedang");
		Balok1 balokSedang = new Balok1();
		
		System.out.println("\n3. Form Input Balok Besar");
		Balok1 balokBesar = new Balok1();
		
		System.out.println("\n========== Hasil Perhitungan ==========");
		System.out.println("1. Balok Kecil" + 
						   "\nPanjang\t\t: " + balokKecil.panjang + 
						   "\nLebar\t\t: " + balokKecil.lebar + 
						   "\nTinggi\t\t: " + balokKecil.tinggi +
						   "\nKeliling\t: " + balokKecil.hitungKeliling() + 
						   "\nLuas\t\t: " + balokKecil.hitungLuas() + 
						   "\nVolume\t\t: " + balokKecil.hitungVolume());
		
		System.out.println("\n2. Balok Sedang" + 
						   "\nPanjang\t\t: " + balokSedang.panjang + 
						   "\nLebar\t\t: " + balokSedang.lebar + 
						   "\nTinggi\t\t: " + balokSedang.tinggi +
						   "\nKeliling\t: " + balokSedang.hitungKeliling() + 
						   "\nLuas\t\t: " + balokSedang.hitungLuas() + 
						   "\nVolume\t\t: " + balokSedang.hitungVolume());
		
		System.out.println("\n3. Balok Besar" + 
						   "\nPanjang\t\t: " + balokBesar.panjang + 
						   "\nLebar\t\t: " + balokBesar.lebar + 
						   "\nTinggi\t\t: " + balokBesar.tinggi +
						   "\nKeliling\t: " + balokBesar.hitungKeliling() + 
						   "\nLuas\t\t: " + balokBesar.hitungLuas() + 
						   "\nVolume\t\t: " + balokBesar.hitungVolume());
	}
}
