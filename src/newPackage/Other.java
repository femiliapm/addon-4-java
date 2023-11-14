package newPackage;

public class Other {
  // atribute modifier
  /*
   * 1. public: bisa diakses secara global, di luar packagenya
   * 2. protected: bisa diakses oleh turunan kelasnya
   * 3. default / tanpa modifier: bisa diakses hanya di package yg sama
   * 4. private: bisa diakses hanya di class yg sama
   */
  public String globalTeks = "teks ini bisa diakses di mana saja";
  protected String protectedAttr = "teks ini bermodifier protected";
  String defaultAttr = "teks ini bermodifier default atau tanpa modifier";
  private String privateAttr = "teks ini private modifier";
  private String name;

  // method setter - getter
  public void setPrivateAttr(String parameter) {
    // bisa dipasang logika di sini
    if (parameter == "") {
      throw new RuntimeException("parameter kosong!");
    }
    privateAttr = parameter;
  }

  public String getPrivateAttr() {
    return privateAttr;
  }

  public String getName() {
    return name;
  }

  // constructor: metode khusus untuk menginit object dari kelas
  public Other() {
  }

  public Other(String nama) {
    name = nama;
  }
}

// class Another {

// }
