
package composite;

public class MenuItem extends MenuComponente {
    
    private String numero;
    
    public MenuItem(String nome, String numero) {
        super(nome);
        this.numero = numero;
    }

    @Override
    public void imprimir() {
        System.out.println("    " + numero + " - " + super.getNome());    
    }
    
}
