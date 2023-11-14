package abstraction.shape;

import abstraction.BangunDatar;

public class Persegi implements BangunDatar {
  // attribute
  private Float sisi;

  // constructor
  public Persegi(Float sisi) throws Exception {
    this.setSisi(sisi);
  }

  public Persegi() {
  }

  // method setter - getter
  public Float getSisi() {
    return sisi;
  }

  public void setSisi(Float sisi) throws Exception {
    // logika untuk ngecek positive number
    if (sisi < 0) {
      throw new Exception("Sisi harus bilangan bulat positif!");
    }

    this.sisi = sisi;
  }

  @Override
  public void menggambarBangun() {
    // logika untuk membuat persegi
    for (int i = 0; i < sisi; i++) {
      for (int j = 0; j < sisi; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  @Override
  public Float hitungKeliling() {
    return 4 * this.sisi;
  }

  @Override
  public Float hitungLuas() {
    return this.sisi * this.sisi;
  }

}
