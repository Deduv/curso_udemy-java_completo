package application;

import db.DB;
import db.DbIntegrityException;
import db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

public class Program {

    public static void main (String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement("DELETE FROM department "
                            + "WHERE "
                            + "Id = ?");
            st.setInt(1, 2);
            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows Affected " + rowsAffected);
        }
        catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
