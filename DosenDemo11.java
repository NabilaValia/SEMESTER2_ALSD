import java.util.Scanner;

public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = input.nextInt();
        input.nextLine(); 
        Dosen11[] daftarDosen = new Dosen11[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode                       : ");
            String kode = input.nextLine();

            System.out.print("Nama                       : ");
            String nama = input.nextLine();

            System.out.print("Jenis Kelamin (pria/wanita): ");
            String jk = input.nextLine().toLowerCase();
            boolean jenisKelamin = jk.equals("pria"); 

            System.out.print("Usia                       : ");
            int usia = input.nextInt();
            input.nextLine(); 

            daftarDosen[i] = new Dosen11(kode, nama, jenisKelamin, usia);
            System.out.println("------------------------------");
        }
        for (int i = 0; i < jumlahDosen; i++) {
            daftarDosen[i].tampilkanData(i + 1);
        }
        DataDosen11.infoDosenPalingTua(daftarDosen);
        DataDosen11.infoDosenPalingMuda(daftarDosen);

        System.out.println("BUILD SUCCESSFUL (total time: 2 minute)");
        input.close();
    }
}
