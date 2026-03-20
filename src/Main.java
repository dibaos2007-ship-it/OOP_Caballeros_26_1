
public class Main {
    public static void main(String[] args) {


        Persona p1 = new Persona("Yonaiker");
        Persona p2 = new Persona("MILLOS DAVID");
        Persona p3 = new Persona("TAL CUAL");

        Caballero c1 = new Caballero("Mu DE ");
        c1.constelacion="Aries";
        c1.material=Material.ORO;
        c1.dios=Dios.ATENEA;
        //aqui puse a saga y kanon
        Caballero c3 = new Caballero("saga y kanon de ");
        c3.constelacion="geminis";
        c3.material=Material.ORO;
        c3.dios=Dios.ATENEA;
        //AQUI ESTA CANCER (MUERTE MASK)
        Caballero c4 = new Caballero("MUERTE MASK de ");
        c4.constelacion="CANCER";
        c4.material=Material.ORO;
        c4.dios=Dios.ATENEA;
        //AQUI ESTA LEO(AIORIA)
        Caballero c5 = new Caballero("AIORIA de ");
        c5.constelacion="LEO";
        c5.material=Material.ORO;
        c5.dios=Dios.ATENEA;
        //AQUI ESTA VIRGO(SAKHA)
        Caballero c6 = new Caballero("SHAKA de ");
        c6.constelacion="VIRGO";
        c6.material=Material.ORO;
        c6.dios=Dios.ATENEA;
        //AQUI ESTA LIBRA(DOHKO)
        Caballero c7 = new Caballero("DOCKO de ");
        c7.constelacion="LIBRA";
        c7.material=Material.ORO;
        c7.dios=Dios.ATENEA;
        //AQUI ESTA ESCORPIO(MILO)
        Caballero c8 = new Caballero("MILO de ");
        c8.constelacion="ESCORPIO";
        c8.material=Material.ORO;
        c8.dios=Dios.ATENEA;
        //AQUI ESTA SAGITARIO(AIOROS)
        Caballero c9 = new Caballero("AIOROS de ");
        c9.constelacion="SAGITARIO";
        c9.material=Material.ORO;
        c9.dios=Dios.ATENEA;
        //AQUI ESTA capricornio(shura)
        Caballero c10 = new Caballero("shura de ");
        c10.constelacion="CAPRICORNIO";
        c10.material=Material.ORO;
        c10.dios=Dios.ATENEA;
        //AQUI ESTA ACUARIO(CAMUS)
        Caballero c11 = new Caballero("CAMUS de ");
        c11.constelacion="ACUARIO";
        c11.material=Material.ORO;
        c11.dios=Dios.ATENEA;
        //AQUI ESTA PICIS(AFRODITA)
        Caballero c12 = new Caballero("AFRODITA de ");
        c12.constelacion="PICIS";
        c12.material=Material.ORO;
        c12.dios=Dios.ATENEA;




        Caballero c2 = new Caballero("Aldebaran de ",Material.ORO,"Tauro",Dios.ATENEA);
        System.out.println(c2.material+" ");


       System.out.println(c2.getVida());

//AQUI ESTA LA VIDA DE TAURO
       c2.setVida(900);
        System.out.println(c2.getVida());
        //System.out.println(c2);
        //aqui esta la vida de GEMINIS
        c3.setVida(950);
        System.out.println(c3.getVida());

//ESTA ES LA VIDA DE ARIES
        c1.setVida(850);
        System.out.println(c1.getVida());
        //LA VIDA DE CANCER
        c4.setVida(700);
        System.out.println(c4.getVida());
        //LA VIDA DE LEO
        c5.setVida(850);
        System.out.println(c5.getVida());
        //LA VIDA DE VIRGO (SHAKA)
        c6.setVida(980);
        System.out.println(c6.getVida());
        //AQUI ESTA LA VIDE DE LIBRA
        c7.setVida(920);
        System.out.println(c7.getVida());
        //AQUI LA DE ESCORPIO
        c8.setVida(820);
        System.out.println(c8.getVida());
        //AQUI LA DE SAGITARIO
        c9.setVida(940);
        System.out.println(c9.getVida());
        //AQUI LA DE CAPRICORNIO
        c10.setVida(800);
        System.out.println(c10.getVida());

        //AQUI LA DE ACUARIO
        c11.setVida(830);
        System.out.println(c11.getVida());
        //AQUI LA DE PICIS
        c12.setVida(750);
        System.out.println(c12.getVida());





        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        //c1.persona=p1;
        //c2.persona=p2;

        System.out.println(c2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
        System.out.println(c10);
        System.out.println(c11);
        System.out.println(c12);



    }
}