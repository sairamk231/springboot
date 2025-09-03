package com.springboot.mapper;

import com.springboot.entity.Address;
import com.springboot.model.request.AddressRequest;
import com.springboot.model.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {

    Address toEntity(AddressRequest addressRequest);

   AddressResponse toResponse(Address address);
}
