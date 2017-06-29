package DOA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by staLker on 23-06-2017.
 */
public class StudentJDBCDAO {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public StudentJDBCDAO() {
    }

    private Connection getConnection() throws SQLException {
        Connection connection;
        connection = ConnectionFactory.getInstance().getConnection();
        return connection;
    }

    public void add(Student student) {

        try {
            String queryString = "INSERT INTO student(Name,RollNo,Address,Course) VALUES (?,?,?,?)";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, (int) student.getRollNo());
            preparedStatement.setString(3, student.getAddress());
            preparedStatement.setString(4, student.getCourse());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            check();

        }
    }
    public void update(Student student){
        try {
            String queryString = "UPDATE student SET Name = ? WHERE RollNo = ?";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, (int) student.getRollNo());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            check();


        }
    }
    public void check(){
        try {
            if (preparedStatement != null)
                preparedStatement.close();
            if (connection != null)
                connection.close();

        } catch (SQLException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
    public void findAll(){
        try {
            String queryString = "SELECT * FROM student";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(queryString);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.print("Name :"+resultSet.getString(1)
                        +" RollNo :"+resultSet.getInt(2)
                        +" Address :"+resultSet.getString(3)
                        +" Course :"+resultSet.getString(4));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            check();
        }
    }

}
