package com.marcoseduardo.password_generator_api.exceptions;

import com.marcoseduardo.password_generator_api.dto.ErroDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(TamanhoInvalidoException.class)

    public ResponseEntity<ErroDTO> tratarTamanhoSenha(TamanhoInvalidoException exception){
        ErroDTO erro = new ErroDTO(exception.getMessage());

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(erro);
    }
}
