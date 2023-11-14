package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
  private static void setExample() {
    // instance set
    // instance obj dari interface
    Set<String> days = new HashSet<>();

    // tambah value
    days.add("senin");
    days.add("selasa");
    days.add("rabu");
    days.add("kamis");
    days.add("jumat");
    days.add("sabtu");
    days.add("sabtu");
    days.add("minggu");

    System.out.println(days);
  }

  private static void listExample() {
    // instance list
    List<Object> listDay = new ArrayList<>();

    // nambah value
    listDay.add("senin");
    listDay.add(2);
    listDay.add("selasa");
    listDay.add(3);
    listDay.add("kamis");
    listDay.add(true);
    listDay.add("sabtu");
    listDay.add(false);
    listDay.add("minggu");

    // [[1,3,5], [2,4,6]]
    // instance obj
    List<Integer[]> arr2D = new ArrayList<>();

    Integer[] temp1 = { 1, 3, 5 };
    Integer[] temp2 = { 2, 4, 6 };

    arr2D.add(temp1);
    arr2D.add(temp2);

    System.out.println(arr2D);

    // prefer this!!
    List<List<Integer>> arrnum2D = new ArrayList<>();

    List<Integer> num1 = new ArrayList<>(Arrays.asList(1, 3, 5));
    List<Integer> num2 = new ArrayList<>(Arrays.asList(2, 4, 6));

    arrnum2D.add(num1);
    arrnum2D.add(num2);

    System.out.println(arrnum2D);

    System.out.println(listDay);

    List<Integer> temp = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      temp.add(i);
    }
    System.out.println(temp);
  }

  private static void mapExample() {
    // instance map
    Map<String, Integer> orders = new HashMap<>();

    // tambah data
    orders.put("ITM01", 90);
    orders.put("ITM02", 50);

    System.out.println(orders);
  }

  public static void main(String[] args) {
    setExample();
    listExample();
    mapExample();
  }
}
