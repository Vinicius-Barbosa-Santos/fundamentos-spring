package br.com.vinicius.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MeuComponente {
    public String chamarMeuComponent() {
        return "Chamando meu componente";
    }
}
