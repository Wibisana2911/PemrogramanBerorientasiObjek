package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Data Mahasiswa
		Mahasiswa mhs1 = new Mahasiswa(
				"2115101066",
				"Risva",
				true,
				"Karangasem",
				"Ilmu Komputer",
				"Teknik Informatika",
				"FTK"
		);
		System.out.println("");		
		mhs1.printAllInfo();
		
		
		//Data Dosen
		Dosen dsn1 = new Dosen(
				"12345678",
				"Yudhi Paramartha",
				true,
				"Singaraja",
				"Dosen & Kaprodi",
				"Ilmu Komputer",
				"Teknik Informatika",
				"FTK"
		);
		System.out.println("");
		dsn1.printAllInfo();
		


		//Data Pegawai
		Pegawai pgw1 = new Pegawai(
								
		);
		System.out.println("");
		pgw1.printAllInfo();
	}

}
