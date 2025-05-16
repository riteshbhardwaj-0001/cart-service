package com.example.CartService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "carts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cart extends BaseEntity{
    @Column(precision = 10, scale = 2)
    private BigDecimal totalWithoutTax;
    @Column(precision = 10, scale = 2)
    private BigDecimal totalTax;
    @Column(precision = 10, scale = 2)
    private BigDecimal cartTotal;


}
