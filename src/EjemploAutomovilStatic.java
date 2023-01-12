public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45);
        System.out.println(Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        Automovil subaru = new Automovil("subaru", "Impreza");
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHACK);

        Automovil mazda = new Automovil("mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque(20));
        System.out.println(mazda.getFabricantes());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(2.0, TipoMotor.BENCINA), new Estanque(20));
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(2.0, TipoMotor.DIESEL), new Estanque(45));
        Automovil nissan3 = new Automovil();
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.GRIS);
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Kilometros por litros = " + nissan.calcularConsumoEstatico(300, 60));
        System.out.println("Kilometros por litros = " + nissan2.calcularConsumoEstatico(300, 60));
        System.out.println("Kilometros por litros = " + nissan3.calcularConsumoEstatico(300, 60));

        System.out.println("Velocidad maxima en carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad maxima en ciudad: " + Automovil.VELOCIDAD_MAXIMA_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("Tipo subaru " + tipoSubaru.getNombre());
        System.out.println("Tipo desc.subaru " + tipoSubaru.getDescripcion());

        System.out.println(mazda.calcularConsumo(300,70));
    }
}
