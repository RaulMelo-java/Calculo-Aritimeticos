package com.melo.raul.calcular.circulo;

public class Circulo {
     
// Formula para calular a area de circulo
// A = PI * RAIO ^ 2

// Autor Raul 
    
private double raio;
private final double PI = 3.14; 
private final int QUADRADO = 2;
private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


   // Método de calcular a área do circulo chamando a Classe Math
   public double calcularArea(double raio){
      
       area = PI * Math.pow(raio, QUADRADO);
       
       return area; 
   }
  
        
   
    
}
