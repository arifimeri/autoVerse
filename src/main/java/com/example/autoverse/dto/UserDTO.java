package com.example.autoverse.dto;

import com.example.autoverse.enums.Role;

public record UserDTO (Long id, String fullName, String email, String phoneNumber, Role role){
}
