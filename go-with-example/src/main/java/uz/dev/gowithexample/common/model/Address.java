package uz.dev.gowithexample.common.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = true)
    private String region;
    @Column(unique = true, nullable = false)
    private String street;
    @Column(unique = true, nullable = false)
    private int buildingNumber;
}
