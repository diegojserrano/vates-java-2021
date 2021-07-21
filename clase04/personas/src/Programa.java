public class Programa {


    public static void main(String[] args) {

        Persona per1 = new Persona("Juan", "Perez", 1953);
        Persona per2 = new Persona();
        Persona per3 = new Persona();

        //per2.setNombre("Silvia");
        //per2.setApellido("Perez");
        //per2.setNacimiento(1967);

        per3.setNombre("Mario");
        per3.setApellido("Gomez");
        per3.setNacimiento(1938);

        per3 = per1;

        //per1.nacimiento++;
        per1.setNacimiento(per1.getNacimiento()+1);

        System.out.println("Persona 1");
        System.out.println(per1.getNombreCompleto());
        System.out.println(per1.getNacimiento());
        System.out.println("Persona 2");
        System.out.println(per2.getNombreCompleto());
        System.out.println(per2.getNacimiento());
        System.out.println("Persona 3");
        System.out.println(per3.getNombreCompleto());
        System.out.println(per3.getNacimiento());



        System.out.println("añsldkfjas");
    }
}
