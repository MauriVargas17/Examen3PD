package examen3.ej3;

import java.util.List;

public class Escuela extends Institucion{

    public Escuela(String name, int capacity, List<Estudiante> estudiantes, String requisitos) {
        super(name, capacity, estudiantes, requisitos);
    }

    public void showInfo(){
        System.out.println("Esto es una escuela");
        super.showInfo();
    }

    @Override
    public void inscribir(List<Estudiante> estudiantes) {
        System.out.println("Inscribiendo en escuela");
        for (Estudiante e : estudiantes){
            if (e.getRequisitos().equals(getRequisitos())){
                estudiantes.add(e);
            }
        }

    }


}