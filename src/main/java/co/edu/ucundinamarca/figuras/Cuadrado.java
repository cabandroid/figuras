/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figuras;

import java.util.Scanner;

/**
 * Esta clase obtiene los atributos de un Circulo y metodos de Figura
 * @author Sebastian Cortes
 * @author David Caballero
 * @version 1.0.0
 */
public class Cuadrado extends Figura{
    
    private double lado;
    /**
     * Metodo contructor por defecto que ejecuto el metodo iniciarMetodos
     */
    public Cuadrado(){
        iniciarMetodos();
    }
    /**
     * Inicia todos los metodos de la clase 
     */
    public void iniciarMetodos(){
        obtenerInformacion();
        calcularArea();
        calcularPerimetro();
        imprimirInformacion();
    }
     /**
     * Metodo que obtiene la información del cuadrado, es decir, el lado
     */
    @Override
    public void obtenerInformacion() {
        Scanner dat = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        lado = dat.nextDouble(); 
    }    
    /**
     * Metodo que imprime la información del cuadrado (el area y perimetro)
     */
    @Override
    public void imprimirInformacion() {
        System.out.println("El area del cuadrado es: "+getArea());
        System.out.println("El perimetro del cuadrado es: "+getPerimetro());
    }
    /**
     * Metodo que calcula y asigna el area del cuadrado
     */    
    @Override
    public void calcularArea() {
        double area = lado*lado;
        setArea(area);
    }
    /**
     * Metodo que calcula y asigna el perimetro del cuadrado
     */
    @Override
    public void calcularPerimetro() {
        double perimetro = lado*4;
        setPerimetro(perimetro);
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
