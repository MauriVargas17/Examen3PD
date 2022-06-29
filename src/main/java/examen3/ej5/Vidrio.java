package examen3.ej5;

public class Vidrio extends Agregado{
    private double precio = 50;

    public Vidrio(String name, IMarca celu) {
        super(name, celu);
    }

    @Override
    public void setAlmacenamiento(int m) {
        getCelu().setAlmacenamiento(m);
    }


    @Override
    public void setPrecio(double p) {
        getCelu().setPrecio(p);
    }

    @Override
    public void showInfo() {
        System.out.println("Tenemos vidrio, costo: "+precio );
        setPrecio(precio);
        getCelu().showInfo();
    }
}

