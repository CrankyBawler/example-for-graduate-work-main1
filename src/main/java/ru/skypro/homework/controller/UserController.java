package ru.skypro.homework.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.homework.dto.SetPassword;

@RestController
@RequestMapping ("/users")
public class UserController {
    private final SetPassword setPassword;

    @PostMapping("/set_password")
    public ResponseEntity<?> password (@RequestBody SetPassword currentPassword, @RequestBody SetPassword newPassword) {
        if (setPassword.currentPassword(setPassword.getCurrentPassword()) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
