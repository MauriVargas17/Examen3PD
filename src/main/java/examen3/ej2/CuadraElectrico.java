package examen3.ej2;

import java.util.Random;

public class CuadraElectrico implements ICuadraElectro{

    private int tanque = 0;

    @Override
    public void cargar() {
        int n = new Random().nextInt(20);
        if(n%2==0){
            tanque = n;
        }else {
            tanque = n + 1;
        }

    }

    @Override
    public int getEstadoElectricidad() {
        return tanque;
    }
}