package examen3.ej5;

public class Celular implements IMarca{

    private String name;
    private int ram;
    private int almacenamiento;
    private int cpu;
    private double precio = 100;

    public Celular(String name, int ram, int almacenamiento, int cpu) {
        this.name = name;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.cpu = cpu;
    }

    @Override
    public void setAlmacenamiento(int m) {
        almacenamiento += m;
    }

    @Override
    public void showInfo() {
        System.out.println("Nombre: "+name);
        System.out.println("Ram: "+ram);
        System.out.println("Almacenamiento: "+almacenamiento);
        System.out.println("Cpu: "+cpu);
        System.out.println("Precio: "+precio);
        System.out.println();


    }

    @Override
    public String getNombre() {
        return name;
    }

    @Override
    public int getRam() {
        return ram;
    }

    @Override
    public int getAlmacenamiento() {
        return almacenamiento;
    }

    @Override
    public int getCpu() {
        return cpu;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double p) {
        precio += p;
    }
}
