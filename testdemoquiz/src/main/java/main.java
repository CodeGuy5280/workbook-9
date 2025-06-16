import java.sql.PreparedStatement;
import java.sql.ResultSet;


String query = "SELECT * FROM customers WHERE age > ?";

PreparedStatement stmt = conn.prepareStatement(query);

stmt.setInt(1, 18);

ResultSet rs = stmt.executeQuery();

while (rs.next()) {

String name = rs.getString("name");

String email = rs.getString("email");

int age = rs.getInt("age");

   System.out.println(name + " " + email + " " + age);

}

