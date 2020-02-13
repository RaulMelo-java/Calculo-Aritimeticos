
package com.melo.raul.calcular.triangulo;

public class teste {
    
     public static void main(String[] args) {
      
        AreaTriangulo triangulo1 = new AreaTriangulo();
        
        //Usando o método SET para atribiur os valores do parâmetro 
        triangulo1.setBase(10);
        triangulo1.setAltura(10);
        
        // Chamando o método para calcular a area ..com  medoto GET
        triangulo1.calcularAreaTrianguloRet(triangulo1.getBase(),triangulo1.getAltura());
        
        // Imprimindo o resultado do metodo acima 
        System.out.println(triangulo1.getArea());
        
        // imprimindo o resultado colocando os valores direto nos parâmetros 
        System.out.println(triangulo1.calcularAreaTrianguloRet(10, 10));
     }
}
