package io.csie.chris.greeting.controller

import io.csie.chris.greeting.model.User
import io.csie.chris.greeting.service.UserService
import kotlinx.coroutines.flow.Flow
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class UserController(private val userService: UserService) {
    @PostMapping("/user/add")
    suspend fun addUser(@RequestBody user: User): ResponseEntity<User> {
        return ResponseEntity.ok(userService.createUser(user))
    }

    @GetMapping("/user/{id}")
    suspend fun findById(@PathVariable id: String): ResponseEntity<User?> {
        return ResponseEntity.ok(userService.findById(id))
    }

    @GetMapping("/users")
    suspend fun findAll(): ResponseEntity<Flow<User>> {
        return ResponseEntity.ok(userService.findAll())
    }

    @DeleteMapping("/user/{id}")
    suspend fun deleteUser(@PathVariable id: String): ResponseEntity<Unit> {
        userService.deleteById(id)
        return ResponseEntity.noContent().build()
    }
}