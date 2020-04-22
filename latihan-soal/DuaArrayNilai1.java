/* Programmer						: Indra Hidayatulloh
   Tanggal dibuat					: 23 April 2020
   Github/Youtube/Twitter/FB/IG		: inhidayatulloh
*/

import java.util.Scanner;

public class DuaArrayNilai1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nMatDis = 0, nPemrograman = 0;
		float[] arrNilaiMatDis, arrNilaiPemrograman;
		boolean ulang;
		
		System.out.println("\n1. Nilai Matematika Diskrit");
		
		ulang = true;
		while(ulang) {
			System.out.print("Masukkan banyak data nilai: ");
			if(scan.hasNextInt()) {
				nMatDis = scan.nextInt();
				if(nMatDis > 0) {
					ulang = false;
					System.out.println("");
				} else {
					System.out.println("Banyak data nilai harus lebih besar dari nol (0).\n");
				}
			} else {
				System.out.println("Masukan tidak valid (bukan bilangan).\n");
			}
			scan.nextLine();
		}
		
		arrNilaiMatDis = new float[nMatDis];
		
		System.out.println("Masukkan semua nilai.");
		for(int i=0; i<nMatDis; i++) {
			ulang = true;
			while(ulang) {
				System.out.print("Nilai ke-" + (i+1) + ": ");
				if(scan.hasNextFloat()) {
					arrNilaiMatDis[i] = scan.nextFloat();
					if(arrNilaiMatDis[i] >= 0 && arrNilaiMatDis[i] <= 100) {
						ulang = false;
						System.out.println("");
					} else {
						System.out.println("Nilai harus nol (0) sampai seratus (100).");
					}
				} else {
					System.out.println("Masukan tidak valid (bukan bilangan).");
				}
				scan.nextLine();
			}
		}
		
		ulang = true;
		while(ulang) {
			System.out.print("Masukkan banyak data nilai MK Pemrograman: ");
			if(scan.hasNextInt()) {
				nPemrograman = scan.nextInt();
				if(nPemrograman > 0) {
					ulang = false;
					System.out.println("");
				} else {
					System.out.println("Banyak data nilai harus lebih besar dari nol (0).\n");
				}
			} else {
				System.out.println("Masukan tidak valid (bukan bilangan).\n");
			}
			scan.nextLine();
		}
		
		arrNilaiPemrograman = new float[nPemrograman];
		
		System.out.println("Masukkan semua nilai.");
		for(int i=0; i<nPemrograman; i++) {
			ulang = true;
			while(ulang) {
				System.out.print("Nilai ke-" + (i+1) + ": ");
				if(scan.hasNextFloat()) {
					arrNilaiPemrograman[i] = scan.nextFloat();
					if(arrNilaiPemrograman[i] >= 0 && arrNilaiPemrograman[i] <= 100) {
						ulang = false;
						System.out.println("");
					} else {
						System.out.println("Nilai harus nol (0) sampai seratus (100).");
					}
				} else {
					System.out.println("Masukan tidak valid (bukan bilangan).");
				}
				scan.nextLine();
			}
		}
		
		System.out.println("======================================================");
		
		System.out.println("\nMenampilkan semua nilai MK Matematikak Diskrit.");
		for(int i=0; i<nMatDis; i++) {
			System.out.println("Nilai ke-" + (i+1) + ": " + arrNilaiMatDis[i]);
		}
		
		System.out.println("\nMenampilkan semua nilai MK Pemrograman.");
		for(int i=0; i<nPemrograman; i++) {
			System.out.println("Nilai ke-" + (i+1) + ": " + arrNilaiPemrograman[i]);
		}
	}
}
