public class Automovil implements Comparable<Automovil> {

    private int id;
    private String fabricantes;
    private String modelo;
    private Color color = COLOR_GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private  int  indiceRuedas;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.ROJO;
    private static int capacidadTanqueEcstatic = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAXIMA_CIUDAD = 60;

    public static final Color COLOR_ROJO = Color.ROJO;
    public static final Color COLOR_AMARILLO = Color.AMARILLO;
    public static final Color COLOR_AZUL = Color.AZUL;
    public static final Color COLOR_BLANCO = Color.BLANCO;
    public static final Color COLOR_GRIS = Color.GRIS;

    public Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricantes, String modelo) {
        this();
        this.fabricantes = fabricantes;
        this.modelo = modelo;
    }

    public Automovil(String fabricantes, String modelo, Color color) {
        this(fabricantes, modelo);
        this.color = color;
    }

    public Automovil(String fabricantes, String modelo, Color color, Motor motor) {
        this(fabricantes, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricantes, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricantes, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricantes, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricantes, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEcstatic;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEcstatic = capacidadTanqueEstatico;
    }

    public String getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(String fabricantes) {
        this.fabricantes = fabricantes;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (estanque == null) {
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda){
        if (indiceRuedas < this.ruedas.length){
        this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }

    public String verDetalle() {
        String detalle = "auto.fabricantes = " + getFabricantes() +
                "\nauto.modelo = " + this.getModelo() + "\nauto.color = " + this.color;
        if (this.getTipo() != null) {
            detalle += "\nauto.tipo = " + this.getTipo().getNombre() + "\nauto.cilindrada = ";
        }
        detalle += "\naututo.color.patente = " + colorPatente +
                "\nauto.id = " + this.id;
        if (this.motor != null) {
            detalle += "\nauto.cilindrada = " + this.motor.getCilindrada();
        }
        if (getConductor() != null) {
            detalle += "\nConductor subaru: " + this.getConductor();
        }
        if (getRuedas() != null) {
            for (Rueda r : this.getRuedas()) {
               detalle +="\n"+ r.getFabricantes() + ", " + r.getAro() + ", " + r.getAncho();

            }
        }

        return detalle;
    }

    public String acelerar(int rpm) {
        return "el auto " + this.fabricantes + " acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return this.fabricantes + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentaje) {
        return km / (porcentaje * estanque.getCapacidad());
    }

    public float calcularConsumo(int km, int porcentaje) {
        return km / ((porcentaje / 100f) * estanque.getCapacidad());
    }

    public static float calcularConsumoEstatico(int km, int calcularConsumoEstatico) {
        return km / ((calcularConsumoEstatico / 100f) * capacidadTanqueEcstatic);
    }

    @Override
    public int compareTo(Automovil a) {
        return fabricantes.compareTo(a.fabricantes);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Automovil)) {
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricantes != null && this.modelo != null
                && this.fabricantes.equals(a.getFabricantes())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return fabricantes + '\'' +
                modelo + '\'' + id ;
    }
}
