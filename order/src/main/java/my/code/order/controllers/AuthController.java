package my.code.order.controllers;

import lombok.RequiredArgsConstructor;
import my.code.order.dtos.AuthenticatedUserDto;
import my.code.order.services.AuthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @GetMapping
    public AuthenticatedUserDto authenticatedUserDto(@RequestParam String username,
                                                     @RequestParam String password) {

        return authService.authAttempt(username, password);
    }
}