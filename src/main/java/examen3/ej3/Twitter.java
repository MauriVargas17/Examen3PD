package examen3.ej3;

import java.util.List;

public class Twitter implements IRedSocial{

    private Institucion institucion;

    public Twitter(Institucion tipoInstitucion) {
        this.institucion = tipoInstitucion;
    }

    @Override
    public void controlar(List<Estudiante> estudiantes) {
        System.out.println("Controlando desde Twitter");
        institucion.inscribir(estudiantes);
    }

    @Override
    public void showInfo() {
        institucion.showInfo();
    }
}
