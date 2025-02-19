public class Mahasiswa {  
    String nama;  
    String nim;  
    double ipk;  
    String kelas;  

    public Mahasiswa() {  
    }    
    public Mahasiswa(String nm, String nim, double ipk, String kls) {  
        this.nama = nm;  
        this.nim = nim;  
        this.ipk = ipk;  
        kelas = kls;  
    }  
    public void tampilkanInformasi() {  
        System.out.println("Nama: " + nama);  
        System.out.println("NIM: " + nim);  
        System.out.println("IPK: " + ipk);  
        System.out.println("Kelas: " + kelas);  
    }  
    public void updateIPK(double ipkBaru) {  
        this.ipk = ipkBaru;  
    }  
}