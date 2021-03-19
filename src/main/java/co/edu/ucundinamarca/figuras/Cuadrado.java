/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figuras;

import java.util.Scanner;

/**
 *
 * @author Sebastian Cortes
 * @author David Caballero
 */
public class Cuadrado extends Figura{
    
    private double lado;
    
    public Cuadrado(){
        iniciarMetodos();
    }
    
    public void iniciarMetodos(){
        obtenerInformacion();
        calcularArea();
        calcularPerimetro();
        imprimirInformacion();
    }
    @Override
    public void obtenerInformacion() {
        Scanner dat = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        lado = dat.nextDouble(); 
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("El area del cuadrado es: "+getArea());
        System.out.println("El perimetro del cuadrado es: "+getPerimetro());
    }
    
    @Override
    public void calcularArea() {
        double area = lado*lado;
        setArea(area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = lado*4;
        setPerimetro(perimetro);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
    
    
}
