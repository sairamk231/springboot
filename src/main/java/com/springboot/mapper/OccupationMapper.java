package com.springboot.mapper;

import com.springboot.entity.Occupation;
import com.springboot.model.request.OccupationRequest;
import com.springboot.model.response.OccupationResponse;
import org.mapstruct.Mapper;

@Mapper
public interface OccupationMapper {

    Occupation toEntity(OccupationRequest occupationRequest);

    OccupationResponse toOccupationResponse(Occupation occupation);
}
