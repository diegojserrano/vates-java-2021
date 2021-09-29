import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/Personas?rewriteBatchedStatements=true", "root", "samaria")) {


/*            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from personas");
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }

*/

            con.setAutoCommit(false);
            PreparedStatement st = con.prepareStatement("insert into personas2 values (?,?,?,?);");

            Scanner sc = new Scanner(new File("personas2.txt"));
            sc.useDelimiter("[;\\n]");

            long inicio = System.currentTimeMillis();
            int i = 0;
            while(sc.hasNextInt()) { // Una vuelta por cada linea / persona
                int documento = sc.nextInt();
                String nombre = sc.next();
                String apellido = sc.next();
                int edad = sc.nextInt();

                st.setInt(1,documento);
                st.setString(2,nombre);
                st.setString(3,apellido);
                st.setInt(4,edad);


                st.executeUpdate();
            }
            con.commit();

            st.close();
            long fin = System.currentTimeMillis();
            long tiempo = fin - inicio;

            System.out.println("Tiempo " + tiempo);
        } catch (SQLException | FileNotFoundException throwables) {
            throwables.printStackTrace();
        }

    }
}
