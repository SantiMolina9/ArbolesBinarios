
package arboles1;

public class Nodo {

    protected Object dato;
    protected Nodo izq;
    protected Nodo derecho;
    
    public Nodo(Object dato){
        this.dato = dato;
        izq = derecho = null;
    }
    
    public Nodo(Nodo izq, Nodo derecha, Object dato){
        this.dato = dato;
        this.derecho = derecha;
        this.izq = izq;
    }
    
public Object valorNodo(){ return dato; }
public Nodo subarbolIzdo(){ return izq; }
public Nodo subarbolDcho(){ return derecho; }
public void nuevoValor(Object d){ dato = d; }
public void ramaIzdo(Nodo n){ izq = n; }
public void ramaDcho(Nodo n){ derecho = n; }
    
    
    
    
    
}
