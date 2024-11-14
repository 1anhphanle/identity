package com.vie.identity.mapper;

import com.vie.identity.dto.request.UserCreationRequest;
import com.vie.identity.dto.request.UserUpdateRequest;
import com.vie.identity.dto.response.UserResponse;
import com.vie.identity.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}