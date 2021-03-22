/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figuras;

import java.util.Scanner;

/**
 *Esta clase hija posee los atributos de un Triangulo y metodos de Figura, además hereda de la clase Figura
 * @author David Caballero
 * @author Sebastian Cortes
 * @version 1.0.0
 */
public class Triangulo extends Figura{
    /**
     * Variable miembro de la clase Triangulo para el primer lado
     */
    private double lado1;
    /**
     * Variable miembro de la clase Triangulo para el segundo lado
     */
    private double lado2;
    /**
     * Variable miembro de la clase Triangulo para el tercer lado
     */
    private double lado3; 
    /**
     * Metodo que calcula y asigna el area del triangulo
     */
    @Override
    public void calcularArea() {     
        //teorema de heron
        double semPerim = (lado1+lado2+lado3)/2;        
        super.setArea(Math.sqrt(semPerim*(semPerim-lado1)*(semPerim-lado2)*(semPerim-lado3)));
    }
    /**
     * Metodo que calcula y asigna el perimetro del triangulo
     */
    @Override
    public void calcularPerimetro() {
        super.setPerimetro(lado1+lado2+lado3);
    }
    /**
     * Metodo que obtiene la información del triangulo, es decir, los tres lados
     */
    @Override
    public void capturarInformacion() {
        Scanner dat = new Scanner(System.in);
        System.out.println("---> TRIANGULO <---");
        System.out.println("Ingrese el primer lado del Triangulo: ");
        lado1 = dat.nextDouble(); 
        System.out.println("Ingrese el segundo lado del Triangulo: ");
        lado2 = dat.nextDouble();  
        System.out.println("Ingrese el tercer lado del Triangulo: ");
        lado3 = dat.nextDouble();
    }
    /**
     * Metodo que imprime la información del triangulo
     */
    @Override
    public void imprimirInformacion() {
        System.out.println("El area del triangulo es: "+super.getArea());
        System.out.println("El perimetro del triangulo es: "+super.getPerimetro());
    }
    /**
     * Metodo que regresa el ladoUno del Triangulo
     * @return retorna el ladoUno del Triangulo
     */
    public double getLado1() {
        return lado1;
    }
    /**
     * Metodo que asigna el ladoUno del Triangulo
     * @param lado1 recibe como parametro el primer lado del triangulo
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    /**
     * Metodo que regresa el ladoDos del Triangulo
     * @return retorna el ladoDos del Triangulo
     */
    public double getLado2() {
        return lado2;
    }
    /**
     * Metodo que asigna el ladoUno del Triangulo
     * @param lado2 recibe como parametro el segundo lado del triangulo
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    /**
     * Metodo que regresa el ladoTres del Triangulo
     * @return retorna el ladoTres del Triangulo
     */
    public double getLado3() {
        return lado3;
    }
    /**
     * Metodo que asigna el ladoUno del Triangulo
     * @param lado3 recibe como parametro el tercer lado del triangulo
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
}