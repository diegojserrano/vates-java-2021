import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[#@\\n]+");
        int campeonatos = sc.nextInt();

        for (int i = 0; i < campeonatos; i++) {
            sc.nextLine();
            String nombre = sc.nextLine();
            int equipos = sc.nextInt();
            Campeonato c = new Campeonato(nombre, equipos);
            sc.nextLine();
            for (int j = 0; j < equipos; j++) {
                String nombreEq = sc.nextLine();
                Equipo e = new Equipo(nombreEq);
                c.agregarEquipo(e);
            }

            int partidos = sc.nextInt();
            for (int j = 0; j < partidos; j++) {
                String nombre1 = sc.next();
                int goles1 = sc.nextInt();
                int goles2 = sc.nextInt();
                String nombre2 = sc.next();
                Partido p = new Partido(nombre1, goles1, nombre2, goles2);
                c.registrarPartido(p);
            }

            System.out.println(c.resultado());
        }
    }
}
