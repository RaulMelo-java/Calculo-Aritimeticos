package com.melo.raul.calcular.triangulo;

public class AreaTriangulo {
    
    // Formula para calcular a àrea de um AreaTriangulo RETANGULO.
    // A = b * h / 2
    // AREA = BASE * ALTURA / 2
    
    private final int DIVISOR = 2;
    private int base;
    private int altura;
    private int area;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return area;
    }
    
    // Método para calcular a área do triangulo retangulo
    public int calcularAreaTrianguloRet(int base , int altura){
        
        area = (base * altura) / DIVISOR;
        
        return area;
    }
        
    }
    
    

