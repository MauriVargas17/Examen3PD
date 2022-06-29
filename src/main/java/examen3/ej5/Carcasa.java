package examen3.ej5;

public class Carcasa extends Agregado{
    private double precio = 34;

    public Carcasa(String name, IMarca celu) {
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
        System.out.println("Tenemos carcasa, costo: "+precio );
        setPrecio(precio);
        getCelu().showInfo();
    }
}
