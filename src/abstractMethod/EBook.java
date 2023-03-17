
package abstractMethod;

public class EBook extends Livro{
    
     public EBook(String titulo) {
        super(titulo);
    }

    @Override
    public void imprimir() {
        System.out.println("E-Book: " + super.getTitulo());
    }
}
