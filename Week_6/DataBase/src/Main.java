import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Veritabanına bağlanın
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employees", "postgres", "postgres");

            // SQL sorgusu oluşturun
            String sql = "SELECT id, name, position, salary FROM employees";

            // Sorguyu çalıştırın
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Sonuçları işleyin
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String position = resultSet.getString("position");
                double salary = resultSet.getDouble("salary");

                System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary);
            }

            // Bağlantıyı kapatın
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
