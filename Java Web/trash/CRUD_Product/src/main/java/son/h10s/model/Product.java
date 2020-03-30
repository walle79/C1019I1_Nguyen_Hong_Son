package son.h10s.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table (name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @NotEmpty(message = "Không được để trống!")
    @Pattern(regexp = "^(HS)-([0-9]{4})$", message = "ID phải có dạng HS-XXXX")
    @Column(name = "product_id")
    private String product_id;

    @NotEmpty(message = "Không được để trống!")
    @Size(min = 6, max = 20, message = "Độ dài từ 6-20 ký tự!")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "Không được để trống!")
    @Column(name = "price")
    private String price;

    @NotEmpty(message = "Không được để trống!")
    @Column(name = "description")
    private String description;

    @NotEmpty(message = "Không được để trống!")
    @Column(name = "origin")
    private String origin;

    @Column(name = "status")
    private String status;

    public Product() {
    }

    public Product( String product_id, String name, String price, String description, String origin, String status) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.origin = origin;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
