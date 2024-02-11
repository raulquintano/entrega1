package mates;

public class Funciones {

    //1
    public static int suma(int n)
    {
        int acumulado = 0;
        for(int i = 1; i<=n ; i++)
        {
            acumulado+=i;
        }
        return acumulado;
    }

    //2
    public static int factorial(int n)
    {
        int acumuladoF = 1;
        for(int i = 1; i<=n ; i++)
        {
            acumuladoF*=i;
        }
        return acumuladoF;
    }

    //3
    public static double potencia(int n)
    {
        double acumuladoP = 0;
        for(int i =1; i<=n ; i++)
        {
            acumuladoP = Math.pow(n,i) + acumuladoP;
        }
        return acumuladoP;
    }

    //4
    public static int lista(int[] lista)
    {
        int acumuladoL = 0;

        for(int i = 1; i < lista.length ; i++)
        {
            acumuladoL +=lista[i];

        }
        return acumuladoL;
    }
//5
    public static int media(int[] lista2)
    {
        int acumuladoM = 0;
        int c = 0;
        for(int i = 0; i < lista2.length ; i++)
        {
            acumuladoM +=lista2[i];
            c++;
        }
        int resultado = acumuladoM/c;
        return resultado;
    }

    //7
    public static int pares1(int n)
    {
        int acumuladoS = 0;
        for(int i = 2; i <= n; i += 2)
        {
            acumuladoS+=i;

        }
        return acumuladoS;
    }

    //8
    public static int idPares(int[] arrayN)
    {
        int acumuladoID = 0;
        
        for(int i = 0; i < arrayN.length; i++)
        {
            int n = arrayN[i];
            if(n%2 == 0)
            {
                acumuladoID+= n;
            }
        }
        return acumuladoID;
    }

    //9
    public static int[] listaPares(int[] arrayPares, int[] gg)
    {
        int contador = -1;
        for(int i = 0; i < arrayPares.length; i++)
        {
            contador++;
            int n = arrayPares[i];
            if(n%2 == 0)
            {
                gg[contador] = n;
            }
            else
            {
                if(contador > 0)
                {
                    contador --;
                }
                else
                {
                    contador = 0;
                }
            }
            
        }
        return gg;
    }

    
    public static int[] pares(int n, int[] pp)
    {
        int c = 0;
        for(int i = 2; i <= n; i += 2)
        {
            pp[c] = i;
            c++;
        }
        return pp;
    }

    public static int escalar(int[] l1, int[] l2)
    {
        int escalarTotal = 0;

        for(int i = 0; i < l1.length; i++)
        {
            int z = l1[i] * l2[i]; 
            escalarTotal+=z;
        }
        return escalarTotal;
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1)
            return n;
        
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }



}