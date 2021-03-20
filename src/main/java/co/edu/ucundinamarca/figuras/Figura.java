/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figuras;

/**
 * Clase abstracta que tiene tiene como parametros y metodos de figura
 * @author Sebastian Cortes
 * @author David Caballero
 * @version 1.0.0
 */
public abstract class Figura implements IFigura{
    
    private double area;
    
    private double perimetro;
    /**
     * Metodo contructor por defecto
     */
    public Figura(){
        
    }
    /**
     * Metodo abstracto para calcular el area de una figura
     */
    public abstract void calcularArea();    
    /**
     * Metodo abstracto para calcular el perimetro de una figura
     */
    public abstract void calcularPerimetro();
    /**
     * Metodo que retorna el area de una figura
     * @return retorna el area de una figura
     */
    public double getArea() {
        return area;
    }
    /**
     * Metodo que recibe el area de una figura
     * @param area recibe el area de una figura
     */
    public void setArea(double area) {
        this.area = area;
    }
    /**
     * Metodo que retorna el perimetro de una figura
     * @return retorna el perimtero de una figura
     */
    public double getPerimetro() {
        return perimetro;
    }
    /**
     * Metodo que recibe el perimetro de una figura
     * @param perimetro recibe el perimetro de una figura
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
}
