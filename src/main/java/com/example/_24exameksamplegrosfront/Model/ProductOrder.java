package com.example._24exameksamplegrosfront.Model;

import jakarta.persistence.*;

@Entity
public class ProductOrder {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
  private  int quantity;

  @ManyToOne
  @JoinColumn(name = "prodid", referencedColumnName = "productid")
 private Product product;

  @ManyToOne
  @JoinColumn(name ="delid", referencedColumnName = "deliveryid")
  private Delivery delivery;

}
