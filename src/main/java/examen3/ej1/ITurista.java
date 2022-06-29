package examen3.ej1;

public interface ITurista {
    String getName();
    double getDinero();
    int getCi();
    double gastar(LaPaz ciudad);
    double gastar(Cochabamba ciudad, int modifier);
    double gastar(SantaCruz ciudad, int modifier);
}
