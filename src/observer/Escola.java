
package observer;

import java.util.LinkedList;
import java.util.Queue;

public class Escola implements Sujeito {
    
    private boolean temVaga;
    private Queue<Observador> listaDeEspera; 

    public Escola() {
        listaDeEspera = new LinkedList<>();
    }

    public void setTemVaga(boolean temVaga) {
        this.temVaga = temVaga;
        
        if(temVaga) {
            notificarObservadores();
        }
    }

    @Override
    public void registrarObservador(Observador obs) {
        listaDeEspera.add((Candidato)obs);
    }

    @Override
    public void removerObservador(Observador obs) {
        listaDeEspera.remove((Candidato)obs);
    }

    @Override
    public void notificarObservadores() {
        for (Observador obs : listaDeEspera) {
            obs.atualizar();
        }
    }
    
}
