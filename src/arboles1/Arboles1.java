package arboles1;

import arboles1.pilaVector.PilaVector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Arboles1 {
    
    public static void main(String[] args) {
        ArbolBinario arbol;
        Nodo a1, a2, a;
        PilaVector pila = new PilaVector();
            //Instancio los nodos con sus datos
            a1 = ArbolBinario.nuevoArbol(null,"Maria",null);
            a2 = ArbolBinario.nuevoArbol(null,"Rodrigo",null);
            //Creo un arbol con sus subarboles
            a = ArbolBinario.nuevoArbol(a1,"Esperanza",a2);
        try {
            //Inserto el arbol en la pila para utilizarla mas tarde
            pila.insertar(a);
        } catch (Exception ex) {
            Logger.getLogger(Arboles1.class.getName()).log(Level.SEVERE, null, ex);
        }
            //Instancio otros tres nodos
            a1 = ArbolBinario.nuevoArbol(null,"Anyora",null);
            a2 = ArbolBinario.nuevoArbol(null,"Abel",null);
            //Creo otro arbol
            a = ArbolBinario.nuevoArbol(a1,"M Jesus",a2);
        try {
            pila.insertar(a);
        } catch (Exception ex) {
            Logger.getLogger(Arboles1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //Quito el arbol de la pila y lo convierto en un subarbol
            a2 = (Nodo) pila.quitar();
        } catch (Exception ex) {
            Logger.getLogger(Arboles1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            a1 = (Nodo) pila.quitar();
        } catch (Exception ex) {
            Logger.getLogger(Arboles1.class.getName()).log(Level.SEVERE, null, ex);
        }
            a = ArbolBinario.nuevoArbol(a1,"Juan",a2);
            arbol = new ArbolBinario(a);     
          System.out.println("INORDEN");
          arbol.inOrden(a);
          System.out.println("");
          System.out.println("----------------------------------------");
          System.out.println("POSTORDEN");
          arbol.postorden(a);
          System.out.println("");
          System.out.println("----------------------------------------");
          System.out.println("PREORDEN");
          arbol.preorden(a);
          System.out.println("");
          System.out.println("----------------------------------------");
    }
    
}
