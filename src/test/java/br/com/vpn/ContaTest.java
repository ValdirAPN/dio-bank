package br.com.vpn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {

    @Test
    void deveRealizarDeposito() {
        Cliente joao = new Cliente("João");
        Conta contaCorrente = new ContaCorrente(joao);

        double valorDeposito = 100;

        contaCorrente.depositar(valorDeposito);

        assertEquals(valorDeposito, contaCorrente.saldo);
    }

    @Test
    void deveRealizarTransferencia() {
        Cliente joao = new Cliente("João");
        Conta contaCorrente = new ContaCorrente(joao);
        Conta contaPoupanca = new ContaPoupanca(joao);

        double valorInicial = 100;
        contaCorrente.depositar(valorInicial);

        double valorTransferencia = 50;
        contaCorrente.transferir(valorTransferencia, contaPoupanca);

        assertEquals(contaPoupanca.saldo, valorTransferencia);
        assertEquals(contaCorrente.saldo, valorInicial - valorTransferencia);
    }

    @Test
    void deveRealizarSaque() {
        Cliente joao = new Cliente("João");
        Conta contaCorrente = new ContaCorrente(joao);

        double valorInicial = 100;
        contaCorrente.depositar(valorInicial);

        double valorSaque = 20;
        contaCorrente.sacar(valorSaque);

        assertEquals(contaCorrente.saldo, valorInicial - valorSaque);
    }
}
