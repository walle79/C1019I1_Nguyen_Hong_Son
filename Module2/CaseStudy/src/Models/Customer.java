package Models;

public class Customer {
    private String name;
    private String birthday;
    private String gender;
    private String id;
    private int idCardNumber;
    private int phoneNumber;
    private String email;
    private String typeOfCustomer;
    private String address;
    private Services services;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, String id, int phoneNumber, String email, String typeOfCustomer, String address) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public int getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(int idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String showInfo(){
        return  "Customer" +
                "\n1. Name: " + this.name +
                "\n2. BirthDay: " + this.birthday +
                "\n3. Gender: " + this.gender +
                "\n4. Id: " + this.id +
                "\n5. CMND: " +this.idCardNumber +
                "\n5. Phone Number: " + this.phoneNumber +
                "\n6. Email: " + this.email +
                "\n7. Type of Customer: " + this.typeOfCustomer +
                "\n8. Address: " + this.address +
                "\n-------------------------";
    }

    public void setServices(String nextLine) {
    }
}
