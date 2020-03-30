package h10s.son.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table (name = "member")
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @NotEmpty(message = "Username is required")
    @Column(name = "username", nullable = false)
    private String username;

    @NotEmpty(message = "First Name is required")
    @Column(name = "first_name", nullable = false)
    private String first_name;

    @NotEmpty(message = "Last Name is required")
    @Column(name = "last_name", nullable = false)
    private String last_name;

    @NotEmpty(message = "Mail is required")
    @Column(name = "mail", nullable = false)
    private String mail;

    @Column(name = "gender", nullable = false)
    private String gender;

    public Member() {
    }

    public Member(String username, String first_name, String last_name, String mail, String gender) {
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.mail = mail;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
