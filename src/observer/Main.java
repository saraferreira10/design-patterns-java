
package observer;

public class Main {
    
    public static void main(String[] args) {
        Escola escola = new Escola();
        
        Candidato[] candidatos = new Candidato[] {new Candidato("Maria"), new Candidato("Luísa"), new Candidato("Daniel"),
        new Candidato("Carlos"), new Candidato("Sofia"), new Candidato("Lucas"), new Candidato("Naiara")};
        
        for (int i = 0; i < candidatos.length; i++) {
            escola.registrarObservador(candidatos[i]);
        }
        
        escola.setTemVaga(false);
        
    }
    
}
