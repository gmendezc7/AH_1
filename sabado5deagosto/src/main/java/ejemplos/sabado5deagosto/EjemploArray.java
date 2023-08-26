/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.sabado5deagosto;

/**
 *
 * @author Eliseo
 */
public class EjemploArray {
    
    public static void main (String[] args){
        int data[] = new int [10];
        int dato = 5;
        for (int i = 0; i < data.length; i++) {
            data[i] = dato;
            dato +=5;
            System.out.println(data[i]);    
        }
       
    }   
    
}
