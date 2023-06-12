package com.herman87.addmapstructgradle.mapper;

import com.herman87.addmapstructgradle.domain.User;
import com.herman87.addmapstructgradle.domain.UserDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(uses = UUID.class)
public interface UserMapper {
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "firstName", source = "firstName")
    User toUser(UserDTO userDto);

}
