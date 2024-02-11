package aplicacion;

import mates.*;

public class Principal {

    public static void main(String[] args) {
        
        System.out.println("1) La suma de los numeros hasta el 10 es " + Funciones.suma(10));
        System.out.println("2) El factorial de 5 es " + Funciones.factorial(5));
        System.out.println("3) La potencia n-ésima de 4 es " + Funciones.potencia(4));

        int[] lista  = {1,2,3,4,6,7,8};
        System.out.println("4) La suma de los valores de la lista es " + Funciones.lista(lista));

        int[] lista2 ={2,3,7};
        System.out.println("5) La media de la suma de los valores de la lista es " + Funciones.media(lista2));

        System.out.println("7) La suma de los números pares hasta el 11 son: " + Funciones.pares1(11));

        int[] arrayN = {2,7,8,5,4};
        System.out.println("8) La suma de los números pares de la lista es: " + Funciones.idPares(arrayN));

        int[] arrayPares = {3,12,2,5,4,7,100,43};
        int[] gg = new int[arrayPares.length];
        System.out.print("9) La nueva lista con números pares es: " + Funciones.listaPares(arrayPares, gg));
        for (int i = 0; i < gg.length; i++) {
            System.out.print(gg[i] + " ");
        }
        System.out.println("");

        int[] pp = new int[10];
        System.out.print("10) La lista con los numeros pares hasta el 20 es: " + Funciones.pares(20, pp));
        for(int i = 0; i < pp.length; i++)
        {
            System.out.print(pp[i] + " ");
        }
        
        System.out.println("");
        
        int[] l1 = {1,2,3};
        int[] l2 = {2,4,6};
        System.out.println("11) El producto escalar de las dos listas es: " + Funciones.escalar(l1, l2));

        int n = 10;
        int resultado = Funciones.calcularFibonacci(10);
        System.out.println("El " + n + "-ésimo elemento de la sucesión de Fibonacci es: " + resultado);

    }
}