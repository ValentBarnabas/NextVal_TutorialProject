package hu.nextval.imdb.app.common

import hu.nextval.imdb.app.common.exceptions.BadRequestException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import java.time.Instant

data class ErrorResponse(val timestamp: Instant, val status: Int, val message: String?)

@ControllerAdvice
class ErrorResponseConfiguration {

    @ExceptionHandler(value = [BadRequestException::class])
    fun handleBadRequestException(exception: BadRequestException, request: WebRequest): ResponseEntity<ErrorResponse> {
        val error = ErrorResponse(Instant.now(), HttpStatus.BAD_REQUEST.value(), exception.message)
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error)
    }

}