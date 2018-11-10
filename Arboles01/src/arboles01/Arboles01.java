/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author Alexis
 */
public class Arboles01 {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList<Atributos> atributos=new ArrayList<>();
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean salir = false;
        int opcion;
        
        while(!salir){
            System.out.println("1. Guardar arboles");
            System.out.println("2. mostrar arboles");
            System.out.println("3. Salir");
            
            
            try {
                 
                 switch(Integer.parseInt(br.readLine())){
                case 1:
                  agregarArbol(atributos);
                    break;
                case 2:
                  Mostrar(atributos);                   
                    break;
                case 3:
                    salir=true;
                    break;          
                default:
                    System.out.println("Elige una opcion correcta");
            }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero");
            }
        }
    } 
       
    public static void agregarArbol(ArrayList<Atributos> atributos) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Atributos atri = new Atributos();
        System.out.println("Ingrese el nombre del arbol");
        atri.setName(br.readLine());
        System.out.println("Ingrese la familia del arbol");
        atri.setFamilia(br.readLine());
        System.out.println("Ingrese el tipo de suelo del arbol");
        atri.setSuelo(br.readLine());
        System.out.println("Ingrese el tipo de Zona del arbol");
        atri.setZona(br.readLine());
        atributos.add(atri);
    }
    public static void Mostrar(ArrayList<Atributos> atributos){
        for(Atributos atri:atributos){
             System.out.println("El nomre es: "+atri.getName());
             System.out.println("La familia es: "+atri.getFamilia());
             System.out.println("El suelo es: "+atri.getSuelo());
             System.out.println("La zona es: "+atri.getZona());
              
        }
    }
}
