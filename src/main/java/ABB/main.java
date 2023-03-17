/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABB;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class main {
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        int orden;
        do{
            System.out.println("¿COMO QUIERE EL ORDENAMIENTO? \n1 - Edad \n2 - Nombre");
        orden = teclado.nextInt();
        teclado.nextLine();
        }while((orden < 1) || (orden > 2));
        BinarySearchTree arbolito = new BinarySearchTree(orden);
        arbolito.insert("Juan", 20);
        arbolito.insert("Maria", 30);
        arbolito.insert("Yulian", 30);
        arbolito.insert("JUAN", 8);
        arbolito.insert("Yeison", 5);
        arbolito.insert("Elian", 12);
        arbolito.insert("Victor", 35);
        System.out.println("¿QUIERES BUSCAR A ALGUIEN? \nINGRESA SU NOMBRE");
        String nombreBuscar = teclado.nextLine();
        arbolito.searchRec(nombreBuscar);
        arbolito.inorderTransversal();
        System.out.println("------------------------------");
        arbolito.dispararPreorden();
    }
}
