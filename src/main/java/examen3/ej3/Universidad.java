package examen3.ej3;

import java.util.List;

public class Universidad extends Institucion{

    public Universidad(String name, int capacity, List<Estudiante> estudiantes, String requisitos) {
        super(name, capacity, estudiantes, requisitos);
    }

    public void showInfo(){
        System.out.println("Esto es una universidad");
        super.showInfo();
    }

    @Override
    public void inscribir(List<Estudiante>estudiantes) {
        System.out.println("Inscribiendo en universidad");
        for (Estudiante e : estudiantes){
            if (e.getRequisitos().equals(getRequisitos())){
                estudiantes.add(e);
            }
        }

    }


}
