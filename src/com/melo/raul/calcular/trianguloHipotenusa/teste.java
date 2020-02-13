
package com.melo.raul.calcular.trianguloHipotenusa;


    public class teste {

    public static void main(String[] args) {
       
        
        // CALCULANDO HIPOTENUSA DO TRIANGULO RETANGULO
        
        HipotenusaTriangulo triangulo2 = new HipotenusaTriangulo();
        
        triangulo2.setLadoA(15);
        triangulo2.setLadoB(20);
        
        triangulo2.calcularHipotenusaSimples();
        System.out.println("Imprimindo Método Simples De calcular HIPOTENUSA - sem parâmetros");
        System.out.println(triangulo2.getHipotenusa());
        
        triangulo2.calcularHipotenusaClasseMathPow();
        System.out.println("Imprimindo Método De calcular HIPOTENUSA com a Classe Math.pow - sem parâmetros");
        System.out.println(triangulo2.getHipotenusa());
        
        triangulo2.calcularHipotenusaComParametros(15, 20);
        System.out.println("Imprimindo Método Simples De calcular HIPOTENUSA - com Parâmetros");
        System.out.println(triangulo2.getHipotenusa());
        
        triangulo2.calcularHipotenusaClasseMathPowComParemetros(15, 20);
        System.out.println("Imprimindo Método calcular HIPOTENUSA Classe Math.pow - com Parâmetros");
        System.out.println(triangulo2.getHipotenusa());   
    }
    
}
