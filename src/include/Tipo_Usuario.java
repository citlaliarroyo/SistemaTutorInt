package include;

public class Tipo_Usuario {
    private int id_tipo;
    private String nombre_tipo_usuario;

    public Tipo_Usuario(int id_tipo, String nombre_tipo_usuario){
        this.id_tipo = id_tipo;
        this.nombre_tipo_usuario = nombre_tipo_usuario;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public void setNombre_tipo_usuario(String nombre_tipo_usuario) {
        this.nombre_tipo_usuario = nombre_tipo_usuario;
    }

    public String getNombre_tipo_usuario() {
        return nombre_tipo_usuario;
    }
}
