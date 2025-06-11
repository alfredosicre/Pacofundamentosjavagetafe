import java.sql.Connection;
import java.sql.DriverManager;
// import com.mysql.cj.jdbc.Driver;

public class ClassTesting {
    public static void main(String[] args) {
        String texto = "abc";
        while (texto.equalsIgnoreCase("stop") == false){
            //dentro del bucle
            
        }



        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection connection = null;
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testing",
                "root", "mysql2025");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
