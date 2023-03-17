
package abstractMethod;

public abstract class Livro {
    
    private String titulo;
    
    public Livro(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public abstract void imprimir();
    
}
