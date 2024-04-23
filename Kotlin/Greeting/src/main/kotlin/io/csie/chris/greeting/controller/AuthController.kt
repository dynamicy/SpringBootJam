package io.csie.chris.greeting.controller

import io.csie.chris.greeting.model.User
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/auth")
class AuthController {
    @PostMapping("/signup")
    fun signup(@RequestBody user: User): ResponseEntity<String> {
        // TODO: Implement user registration logic
        return ResponseEntity.ok("User registered successfully!")
    }

    @PostMapping("/login")
    fun login(@RequestBody user: User): ResponseEntity<String> {
        // TODO: Implement user login logic
        return ResponseEntity.ok("User login successfully!")
    }
}