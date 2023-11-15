package productApp.service.customer;

import java.util.List;
import java.util.Objects;

import productApp.dao.CustomerDao;
import productApp.model.Customer;

public class CustomerServiceImpl implements CustomerService {
  CustomerDao customerDao;

  public CustomerServiceImpl(CustomerDao customerDao) {
    this.customerDao = customerDao;
  }

  @Override
  public void regisCustomer(Customer customer) {
    // cek null customer
    if (Objects.isNull(customer)) {
      throw new RuntimeException("Customer can't be null!");
    }

    // save data ke dao/db
    customerDao.save(customer);
    System.out.println("Customer successfully added!");
  }

  @Override
  public void showAllCustomer() {
    List<Customer> customers = customerDao.findAll();

    for (int i = 0; i < customers.size(); i++) {
      System.out.println((i + 1) + ". " + customers.get(i));
    }
  }

  @Override
  public void showCustomerbyid(Integer id) {
    if (id > customerDao.size()) {
      throw new RuntimeException("ID is not found!");
    }

    Customer customer = customerDao.findById(id);
    System.out.println(customer);
  }

}
