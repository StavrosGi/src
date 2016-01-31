 public Pinakas getBookingTableModel(Date startDate, Date endDate) {
                PreparedStatement state = null;
        ResultSet apotelesmata = null;
Connection sundesh = null;

        Pinakas model = null;

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            sundesh = getHSQLConnection();
            String sql = "select roomId, roomTypeId, customerLastName, customerFirstName, "
                + "startDate, endDate, price,DATEDIFF ( 'day', startDate,endDate ) as duration, " +
                  " DATEDIFF ( 'day', startDate,endDate )*price  as cost" +
                 " from customer, rooms, roomtype, booking "
                 + "where rooms.roomtypeid=roomtype.typeid and booking.roomid=rooms.roomid 
             if(startDate != null) {
                sql += " and startDate >= '"+sdf.format(startDate)+"'";
            }
            if (endDate != null) {
                sql+="and endDate <= '"+sdf.format(endDate)+"'";
            }
            state = conn.prepareStatement(sql);

            apotelesmata = state.executeQuery();
            model = buildTableModel(rs);
        } catch (Exception ex) {

            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                apotelesmata.close();
                state.close();
                sundesh.close();
            } catch (SQLException ex) {
                Logger.getLogger(Databas.class.getName()).log(Level.SEVERE, null, ex);
            }
        return model;
    }
