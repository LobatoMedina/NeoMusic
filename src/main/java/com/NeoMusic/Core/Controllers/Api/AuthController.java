package com.NeoMusic.Core.Controllers.Api;

import com.NeoMusic.Core.Services.Interfaces.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth/")
@RequiredArgsConstructor
public class AuthController {
    @Autowired
    private final IUserService iUserService;
    


}
