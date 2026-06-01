package com.marcoseduardo.password_generator_api.service;

import com.marcoseduardo.password_generator_api.dto.SenhaResponseDTO;
import com.marcoseduardo.password_generator_api.exceptions.TamanhoInvalidoException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class SenhaService {

    Random random = new Random();

    private char sortearCaractere(){
        String caracteres = "abcdefghijklmnopq" +
                "rstuvwxyzABCDEFGHIJKLMNOP" +
                "QRSTUVWXYZ0123456789!@#$%&*";

        return caracteres.charAt(random.nextInt(caracteres.length()));
    }

    public SenhaResponseDTO gerarSenha(Integer tamanho){

        if(tamanho < 6 || tamanho > 50){
            throw new TamanhoInvalidoException();
        }

        StringBuilder senhaGerada = new StringBuilder();

        String senha = "";

        for(int i = 0; i <= tamanho; i++){
            senha = senhaGerada.append(sortearCaractere()).toString();
        }

        SenhaResponseDTO senhaResponseDTO = new SenhaResponseDTO(
                senha,
                tamanho
        );

        return senhaResponseDTO;

    }
}
