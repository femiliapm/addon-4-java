package inheritance;

/*
 * inheritance: suatu class dapat diturunkan ke class lainnya.
 * dengan mewarisi atribute dan methodnya
 * 1. Jenis kelasnya sama, sesama class atau sesama interface, extends
 * 2. Interface -> Class, implements
 */
public class Child extends Parent {
  // encapsulation
  private String domicile;

  // constructor
  public Child() {
  }

  public Child(String fname, String lname, String domicile) {
    super(fname, lname);
    this.domicile = domicile;
  }

  // method setter-getter
  public void setDomicile(String domicile) {
    this.domicile = domicile;
  }

  // overload - polymorphism
  public String getDomicile() {
    return domicile;
  }

  public String getDomicile(String address) {
    return address + " - " + domicile;
  }

  public String getDomicile(String jalan, Integer nomor) {
    return jalan + " " + nomor + " - " + domicile;
  }

  public String getData() {
    return super.getFname() + " " + super.getLname() + " - " + this.getDomicile();
  }

  @Override
  public String getFullname() {
    // TODO Auto-generated method stub
    // kita berikan validasi atau baris kode lainnya di sini
    return super.getFullname() + " - " + this.getDomicile();
  }

  @Override
  public String toString() {
    return "Child [domicile=" + domicile + "]";
  }

  // @Override
  // public String toString() {
  // // TODO Auto-generated method stub
  // return this.domicile;
  // }

  /*
   * this dan super
   * 1. this: obj representatif dari class dirinya sendiri
   * 2. super: obj representatif dari super classnya
   */

  /*
   * polymorphism: banyak bentuk dari suatu method atau constructor classnya
   * 1. overload: suatu class bisa menduplikat method dan/atau constructor
   * 2. override: subclass dapat meneruskan method yg dimiliki dari superclassnya
   */
}
