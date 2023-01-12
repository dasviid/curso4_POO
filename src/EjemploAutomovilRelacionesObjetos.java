public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {



        Persona conductorSubaru = new Persona("David", "Barreneche");
        Automovil subaru = new Automovil("subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedaSubaru);
        Rueda[] ruedaSubaru = new Rueda[5];
        for (int i = 0; i < ruedaSubaru.length; i++) {
           subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Persona pato = new Persona("Pato", "Nisman");
        Automovil mazda = new Automovil("mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque(20));
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMazda);
        Rueda[] ruedasMazda = new Rueda[5];
        for ( int i = 0; i < ruedasMazda.length; i ++){
           mazda.addRueda( new Rueda("michelin",18,10.5));
        }

        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "Navara",
                Color.GRIS, new Motor(2.0, TipoMotor.BENCINA), new Estanque(20));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setConductor(bea);
        nissan.addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5));


        Rueda[] ruedaNissan2 = { new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
        };

        Persona lalo = new Persona("Lalo", "Mendoza");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(2.0, TipoMotor.DIESEL), new Estanque(45),lalo,null  );
        nissan2.setColor(Color.AZUL);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.GRIS);

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

      /*  System.out.println("El conductor de la subaru es: "+ subaru.getConductor());
        System.out.println("Ruedas subaru");
        for (Rueda r : subaru.getRuedas()){
            System.out.println(r.getFabricantes()+", " + r.getAro() + ", " + r.getAncho());

        }*/

    }
}
