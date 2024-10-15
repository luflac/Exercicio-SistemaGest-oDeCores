import java.util.ArrayList;
import java.util.List;

public class FormaManager {
    private List<Forma> formas;
    private CorFactory corFactory;

    public FormaManager() {
        formas = new ArrayList<>();
        corFactory = new CorFactory();
    }

    // Método para adicionar uma nova forma
    public void addForma(String nomeCor, String posicao, int tamanho) {
        Cor cor = CorFactory.getCor(nomeCor);
        Forma forma = new Forma(cor, posicao, tamanho);
        formas.add(forma);
    }

    // Método para exibir as informações de todas as formas
    public void apresentar() {
        for (Forma forma : formas) {
            System.out.println(forma);
        }
    }
}
