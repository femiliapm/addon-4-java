package inheritance;

public class Parent {
  // attribute class
  private String fname;
  private String lname;

  // custom constructor
  public Parent() {
  }

  public Parent(String fname, String lname) {
    this.fname = fname;
    this.lname = lname;
  }

  // method getter-setter
  public String getFname() {
    return fname;
  }

  public String getLname() {
    return lname;
  }

  public void setFname(String namaDepan) {
    fname = namaDepan;
  }

  public void setLname(String namaBelakang) {
    lname = namaBelakang;
  }

  public String getFullname() {
    return this.fname + " " + this.lname;
  }
}
