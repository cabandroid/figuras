/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figuras;

import java.util.Scanner;

/**
 *
 *Esta clase hija posee los atributos de un Rectángulo y metodos de Figura, además hereda de la clase Figura
 * @author David Caballero
 * @author Sebastian Cortes
 * @version 1.0.0
 */
public class Rectangulo extends Figura{
    /**
     * Variable mientro de la clase Rectangulo que captura la base
     */
    private double base;
    /**
     * Variable mientro de la clase Rectangulo que captura la altura
     */
    private double altura;
    /**
     * Metodo que calcula y asigna el area del rectangulo
     */   
    @Override
    public void calcularArea() {
        super.setArea(base*altura);
    }
    /**
     * Metodo que calcula y asigna el perimetro del rectangulo
     */
    @Override
    public void calcularPerimetro() {
        super.setPerimetro((base*2)+(altura*2));
    }
    /**
     * Metodo que obtiene la información del rectangulo, es decir, la base y altura
     */
    @Override
    public void capturarInformacion() {
        Scanner dat = new Scanner(System.in);
        System.out.println("---> RECTANGULO <---");
        System.out.println("Ingrese la base del rectangulo: ");
        base = dat.nextDouble(); 
        System.out.println("Ingrese la altura del rectangulo: ");
        altura = dat.nextDouble(); 
    }
    /**
     * Metodo que imprime la información del rectangulo (el area y perimetro)
     */
    @Override
    public void imprimirInformacion() {
        System.out.println("El area del rectangulo es: "+super.getArea());
        System.out.println("El perimetro del rectangulo es: "+super.getPerimetro());
    }
    /**
     * Metodo que retorna la base del rectangulo
     * @return retorna la base del cuadrado
     */
    public double getBase() {
        return base;
    }
    /**
     * Metodo que recibe la base del rectangulo
     * @param base recibe como parametro la base del rectangulo
     */
    public void setBase(double base) {
        this.base = base;
    }
    /**
     * Metodo que retorna la altura del rectangulo
     * @return retorna la altura del cuadrado
     */
    public double getAltura() {
        return altura;
    }
    /**
     * Metodo que recibe la altura del rectangulo
     * @param altura recibe como parametro la altura del rectangulo
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}

