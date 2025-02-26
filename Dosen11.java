class Dosen11 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    // Constructor
    public Dosen11(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    // Method untuk menampilkan data dosen
    public void tampilkanData(int index) {
        System.out.println("Data Dosen ke-" + index);
        System.out.println("Kode  : " + kode);
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia  : " + usia);
        System.out.println("------------------------------");
    }
}
