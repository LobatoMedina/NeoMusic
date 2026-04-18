package com.NeoMusic.Core.Controllers.Api;

import com.NeoMusic.Core.Permanence.DTOs.UserLogInDTO;
import com.NeoMusic.Core.Services.Interfaces.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth/")
@RequiredArgsConstructor
public class AuthController {
    @Autowired
    private final IUserService iUserService;


    @PostMapping("/SingUp")
    public ResponseEntity<TokenResponse> singUp(@RequestPart  UserLogInDTO dto){
        //todo
        return ResponseEntity.internalServerError().body(null);
    }
    @PostMapping("/LogIn")
    public ResponseEntity<TokenResponse> logIn(@RequestPart UserLogInDTO dto){
        //todo
        return ResponseEntity.internalServerError().body(null);
    }


}
