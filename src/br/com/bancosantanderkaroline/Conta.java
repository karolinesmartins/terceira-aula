package br.com.bancosantanderkaroline;

public abstract class Conta {

    //Atributos

    private Cliente cliente;
    private double saldo;

    //Métodos
    private boolean sacar(double valor){
        return true;
    }
    private void depositar (double valor){
        System.out.println("Você sacou: ");
    }}

