package com.marcoseduardo.password_generator_api.controller;

import com.marcoseduardo.password_generator_api.dto.SenhaResponseDTO;
import com.marcoseduardo.password_generator_api.service.SenhaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/senhas")
@RequiredArgsConstructor
public class SenhaController {

    private final SenhaService senhaService;

    @GetMapping("/gerarSenha/{tamanho}")
    public SenhaResponseDTO gerarSenha(@PathVariable Integer tamanho){
        return senhaService.gerarSenha(tamanho);
    }
}
