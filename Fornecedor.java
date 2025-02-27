package Herança_2;

public class Fornecedor {

    double ValorCred;
    double ValorDivida;

   public Fornecedor(){
   }

   public void ObterValor(){
       System.out.println("");
       System.out.println("Valor: RS");
   }


    public double getValorCred() {
        return ValorCred;
    }

    public void setValorCred(double valorCred) {
        ValorCred = valorCred;
    }

    public double getValorDivida() {
        return ValorDivida;
    }

    public void setValorDivida(double valorDivida) {
        ValorDivida = valorDivida;
    }

    public Fornecedor(double ValorCred, double ValorDivida){

   }
}