public void printDomatioT () {
        
        PreparedStatement state = null;
        ResultSet apotelesmata = null;
	Connection sundesh = null;
        try {
            sundesh = getHSQLConnection();
            String sql = "SELECT * FROM ROOMTYPE";

            State1 = conn.prepareStatement(sql);
            apotelesmata = stmt.executeQuery();

            while (apotelesmata.next()) {
                System.out.println(apotelesmata.getString("TypeId") + " | " + apotelesmata.getString("Price"));
            }

        } catch (Exception ex) {

            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                apotelesmata.close();
                state.close();
                sundesh.close();

            } catch (SQLException ex) {
                Logger.getLogger(Databas.class.getName()).log(Level.SEVERE, null, ex);
            } }    