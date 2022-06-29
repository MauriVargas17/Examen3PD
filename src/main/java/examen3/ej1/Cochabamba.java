package examen3.ej1;

public class Cochabamba implements IDepto{

    private String name;
    private int numberProvincias;
    private int numberHabitantes;
    private String clima;
    private double dineroPorTurismo;

    public Cochabamba(String name, int numberProvincias, int numberHabitantes, String clima, double dineroPorTurismo) {
        this.name = name;
        this.numberProvincias = numberProvincias;
        this.numberHabitantes = numberHabitantes;
        this.clima = clima;
        this.dineroPorTurismo = dineroPorTurismo;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumberProvincias() {
        return numberProvincias;
    }

    @Override
    public int getNumberHabitantes() {
        return numberHabitantes;
    }

    @Override
    public String getClima() {
        return clima;
    }

    @Override
    public double getDineroPorTurismo() {
        return dineroPorTurismo;
    }

    @Override
    public void recibirTurista(ITurista turista) {
        dineroPorTurismo += turista.gastar(this, numberHabitantes);
    }
}
