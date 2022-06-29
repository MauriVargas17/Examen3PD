package examen3.ej3;

import java.util.List;

public class Facebook implements IRedSocial{

    private Institucion tipoInstitucion;

    public Facebook(Institucion tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    @Override
    public void controlar(Institucion institucion, List<Estudiante> estudiantes) {
        System.out.println("Controlando desde Facebook");
        institucion.inscribir(estudiantes);
    }

    @Override
    public void showInfo() {
        tipoInstitucion.showInfo();
    }
}
