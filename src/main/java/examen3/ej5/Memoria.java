package examen3.ej5;

public class Memoria extends Agregado{
    private double precio = 100;
    private int memoria = 500;

    public Memoria(String name, IMarca celu) {
        super(name, celu);
    }


    @Override
    public void setPrecio(double p) {
        getCelu().setPrecio(p);
    }

    @Override
    public void setAlmacenamiento(int m) {
        getCelu().setAlmacenamiento(m);
    }

    @Override
    public void showInfo() {
        System.out.println("Tenemos memoria externa, costo: "+precio );
        setPrecio(precio);
        setAlmacenamiento(memoria);
        getCelu().showInfo();
    }
}


