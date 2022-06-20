package hu.nextval.imdb.app.common.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lhu/nextval/imdb/app/common/exceptions/NotFoundException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "imdb-app"})
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.NOT_FOUND)
public final class NotFoundException extends java.lang.Exception {
    
    public NotFoundException() {
        super();
    }
}