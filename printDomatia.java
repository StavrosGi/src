public void printDomatia() {
        
        
        Connection sundesh = null;
ResultSet apotelesmata = null;
        PreparedStatement state = null;try {

            conn = getHSQLConnection();

            String sql = "SELECT * FROM ROOMS";

            state = sundesh.prepareStatement(sql);
            apotelesmata = state.executeQuery();

            while (apotelesmata.next()) {
                System.out.println("Room " + apotelesmata.getInt("RoomId") + " | " + apotelesmata.getString("RoomTypeId") + " | " + apotelesmata.getString("Booked"));
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
            }        }