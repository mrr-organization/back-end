package com.api.mrr.mapper;

import com.api.mrr.model.Registration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.Date;

@Mapper
public interface RegistrationMapper {

    RegistrationMapper INSTANCE = Mappers.getMapper(RegistrationMapper.class);

    @Mappings({
            @Mapping (source = "userNo", target = "userNo"),
            @Mapping (source = "roleId", target = "roleId"),
            @Mapping (source = "addDate", target = "addDate")
    })
    Registration createRegistration (Long userNo, Long roleId, Date addDate);
}
