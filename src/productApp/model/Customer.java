package productApp.model;

import java.util.Objects;

public class Customer {
  // attribute
  // private Integer id;
  private String firstName;
  private String lastName;
  private String email;

  // constructor
  public Customer() {
  }

  public Customer(String email) {
    this.setEmail(email);
  }

  // method setter-getter
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    if (email == "" || Objects.isNull(email)) {
      throw new RuntimeException("Email is required!");
    }

    this.email = email;
  }

  @Override
  public String toString() {
    return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
  }

}
