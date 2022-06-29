package examen3.ej1;

import java.util.Random;

public class Turista implements ITurista{

    private String name;
    private double dinero;
    private int ci;

    public Turista(String name, double dinero, int ci) {
        this.name = name;
        this.dinero = dinero;
        this.ci = ci;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getDinero() {
        return dinero;
    }

    @Override
    public int getCi() {
        return ci;
    }

    @Override
    public double gastar(LaPaz ciudad) {
        double amount = new Random().nextDouble();
        System.out.println("Gasta: "+ amount);
        reduceBalance(amount);
        return amount;
    }

    @Override
    public double gastar(Cochabamba ciudad, int modifier) {
        double amount = modifier * 0.1;
        System.out.println("Gasta: "+ amount);
        reduceBalance(amount);
        return amount;
    }

    @Override
    public double gastar(SantaCruz ciudad, int modifier) {
        double amount = modifier * 0.5;
        System.out.println("Gasta: "+ amount);
        reduceBalance(amount);
        return amount;
    }

    private void reduceBalance(double amount){
        if (amount > dinero){
            dinero = 0;
        } else {
            dinero -= amount;
        }
    }

    public void showTurista(){
        System.out.println("Turista!");
        System.out.println("Nombre: "+name);
        System.out.println("Dinero: "+dinero);
        System.out.println("ci: "+ci);
        System.out.println();

    }
}
