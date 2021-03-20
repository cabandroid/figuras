/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figuras;

/**
 *Clase tipo Interface para la seguridad y visibilidad de metodos al usuario
 * @author Sebastian Cortes
 * @author David Caballero
 */
public interface IFigura {
    /**
     * Método abstracto para imprimir la información
     */
    public void imprimirInformacion();
    /**
     * Método abstracto para obtener la información
     */
    public void obtenerInformacion();
}
