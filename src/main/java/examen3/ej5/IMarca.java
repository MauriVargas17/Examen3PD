package examen3.ej5;

public interface IMarca {
    String getNombre();
    int getRam();
    int getAlmacenamiento();
    int getCpu();
    double getPrecio();
    void setPrecio(double p);
    void setAlmacenamiento(int m);

    void showInfo();

}
