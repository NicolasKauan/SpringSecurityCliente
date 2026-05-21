package com.example.nika.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "products")
public class ProductModel {

    @Id
    private Long id;

    private String nome;

    private Double preco;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ProductModel> productModelList = new ArrayList<>();

    public ProductModel() {
    }

    public ProductModel(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

}