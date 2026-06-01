package com.marcoseduardo.password_generator_api.service;

import com.marcoseduardo.password_generator_api.dto.SenhaResponseDTO;
import com.marcoseduardo.password_generator_api.exceptions.TamanhoInvalidoException;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

@Service
public class SenhaService {

    SecureRandom secureRandom = new SecureRandom();

    private char sortearCaractere(){
        String caracteres = "abcdefghijklmnopq" +
                "rstuvwxyzABCDEFGHIJKLMNOP" +
                "QRSTUVWXYZ0123456789!@#$%&*";

        return caracteres.charAt(secureRandom.nextInt(caracteres.length()));
    }

    public SenhaResponseDTO gerarSenha(Integer tamanho){

        if(tamanho < 6 || tamanho > 50){
            throw new TamanhoInvalidoException();
        }

        StringBuilder senhaGerada = new StringBuilder();

        for(int i = 0; i < tamanho; i++){
            senhaGerada.append(sortearCaractere());
        }

        SenhaResponseDTO senhaResponseDTO = new SenhaResponseDTO(
                senhaGerada.toString(),
                tamanho
        );

        return senhaResponseDTO;

    }
}
