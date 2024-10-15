import java.util.HashMap;
import java.util.Map;

public class CorFactory {
    private static Map<String, Cor> cores = new HashMap<>();

    // Método que retorna a cor, reutilizando se já existir
    public static Cor getCor(String nome) {
        // Verifica se a cor já está no mapa
        Cor cor = cores.get(nome);

        // Se não existir, cria a cor e a adiciona no mapa
        if (cor == null) {
            cor = new Cor(nome);
            cores.put(nome, cor);
        }

        return cor;
    }
}
