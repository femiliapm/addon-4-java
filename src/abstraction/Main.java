package abstraction;

import java.util.Scanner;

import abstraction.shape.Persegi;

public class Main {
  public static void main(String[] args) {
    // Scanner kelas untuk user input
    Scanner scanner = new Scanner(System.in);
    try {

      System.out.println("""
          1. Persegi
          2. Persegi Panjang
          3. Segitiga
          """);
      System.out.print("Pilih bangun: ");
      String opsi = scanner.nextLine();
      switch (opsi) {
        case "1":
          // Persegi
          System.out.println("=== PERSEGI ===");
          System.out.print("Input sisi persegi: ");
          Float sisi = Float.valueOf(scanner.nextLine());
          Persegi persegi = new Persegi(sisi);
          persegi.menggambarBangun();
          System.out.println("Sisi: " + persegi.getSisi());
          System.out.println("Keliling: " + persegi.hitungKeliling());
          System.out.println("Luas: " + persegi.hitungLuas());
          break;

        case "2":
          // Persegi panjang
          break;

        case "3":
          // Segitiga
          break;

        default:
          System.out.println("Bangun tidak tersedia!");
          break;
      }

    } catch (Exception e) {
      System.out.println(e.getMessage());

    } finally {
      scanner.close();
    }

  }
}
