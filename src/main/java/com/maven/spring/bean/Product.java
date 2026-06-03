package com.maven.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data



public class Product {
    private int id;
    private String name;
    private String brand;
    private int price;



    private int manufactureYear;


    public Product() {
    }

    public Product(int id, String name, String brand, int price, int manufactureYear) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.manufactureYear = manufactureYear;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", manufactureYear=" + manufactureYear +
                '}';
    }
}
