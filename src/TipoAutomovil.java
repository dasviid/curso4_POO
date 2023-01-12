public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 4),
    HATCHACK("Hatchback", "Auto compacto", 4),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgon", "Auto utilitario", 4),
    SUV("SUV","Todo terreno deportivo",5);

    private final String nombre;
    private final int numeroPuerta;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }
}
