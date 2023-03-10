package service;

import main.java.ContaBancaria;

public class ContaBancariaService {

    public Double sacar(ContaBancaria conta, Double valor) {
        if (conta == null) {
            return 0.0;
        }
        if (valor <= conta.getSaldo()) {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Transação de saque realisada com sucesso.");
            System.out.println(conta.getSaldo());
        } else {
            System.out.println("Não foi possivel realizar a transação");
            System.out.println("O valor solicitado foi superior ao valor disponivel no saldo");
            System.out.println(conta.getSaldo());
        }
        return valor;

    }
    public Double depositar(ContaBancaria conta, Double valor) {
        if (conta == null) {
            return 0.0;
        }
        if (valor >= 0) {
            conta.setSaldo(conta.getSaldo() + valor);
            System.out.println("Transação de depósito realisada com sucesso.");
            System.out.println("Saldo atual na conta é :" + conta.getSaldo());
        } else {
            System.out.println("Não foi possivel realizar a transação. O valor precisa ser maior que zero");
            System.out.println(conta.getSaldo());
        }
        return valor;
    }
}
