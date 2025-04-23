package br.com.lucas.bean;

import br.com.lucas.ejb.SaudacaoService;
import jakarta.ejb.EJB;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class SaudacaoBean {

    @EJB
    private SaudacaoService saudacaoService;

    private String nome;
    private String mensagem;

    public void gerarMensagem() {
        mensagem = saudacaoService.ola(nome);
    }

}