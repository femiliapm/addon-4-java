package abstraction.shape;

public class Kubus extends Persegi {
  public Float getVolume() {
    return super.hitungLuas() * super.getSisi();
  }
}
