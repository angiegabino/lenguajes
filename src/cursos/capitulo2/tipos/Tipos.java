

package cursos.capitulo2.tipos;

public class Tipos {
   //static int algo;
    public static void main(String args []){
        //Declarar arreglo
        //int [] arreglo1 = new int [3];
        int [] arreglo1 = {-20, 7, 8, 54, 9, 12};
        //System.out.println(arreglo1[0]); //Imprime el índice 0
        //System.out.println(algo);
        /*for (int i = 0; i < arreglo1.length ; i++){
            System.out.println(arreglo1[i]);
        }*/
        for (int x : arreglo1){ //tipo de dato sobre el que se va a iterar, se relaciona al tipo de dato de arreglo
            System.out.println(x);
        }
    }
    
}
