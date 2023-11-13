package newPackage;

public class Another {
  public static void main(String[] args) {
    // instance obj other
    Other other = new Other();
    System.out.println(other.protectedAttr);
    System.out.println(other.defaultAttr);
    System.out.println(other.getPrivateAttr());

    System.out.println();
    System.out.print("teks 1");
    System.out.print("teks 2");
    System.out.print("teks 3");
    // System.out.println("teks 4");

    other.setPrivateAttr("change value private");
    System.out.println(other.getPrivateAttr());

    int nilai = 75;
    nilai = 50;
    if (nilai < 75) {
      System.out.println("Anda belum lulus!");
    } else {
      System.out.println("Anda lulus!");
    }

    // mencetak angka ganjil dari 100 - 75
    for (int i = 100; i >= 75; i--) {
      if (i % 2 == 1)
        System.out.println(i);
    }

    int[] arrNum = { 100, 20, 30, 54, 25, 75 };
    for (int i = 0; i < arrNum.length; i++) {
      System.out.println(arrNum[i]);
    }

    for (int item : arrNum) {
      System.out.println(item);
    }
  }
}
