import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import newPackage.Other;

public class App {
    // main method => static
    /*
     * - static: variable atau method dimiliki oleh kelas. pemanggilannya dari
     * kelasnya. tanpa instance obj
     * - non-static: variable atau method dimiliki oleh object kelas. pemanggilannya
     * dari objectnya. wajib instance obj
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // tipe data primitive
        // struktur membuat var:
        // tipeData namaVariabel = value
        boolean isActive = true;
        System.out.println("status: " + isActive);
        // byte
        // short
        // int
        // long
        // float
        // double
        // char

        // tipe data non-primitive / reference based
        String judulBuku = "Laskar Pelangi";
        System.out.println("judul buku: " + judulBuku);
        // Boolean
        // Byte
        // Short
        Integer qty = 100;
        System.out.println("kuantitas: " + qty);
        // Long
        // Float
        // Double
        // Character

        // array primitive
        String[] days = { "sun", "mon", "tue", "wed", "thu", "fri", "sat" };
        System.out.println("days: " + days);
        System.out.println(Arrays.toString(days));
        // Integer[]
        // int[]

        // instance obj
        // NamaKelas namaObj = new Constuctor kelasnya
        App app = new App();
        app.printFullname("Femilia", "Putri");

        String hasil = app.getFullname("Ajeng", "Kamaratih");
        System.out.println(hasil);

        // instance obj other
        Other other = new Other();
        System.out.println(other.globalTeks);
        // System.out.println(other.);

        // Date
        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy")));
    }

    // method untuk menampilkan nama lengkap dari parameter nama depan dan nama
    // belakang
    // 1. void method
    public void printFullname(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    // 2. return method
    public String getFullname(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
