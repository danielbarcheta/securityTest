package com.rewardshub.dto;


import com.rewardshub.model.Role;

public record CreateUserDTO(String email, String password, Role role) {

}