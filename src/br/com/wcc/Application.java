package br.com.wcc;

import br.com.wcc.model.Circulo;
import br.com.wcc.model.Retangulo;

public class Application {
    
        public static void main (String [] args){
        Circulo circulo1 = new Circulo (1d);
        Circulo circulo2 = new Circulo (2d);
        System.out.println("circulo1: area:" + circulo1.getArea() +
                            "perimetro: " + circulo1.getPerimetro());
        System.out.println("circulo2: area:" + circulo2.getArea() +
                            "perimetro: " + circulo2.getPerimetro());

        Retangulo retangulo1 = new Retangulo ( 2d, 4d);
        Retangulo retangulo2 = new Retangulo ( 1d, 2d);

        System.out.println("retangulo1: area:" + retangulo1.getArea() +
                            " perimetro: " + retangulo1.getPerimetro());
        System.out.println("retangulo2: area: " + retangulo2.getArea() +
                            " perimetro: " + retangulo2.getPerimetro());

    }
}