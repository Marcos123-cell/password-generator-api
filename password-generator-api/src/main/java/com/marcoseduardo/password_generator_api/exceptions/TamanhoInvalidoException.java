package com.marcoseduardo.password_generator_api.exceptions;

public class TamanhoInvalidoException extends RuntimeException {
    public TamanhoInvalidoException() {
        super("Não foi possível criar uma senha. A senha deve conter de 6 a 50 caracteres");
    }
}
