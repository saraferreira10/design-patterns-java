
package composite;

public abstract class MenuComponente {
    private String nome;

    public MenuComponente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public abstract void imprimir();
}
