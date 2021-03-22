/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figuras;

import java.util.Scanner;

/**
 *Clase Principal (main) de la aplicación
 * @author David Caballero
 * @author Sebastian Cortes
 * @version 1.0.0
 */
public class Principal {

    /**
     * Metodo contructor por defecto que ejecuta al método inciar
     */
    public Principal(){
        
        iniciar();
        
    }
    /**
     * Metodo que instacia el vector de objetos y aplica el polimorfismo
     */
    public void iniciar(){
        Scanner dat = new Scanner(System.in);
        
        IFigura cuadrado = new Cuadrado();
        IFigura rectangulo = new Rectangulo();
        IFigura triangulo = new Triangulo();
        IFigura circulo = new Circulo();
        
        IFigura[] vector = new IFigura[4];
        vector[0] = cuadrado;
        vector[1] = rectangulo;
        vector[2] = triangulo;
        vector[3] = circulo; 
        
        System.out.println("|-----------------------------------------------------------------------|/n");
        System.out.println("| BIENVENIDO ESTE ES UN PROGRAMA QUE CALCULA EL AREA Y EL PERIMETRO DE: |/n");
        System.out.println("|-----------------------------------------------------------------------|\n");
        System.out.println("|->      Un cuadrado, un rectangulo, un triangulo y un circulo        <-|");
        System.out.println("|-----------------------------------------------------------------------|\n");

        for (IFigura fig : vector){
            Figura fff;
            fff = ((Figura) fig);
            fff.capturarInformacion();
            fff.calcularArea();
            fff.calcularPerimetro();
            fff.imprimirInformacion();
            System.out.println("\n");
        }
        
    }
    /**
     * Metodo que ejecuta el constructor de la clase Matriz
     * @param args Argumentos del programa
     */
    public static void main(String[] args) {
        
        Principal pri = new Principal();
    }
}


