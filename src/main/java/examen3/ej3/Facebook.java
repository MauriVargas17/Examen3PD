package examen3.ej3;

import java.util.List;

public class Facebook implements IRedSocial{

    private Institucion institucion;

    public Facebook(Institucion tipoInstitucion) {
        this.institucion = tipoInstitucion;
    }

    @Override
    public void controlar( List<Estudiante> estudiantes) {
        System.out.println("Controlando desde Facebook");
        institucion.inscribir(estudiantes);
    }

    @Override
    public void showInfo() {
        institucion.showInfo();
    }
}
