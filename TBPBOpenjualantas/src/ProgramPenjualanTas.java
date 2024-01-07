import java.sql.*;
import java.util.Scanner;

public class ProgramPenjualanTas {
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/tokotasnajwa";
    static final String USER = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                System.out.println("Database terhubung!");
    
                // Meminta input dari pengguna untuk data tas
                System.out.println("Masukkan data tas:");
                System.out.print("Merek tas: ");
                String merekTas = scanner.nextLine();
                System.out.print("Harga tas: ");
                double hargaTas = scanner.nextDouble();
                System.out.print("Ukuran tas: ");
                String ukuranTas = scanner.next();
                scanner.nextLine(); // Membersihkan buffer
    
                Tas tas1 = new Tas(merekTas, hargaTas, ukuranTas);
    
                // Meminta input dari pengguna untuk data transaksi
                System.out.println("Masukkan data transaksi:");
                System.out.print("Jumlah beli: ");
                int jumlahBeli = scanner.nextInt();
                scanner.nextLine(); // Membersihkan buffer
                System.out.print("Apakah member (true/false): ");
                boolean isMember = scanner.nextBoolean();
    
                Transaksi transaksi1 = new Transaksi(tas1, jumlahBeli, isMember);

                // Menampilkan informasi transaksi
                System.out.println("Informasi Transaksi 1:");
                System.out.println("Jumlah Beli: " + transaksi1.getJumlahBeli());
                System.out.println("Total Beli: Rp" + transaksi1.getTotalBeli());
                System.out.println("Apakah Member: " + transaksi1.isMember());

                // Membuat instance Struk dan menambahkan transaksi ke dalamnya
                Struk struk = new Struk();
                struk.tambahTransaksi(transaksi1);
            

                // Menampilkan informasi struk
                struk.cetakStruk();
                } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                } finally {
                scanner.close();
                }
           }

}