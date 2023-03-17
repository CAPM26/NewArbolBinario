/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABB;

/**
 *
 * @author Usuario
 */
public class BinarySearchTree {
    
    private Nodo root;
    public int orden;
    
    public BinarySearchTree(int ordenamiento){
        orden = ordenamiento;
    }
    
    public void insert(String dato, int age){
        if (this.root == null) {
            this.root = new Nodo(dato, age);
        }else{
            this.insertar(this.root, dato, age);
        }
    }
    
    
    private void insertar(Nodo padre, String dato, int age){
        switch (orden) {
            case 1 -> { //BALANCEA POR EDAD------------------------------------------
                if (age == padre.age) {
                    System.out.println("elemento duplicado (" + dato +", "+ age +"), no se tomará en cuenta");
                }else if (age > padre.age) {
                    if (padre.right == null) {
                        padre.right = new Nodo(dato, age);
                    }else{
                        this.insertar(padre.right, dato, age);
                    }
                }else{
                    if (padre.left == null) {
                        padre.left = new Nodo(dato, age);
                    }else{
                        this.insertar(padre.left, dato, age);
                    }
                }
            }
            case 2 -> { //BALANCEA POR NOMBRE-------------------------------------------
                if (dato.toLowerCase().equals(padre.name.toLowerCase())) {
                    System.out.println("elemento duplicado (" + dato +", "+ age +"), no se tomará en cuenta");
                }else if (dato.compareTo(padre.name) > 0) {
                    if (padre.right == null) {
                        padre.right = new Nodo(dato, age);
                    }else{
                        this.insertar(padre.right, dato, age);
                    }
                }else{
                    if (padre.left == null) {
                        padre.left = new Nodo(dato, age);
                    }else{
                        this.insertar(padre.left, dato, age);
                    }
                }
            }
            default -> System.out.println("Error en el arbol binario");
        }
    }
    
    
    public void inorderTransversal(){
        inorderTransversalRec(root);
    }
    
    private void inorderTransversalRec(Nodo root){
        if (root != null){
            inorderTransversalRec(root.left);
            System.out.println("nombre: "+root.name+", Edad: "+root.age);
            inorderTransversalRec(root.right);
        }
    }
    
    public void searchRec(String name){
        this.searchRec(this.root, name);
    }
    
    private void searchRec(Nodo root, String name){
                if (root == null) {
                    System.out.println("Elemento no encontrado");
                    return;
                }
                if (root.name.toLowerCase().equals(name.toLowerCase())) {
                    System.out.println("PERSONA ENCONTRADA:");
                    System.out.println(root.name + ", " + root.age);
                }else if(name.compareTo(root.name) < 0){
                    searchRec(root.left, name);
                }else{
                    searchRec(root.right, name);
                }
            }
    
        public void dispararPreorden(){
        this.Preorden(this.root);
    }
    public void Preorden(Nodo n){
        if (n == null) {
            return;
        }else{
            System.out.println("Nombre: " + n.name + ", Edad: "+n.age);
            Preorden(n.left);
            Preorden(n.right);
        }
    }
}

