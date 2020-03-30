package son.java.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "contract")
public class Contract implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn (name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn (name = "service_id")
    private Service service;

    @Column(name = "contract_day", nullable = false)
    private Date contract_day;

    @Column(name = "contract_end", nullable = false)
    private Date contract_end;

    @Column(name = "total_cost", nullable = false)
    private int total_cost;

    @OneToMany(mappedBy = "contract", fetch = FetchType.LAZY)
    private List<ContractDetail> contractDetailList;

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }

    public Contract() {
    }

    public Contract(Customer customer, Service service, Date contract_day, Date contract_end, int total_cost) {
        this.customer = customer;
        this.service = service;
        this.contract_day = contract_day;
        this.contract_end = contract_end;
        this.total_cost = total_cost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Date getContract_day() {
        return contract_day;
    }

    public void setContract_day(Date contract_day) {
        this.contract_day = contract_day;
    }

    public Date getContract_end() {
        return contract_end;
    }

    public void setContract_end(Date contract_end) {
        this.contract_end = contract_end;
    }

    public int getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(int total_cost) {
        this.total_cost = total_cost;
    }
}
