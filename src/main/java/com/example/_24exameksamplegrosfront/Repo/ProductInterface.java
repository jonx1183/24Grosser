package com.example._24exameksamplegrosfront.Repo;

import com.example._24exameksamplegrosfront.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInterface extends JpaRepository<Product, Integer> {

}
