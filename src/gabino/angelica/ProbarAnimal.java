

package gabino.angelica;


public class ProbarAnimal {
    public static void main(String...x)
    {
        Animal a1=new Animal(); //Definición de constructor
        //a1.setNombre("perro"); //Cambiar el nombre sin necesidad de regresar a la clase
        Animal a2=new Animal();
        System.out.println("El animal es: "+a1.getNombre());
        System.out.println("El peso es: "+a1.getPeso());
        System.out.println("La edad es: "+a1.getEdad());
    }
}
