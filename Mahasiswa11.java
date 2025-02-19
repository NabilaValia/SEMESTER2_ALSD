public class Mahasiswa11 {   
    String nim;  
    String nama;  
    String kelas;  
    double ipk;  

    public Mahasiswa11() {
    }
    public Mahasiswa11(String nim, String nama, String kelas, double ipk) {   
        this.nim = nim;   
        this.nama = nama;   
        this.kelas = kelas;   
        this.ipk = ipk;   
    }  
    public void tampilkanInformasi() {   
        System.out.println("Nama  : " + nama);   
        System.out.println("NIM   : " + nim);   
        System.out.println("IPK   : " + ipk);   
        System.out.println("Kelas : " + kelas);   
    }   
    public void ubahKelas(String kelasBaru) {   
        this.kelas = kelasBaru;   
        System.out.println("Kelas telah diubah ke: " + kelas);   
    }   
    public void updateIpk(double ipkBaru) {   
        this.ipk = ipkBaru;   
        System.out.println("IPK telah diperbarui ke: " + ipk);   
    }   
    public String nilaiKinerja(double ipk) {   
        if (ipk > 3.5)   
            return "Kinerja sangat Baik";   
        else if (ipk >= 3.0)   
            return "Kinerja baik";   
        else if (ipk >= 2.0)   
            return "Kinerja cukup";   
        else   
            return "Kinerja kurang";   
    }  
}
