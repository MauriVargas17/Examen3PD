package examen3.ej4;

import java.util.ArrayList;
import java.util.List;

public class Server1 implements IServer{
    private List<Usuario> users = new ArrayList<>();

    @Override
    public void acceptUser(Usuario user) {
        System.out.println("Aceptando usuario "+user.getName()+" al Server 1");
        users.add(user);
    }
}
