package examen3.ej3;

import java.util.List;

public class WhatsApp implements IRedSocial{

    private Institucion institucion;

    public WhatsApp(Institucion tipoInstitucion) {
        this.institucion = tipoInstitucion;
    }

    @Override
    public void controlar(List<Estudiante> estudiantes) {
        System.out.println("Controlando desde WhatsApp");
        institucion.inscribir(estudiantes);
    }

    @Override
    public void showInfo() {
        institucion.showInfo();
    }
}