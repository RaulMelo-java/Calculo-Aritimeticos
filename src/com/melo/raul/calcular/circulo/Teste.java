
package com.melo.raul.calcular.circulo;

public class Teste {
    
    public static void main(String[] args) {
        
        //Instanciando os objetos para fazer os calculos
        Circulo circulo = new Circulo();
        Circulo circulo2 = new Circulo();
        Circulo circuloMetodoGETendSET = new Circulo();
        
        
        //Chamando o método para calcular a área do circulo
        double areaCirculo = circulo.calcularArea(2);
        double areaCirculo2 = circulo2.calcularArea(5);
        double raioSET ; 
        
        /* O Códogo abaixo eu tento mostrar com diferentes jeitos
        *de imprimir o resultado na tela 
        */
        System.out.println("Area total do circulo é: " );
        System.out.println(areaCirculo);
        
        
        System.out.println("Area total do circulo 2 é: " );
        System.out.println(areaCirculo2);
        
        circuloMetodoGETendSET.calcularArea(5);
        System.out.println(circuloMetodoGETendSET.getArea());
         
        circuloMetodoGETendSET.setRaio(5);
        
        raioSET = circuloMetodoGETendSET.getRaio();
         
        circuloMetodoGETendSET.calcularArea(circuloMetodoGETendSET.getRaio());
        System.out.println(circuloMetodoGETendSET.getArea());
        
        System.out.println(raioSET);
        
        
    }
    
}
