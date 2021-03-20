/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figuras;

/**
 *
 * @author Sebastian Cortes
 * @author David Caballero
 */
public class Principal {
    
    public Principal(){
         
        iniciar();
    }

    public void iniciar(){
        
        IFigura cuadrado = new Cuadrado();
        IFigura triangulo = new Triangulo();
        IFigura circulo = new Circulo();
        
        IFigura[] vector = new IFigura[3];           
        vector[0] = cuadrado;
        vector[1] = triangulo;
        vector[2] = circulo; 
        
    }
    
    public static void main(String[] args) {
        
        Principal pri = new Principal();
    }
}
