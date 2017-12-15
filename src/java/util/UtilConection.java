package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilConection {

    private static UtilConection instance = null;
    //*******************************************************************************************************************
    //*******************************************************************************************************************

    public static synchronized UtilConection getInstance() {
        if (instance == null) {
            instance = new UtilConection();
        }
        return instance;
    }

        public Connection getConnection() throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
        String USERNAME = "sa";
        String PASSWORD = "Usu4ri0";
        String INSTANCIABD = "dbregnacseg";
        String SERVIDORBD = "172.31.0.10";
        String PUERTO = "1433";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        String url = "jdbc:sqlserver://"+SERVIDORBD+":"+PUERTO+";databaseName=" + INSTANCIABD;
        Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
        System.out.println("DB Connection started");
        return conn;
    }

}
