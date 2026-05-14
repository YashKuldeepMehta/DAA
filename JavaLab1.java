import java.sql.*;

public class JavaLab1 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/javalab1";
        String username = "root";
        String password = "";  

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to Database!");

            String insertQuery = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement insertStmt = con.prepareStatement(insertQuery);

            insertStmt.setInt(1, 2);
            insertStmt.setString(2, "Anjali");
            insertStmt.setInt(3, 21);

            insertStmt.executeUpdate();
            System.out.println("Data Inserted Successfully!");

            insertStmt.close();

            String selectQuery = "SELECT * FROM student";
            Statement selectStmt = con.createStatement();
            ResultSet rs = selectStmt.executeQuery(selectQuery);

            System.out.println("\n--- Student Table Data ---");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println("ID: " + id + 
                                   ", Name: " + name + 
                                   ", Age: " + age);
            }

            rs.close();
            selectStmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}