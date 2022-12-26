package com.bootcamp.pos.EzyPOS.adviser;

import com.bootcamp.pos.EzyPOS.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Mohamed Aazaf <aazafmax2@gmail.com> (www.aazafbiz.web.app)
 * @since 12/24/22
 */
@RestControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(ClassNotFoundException.class)
    public ResponseEntity<StandardResponse> NotFoundException(ClassNotFoundException e) {
        return new ResponseEntity<>(
                new StandardResponse(
                        404, e.getMessage() + " was occurred", e.getException()
                ), HttpStatus.NOT_FOUND
        );
    }
}

