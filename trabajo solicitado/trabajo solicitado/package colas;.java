package colas;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Cola {
    Queue<Integer> cola = new LinkedList<>();
    static Scanner dat = Scanner.(System.in); 
    public void AgregaElemento(int dato){
        cola.add(dato);
        }
    public void MuestraCola(){
        System.out.println("Despliega cola");
        for (Integer elemento : cola){
            System.out.println(elemento);
            }
        }
    public void MuestraPrimerElemento(){
        Integer elementoInicio = cola.peek();
        System.out.println("Primer elemento de la cola: " + elementoInicio);    
        }
    public void EliminaElElementoInicial(int dato){
         cola.remove(dato);
        }
    public void ObtenerTamañoDeLaCola(int dato){
        System.out.println(cola.size(dato));
        }
        public void EliminaUnElemento(int dato){
            cola.clear(dato);
            system.out.println("todos los datos fueron eliminados ");
        }
        public void EliminaUnElemento(int N){
            System.out.println("seleccione el elemento a buscar");
            N=NextInt();
            cola.contains(N);
        }
    }

