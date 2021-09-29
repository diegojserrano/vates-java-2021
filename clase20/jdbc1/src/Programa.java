import java.sql.*;

public class Programa {
    public static void main(String[] args) {

        try {
            Connection conn =  DriverManager.getConnection("jdbc:mariadb://localhost/Personas", "root", "root");
            // En este punto se pudo establecer la conexion
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from Personas");

            while(rs.next()) {

                String apellido = rs.getString("apellido");
                String nombre = rs.getString("nombre");
                int id = rs.getInt("id");
                System.out.println(id + ": " + nombre + " " + apellido);
            }

            rs.close();
            st.close();
            conn.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
