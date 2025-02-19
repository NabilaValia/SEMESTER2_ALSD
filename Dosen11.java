public class Dosen11 {  
    private String idDosen;  
    private String namaDosen;  
    private boolean statusAktif;  
    private int tahunBergabung;  
    private String bidang;  

    public Dosen11() {  
        this.idDosen = "D000";  
        this.namaDosen = "Drs. Juwita Dewi";  
        this.statusAktif = true;  
        this.tahunBergabung = 2020;  
        this.bidang = "Matematika";  
    }  
    public Dosen11(String idDosen, String namaDosen, boolean statusAktif, int tahunBergabung, String bidang) {  
        this.idDosen = idDosen;  
        this.namaDosen = namaDosen;  
        this.statusAktif = statusAktif;  
        this.tahunBergabung = tahunBergabung;  
        this.bidang = bidang;  
    }  
    public void tampilInformasi() {  
        System.out.println("ID Dosen: " + idDosen);  
        System.out.println("Nama Dosen: " + namaDosen);  
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));  
        System.out.println("Tahun Bergabung: " + tahunBergabung);  
        System.out.println("Bidang: " + bidang);  
    }  
    public void setStatusAktif(boolean status) {  
        this.statusAktif = status;  
    }    
    public int hitungMasaKerja(int thnSkrg) {  
        return thnSkrg - tahunBergabung;  
    }  
    public void ubahKeahlian(String bidang) {  
        this.bidang = bidang;  
    }   
    public String getNamaDosen() {  
        return namaDosen;  
    }   
    public String getBidang() {  
        return bidang;  
    }  
}