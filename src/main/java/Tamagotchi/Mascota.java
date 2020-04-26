package Tamagotchi;

public class Mascota {
    private int nivelDeContenta;
    private EstadoMascota estadoMascota;
    private int tiempoAburrida;

    public Mascota(int nivelDeContenta, EstadoMascota estadoMascota, int tiempoAburrida) {
        this.nivelDeContenta = nivelDeContenta;
        this.estadoMascota = estadoMascota;
        this.tiempoAburrida = tiempoAburrida;
    }

    public void comer(){
        estadoMascota.comer();

    }

    public void jugar(){
        if(this.podesJugar()){
            estadoMascota.jugar();
        }
    }

    public Boolean podesJugar(){
        return this.estadoMascota.equals(new Contenta()) || this.estadoMascota.equals(new Aburrida());
    }

    public void cambiarEstado(EstadoMascota estado) {
        this.estadoMascota = estado;
    }

    public EstadoMascota getEstadoMascota(){
        return estadoMascota;
    }

    public int getTiempoAburrida() {
        return tiempoAburrida;
    }

    public int getNivelDeContenta() {
        return nivelDeContenta;
    }

    public void setNivelDeContenta(int nivelDeContenta) {
        this.nivelDeContenta = nivelDeContenta;
    }
}
