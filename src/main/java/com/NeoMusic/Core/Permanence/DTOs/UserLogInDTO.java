package com.NeoMusic.Core.Permanence.DTOs;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class UserLogInDTO {
    @Email
    @Length(min = 6, max = 128)
    private String email;
    @Length(min = 8, max = 128)
    private String password;
}
