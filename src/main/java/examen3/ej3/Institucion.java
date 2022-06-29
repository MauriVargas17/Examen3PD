package examen3.ej3;

import java.util.List;

public abstract class Institucion {

    private String name;
    private int capacity;
    private List<Estudiante> estudiantes;
    private String requisitos;

    public Institucion(String name, int capacity, List<Estudiante> estudiantes, String requisitos) {
        this.name = name;
        this.capacity = capacity;
        this.estudiantes = estudiantes;
        this.requisitos = requisitos;
    }

    public abstract void inscribir(List<Estudiante> estudiantes);

    public void showInfo(){
        System.out.println("Nombre: "+name);
        System.out.println("Capacidad: "+capacity);
        System.out.println("Requisitos: "+requisitos);
        System.out.println("Estudiantes:");
        for (Estudiante e: estudiantes){
            System.out.println("Nombre: "+e.getName());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }
}
