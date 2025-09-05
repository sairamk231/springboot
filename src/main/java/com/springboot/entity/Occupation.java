package com.springboot.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "occupation",schema = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Occupation {

    @Column(name = "occ_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer occId;

    private String name;
}
