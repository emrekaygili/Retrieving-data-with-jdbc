import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code , Name , Continent,Region from country");
        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        }
        finally {
            connection.close();
        }

    }

    }
