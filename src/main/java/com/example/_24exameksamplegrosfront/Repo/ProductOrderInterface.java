package com.example._24exameksamplegrosfront.Repo;

import com.example._24exameksamplegrosfront.Model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderInterface extends JpaRepository<ProductOrder, Integer> {
}
