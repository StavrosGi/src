 private void roomTypeCombo energeies (java.awt.event.ActionEvent evt) {                                              

    }                                             

    private void click(java.awt.event.MouseEvent evt) {                                           
        
    }                                          

    private void koubisuc energeies (java.awt.event.ActionEvent evt) {                                                  
        float price=Float.parseFloat(priceText.getText());
        String roomType=(String)roomTypeCombo.getSelectedItem();
        db.setPriceForRoomType(roomType,price);
        priceTable.setModel(db.getPriceTableModel());
        System.out.println("Set price for room type "+roomType+" to "+price);
    }                                                 

    private void jButton1 energeies (java.awt.event.ActionEvent evt) {
        Date startDate=startDatePicker.getDate();
        Date endDate=endDatePicker.getDate();
        
        
        bookingTable.setModel(db.getBookingTableModel(startDate,endDate));
    }


    private Databas db=new Databas ();
    
    private javax.swing. jpin bookingTable;
private javax.swing.JLabel jlab1;
    private javax.swing.JLabel Jlab2;
    private javax.swing.JLabel Jlab3;
    private javax.swing.JLabel Jlab4;
    private javax.swing.JPanel jpin1;
        private org.jdesktop.swingx.JXDatePicker endDatePicker;
    private javax.swing.JButton jButton1;
    

    private javax.swing.JPanel offersPane;
    private javax.swing.JComboBox roomTypeCombo;
    private org.jdesktop.swingx.JXDatePicker startDatePicker;
    private javax.swing.JButton koubisuc;
    private javax.swing.JDialog systemMessage;
    
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing. jpin jpin1;

}