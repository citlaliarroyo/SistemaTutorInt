package include;

public class Inteligencias {
    private int id_inteligencias;
    private String tipo_de_inteligencia;

    public Inteligencias(int id_inteligencias, String tipo_de_inteligencia) {
        this.id_inteligencias = id_inteligencias;
        this.tipo_de_inteligencia = tipo_de_inteligencia;
    }

    public int getId_inteligencias() {
        return id_inteligencias;
    }

    public void setId_inteligencias(int id_inteligencias) {
        this.id_inteligencias = id_inteligencias;
    }

    public String getTipo_de_inteligencia() {
        return tipo_de_inteligencia;
    }

    public void setTipo_de_inteligencia(String tipo_de_inteligencia) {
        this.tipo_de_inteligencia = tipo_de_inteligencia;
    }

}