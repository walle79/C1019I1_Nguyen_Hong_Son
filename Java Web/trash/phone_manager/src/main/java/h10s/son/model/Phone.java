package h10s.son.model;

import javax.persistence.*;

@Entity
@Table (name = "phone")
public class Phone {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private long id;

    @Column (name = "name", nullable = false)
    private long name;

    @Column (name = "price", nullable = false)
    private long price;

    @Column (name = "description", nullable = false)
    private long description;

    @Column (name = "origin", nullable = false)
    private long origin;

    public Phone() {
    }

    public Phone(long name, long price, long description, long origin) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.origin = origin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getName() {
        return name;
    }

    public void setName(long name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getDescription() {
        return description;
    }

    public void setDescription(long description) {
        this.description = description;
    }

    public long getOrigin() {
        return origin;
    }

    public void setOrigin(long origin) {
        this.origin = origin;
    }
}
