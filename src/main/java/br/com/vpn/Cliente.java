package br.com.vpn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Cliente {

    @Getter
    @Setter
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
}
