import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoJdbc {

    public static void main(String[] args) throws Exception {
        /*
            Import Package
            Load and Register Drivers
            Create Connection
            Create Statement
            Execute Statement
            Process the results
            Close the Connection
         */

        int sid = 102;
        String sname = "Neha";
        int marks = 73;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "2812";
//        String sql = "select sname from student where sid = 1";
//        String sql = "select * from student";
//        String sql = "insert into student values (" + sid + ", '" + sname + "', " + marks + ")";
        String sql = "insert into student values (?, ?, ?)";

//        // Load and Register Driver (Optional)
//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        // Creating Connection
//        try {
//            Connection con = DriverManager.getConnection(url, uname, pass);
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

        // Creating Connection
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");
//
//        // Create a statement
//        Statement st = con.createStatement();

        // Execute a statement (Read)
//        ResultSet rs = st.executeQuery(sql);
////        System.out.println(rs.next());
////        rs.next();
////
////        String name = rs.getString("sname");
//////        System.out.println(rs.getString(1));
////        System.out.println("Name of student is " + name);
//
//        while (rs.next()) {
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getString(2) + " - ");
//            System.out.println(rs.getInt(3));
//        }

        // Prepared Statement
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);

        // Executing a statement (Insert)
        boolean status = st.execute();
        System.out.println(status);

        // Close the connection
        con.close();
        System.out.println("Connection Closed");
    }
}
