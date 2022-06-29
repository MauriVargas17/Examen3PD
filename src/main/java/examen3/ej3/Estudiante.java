package examen3.ej3;

public class Estudiante {
    private String name;
    private int ci;
    private String requisitos;

    public Estudiante(String name, int codigo, String requisitos) {
        this.name = name;
        this.ci = codigo;
        this.requisitos = requisitos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }
}
