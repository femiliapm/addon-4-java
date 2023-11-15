package productApp;

import java.util.Scanner;

import productApp.dao.CustomerDao;
import productApp.model.Customer;
import productApp.service.customer.CustomerService;
import productApp.service.customer.CustomerServiceImpl;

public class Main {
  // instance attr
  // dao attr
  static CustomerDao customerDao = new CustomerDao();

  // service attr
  static CustomerService customerService = new CustomerServiceImpl(customerDao);

  private static void showMenu() {
    System.out.println("""
        === SISTEM ORDER PRODUCT ===
        1. Register Customer
        2. Show All Customer
        3. Show Customer
        """);
    System.out.print("Input menu: ");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Boolean retry = true;

    try {
      do {
        showMenu();
        String opsi = sc.nextLine();

        switch (opsi) {
          case "1":
            System.out.println("=== REGISTER CUSTOMER ===");

            // input data
            System.out.print("Fist Name: ");
            String fname = sc.nextLine();
            System.out.print("Last Name: ");
            String lname = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();

            // instance obj customer
            Customer customer = new Customer(email);
            customer.setFirstName(fname);
            customer.setLastName(lname);

            customerService.regisCustomer(customer);
            break;

          case "2":
            System.out.println("=== SHOW ALL CUSTOMER ===");

            customerService.showAllCustomer();
            break;

          case "3":
            System.out.println("=== SHOW CUSTOMER BY ID ===");

            customerService.showAllCustomer();

            System.out.print("Input ID: ");
            Integer id = Integer.parseInt(sc.nextLine());
            customerService.showCustomerbyid(id);
            break;

          default:
            System.out.println("Menu doesn't exists!");
            break;
        }

        while (true) {
          System.out.print("Want to retry menu? (y|n): ");
          String ans = sc.nextLine();
          if ("y".equalsIgnoreCase(ans)) {
            break;
          } else if ("n".equalsIgnoreCase(ans)) {
            retry = false;
            break;
          } else {
            System.out.println("Wrong input!");
            continue;
          }
        }

      } while (retry);

    } catch (Exception e) {
      System.err.println(e.getMessage());
    } finally {
      sc.close();
    }
  }
}
