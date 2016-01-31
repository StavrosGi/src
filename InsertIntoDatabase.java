  public void insertIntoDatabase(int id, String type, boolean booked) 
{
        

        try {
            conn = getHSQLConnection()
            String sql = “DOSE TIMH GIA DOMATIO"

            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, type);
            stmt.setInt(3, booked ? 1 : 0);
            stmt.execute();


        } catch (Exception ex) {           %elegxos an einai piasmeno to domatio

            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
conn.close();

                stmt.close();

                            } catch (SQLException ex) {
                Logger.getLogger(Databas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }