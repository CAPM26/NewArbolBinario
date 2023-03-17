/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABB;

/**
 *
 * @author Usuario
 */
public class Nodo implements NodoInterface{
    public String name;
    public int age;
    public Nodo left;
    public Nodo right;

    
    public Nodo(String name, int age) {
        this.name = name;
        this.age = age;
        this.left = null;
        this.right = null;
    }

    @Override
    public String obtenerValores() {
        return "Nombre: " + this.name + ", Edad: " + this.age;
    }
}
