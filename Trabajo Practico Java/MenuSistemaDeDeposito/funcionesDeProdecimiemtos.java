package MenuSistemaDeDeposito;



public class funcionesDeProdecimiemtos {
/**
 * Muestra en pantalla los elementos del array elegido, en orden, uno debajo del otro
 * @param x array unidimensional de numeros enteros
 * 
 */
 public static void muestraStock(int x[]){
    for(int i = 0; i < x.length; i++){
        System.out.println((i+1) + ". " + x[i]);
    }

}
/**
 * Muestra en pantalla los elementos de un array
 * resultado de la multiplicacion de 2 arrays de numeros enteros
 * @param x array unidimensional de numeros enteros
 * @param y otro array unidimensional de numeros 
 * @param j array unidemensional, resultado de la multiplicacion de los anteriores
 * @return el array bidimensional resultado de la multiplicacion de 2 arrays de numeros 
 * enteros
 */
public static void muestraCostoTotal(int x[], int y[], int j[]){
    for(int i = 0; i < x.length; i++){
       j[i]= (x[i] * y[i]);
        System.out.println((i+1)+ ". " + j[i] );
    }
   
}
/**Muestra los elememtos de un array, resutaldo de la resta de los arrays 
 * 
 * @param x array unidimensional de numeros enteros
 * @param y array unidimensional de numeros enteros
 * @param j array unidimensional que resulta de la resta de los anteriores
 * @return el array unidimensional resutaldo de la resta de los arrays
 */
public static void nuevoStock( int x[],int y[],int j[]) {
  for(int i=0; i<x.length; i++){
    j[i] = x[i] - y[i];
    System.out.println((i+1) + ". " +j[i]);
  }
    
}
}


