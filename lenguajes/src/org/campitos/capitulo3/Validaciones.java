/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.campitos.capitulo3;

/**
 *
 * @author campitos
 */
public class Validaciones {
    
    public static void validarEdad(int edad)throws EdadNegativaException{
        if(edad<18)throw new EdadNegativaException();
    }
    
}
