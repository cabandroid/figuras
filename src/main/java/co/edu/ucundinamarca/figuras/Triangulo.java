/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figuras;

import java.util.Scanner;

/**
 * Esta clase obtiene los atributos de un triangulo y metodos de Figura
 * @author Sebastian Cortes
 * @author David Caballero
 */
public class Triangulo extends Figura{
    
    private double ladoUno;
    private double ladoDos;
    private double LadoTres;
    
    /**
     * Metodo contructor por defecto que ejecuto el metodo iniciarMetodos
     */
    public Triangulo(){
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
     * Metodo que obtiene la información del triangulo
     */
    @Override
    public void obtenerInformacion() {        
        Scanner dat = new Scanner(System.in);
        System.out.println("Ingrese el primer lado del Triangulo: ");
        ladoUno = dat.nextDouble(); 
        System.out.println("Ingrese el segundo lado del Triangulo: ");
        ladoDos = dat.nextDouble();  
        System.out.println("Ingrese el tercer lado del Triangulo: ");
        LadoTres = dat.nextDouble();
    }
    /**
     * Metodo que imprimer la información del triangulo
     */
    @Override
    public void imprimirInformacion() {
        System.out.println("El area del triangulo es: "+getArea());
        System.out.println("El perimetro del triangulo es: "+getPerimetro());
    }
    
    /**
     * Metodo que calcula y asigna el area
     */
    @Override
    public void calcularArea() {
        double area = (ladoUno+ladoDos+LadoTres)/2;
        setArea(area);
    }
    /**
     * Metodo que calcula y asigna el perimetro
     */
    @Override
    public void calcularPerimetro() {
        double perimetro = ladoUno+ladoDos+LadoTres;
        setPerimetro(perimetro);
    }
    /**
     * Metodo que regresa el ladoUno del Triangulo
     * @return retorna el ladoUno del Triangulo
     */
    public double getLadoUno() {
        return ladoUno;
    }
    /**
     * Metodo que asigna el ladoUno del Triangulo
     */
    public void setLadoUno(double ladoUno) {
        this.ladoUno = ladoUno;
    }
    /**
     * Metodo que regresa el ladoDos del Triangulo
     * @return retorna el ladoDos del Triangulo
     */
    public double getLadoDos() {
        return ladoDos;
    }    
    /**
     * Metodo que asigna el ladoUno del Triangulo
     */
    public void setLadoDos(double ladoDos) {
        this.ladoDos = ladoDos;
    }
    /**
     * Metodo que regresa el ladoTres del Triangulo
     * @return retorna el ladoTres del Triangulo
     */
    public double getLadoTres() {
        return LadoTres;
    }
    /**
     * Metodo que asigna el ladoUno del Triangulo
     */
    public void setLadoTres(double LadoTres) {
        this.LadoTres = LadoTres;
    }  
     
}
