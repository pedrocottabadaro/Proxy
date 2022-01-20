import java.util.List;

public class CelulaProxy implements ICelula{
    private Celula celula;
    private Integer id;

    public CelulaProxy(Integer id) {
        this.id = id;
    }

    @Override
    public List<String> getDados() {

        if(this.celula == null) {
            this.celula = new Celula(this.id);
        }
        return this.celula.getDados();
    }

    @Override
    public String checkup(LugarSistemaImunologico sistemaImunologico) {
        if(this.celula == null) {
            this.celula = new Celula(this.id);
        }
        if(this.celula.getcodigo()!= sistemaImunologico.getCodigo()) {
            throw new IllegalArgumentException("Celula será finalizada");
        }
        return this.celula.checkup(sistemaImunologico);
    }
}
