public class Programa {


    public static void main(String[] args) {

        Persona per1 = new Persona();
        Persona per2 = new Persona();
        Persona per3 = new Persona();


        per1.nombre = "Juan";
        per1.apellido = "Perez";
        per1.nacimiento = 1987;

        per2.nombre = "Silvia";
        per2.apellido = "Perez";
        per2.nacimiento = 1967;

        per3.nombre = "Mario";
        per3.apellido = "Gomez";
        per3.nacimiento = 1938;

        per3 = per1;

        per1.nacimiento++;

        System.out.println("Persona 1");
        System.out.println(per1.nombre);
        System.out.println(per1.apellido);
        System.out.println(per1.nacimiento);
        System.out.println("Persona 2");
        System.out.println(per2.nombre);
        System.out.println(per2.apellido);
        System.out.println(per2.nacimiento);
        System.out.println("Persona 3");
        System.out.println(per3.nombre);
        System.out.println(per3.apellido);
        System.out.println(per3.nacimiento);
    }
}
