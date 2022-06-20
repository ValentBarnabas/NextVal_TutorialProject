package hu.nextval.imdb.ratingsapp.user

import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController (val service: UserService) {

    @PreAuthorize("permitAll()")
    @GetMapping
    fun getAll(): List<UserEntity> {
        return service.getUsers()
    }

    @PreAuthorize("permitAll()")
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): UserEntity {
        return service.getUserById(id)
    }

    @PreAuthorize("permitAll()")
    @PostMapping
    fun post(@RequestBody userRequest: UserEntity): UserEntity {
        return service.postUser(userRequest)
    }

    @PreAuthorize("permitAll()")
    @PutMapping
    fun put(@RequestBody userRequest: UserEntity) : UserEntity {
        return service.updateUser(userRequest)
    }

    @PreAuthorize("permitAll()")
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        service.deleteUserById(id)
    }
}