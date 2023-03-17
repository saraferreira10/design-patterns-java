
package abstractMethod;

public class LivroImpresso extends Livro {
    
    public LivroImpresso(String titulo) {
        super(titulo);
    }

    @Override
    public void imprimir() {
        System.out.println("Livro físico: " + super.getTitulo());
    }
    
}
