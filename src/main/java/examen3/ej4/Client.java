package examen3.ej4;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        Usuario u1 = new Usuario(1, "Bob", "123");
        Usuario u2 = new Usuario(2, "Rob", "453");
        Usuario u3 = new Usuario(3, "Ken", "643");
        Usuario u4 = new Usuario(4, "Lalo", "654");

        List<Usuario> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        ServerProxy verifier = new ServerProxy(users);

        verifier.acceptUser(u1);
        verifier.acceptUser(u2);
        verifier.acceptUser(u3);


    }
}
