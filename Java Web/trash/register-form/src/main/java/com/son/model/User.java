package com.son.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table (name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Không được để trống")
    @Size(min = 5, max = 45, message = "Không đủ độ dài")
    private String name;
    @NotEmpty(message = "Không được để trống")
    private int phone_number;
    @NotEmpty(message = "Không được để trống")
    @Min(value = 18, message = "Tối thiểu 18 tuổi mới được đăng ký")
    private int age;
    @NotEmpty(message = "Không được để trống")
    private String email;

    public User() {
    }

    public User(String name, int phone_number, int age, String email) {
        this.name = name;
        this.phone_number = phone_number;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
