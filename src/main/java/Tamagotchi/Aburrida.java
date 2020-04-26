package Tamagotchi;

public class Aburrida extends EstadoMascota {
    private Mascota mascota;

    @Override
    public void comer(){
        if (mascota.getTiempoAburrida() > 80){
            mascota.cambiarEstado(new Contenta());
        }
    }

    @Override
    public void jugar(){
        mascota.cambiarEstado(new Contenta());
    }

}
