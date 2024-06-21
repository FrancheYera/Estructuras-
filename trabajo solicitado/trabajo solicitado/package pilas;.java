package pilas;
import java.util.Stack;

public class Pila {
    Stack<Integer> pila = new Stack<>();
    
    public void AgregaElemento(int dato){
        pila.push(dato);
        }
    public void MuestraPila(){
        System.out.println("Despliega pila");
        for (Integer elemento : pila){
            System.out.println(elemento);
            }
        }
    public void MuestraElementoArriba(){
        Integer elementoInicio = pila.peek();
        System.out.println("Primer elemento de la pila: " + elementoInicio);    
        }    
    public void EliminarElemento(int dato){
        pila.pop(dato);
    }
    public void EliminarPila(int dato){
        pila.clear(dato);
        System.out.println("se ha borrado los datos de la pila");
    }
    public void TamañoDeLaPila(int dato){
        System.out.println(pila.size(dato));
    }
    }
