
package com.melo.raul.calcular.trianguloHipotenusa;


public class HipotenusaTriangulo {
    
   // Formula para calcular da Hipotenusa
   // a^2 = b^2 + c^2
   // HIPOTENUSA elevado a 2 = cateto elevado a 2 + cateto elevado a 2
    
    private int ladoA;
    private int ladoB;
    private double hipotenusa;
    

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(int hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
    
    ////////////////////////////////////////////////////////////////////////
    public double calcularHipotenusaSimples(){
    
        hipotenusa = (ladoA * ladoA) + (ladoB * ladoB);
        
        hipotenusa = Math.sqrt(hipotenusa); // Extrai a raiz quadrada da HIPOTENUSA
        
     return hipotenusa;
    
    }
    /////////////////////////////////////////////////////////////////////
     public double calcularHipotenusaClasseMathPow(){
     
       hipotenusa = Math.pow(ladoA , 2) + Math.pow(ladoB ,2);
       
       hipotenusa = Math.sqrt(hipotenusa);
       
     return hipotenusa;
     }
   ///////////////////////////////////////////////////////////////////////
     
     public double calcularHipotenusaComParametros(int ladoA , int ladoB){
         
         hipotenusa = (ladoA * ladoA) + (ladoB * ladoB);
         
         hipotenusa = Math.sqrt(hipotenusa);
        
     return hipotenusa;
     }
   //////////////////////////////////////////////////////////////////////////////////////////  
     public double calcularHipotenusaClasseMathPowComParemetros( double ladoA ,double ladoB ){
         
         hipotenusa =  Math.pow(ladoA , 2)  + Math.pow(ladoB, 2);
         
         hipotenusa = Math.sqrt(hipotenusa);
         
         return hipotenusa;
     }
}
