package com.example.Customer.domine;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TYPE")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "product_id")
    private Long productId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "cust_id", referencedColumnName = "id")
    private Customer customer;

    @Override
    @Generated
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        Product that = (Product) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    @Generated
    public int hashCode() {
        return getClass().hashCode();
    }

}
