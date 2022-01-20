public class LugarSistemaImunologico {

    private String lugar;
    private int codigo;

    public LugarSistemaImunologico(String lugar, int codigo) {
        this.lugar = lugar;
        this.codigo = codigo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
