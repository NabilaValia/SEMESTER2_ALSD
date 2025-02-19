public class MahasiswaMain11 {  
    public static void main(String[] args) {  
        Mahasiswa11 mhs1 = new Mahasiswa11();  
        mhs1.nama = "Muhammad Ali Farhan";  
        mhs1.nim = "2241720111";  
        mhs1.ipk = 3.55;  
        mhs1.kelas = "SI 2J";  

        mhs1.tampilkanInformasi();  
        mhs1.ubahKelas("SI 2K");  
        mhs1.updateIpk(3.60);  
        mhs1.tampilkanInformasi();  

        Mahasiswa mhs2 = new Mahasiswa ("Annisa Nabila","2141720160", 3.25,"TI 2L");
        mhs2.updateIPK(3.30);  
        mhs2.tampilkanInformasi();

        Mahasiswa mhsNabila = new Mahasiswa ("Nabil","244107060086", 3.85,"SIB 1E");
    }  
}  
class Mahasiswa11 {  
    String nim;  
    String nama;  
    double ipk;  
    String kelas;  

    public void tampilkanInformasi() {  
        System.out.println("Nama: " + nama);  
        System.out.println("NIM: " + nim);  
        System.out.println("IPK: " + ipk);  
        System.out.println("Kelas: " + kelas);  
    }  

    public void ubahKelas(String kelasBaru) {  
        kelas = kelasBaru;  
    }  

    public void updateIpk(double ipkBaru) {  
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {  
            ipk = ipkBaru;  
        } else {  
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0.");  
        }  
    }  
}