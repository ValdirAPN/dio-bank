package br.com.vpn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void deveCriarCliente() {
        String nome = "João";
        Cliente cliente = new Cliente(nome);
        assertEquals(nome, cliente.getNome());
    }
}
