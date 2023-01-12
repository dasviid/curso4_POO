import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.AZUL);

        Automovil mazda = new Automovil("mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        System.out.println(mazda.getFabricantes());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.BLANCO, new Motor(2.5, TipoMotor.BENCINA), new Estanque(50));
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5, TipoMotor.BENCINA), new Estanque());
        Automovil nissan3 = new Automovil();

        Date fecha = new Date();
        System.out.println(nissan.equals(fecha));
        System.out.println(nissan.toString());

        System.out.println(nissan2.equals(nissan));
        System.out.println(nissan3.equals(nissan));
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(subaru.acelerar(100));
        System.out.println(mazda.frenar());
        System.out.println(subaru.acelerarFrenar(3000));

        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300, 60));
        System.out.println("Kilometros por litro " + nissan.calcularConsumo(300, 60));

    }
}
