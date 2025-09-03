package com.springboot.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //defined annotation to know its a table to the spring boot
@Table(name = "address", schema = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO
//            , generator = "address_address_id_seq"
    )
//    @SequenceGenerator(name = "address_address_id_seq", sequenceName = "address_address_id_seq")
    @Column(name = "address_id")
    private Integer addressId;

    private String line1;

    private String line2;

    private String pincode;

    private String city;

    private String state;

}
