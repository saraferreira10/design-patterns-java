
package observer;

public interface Sujeito {
    void registrarObservador(Observador obs);
    void removerObservador(Observador obs);
    void notificarObservadores();
}
