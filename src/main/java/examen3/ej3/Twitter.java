package examen3.ej3;

import java.util.List;

public class Twitter implements IRedSocial{

    private Institucion tipoInstitucion;

    public Twitter(Institucion tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    @Override
    public void controlar(Institucion institucion, List<Estudiante> estudiantes) {
        System.out.println("Controlando desde Twitter");
        institucion.inscribir(estudiantes);
    }

    @Override
    public void showInfo() {
        tipoInstitucion.showInfo();
    }
}
