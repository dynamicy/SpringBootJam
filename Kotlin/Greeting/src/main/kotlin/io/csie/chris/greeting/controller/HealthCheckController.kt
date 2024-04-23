package io.csie.chris.greeting.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {
    @GetMapping("/health")
    fun health(): ResponseEntity<*> {
        return ResponseEntity.status(HttpStatus.OK).build<Any>()
    }
}