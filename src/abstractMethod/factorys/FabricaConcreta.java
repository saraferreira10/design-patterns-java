
package abstractMethod.factorys;

public abstract class FabricaConcreta {

    public static FabricaLivro getFabrica(char resp) {
        if (resp == 'F') {
            return new FabricaLivroImpresso();
        } else if (resp == 'D') {
            return new FabricaEBook();
        }
        
        return null;
    }
    

}
