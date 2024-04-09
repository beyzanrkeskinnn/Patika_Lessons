import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Veritabanı bağlantısı
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employees", "postgres", "postgres");

            // SQL sorgusu
            String sql = "SELECT id, name, position, salary FROM employees";

            // Sorguyu çalıştır
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Sonuçlar
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String position = resultSet.getString("position");
                double salary = resultSet.getDouble("salary");

                System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary);
            }

            // Bağlantıyı kapat
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
