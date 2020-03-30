package h10s.son.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table (name = "product")
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private long id;

    @NotEmpty(message = "Không được để trống")
    @Column (name = "name", nullable = false)
    private String name;

    @Column (name = "type_product", nullable = false)
    private String type_product;

    @Min(value = 1, message = "Phải là số nguyên dương")
    @Column (name = "price", nullable = false)
    private int price;

    @Min(value = 1, message = "Phải là số nguyên dương")
    @Column (name = "amount", nullable = false)
    private int amount;

    @NotEmpty (message = "Không được để trống")
    @Column (name = "description", nullable = false)
    private String description;

    public Product() {
    }

    public Product(String name, String type_product, int price, int amount, String description) {
        this.name = name;
        this.type_product = type_product;
        this.price = price;
        this.amount = amount;
        this.description = description;
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

    public String getType_product() {
        return type_product;
    }

    public void setType_product(String type_product) {
        this.type_product = type_product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
