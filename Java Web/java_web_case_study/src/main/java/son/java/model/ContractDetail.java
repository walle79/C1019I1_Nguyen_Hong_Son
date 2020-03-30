package son.java.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "contract_detail")
public class ContractDetail implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn (name = "contract_id")
    private Contract contract;

    @Column (name = "companied_service_name", nullable = false)
    private String companied_service_name;

    @Column (name = "price", nullable = false)
    private int price;

    @Column (name = "unit", nullable = false)
    private int unit;

    @Column (name = "status", nullable = false)
    private String status;

    public ContractDetail() {
    }

    public ContractDetail(Contract contract, String companied_service_name, int price, int unit, String status) {
        this.contract = contract;
        this.companied_service_name = companied_service_name;
        this.price = price;
        this.unit = unit;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getCompanied_service_name() {
        return companied_service_name;
    }

    public void setCompanied_service_name(String companied_service_name) {
        this.companied_service_name = companied_service_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
