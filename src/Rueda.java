public class Rueda {

    private String fabricantes;
    private int aro;
    private double ancho;

    public Rueda(String fabricantes, int aro, double ancho) {
        this.fabricantes = fabricantes;
        this.aro = aro;
        this.ancho = ancho;
    }

    public String getFabricantes() {
        return fabricantes;
    }

    public int getAro() {
        return aro;
    }

    public double getAncho() {
        return ancho;
    }
}
