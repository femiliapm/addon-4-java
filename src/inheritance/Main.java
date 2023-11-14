package inheritance;

public class Main {
  public static void main(String[] args) {
    // instance obj parent
    Parent parent = new Parent();
    parent.setFname("raden ajeng");
    parent.setLname("kartini");

    System.out.println(parent.getFullname());
    System.out.println(parent);

    // instance obj child
    Child child = new Child();
    child.setFname(parent.getFname());
    child.setLname(parent.getLname());
    child.setDomicile("jepara");

    System.out.println(child.getFullname());
    System.out.println(child);

    child = new Child("ini", "budi", "jakarta");
    System.out.println(child.getFullname());
  }
}
