package com.son.service;

import com.son.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Iphone","1000$","Very Good","US"));
        products.put(2,new Product(2,"Samsung","800$","Good","Japan"));
        products.put(3,new Product(3,"Xiaomi","300$","Good","China"));
        products.put(4,new Product(4,"Bphone","250$","Not bad","VietNam"));
        products.put(5,new Product(5,"Vsmart","200$","Normal","VietNam"));

    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> list=new ArrayList<>(products.values());
        List<Product> result=new ArrayList<>();
        System.out.println(name);
        System.out.println(list.get(0).getName());
        for(int i=0;i<list.size();i++) {
            if(name.equals(list.get(i).getName())) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    @Override
    public void save(Product product) {
    products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }
}
