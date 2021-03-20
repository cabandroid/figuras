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
public class Circulo extends Figura{
    
    private double radio;
    
    
    public Circulo(){
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
        System.out.println("Ingrese el radio del circulo: ");
        radio = dat.nextDouble(); 
    }
    
    @Override
    public void imprimirInformacion() {
        System.out.println("El area del circulo es: "+getArea());
        System.out.println("El perimetro del circulo es: "+getPerimetro());
    }

    @Override
    public void calcularArea() {
        double area = Math.PI*(Math.pow(radio, 2));
        setArea(area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2*Math.PI*radio;
        setPerimetro(perimetro);
    }

}
