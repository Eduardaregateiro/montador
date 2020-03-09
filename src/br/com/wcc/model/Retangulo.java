package br.com.wcc.model;


public class Retangulo implements Shape {

    private final base;
    private final altura;

    public Retangulo (Double base, Double altura) {
        this.base  = base;
        this.altura = altura;
        
    }
    @Override
    public Double getArea() {
        return base * altura;
    }

    @Override
    public Double getPerimetro() {
         return (2 * base) + (2 * altura);
    }
    
}