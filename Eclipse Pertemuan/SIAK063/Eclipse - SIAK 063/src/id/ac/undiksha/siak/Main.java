package id.ac.undiksha.siak;
import id.ac.undiksha.siak.entities.*;

public class Main {

	public static void main(String[] args) {
		Mahasiswa mhs2 = new Mahasiswa(
				"KOMANG WIBISANA",
				"Busungbiu,Buleleng",
				true,//Laki laki
				"2115101063 ",
				"ILKOM",
				"Ilmu Komputer",
				"TI",
				"Teknik Informatika",
				"FTK"
				);
		mhs2.printAllInfo();
		
		Dosen dosen1 = new Dosen(
				"Dosen1",
				"Singaraja",
				true,
				"1234567890",
				"ILKOM",
				"Ilmu Komputer",
				"Dosen Ilkom",
				"TI",
				"Teknik Informatika",
				"FTK"
				);
		dosen1.printAllInfo();
		
		Pegawai pegawai1 = new Pegawai(
				"Pegawai1",
				"Buleleng",
				false,
				"1234567890",
				"Pegawai Ilkom"
				);
		pegawai1.printAllInfo();
	}
}