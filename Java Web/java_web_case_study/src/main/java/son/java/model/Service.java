package son.java.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "service")
public class Service implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "area", nullable = false)
    private int area;

    @Column(name = "number_of_floor", nullable = false)
    private int number_of_floor;

    @Column(name = "max_people", nullable = false)
    private int max_people;

    @Column(name = "fee_rent", nullable = false)
    private int fee_rent;

    @Column(name = "type_rent", nullable = false)
    private String type_rent;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "status", nullable = false)
    private String status;

    @OneToMany(mappedBy = "service", fetch = FetchType.LAZY)
    private List<Contract> contractList;

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public Service() {
    }

    public Service(String name, int area, int number_of_floor, int max_people, int fee_rent, String type_rent, int price, String status) {
        this.name = name;
        this.area = area;
        this.number_of_floor = number_of_floor;
        this.max_people = max_people;
        this.fee_rent = fee_rent;
        this.type_rent = type_rent;
        this.price = price;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNumber_of_floor() {
        return number_of_floor;
    }

    public void setNumber_of_floor(int number_of_floor) {
        this.number_of_floor = number_of_floor;
    }

    public int getMax_people() {
        return max_people;
    }

    public void setMax_people(int max_people) {
        this.max_people = max_people;
    }

    public int getFee_rent() {
        return fee_rent;
    }

    public void setFee_rent(int fee_rent) {
        this.fee_rent = fee_rent;
    }

    public String getType_rent() {
        return type_rent;
    }

    public void setType_rent(String type_rent) {
        this.type_rent = type_rent;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
