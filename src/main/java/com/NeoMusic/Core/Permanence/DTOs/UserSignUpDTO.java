package com.NeoMusic.Core.Permanence.DTOs;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.NumberFormat;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class UserSignUpDTO {
    @Email
    @Length(min = 6, max = 128)
    private String email;
    @Length(min = 8, max = 128)
    private String password;
    @Length(min = 10, max = 12)
    private String phone;
    @Length(min = 8, max = 128)
    private String name;
    @Length(min = 8, max = 128)
    private String lastName;
    @Length(min = 8, max = 128)
    private String nickname;

}
