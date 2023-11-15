package productApp.service.customer;

import productApp.model.Customer;

public interface CustomerService {
  // kerangka untuk CRUD method
  void regisCustomer(Customer customer);

  void showAllCustomer();

  void showCustomerbyid(Integer id);
}
