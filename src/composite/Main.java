
package composite;

public class Main {
    
    public static void main(String[] args) {
        Menu root = new Menu("Menu");

        Menu menu1 = new Menu("Games");
        
        MenuItem subMenu1 = new MenuItem("Aventura", "1");
        MenuItem subMenu2 = new MenuItem("Esportes", "2");
        
        menu1.addItem(subMenu1);
        menu1.addItem(subMenu2);
        
        Menu menu2 = new Menu("Filmes");
        
        MenuItem subMenu3 = new MenuItem("Até o último homem", "1");
        MenuItem subMenu4 = new MenuItem("Um sonho de liberdade", "2");
        MenuItem subMenu5 = new MenuItem("Planeta dos macacos", "3");
        MenuItem subMenu6 = new MenuItem("Um lindo dia na vizinhança", "4");
        MenuItem subMenu7 = new MenuItem("Forrest Gump", "5");
        
        menu2.addItem(subMenu3);
        menu2.addItem(subMenu4);
        menu2.addItem(subMenu5);
        menu2.addItem(subMenu6);
        menu2.addItem(subMenu7);
        
        Menu menu3 = new Menu("Series");
        
        MenuItem subMenu8 = new MenuItem("Drama", "1");
        MenuItem subMenu9 = new MenuItem("Suspense", "2");
        
        menu3.addItem(subMenu8);
        menu3.addItem(subMenu9);
        
        root.addItem(menu1);
        root.addItem(menu2);
        root.addItem(menu3);
        
        root.imprimir();
    }
    
}
