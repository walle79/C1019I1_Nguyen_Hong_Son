package com.codegym.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorys")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String categoryName;

    @OneToMany(targetEntity = Blog.class)
    private List<Blog> blogs;


    public Category() {
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}