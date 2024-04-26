package io.csie.chris.greeting.service

import io.csie.chris.greeting.model.User
import io.csie.chris.greeting.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository) {

    suspend fun createUser(user: User): User = userRepository.save(user)

    fun findAll(): Flow<User> = userRepository.findAll()

    suspend fun findById(id: String): User? = userRepository.findById(id)

    suspend fun deleteById(id: String) = userRepository.deleteById(id)

}