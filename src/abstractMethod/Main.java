
package abstractMethod;

import abstractMethod.factorys.FabricaConcreta;
import abstractMethod.factorys.FabricaLivro;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                
        String titulo;
        char resp;
        FabricaLivro fab = null;
        
        try (Scanner sc = new Scanner(System.in)) {
        
            System.out.println("Digite o título do livro: ");
            titulo = sc.nextLine();
            System.out.println("F (Físico/Impresso) ou D(Digital/E-book)?");
            resp = sc.next().charAt(0);
            
            fab = FabricaConcreta.getFabrica(resp);
        }
        

        Livro l = fab.getLivro(titulo);
        l.imprimir();
    }
    
}
