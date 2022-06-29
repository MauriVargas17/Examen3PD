package examen3.ej3;

public class Estudiante {
    private String name;
    private int codigo;
    private String requisitos;

    public Estudiante(String name, int codigo, String requisitos) {
        this.name = name;
        this.codigo = codigo;
        this.requisitos = requisitos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }
}
