package Tamagotchi;

public class Contenta extends EstadoMascota {
    private Mascota mascota;
    private int cantDeJugadas = 0;

    @Override
    public void comer() {
        mascota.setNivelDeContenta(1);
    }

    @Override
    public void jugar() {
        if(cantDeJugadas <= 5){
            mascota.setNivelDeContenta(2);
            cantDeJugadas ++;
        }
        else{
            mascota.cambiarEstado(new Hambrienta());
        }
    }
}
