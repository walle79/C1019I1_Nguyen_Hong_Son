import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String dob;
    private String address;
    private String img;
    private static List<Customer> list;
    static {
        list = new ArrayList<>();
        list.add(new Customer("Son","18/12/1995","DN","img/nothing"));
        list.add(new Customer("Son","18/12/1995","DN","img/nothing"));
        list.add(new Customer("Son","18/12/1995","DN","img/nothing"));
        list.add(new Customer("Son","18/12/1995","DN","img/nothing"));

    }
    public static List<Customer> getList(){
        return list;
    }

    public Customer() {
    }

    public Customer(String name, String dob, String address, String img) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public static void setList(List<Customer> list) {
        Customer.list = list;
    }
}