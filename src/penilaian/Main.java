package penilaian;

public class Main {
    public static void main(String[] args) {
       NilaiAkhir qadri = new NilaiAkhir ("Muhammad Qadri","2110010130",80,75,85); 
    
    
        System.out.println("Nama Mahasiswa: "+qadri.getNama());
        System.out.println("NPM Mahasiswa: "+qadri.getNpm());
        System.out.println("Nilai Akhir: "+qadri.hitungNilaiAkhir());
    
    
    }
}
