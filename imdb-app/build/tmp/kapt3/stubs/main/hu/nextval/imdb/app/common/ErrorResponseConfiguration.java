package hu.nextval.imdb.app.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017\u00a8\u0006\n"}, d2 = {"Lhu/nextval/imdb/app/common/ErrorResponseConfiguration;", "", "()V", "handleBadRequestException", "Lorg/springframework/http/ResponseEntity;", "Lhu/nextval/imdb/app/common/ErrorResponse;", "exception", "Lhu/nextval/imdb/app/common/exceptions/BadRequestException;", "request", "Lorg/springframework/web/context/request/WebRequest;", "imdb-app"})
@org.springframework.web.bind.annotation.ControllerAdvice
public class ErrorResponseConfiguration {
    
    public ErrorResponseConfiguration() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {hu.nextval.imdb.app.common.exceptions.BadRequestException.class})
    public org.springframework.http.ResponseEntity<hu.nextval.imdb.app.common.ErrorResponse> handleBadRequestException(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.common.exceptions.BadRequestException exception, @org.jetbrains.annotations.NotNull
    org.springframework.web.context.request.WebRequest request) {
        return null;
    }
}