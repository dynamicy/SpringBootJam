package io.csie.chris.greeting.repository

import io.csie.chris.greeting.model.User
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface UserRepository : CoroutineCrudRepository<User, String>