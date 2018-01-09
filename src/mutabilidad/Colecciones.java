/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabilidad;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Colecciones {
    // psvm + TAB
    public static void main(String[] args) {
        //LAS COLECCIONES GENERICAS DEBEN SER CREADAS A PARTIR DE 
        //CLASES, NO WRAPPERS O PRIMITIVOS
        ArrayList<Integer> numeros =
                new ArrayList<>();
        numeros.add(45);
        numeros.add(55);
        numeros.add(65);
        numeros.add(75);
        numeros.add(85);
        numeros.add(95);
        numeros.add(105);
        //SINTAXIS BUCLE REFERENCIA JAVA
        //for (int i=0; i < numeros.size(); i++)
        for (int num: numeros)
        {
            //sout + TAB
            System.out.println("Numero: " + num);
            
            //ESTA LINEA DA ERROR DE CONCURRENCIA, ESTO NO SE DEBE HACER NUNCA
            //numeros.add((7888));
        }
        
        //numeros.add("hhh");
        //Vector antiguo
        
                        
                    
    }
    
}
