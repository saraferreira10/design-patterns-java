
package composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponente {
    
    List<MenuComponente> itens;
    
    public Menu(String nome) {
        super(nome);
        itens = new ArrayList<>();
    }
    
    public void addItem(MenuComponente item) {
        itens.add(item);
    }
    
    @Override
    public void imprimir() {
        System.out.println(">> " + super.getNome()); 
        
        for (MenuComponente item : itens) {
            item.imprimir();
        }
    }
    
}
