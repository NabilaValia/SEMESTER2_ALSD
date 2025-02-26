import java.util.Scanner;

public class MataKuliahDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine(); 
        MataKuliah11[] arrayOfMataKuliah11 = new MataKuliah11[jumlahMK];
        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < jumlahMK; i++) {
            arrayOfMataKuliah11[i] = new MataKuliah11();  
            System.out.println("\nMasukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode         : ");
            kode = sc.nextLine();
            System.out.print("Nama         : ");
            nama = sc.nextLine();
            System.out.print("SKS          : ");
            sks = sc.nextInt();
            System.out.print("Jumlah Jam   : ");
            jumlahJam = sc.nextInt();
            sc.nextLine(); 
            System.out.println("------------------------------");

            arrayOfMataKuliah11[i].kode = kode;
            arrayOfMataKuliah11[i].nama = nama;
            arrayOfMataKuliah11[i].sks = sks;
            arrayOfMataKuliah11[i].jumlahJam = jumlahJam;
        }

        System.out.println("\n=== Data Mata Kuliah ===");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("Mata Kuliah Ke-" + (i + 1));
            System.out.println("Kode            : " + arrayOfMataKuliah11[i].kode);
            System.out.println("Nama            : " + arrayOfMataKuliah11[i].nama);
            System.out.println("SKS             : " + arrayOfMataKuliah11[i].sks);
            System.out.println("Jumlah Jam      : " + arrayOfMataKuliah11[i].jumlahJam);
            System.out.println("------------------------------");
        }
    }
}
