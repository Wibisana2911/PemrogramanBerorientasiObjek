package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Manusia;
import id.ac.undiksha.siak.entities.Pegawai;



public class Main {

	public static void main(String[] args) {
		
//		Mahasiswa mhs1 = new Mahasiswa(
//				"2115101063",
//				"Wibisana ",
//				true,
//				"Singaraja",
//				"Ilmu Komputer",
//				"Teknik Informatika",
//				"FTK"
//				);

		System.out.println("Data Mahasiswa");
		
//		mhs1.printAllInfo();
//		
//		Mahasiswa mhs2 = new Mahasiswa(
//				"12345678",
//				"Budi",
//				true,
//				"Denpasar",
//				"Ilmu Komputer",
//				"Teknik Informatika",
//				"FTK"
//				);
//		System.out.println("");
//		
//		mhs2.printAllInfo();
		
		System.out.println("");
//		System.out.println("Data Dosen");

		Manusia mns1 = new Manusia();
		mns1.setNama("Dodi");
		mns1.setAlamat("Denpasar");
		mns1.setJenisKelamin(true);
		mns1.printAllInfo();
		
		System.out.println("");
		System.out.println("mhs3");
		Mahasiswa mhs3 = new Mahasiswa();
		mhs3.setNama("Dodi");
		mhs3.setProdi("Ilmu Komputer");
		mhs3.printAllInfo();
		
//		Manusia mns2 = new Manusia("Edi", true "Singaraja");
//		mns2.printAllInfo();
		
		System.out.println("");
		System.out.println("mhs5");
		Mahasiswa mhs5 = new Mahasiswa("1234","ILKOM", "TI", "FTK");	
//		mhs5.getAlamat();
//		mhs5.getNim();
		mhs5.printAllInfo();
		
		System.out.println("");
		System.out.println("mhs7");
		Mahasiswa mhs7 = new Mahasiswa("Budi",true, "Denpasar");
		mhs7.printAllInfo();
		
		System.out.println("");
		System.out.println("siX");
		Manusia siX = new Mahasiswa (); 
		siX.getNama(); 
//		siX.getNim();
		siX.printAllInfo();
		
//		Mahasiswa siY = new Manusia();
		
		System.out.println("");
		System.out.println("mhsA");
		Mahasiswa mhsA = new Mahasiswa("Nama Mahasiswa",true,"Alamat Tempat Tinggal",
				"100","Prodi Ilkom","Jurusan TI","Fakultas FTK");
		mhsA.printAllInfo();
		
//		System.out.println("");
//		System.out.println("Data Pegawai");
//		pgw1.printAllInfo();
		
		//
		System.out.println("");
		System.out.println("dosen");
		Dosen dos = new Dosen("Dosen1",true,"Singaraja");
		dos.setNip("11111111");
		dos.setJabatan("Rektor");
		dos.setProdi("ILKOM"); 
		dos.setJurusan("TI");
		dos.setFakultas("FTK");
		dos.printAllInfo();
		
		System.out.println("");
		Dosen dos1 = new Dosen("Dosen 2", false, "Denpasar", "10101","Jabatan 1","Prodi A","Jurusan A","Fakultas A");
		dos1.printAllInfo();
		
		System.out.println("");
		System.out.println("Pegawai");
		Manusia A = new Pegawai ("Abcd", true, "Gianyar"); 
		A.printAllInfo();
		
		System.out.println("");
		System.out.println("Pegawai 1");
		Pegawai pgw1 = new Pegawai("Pegawai1", false, "Denpasar"); 
		pgw1.setNip("1111"); 
		pgw1.setJabatan("Karyawan Tetap");
		pgw1.setUnit("Sektor B");
		pgw1.printAllInfo();
	}
	

	
	

}
