/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figuras;

import java.util.Scanner;

/**
 *Esta clase hija posee los atributos de un Circulo y metodos de Figura, además hereda de la clase Figura
 * @author David Caballero
 * @author Sebastian Cortes
 * @version 1.0.0
 */
public class Circulo extends Figura{
    /**
     * Variable miembro de un circulo para el radio
     */
    private double radio;

    /**
     * Metodo que calcula y asigna el area del circulo
     */
    @Override
    public void calcularArea() {
        double area = Math.PI*(Math.pow(radio, 2));
        super.setArea(area);
    }
    /**
     * Metodo que calcula y asigna el perimetro del circulo
     */
    @Override
    public void calcularPerimetro() {
        double perimetro = 2*Math.PI*radio;
        super.setPerimetro(perimetro);
    }
    /**
     * Metodo que obtiene la información del circulo, es decir, el radio
     */
    @Override
    public void capturarInformacion() {
        Scanner dat = new Scanner(System.in);
        System.out.println("---> CIRCULO <---");
        System.out.println("Ingrese el radio del circulo: ");
        radio = dat.nextDouble(); 
    }
    /**
     * Metodo que imprime la información del circulo (el area y perimetro)
     */
    @Override
    public void imprimirInformacion() {
        System.out.println("El area del circulo es: "+super.getArea());
        System.out.println("El perimetro del circulo es: "+super.getPerimetro());
    }
    /**
     * Metodo que retorna el radio del circulo
     * @return retorna el radio del circulo
     */
    public double getRadio() {
        return radio;
    }
    /**
     * Metodo que recibe el radio del circulo
     * @param radio recibe como parámetro el radio del circulo
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
