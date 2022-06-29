package examen3.ej1;

public class Client {
    public static void main(String[] args){
        LaPaz laPaz = new LaPaz("La Paz", 50, 1000000, "Frio", 0);
        SantaCruz santaCruz = new SantaCruz("SCZ", 70, 2000000, "Calido", 0);
        Cochabamba cochabamba = new Cochabamba("Cochabamba", 60, 1500000, "Templado", 0);

        Turista turista = new Turista("Bob", 240000, 1234567);

        laPaz.recibirTurista(turista);
        cochabamba.recibirTurista(turista);
        santaCruz.recibirTurista(turista);

        turista.showTurista();
    }
}
