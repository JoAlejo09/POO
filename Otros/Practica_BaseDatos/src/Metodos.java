import java.sql.*;

public class Metodos {
    private Connection conexion;
    public static String url= "jdbc:mysql://localhost:3306/";
    public static String usuario = "root";
    public static String password = "root";
    public static String database= "practica";

    public void consultarRegistros() {
        String query = "SELECT * FROM tabla_ejemplo"; // Cambia 'tabla_ejemplo' por el nombre de tu tabla
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Nombre: " + rs.getString("nombre"));
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar registros: " + e.getMessage());
        }
    }

    // Método para agregar un registro
    public void agregarRegistro(String nombre) {
        String query = "INSERT INTO tabla_ejemplo (nombre) VALUES (?)";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setString(1, nombre);
            stmt.executeUpdate();
            System.out.println("Registro agregado con éxito.");
        } catch (SQLException e) {
            System.out.println("Error al agregar registro: " + e.getMessage());
        }
    }

    // Metodo para editar un registro
    public void editarRegistro(int id, String nuevoNombre) {
        String query = "UPDATE tabla_ejemplo SET nombre = ? WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setString(1, nuevoNombre);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("Registro actualizado con éxito.");
        } catch (SQLException e) {
            System.out.println("Error al actualizar registro: " + e.getMessage());
        }
    }

    // Metodo para eliminar un registro
    public void eliminarRegistro(int id) {
        String query = "DELETE FROM tabla_ejemplo WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Registro eliminado con éxito.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar registro: " + e.getMessage());
        }
    }
    /* AGREGAR TABLAS
    DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cod");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Edad");
        model.addColumn("Correo");
        while (res.next()) {
        Object[] fila = {res.getInt("cod"), res.getString("nombre"), res.getString("apellido"),res.getInt("edad"),res.getString("correo")};
        model.addRow(fila);
    }
        table1.setModel(model);
}*/
}
