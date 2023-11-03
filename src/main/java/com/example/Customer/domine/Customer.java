package com.example.Customer.domine;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "CUSTOMER_DETAILS")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    private List<Product> productList;


    @Override
    @Generated
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        Customer that = (Customer) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    @Generated
    public int hashCode() {
        return getClass().hashCode();
    }

}
