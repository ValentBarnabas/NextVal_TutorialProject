package hu.nextval.imdb.ratingsapp.user

import org.springframework.context.annotation.Primary
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Primary
@Repository
interface UserRepository : JpaRepository<UserEntity, Long> {
    @Query("SELECT u from UserEntity u where UPPER(u.username) LIKE UPPER(:name)")
    fun findByName(name: String) : UserEntity?

//    @Query("SELECT a from UserEntity.authorities a, UserEntity u where  = u.id")
//    fun findAuthoritiesById(id: Long) : List<String>
}