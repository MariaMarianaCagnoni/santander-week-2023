package me.dio.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author mariana
 * @Project: santander-week-2023
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(unique = true)
    private String number;

    @Column
    private String agency;

    @Column(scale = 13, precision = 2)
    private BigDecimal balance;

    @Column(name = "available_limit", scale = 13, precision = 2)
    private BigDecimal limit;
}
