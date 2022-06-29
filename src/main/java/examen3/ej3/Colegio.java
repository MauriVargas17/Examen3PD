package examen3.ej3;

import java.util.List;

public class Colegio extends Institucion{

    public Colegio(String name, int capacity, List<Estudiante> estudiantes, String requisitos) {
        super(name, capacity, estudiantes, requisitos);
    }

    public void showInfo(){
        System.out.println("Esto es un colegio");
        super.showInfo();
    }

    @Override
    public void inscribir(List<Estudiante> estudiantes) {
        System.out.println("Inscribiendo en colegio");
        for (Estudiante e : estudiantes){
            if (e.getRequisitos().equals(getRequisitos())){
                this.getEstudiantes().add(e);
            }
        }

    }


}
