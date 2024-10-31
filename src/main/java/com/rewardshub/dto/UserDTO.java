package com.rewardshub.dto;

import com.rewardshub.model.Role;

import java.util.List;

public record UserDTO(Long id, String email, List<Role> roles) {

}