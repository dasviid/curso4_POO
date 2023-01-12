import java.util.Arrays;

public class EjemploAutomovilArreglos {
    public static void main(String[] args) {



        Persona conductorSubaru = new Persona("David", "Barreneche");
        Automovil subaru = new Automovil("subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHACK);
        subaru.setConductor(conductorSubaru);

        Persona pato = new Persona("Pato", "Nisman");
        Automovil mazda = new Automovil("mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque(20));
        mazda.setConductor(pato);

        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "Navara",
                Color.GRIS, new Motor(2.0, TipoMotor.BENCINA), new Estanque(20));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setConductor(bea);

        Persona lalo = new Persona("Lalo", "Mendoza");
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS, new Motor(2.0, TipoMotor.DIESEL), new Estanque(45) );
        suzuki.setConductor(lalo);
        suzuki.setColor(Color.AZUL);
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.GRIS);

        Automovil audi = new Automovil("Audi","A3");
        audi.setConductor(new Persona("Jano", "Perez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto.toString());
        }
    }
}
