package examen3.ej5;

public class Client {
    public static void main(String[] args){
        IMarca celular = new Celular("Xiaomi", 3, 128, 9);
        celular = new Carcasa("Xiaomi Carcasa", celular);
        celular = new Vidrio("Xiaomi vidrio", celular);
        celular = new Memoria("Xiaomi memoria", celular);
        celular.showInfo();

    }
}
