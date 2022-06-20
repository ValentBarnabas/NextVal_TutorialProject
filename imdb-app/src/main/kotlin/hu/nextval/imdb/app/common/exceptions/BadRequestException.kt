package hu.nextval.imdb.app.common.exceptions

//@ResponseStatus(value = HttpStatus.BAD_REQUEST)
class BadRequestException : RuntimeException {
    constructor() : super()
    constructor(message: String) : super(message)
}