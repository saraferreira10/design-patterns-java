
package abstractMethod.factorys;

import abstractMethod.Livro;
import abstractMethod.LivroImpresso;

public class FabricaLivroImpresso implements FabricaLivro {

    @Override
    public Livro getLivro(String titulo) {
        return new LivroImpresso(titulo);
    }

}
