package examen3.ej1;

public interface IDepto {
    String getName();
    int getNumberProvincias();
    int getNumberHabitantes();
    String getClima();
    double getDineroPorTurismo();
    void recibirTurista(ITurista turista);
}
