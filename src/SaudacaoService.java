package br.com.lucas.ejb;

import jakarta.ejb.Stateless;

@Stateless
public class SaudacaoService {
    public String ola(String nome) {
        return "Olá, " + nome + "!";
    }
}