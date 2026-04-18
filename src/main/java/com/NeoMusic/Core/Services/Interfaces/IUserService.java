package com.NeoMusic.Core.Services.Interfaces;

import com.NeoMusic.Core.Controllers.Api.TokenResponse;
import com.NeoMusic.Core.Permanence.DTOs.UserLogInDTO;
import com.NeoMusic.Core.Permanence.DTOs.UserSignUpDTO;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    TokenResponse SingUp(UserSignUpDTO dto);
    TokenResponse LogIn(UserLogInDTO dto);


}
