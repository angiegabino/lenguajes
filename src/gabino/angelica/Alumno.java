
package gabino.angelica;


public class Alumno {
    private String nombreMateria;
    private  float examenParcial; 
    private  float practicas; 
    private  float examenFinal; 
    private  float asistencia;
    
    public void setExamenParcial(float examenParcial ){
     this.examenParcial=examenParcial;
     System.out.println("Ya ajustamos el valor de examen parcial "); 
      
     if(examenParcial>10){
         System.out.println("Calificación incorrecta"); 
         this.examenParcial=10;
     }
     else{
         this.examenParcial=examenParcial; 
         System.out.println("La calificcion se ajusto  "); 
     }
    }
        
    public float getExamenPacial(){
    return examenParcial ;    
    }
    
}
