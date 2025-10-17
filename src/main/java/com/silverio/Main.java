package com.silverio;

import com.silverio.*;

import main.java.com.silverio.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Túlio", 10000);
        System.out.println("Saldo = " + conta.getSaldo());
        conta.saque(5000);
        System.out.println("Novo Saldo = " + conta.getSaldo());
    }
}