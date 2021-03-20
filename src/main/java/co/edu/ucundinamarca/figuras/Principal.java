/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figuras;

/**
 * Clase Inicio(main) de la aplicación
 * @author Sebastian Cortes
 * @author David Caballero
 * @version 1.0.0
 */
public class Principal {
    
    /**
     * Metodo contructor por defecto que ejecuto el metodo inciar
     */
    public Principal(){
         
        iniciar();
    }
    /**
     * Metodo que instacia el vector de objetos
     */
    public void iniciar(){
        
        IFigura cuadrado = new Cuadrado();
        IFigura triangulo = new Triangulo();
        IFigura circulo = new Circulo();
        
        IFigura[] vector = new IFigura[3];           
        vector[0] = cuadrado;
        vector[1] = triangulo;
        vector[2] = circulo; 
        
    }
    /**
     * Metodo que ejecuta el constructor de la clase Matriz
     * @param args Argumentos del programa
     */
    public static void main(String[] args) {
        
        Principal pri = new Principal();
    }
}
