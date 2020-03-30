package h10s.son.model;

import javax.persistence.*;

@Entity
@Table (name = "app_role", uniqueConstraints = {@UniqueConstraint(name = "APP_ROLE_UK",columnNames = "ROLE_NAME")})
public class AppRole {
    @Id
    @GeneratedValue
    @Column(name = "Role_Id", nullable = false)
    private long roleId;

    @Column(name = "Role_Name", length = 30, nullable = false)
    private String roleName;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
