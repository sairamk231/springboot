package com.springboot.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponse {

    private Integer addressId;

    private String line1;

    private String line2;

    private String pincode;

    private String city;

    private String state;

}
