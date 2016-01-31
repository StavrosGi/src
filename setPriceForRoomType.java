public void setPriceForRoomType(String roomTypeId, float price) {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
	Connection conn = null;
        try {
            conn = getHSQLConnection();
            String sql = "UPDATE ROOMTYPE SET PRICE=? WHERE TYPEID=?";

            stmt = conn.prepareStatement(sql);
            stmt.setFloat(1, price);
            stmt.setString(2, roomTypeId);
            stmt.execute();
            printDomatioT ();

        } catch (Exception ex) {

            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Databas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }