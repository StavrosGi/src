public Pinakas getPriceTableModel() {
        
        ResultSet apotelesmata = null;
Connection sundesh = null;
        PreparedStatement state = null;

        Pinakas model = null;
        try {
            conn = getHSQLConnection();
            String sql = "SELECT * FROM ROOMTYPE";
state = conn.prepareStatement(sql);
            sundesh = stmt.executeQuery();
            model = buildTableModel(rs);
        } catch (Exception ex) {

      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
 } finally {
            try {
             apotelesmata.close();
                state.close();
                sundesh.close();

                Logger.getLogger(Databas.class.getName()).log(Level.SEVERE, null, ex);
            }

 }
        return model;
    
}