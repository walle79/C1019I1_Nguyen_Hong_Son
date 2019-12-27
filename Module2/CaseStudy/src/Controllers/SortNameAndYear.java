package Controllers;


import Models.Customer;

import java.util.Comparator;

public class SortNameAndYear implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        int birthday1 = Integer.parseInt(c1.getBirthday().substring(c1.getBirthday().lastIndexOf("/")+1));
        int birthday2 = Integer.parseInt(c2.getBirthday().substring(c2.getBirthday().lastIndexOf("/")+1));
        int res = birthday2 - birthday1;
        String name1 = c1.getName().substring(c1.getName().lastIndexOf(" "));
        String name2 = c2.getName().substring(c2.getName().lastIndexOf(" "));
        int rs = name1.compareTo(name2);
        if (rs == 0) {
            if (res > 0) {
                  return -1; // do nothing
            } else if (res <0) {
                  return 1; // swap
              }
                  return 0;
        } else {
            return rs;
        }
    }
}
