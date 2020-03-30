package h10s.son.model;

import javax.persistence.*;

@Entity
@Table (name = "user_role", uniqueConstraints = {@UniqueConstraint(name = "USER_ROLE_UK", columnNames = {"USER_ID","ROLE_ID"})})
public class UserRole {

    @Id
    @GeneratedValue
    @Column (name = "Id", nullable = false)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Role_Id", nullable = false)
    private AppRole appRole;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_Id", nullable = false)
    private UserRole userRole;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AppRole getAppRole() {
        return appRole;
    }

    public void setAppRole(AppRole appRole) {
        this.appRole = appRole;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
