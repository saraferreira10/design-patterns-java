
package observer;


public class Candidato implements Observador{
    private String nome;

    public Candidato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar() {
        System.out.println("Candidato " + nome + " surgiu uma vaga!");
    }

}
