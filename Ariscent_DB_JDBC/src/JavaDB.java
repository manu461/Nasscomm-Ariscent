import java.sql.*;
import java.util.Scanner;

/**
 * Created by staLker on 21-06-2017.
 */
public class JavaDB {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDb", "root", "mysql461");
            CallableStatement insertStatement = connection.prepareCall("{call INSERTDATA(?,?,?)}");
            CallableStatement deleteStatement = connection.prepareCall("{call DELETEDATA(?)}");
            System.out.print("press:\n 1 to insert \n 2 to delete\n");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.print("Enter total users to be inserted :");
                    int times = scanner.nextInt();
                    System.out.print("\nEnter Data ,\n");
                    while (times>0){
                        System.out.print("Enter ID :");
                        int id = scanner.nextInt();
                        insertStatement.setInt(1, id);
                        System.out.print("Enter Name :");
                        String name = scanner.next();
                        insertStatement.setString(2, name);
                        System.out.print("Enter contact :");
                        int contact = scanner.nextInt();
                        insertStatement.setInt(3, contact);
                        insertStatement.execute();
                        System.out.print("Data successfully Inserted\n");
                        times--;
                    }
                    break;
                case 2:
                    System.out.print("Enter the ID of the User");
                    int id = scanner.nextInt();
                    deleteStatement.setInt(1,id);
                    deleteStatement.execute();
                    break;

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
