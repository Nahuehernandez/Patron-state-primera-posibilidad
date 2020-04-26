package Tamagotchi;

public class Hambrienta extends EstadoMascota{
    private Mascota mascota;

    @Override
    public void comer() {
        mascota.cambiarEstado(new Contenta());
    }
}
