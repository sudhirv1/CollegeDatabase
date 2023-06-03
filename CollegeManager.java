package CollegeHW;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CollegeManager {
    private static final String INSERT_QUERY = "INSERT INTO Info (studentNumber, name, address) VALUES (?, ?, ?)";
    private static final String UPDATE_QUERY = "UPDATE Info SET address = ? WHERE studentNumber = ?";
    private static final String DELETE_QUERY = "DELETE FROM Info WHERE studentNumber = ?";
    private static final String SELECT_QUERY = "SELECT * FROM Info";

    private static final String INSERT_ATTEND_QUERY = "INSERT INTO Attendance (studentNumber, date, address) VALUES (?, ?, ?)";


    public static void addStudent(int studentNumber, String name, String address) {
        try (Connection connection = DatabaseConnector.getConnection();//Use method taught to not create object of class before using method
                PreparedStatement statement = connection.prepareStatement(INSERT_QUERY)) {
            statement.setInt(1, studentNumber);
            statement.setString(2, name);
            statement.setString(3, address);
            statement.executeUpdate();
        } 
        catch (SQLException e) {
            System.out.println("ERROR! Trace the problem below\n");
            e.printStackTrace();
        }
    }

    public static void updateAddress(int studentNumber, String newAddress) {
        try (Connection connection = DatabaseConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(UPDATE_QUERY)) {
            statement.setString(1, newAddress);
            statement.setInt(2, studentNumber);
            statement.executeUpdate();
        } 
        catch (SQLException e) {
            System.out.println("ERROR! Trace the problem below\n");
            e.printStackTrace();
        }
    }

    public static void deleteStudent(int studentNumber) {
        try (Connection connection = DatabaseConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(DELETE_QUERY)) {
            statement.setInt(1, studentNumber);
            statement.executeUpdate();
        } 
        catch (SQLException e) {
            System.out.println("ERROR! Trace the problem below\n");
            e.printStackTrace();
        }
    }

    public static void displayStudents() {
        try (Connection connection = DatabaseConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(SELECT_QUERY);
                ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int studentNumber = resultSet.getInt("studentNumber");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                System.out.println("Student Number: " + studentNumber);
                System.out.println("Name: " + name);
                System.out.println("Address: " + address);
                System.out.println("-------------------------");
            }
        } catch (SQLException e) {
            System.out.println("ERROR! Trace the problem below\n");
            e.printStackTrace();
        }
    }
}
