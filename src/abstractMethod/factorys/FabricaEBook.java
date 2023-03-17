
package abstractMethod.factorys;

import abstractMethod.EBook;
import abstractMethod.Livro;

public class FabricaEBook implements FabricaLivro {

    @Override
    public Livro getLivro(String titulo) {
        return new EBook(titulo);
    }
    
}
