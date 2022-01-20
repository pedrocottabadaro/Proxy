
import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Celula > celulas = new HashMap<>();

    public static Celula getCelula(Integer id) {
        return celulas.get(id);
    }

    public static void addCelula(Celula celula) {
        celulas.put(celula.getId(), celula);
    }
}