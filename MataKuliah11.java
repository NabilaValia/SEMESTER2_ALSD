public class MataKuliah11 {  
    private String kodeMK;  
    private String nama;  
    private int sks;  
    private int jumlahJam;  

    public MataKuliah11() {  
        this.kodeMK = "MK002";  
        this.nama = "Praktikum Algoritma Struktur Data";  
        this.sks = 3;  
        this.jumlahJam = 18;  
    }  
    public MataKuliah11(String kodeMK, String nama, int sks, int jumlahJam) {  
        this.kodeMK = kodeMK;  
        this.nama = nama;  
        this.sks = sks;  
        this.jumlahJam = jumlahJam;  
    }  
    public void tampilInformasi() {  
        System.out.println();
        System.out.println("Kode MK   : " + kodeMK);  
        System.out.println("Nama      : " + nama);  
        System.out.println("SKS       : " + sks);  
        System.out.println("Jumlah Jam: " + jumlahJam);  
    }  
    public void ubahSKS(int sksBaru) {  
        this.sks = sksBaru;  
        System.out.println("SKS telah diubah menjadi: " + sks);  
    }  
    public void tambahJam(int jam) {  
        System.out.println();
        this.jumlahJam += jam;  
        System.out.println("Jumlah jam telah ditambahkan. Jumlah Jam sekarang: " + jumlahJam);  
    }  
    public void kurangiJam(int jam) {  
        if (jumlahJam - jam < 0) {  
            System.out.println("Pengurangan tidak dapat dilakukan, jumlah jam tidak mencukupi.");  
        } else {  
            jumlahJam -= jam;  
            System.out.println("Jumlah jam telah dikurangi. Jumlah Jam sekarang: " + jumlahJam);  
        }  
    }  
}
