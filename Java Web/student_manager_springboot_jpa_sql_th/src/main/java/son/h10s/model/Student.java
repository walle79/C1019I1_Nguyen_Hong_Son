package son.h10s.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table (name = "student")
public class Student implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id", nullable = false)
    private long id;

    @NotEmpty (message = "Name is required")
    @Size (min = 6, max = 30, message = "Invalid name")
    @Column (name = "full_name", nullable = false)
    private String name;

    @Column (name = "age", nullable = false)
    private int age;

    @NotEmpty (message = "Mail is required")
    @Pattern(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$", message = "Invalid mail")
    @Column (name = "mail", nullable = false)
    private String mail;

    @Pattern(regexp = "^((09)[0-9]{8})", message = "Invalid phone, format: 09xxxxxxxx")
    @Column (name = "phone_number", nullable = false)
    private String phone_number;

    @Column (name = "teacher", nullable = false)
    private String teacher;

    public Student() {
    }

    public Student( String name, int age , String mail, String phone_number, String teacher) {
        this.name = name;
        this.age = age;
        this.mail = mail;
        this.phone_number = phone_number;
        this.teacher = teacher;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
