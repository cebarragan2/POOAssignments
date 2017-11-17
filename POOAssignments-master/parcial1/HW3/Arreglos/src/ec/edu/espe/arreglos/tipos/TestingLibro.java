package ec.edu.espe.arreglos.tipos;



import ec.edu.espe.arreglos.modelo.Libro;

/**
 *
 * @author usuario
 */
public class TestingLibro {
    
    public static void main(String[] args) {
         Libro  libros[] = new Libro[10];
            
             
             for(int i=0 ;i<libros.length;i++)
             {
                 
                 
                 if(i%2 == 0)
                 {
                     libros [i]= new Libro("Juicio Final",i*20,"terror");
                 }
                 else
                 {
                     libros[i]= new Libro("La sombra",i*40,"suspenso");
                 }  
                 

             }
            for (Libro libro : libros) 
            {   
                System.out.println("Libro: "+ "El nombre del libro es :"+libro.getNombre()+" tiene "+libro.getPaginas()+" paginas "+ " y su tipo es " +libro.getTipo());
                System.out.println();
                
            }
    }
    
}
