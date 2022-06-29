package examen3.ej3;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args){
        Universidad universidad = new Universidad("UPB", 2400, new ArrayList<>(), "Ser mas pro");
        Colegio colegio = new Colegio("La Salle", 1200, new ArrayList<>(), "Ser pro");
        Escuela escuela = new Escuela("Bichito de luz", 400, new ArrayList<>(), "Ser peque");


        Facebook facebook = new Facebook();

    }
}
