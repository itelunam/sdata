public class Ambiente {
    private int numAmbiente;
    private int capacidad;
    private int piso;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void showData(){
        System.out.println("Num Ambiente:"+this.numAmbiente+" Capacidad:"+this.capacidad+" Ubicacion:"+this.piso);
    }

    public int getNumAmbiente() {
        return numAmbiente;
    }

    public void setNumAmbiente(int numAmbiente) {
        this.numAmbiente = numAmbiente;
    }
}
