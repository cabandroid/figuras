/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figuras;

import java.util.Scanner;

/**
 *Esta clase hija posee los atributos de un Cuadrado y metodos de Figura, además hereda de la clase Figura
 * @author David Caballero
 * @author Sebastian Cortes
 * @version 1.0.0
 */
public class Cuadrado extends Figura{
    /**
     * Variable miembro de la clase Cuadrado para capturar el lado de un cuadrado
     */
    private double lado;
    /**
     * Metodo que calcula y asigna el area del cuadrado
     */   
    @Override
    public void calcularArea() {
        super.setArea(Math.pow(lado, 2));
    }
    /**
     * Metodo que calcula y asigna el perimetro del cuadrado
     */
    @Override
    public void calcularPerimetro() {
        super.setPerimetro(lado*4);
    }
    /**
     * Metodo que obtiene la información del cuadrado, es decir, el lado
     */
    @Override
    public void capturarInformacion() {
        Scanner dat = new Scanner(System.in);
        System.out.println("---> CUADRADO <---");
        System.out.println("Ingrese el lado del cuadrado: ");
        lado = dat.nextDouble(); 
    }
    /**
     * Metodo que imprime la información del cuadrado (el area y perimetro)
     */
    @Override
    public void imprimirInformacion() {
        System.out.println("El area del cuadrado es: "+super.getArea());
        System.out.println("El perimetro del cuadrado es: "+super.getPerimetro());
    }
    /**
     * Metodo que retorna el lado del cuadrado
     * @return retorna el lado del cuadrado
     */
    public double getLado() {
        return lado;
    }
    /**
     * Metodo que recibe el lado del cuadrado
     * @param lado recibe como parametro el lado del cuadrado
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
