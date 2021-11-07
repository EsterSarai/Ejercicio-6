private void btnAbrirurlActionPerformed(java.awt.event.ActionEvent evt) {                                         

        try {

            Desktop.getDesktop().browse(new URI("www.google.com"));

        } catch (URISyntaxException ex) {

            System.out.println(ex);

        }catch(IOException e){

            System.out.println(e);

        }
      
 }                               