package com.springboot.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user_info")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserInfo {

    @Column(name = "user_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "mobile_no")
    private String mobileNumber;

    private String salary;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    /** 🔹 Many-to-Many with Occupation */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "user_occupation",
            schema = "user",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "occ_id")
    )
    private Set<Occupation> occupations = new HashSet<>();

}
