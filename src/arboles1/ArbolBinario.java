package arboles1;

public class ArbolBinario {
    protected Nodo raiz;
    //Construyo un arbol vacio
    public ArbolBinario(){
        raiz = null;
    }
    //Construyo un arbol con su raiz
    public ArbolBinario(Nodo raiz){
        this.raiz = raiz;
    }
    //Retorno la raiz del arbol
    public Nodo raizArbol(){
        return raiz;
    }
    //Controlo si el arbol esta vacio
    boolean isEmpty(){
        return raiz == null;
    }
    //Creo un nuevo arbol con sus subarboles
    public static Nodo nuevoArbol(Nodo ramaIzq, Object dato, Nodo ramaDerecha){
       return new Nodo(ramaIzq, ramaDerecha, dato);
    }
    //Metodo inorden
    public void inOrden(Nodo a){
        if(a != null){
            inOrden(a.subarbolIzdo());
            System.out.print(a.dato + " ");
            inOrden(a.subarbolDcho());
        }
    }
    //Metodo postorden
    public void postorden(Nodo a){
        if(a != null){
            postorden(a.subarbolIzdo());
            postorden(a.subarbolDcho());
            System.out.print(a.dato + " ");
        }
    }
    //Metodo preorden
    public void preorden(Nodo a){
        if(a != null){
            System.out.print(a.dato + " ");
            preorden(a.subarbolIzdo());
            preorden(a.subarbolDcho());
        }
    }
    
}
