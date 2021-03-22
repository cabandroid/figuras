/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figuras;

/**
 *Esta clase es una Interface abstracta que contiene metodos abstractos
 * @author David Caballero
 * @author Sebastian Cortes
 * @version 1.0.0
 */
public interface IFigura {
    /**
     * Metodo abstracto para leer la informacion que el usuario ingresa por consola
     */
    public void capturarInformacion();
    /**
     * Metodo abstracto para imprimir por consola al usuario
     */
    public void imprimirInformacion();
}