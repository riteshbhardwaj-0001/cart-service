package com.example.CartService.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartEntry extends BaseEntity{

    private Integer quantity;
    @Column(precision = 10, scale = 2)
    private BigDecimal basePrice;
    @Column(precision = 10, scale = 2)
    private BigDecimal taxes;
    @Column(precision = 10, scale = 2)
    private BigDecimal totalPrice;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;
}
