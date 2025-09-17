package com.nie.csd.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "products")
public class Products {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private String category;
    private int stock;

    public Products() {}

    public Products(String name, String description, double price, String category, int stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

        @Override
        public String toString() {
            return "Products{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", price=" + price +
                    ", category='" + category + '\'' +
                    ", stock=" + stock +
                    '}';
        }
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}