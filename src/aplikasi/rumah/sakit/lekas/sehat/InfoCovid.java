/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.rumah.sakit.lekas.sehat;


import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONArray;
import org.json.JSONObject;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.style.Styler;

/**
 *
 * @author Alfianda Syahrul
 */
public class InfoCovid extends javax.swing.JFrame {

    /**
     * Creates new form GrafikCorona
     */
    public InfoCovid() {
        initComponents();
        try{
            getProvinsi();
            getProvinsi2();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barChartPanel = new javax.swing.JPanel();
        barChartPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setResizable(false);

        barChartPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        barChartPanel.setLayout(new java.awt.BorderLayout());

        barChartPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        barChartPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barChartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barChartPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1137, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barChartPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setChart(List x, List y1, List y2){
        CategoryChart chart = new CategoryChartBuilder()
                .title("Provinsi Dengan Kasus COVID-19 Tertinggi")
                .xAxisTitle("Provinsi")
                .yAxisTitle("Jiwa")
                .build();
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNE);
        chart.getStyler().setHasAnnotations(true);
        chart.getStyler().setXAxisLabelRotation(45);
        chart.addSeries("Positif", x, y1);
        chart.addSeries("Sembuh", x, y2);
        barChartPanel.removeAll();
        XChartPanel<CategoryChart> bchart = new XChartPanel<CategoryChart>(chart);
        barChartPanel.add(bchart);
        barChartPanel.validate();
    }
    
    public void setChart2(List x, List y1, List y2){
        CategoryChart chart = new CategoryChartBuilder()
                .title("Provinsi Dengan Kasus COVID-19 Tertinggi")
                .xAxisTitle("Provinsi")
                .yAxisTitle("Jiwa")
                .build();
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNE);
        chart.getStyler().setHasAnnotations(true);
        chart.getStyler().setXAxisLabelRotation(45);
        chart.addSeries("Positif", x, y1);
        chart.addSeries("Sembuh", x, y2);
        barChartPanel1.removeAll();
        XChartPanel<CategoryChart> bchart = new XChartPanel<CategoryChart>(chart);
        barChartPanel1.add(bchart);
        barChartPanel1.validate();
    }
    
    public void getProvinsi() throws IOException{
        CloseableHttpClient httpClient = HttpClients.createDefault();
        List<String> prov = new ArrayList<String>(Arrays.asList(new String[] {}));
        List<Number> posi = new ArrayList<Number>(Arrays.asList(new Number[] {}));
        List<Number> semb = new ArrayList<Number>(Arrays.asList(new Number[] {}));
        
        try {
            HttpGet request = new HttpGet("https://api.kawalcorona.com/indonesia/provinsi");
            request.addHeader("accept", "application/json");
            CloseableHttpResponse response;
            response = httpClient.execute(request);
            HttpEntity entity = response.getEntity();
            try {
                if (entity != null){
                    String json = IOUtils.toString(entity.getContent());
                    JSONArray array = new JSONArray(json);
                    
                    for (int i = 0; i <= 14; i++){
                        JSONObject object = array.getJSONObject(i);
                        
                        JSONObject record = object.getJSONObject("attributes");
                        
                        prov.add((String) record.get("Provinsi"));
                        posi.add((Number) record.get("Kasus_Posi"));
                        semb.add((Number) record.get("Kasus_Semb"));
                    }
                    setChart(prov, posi, semb);
                }
            } finally{
                response.close();
            }
        } finally{
            httpClient.close();
        }
    }
    
    public void getProvinsi2() throws IOException{
        CloseableHttpClient httpClient = HttpClients.createDefault();
        List<String> prov2 = new ArrayList<String>(Arrays.asList(new String[] {}));
        List<Number> posi2 = new ArrayList<Number>(Arrays.asList(new Number[] {}));
        List<Number> semb2 = new ArrayList<Number>(Arrays.asList(new Number[] {}));
        
        try {
            HttpGet request = new HttpGet("https://api.kawalcorona.com/indonesia/provinsi");
            request.addHeader("accept", "application/json");
            CloseableHttpResponse response;
            response = httpClient.execute(request);
            HttpEntity entity = response.getEntity();
            try {
                if (entity != null){                    
                    String json2 = IOUtils.toString(entity.getContent());
                    JSONArray array2 = new JSONArray(json2);
                    
                    for (int i = 15; i <= 33; i++){
                        JSONObject object2 = array2.getJSONObject(i);
                        
                        JSONObject record2 = object2.getJSONObject("attributes");
                        
                        prov2.add((String) record2.get("Provinsi"));
                        posi2.add((Number) record2.get("Kasus_Posi"));
                        semb2.add((Number) record2.get("Kasus_Semb"));
                    }
                    setChart2(prov2, posi2, semb2);
                }
            } finally{
                response.close();
            }
        } finally{
            httpClient.close();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InfoCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoCovid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barChartPanel;
    private javax.swing.JPanel barChartPanel1;
    // End of variables declaration//GEN-END:variables
}
