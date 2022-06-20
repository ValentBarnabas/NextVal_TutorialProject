package hu.nextval.imdb.ratingsapp.user

import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(val db: UserRepository, val passwordEncoder: PasswordEncoder) {

    fun getUsers(): List<UserEntity> = db.findAll()

    fun getUserById(id: Long) : UserEntity {
        val user = db.findById(id)
        if (user.isPresent) return user.get()
        throw RuntimeException("User with given ID does not exist: $id")
    }

    fun postUser(userEntity: UserEntity)  {
        userEntity.password = passwordEncoder.encode(userEntity.password)
        db.save(userEntity)
    }

    fun updateUser(userEntity: UserEntity) : UserEntity {
        db.findById(userEntity.id!!)
        return db.save(userEntity)
    }

    fun deleteUserById(id: Long) = db.deleteById(id)

}