package br.tjro.csd.domain;

public class FizzBuzz  {
    private static final int TRES = 3;
    private static final int CINCO = 5;

    
    public boolean ehDivisivelPor(int numero, int divisor){
        return (numero%divisor == 0);
    }


    public String ehDivisivelPorTres(int numero){
        return (this.ehDivisivelPor(numero, TRES)?"Fizz":String.valueOf(numero));
        
    }


    public String ehDivisivelPorCinco(int numero){
        return (this.ehDivisivelPor(numero, CINCO)?"Buzz":String.valueOf(numero));
        
    }


    public String ehDivisivelPorTresEhCinco(int numero){
         return (this.ehDivisivelPor(numero, TRES) && this.ehDivisivelPor(numero, CINCO))?"FizzBuzz":String.valueOf(numero);
    }


    
}
