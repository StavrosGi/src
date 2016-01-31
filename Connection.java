private static Connection getHSQLConnection() throws Exception {
        Class.forName("org.hsqldb.jdbcDriver");
        Connection sundesh = DriverManager.getConnection(url, "sa");
        conn.setAutoCommit(true);

        return sundesh;

    }

    public static Pinakas buildTableModel(ResultSet rs)
            throws SQLException {

        
int arsthlhs = metaData.getarsthlhs ();
        Vector<String> onomasthlhs = new Vector<String>();{
        
        for (int column = 1; column <= arsthlhs; column++) {
            onomasthlhs.add(metaData.getColumnName(column));
        }

        while (apotelesmata.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= arsthlhs; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new Pinakas (data, onomasthlhs);

    }
    }