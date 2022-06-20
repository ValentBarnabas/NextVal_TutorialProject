package hu.nextval.imdb.ratingsapp.security

import hu.nextval.imdb.ratingsapp.user.UserRepository
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class CustomUserDetailsService(val userRepository: UserRepository) : UserDetailsService {
    override fun loadUserByUsername(username: String?): UserDetails {
        val customer = userRepository.findByName(username!!) ?: throw UsernameNotFoundException(username)
        return User.withUsername(customer.username).password(customer.password)
            .authorities(customer.authorities.map { SimpleGrantedAuthority(it) }).build()
    }
}