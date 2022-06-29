package examen3.ej4;

import java.util.ArrayList;
import java.util.List;

public class Server2 implements IServer{
    private List<Usuario> users = new ArrayList<>();

    @Override
    public void acceptUser(Usuario user) {
        System.out.println("Aceptando usuario "+user.getName()+" al Server 2");
        users.add(user);
    }
}
