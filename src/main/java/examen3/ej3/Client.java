package examen3.ej3;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        Universidad universidad = new Universidad("UPB", 2400, new ArrayList<>(), "Ser mas pro");
        Colegio colegio = new Colegio("La Salle", 1200, new ArrayList<>(), "Ser pro");
        Escuela escuela = new Escuela("Bichito de luz", 400, new ArrayList<>(), "Ser peque");

        Estudiante e1 = new Estudiante("Bob", 1234, "Ser pro");
        Estudiante e2 = new Estudiante("Rob", 46456, "Ser mas pro");
        Estudiante e3 = new Estudiante("Elena", 75675, "Ser peque");
        Estudiante e4 = new Estudiante("Jake", 24245, "Ser pro");
        Estudiante e5 = new Estudiante("Ulises", 86786, "Ser mas pro");

        List<Estudiante> lista1 = new ArrayList<>();
        lista1.add(e1);
        lista1.add(e4);

        List<Estudiante> lista2 = new ArrayList<>();
        lista2.add(e2);
        lista2.add(e5);

        List<Estudiante> lista3 = new ArrayList<>();
        lista3.add(e3);



        Facebook facebook = new Facebook(universidad);
        WhatsApp whatsApp = new WhatsApp(colegio);
        Twitter twitter = new Twitter(escuela);

        facebook.controlar(lista2);
        whatsApp.controlar(lista1);
        twitter.controlar(lista3);

        facebook.showInfo();
        whatsApp.showInfo();
        twitter.showInfo();

    }
}
