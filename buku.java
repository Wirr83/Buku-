import java.util.ArrayList;
import java.util.Scanner;
 class idbuku {
    private String isbn;
    private String judul;

    public idbuku (String isbn, String judul){
        this.isbn = isbn;
        this.judul = judul;
    }
     public String getISBN (){
        return isbn;
     }
     public String getJudul (){
        return judul;
     }
}
 class Peminjam {
    private String nim;
    private String nama;
    private ArrayList<idbuku> daftarBuku = new ArrayList<>();

public Peminjam(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void pinjam(idbuku buku) {
        daftarBuku.add(buku);
    }
    public String getNIM (){
        return nim;
    }
    public String getName (){
        return nama;
    }
        public ArrayList<idbuku> getDaftarBuku() {
        return daftarBuku;
    }
} 
public class buku {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=============================================================================================");

        System.out.print("NIM = ");
        String NIM = in.nextLine();

        System.out.print("Nama = ");
        String Nama = in.nextLine();

        Peminjam mhs = new Peminjam(NIM, Nama);

            System.out.println("\nData Buku " );
            System.out.print("Masukkan ISBN  : ");
            String isbn = in.nextLine();

            System.out.print("Masukkan Judul : ");
            String judul = in.nextLine();

            mhs.pinjam(new idbuku(isbn, judul));

            System.out.println("\n======================================================================================");
            System.out.println("NIM   : " + mhs.getNIM());
            System.out.println("Nama  : " + mhs.getName());
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("| No |            ISBN                       |                     Judul                |");
            System.out.println("----------------------------------------------------------------------------------------");

            int no = 1;
            for (idbuku b : mhs.getDaftarBuku()) {
            System.out.printf("| %-3d| %-35s | %-40s |\n", no, b.getISBN(), b.getJudul());
            no++;
        }

        System.out.println("----------------------------------------------------------------------------------------");
        in.close();
        }
    }