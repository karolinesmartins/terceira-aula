package br.com.bancosantanderkaroline;

public class Cliente {

    //Atributos
    private int numeroConta;
    private String sobrenome;
    private String rg;
    private String cpf;

    //Construtor padrão
    public Cliente (){

    }

    //Construtor esoecífico
    public Cliente( int numeroConta, String sobrenome, String rg, String cpf){
        this.numeroConta = numeroConta;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
    }

    public int getNumeroConta(){return this.numeroConta;}
    public String getSobrenome(){return this.sobrenome;}
    public String getRg(){return this.rg;}
    public String getCpf(){return this.cpf;}


