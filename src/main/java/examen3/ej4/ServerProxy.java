package examen3.ej4;

import java.util.ArrayList;
import java.util.List;

public class ServerProxy implements IServer{
    private Server1 server1 = new Server1();
    private Server2 server2 = new Server2();
    private List<Usuario> users = new ArrayList<>();

    public ServerProxy(List<Usuario> users) {
        this.users = users;
    }

    @Override
    public void acceptUser(Usuario user) {
        if (users.contains(user)){
            if (isPrime(user.getId())){
                server1.acceptUser(user);
            } else {
                server2.acceptUser(user);
            }
        }
    }

    private boolean isPrime(int n){
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
