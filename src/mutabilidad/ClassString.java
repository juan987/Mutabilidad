/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabilidad;

/**
 *
 * @author Alumno
 */
public class ClassString {
    public static void main(String[] args) {
        conStringBuilder();
        //conString();
    }
    
    
    static void conString(){
        String texto = "Inicio.....";
        for(int i = 0; i < 20000; i++)
        {
            texto += i;
            //System.out.println(texto);
        }
        System.out.println("Estamos creando 1000 instancias de String");
    }
    
    static void conStringBuilder(){
        StringBuilder texto = new StringBuilder();
        texto.append("Inicio.....");
        for(int i = 0; i < 200000; i++)
        {
            texto.append(i);
            //System.out.println(texto);
        }

        System.out.println("Estamos creando un objeto StringBuilder");
    }
}
