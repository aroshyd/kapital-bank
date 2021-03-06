package uz.pdp.kapitalbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 14,nullable = false)
    private String name;

    @Column(length = 3,nullable = false)
    private String country;

    private String address;

    private String phone;
}
