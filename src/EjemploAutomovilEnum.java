public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45);
        Automovil subaru = new Automovil("subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHACK);

        Automovil mazda = new Automovil("mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println(mazda.getFabricantes());

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("Tipo subaru " + tipo.getNombre());
        System.out.println("Tipo desc.subaru " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El auto es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
            case FURGON -> System.out.println("Es un automovil utilitario de trasnpore, de empresas");
            case HATCHACK -> System.out.println("Es un automovil mediano compacto, de aspecto deportivo");
            case PICKUP -> System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automovil mediano");
            case STATION_WAGON -> System.out.println("Es un automovil mas grande, con maletas grande...");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta : tipos) {
            System.out.print(ta + " =>" + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuerta());
            System.out.println();
        }
    }
}

