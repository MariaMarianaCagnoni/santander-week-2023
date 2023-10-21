package me.dio.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * @author mariana
 * @Project: santander-week-2023
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;


    @OneToOne(cascade = CascadeType.ALL)
    private Account account;


    @OneToOne(cascade = CascadeType.ALL)
    private Card card;


    @OneToMany(cascade = CascadeType.ALL)
    private List<Feature> feature;


    @OneToMany(cascade = CascadeType.ALL)
    private List<News> news;

}
