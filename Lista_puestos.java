/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raul.s.application;

import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Lista_puestos {
    
    private static String fichero_puesto = "puesto.dat";
    

    
   public static void main(String[] args) {
       
       ArrayList<Puesto> Array_Puestos = new ArrayList<>();
   try {
            ObjectInputStream lee_fichero = new ObjectInputStream(new FileInputStream(fichero_puesto));
            Array_Puestos = (ArrayList<Puesto>)lee_fichero.readObject();            
            System.out.println("Datos cargados correctamente...");
            
            lee_fichero.close();
 
        } catch (ClassNotFoundException cnfe) {
            System.out.println("No se pudo acceder a la clase adecuada para revertir la Serializacion al leer del fichero.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: El fichero no existe. ");
        } catch (IOException ioe) {
            ioe.printStackTrace();
                System.out.println("Error: Fallo en la lectura del fichero. ");
        }
 

   }
    
}
