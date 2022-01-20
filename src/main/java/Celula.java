import java.util.Arrays;
import java.util.List;

public class Celula implements ICelula{

    private int id;
    private String nome;
    private String tamanho;
    private int codigo;

    public Celula(int id){
        this.id = id;
        Celula object = BD.getCelula(id);
        this.nome = object.nome;
        this.tamanho = object.tamanho;
        this.codigo = object.codigo;
    }

    public Celula(int id, String nome, String tamanho, int codigo) {
        this.id = id;
        this.nome = nome;
        this.tamanho = tamanho;
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getcodigo() {
        return codigo;
    }

    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public List<String> getDados() {
        return Arrays.asList(this.nome, this.tamanho);
    }

    @Override
    public String checkup(LugarSistemaImunologico sistemaImunologico) {
        return "Celula verificada " + sistemaImunologico.getLugar();
    }
}
