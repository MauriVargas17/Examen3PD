package examen3.ej5;

public abstract class Agregado implements IMarca{

    private String name;
    private IMarca celu;

    public Agregado(String name, IMarca celu) {
        this.name = name;
        this.celu = celu;
    }

    @Override
    public double getPrecio() {
        return celu.getPrecio();
    }

    public IMarca getCelu() {
        return celu;
    }

    public void setCelu(IMarca celu) {
        this.celu = celu;
    }

    @Override
    public String getNombre() {
        return name;
    }

    @Override
    public int getRam() {
        return celu.getRam();
    }

    @Override
    public int getAlmacenamiento() {
        return celu.getAlmacenamiento();
    }

    @Override
    public int getCpu() {
        return celu.getCpu();
    }
}
