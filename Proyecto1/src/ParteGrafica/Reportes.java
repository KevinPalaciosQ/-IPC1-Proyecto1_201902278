package ParteGrafica;
import static ParteGrafica.Libros.tabla;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import proyecto1.*;
import static proyecto1.Proyecto1.cUsuarios;
import static proyecto1.Proyecto1.usuarios;
public class Reportes extends JPanel implements ActionListener{
    JPanel Libross;
    JButton GenerarReporte;
    private JComboBox<String> ComboBox;
    static Object[][] data;
    public Reportes(){
        JLabel titulo;
        Color ColorJLabel = new Color ( 184, 224, 222 );//Este es el Color que va en el JLabel
        Color oscuro = new Color( 22, 28, 31  );   
        //Etiqueta Tipo de Reporte
        titulo = new JLabel("Tipo de Reporte");
        titulo.setBounds(30,40,140,20);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar
        this.add(titulo);//añadir a la ventana      
        
        //Boton Generar Reporte
        GenerarReporte = new JButton("Generar");
        GenerarReporte.setFont(new Font("ARIAL BLACK", Font.BOLD,14));
        GenerarReporte.setBounds(253,75,98,30);
        GenerarReporte.setVisible(true);
        GenerarReporte.addActionListener(this);
        this.add(GenerarReporte);  //añadir boton   
        setLayout(null);
        
        //ComboBox de TipoReporte
        ComboBox=new JComboBox<String>();
        ComboBox.setBounds(200,40,150,25);//Posición x, Posición y, Ancho, Largo
        ComboBox.setFont(new Font("Comic Sans MS", Font.ITALIC,13));//Tipo de Letra
        add(ComboBox);
        ComboBox.addItem("Reporte Usuarios");
        ComboBox.addItem("Reporte Libros");
        ComboBox.addItem("Reporte Prestamos");
        ComboBox.addActionListener(this);
        ComboBox.addActionListener(this);   
        
        Libross = new JPanel();
        Libross.setBounds(400,220,350,300);
       
        this.add(Libross);
        this.setBackground(ColorJLabel);
        this.setLayout(null);  
        
        //Aquí empieza la tabla 
        String[] e = {"Fecha Generación","Usuario","Tipo de Reporte"}; 
        //Object[][]datos ={{"20/02/22","Administrador1","Reporte1"}};
        data = Proyecto1.TablaReportes();
        tabla =new JTable(data,e);
        JScrollPane diseño = new  JScrollPane(tabla);
        diseño.setBounds(380,10,600,600);
        this.add(diseño);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==GenerarReporte) {
            if (ComboBox.getSelectedItem()=="Reporte para Usuario") {
                Reporteusuario();
                JOptionPane.showMessageDialog(this, "Se realizó el reporte sin problema");
            }else if(ComboBox.getSelectedItem()=="Reporte para Libros"){
                JOptionPane.showMessageDialog(this, "Se realizó el reporte sin problema");
            }else if(ComboBox.getSelectedItem()=="Reporte para Prestamos"){
               JOptionPane.showMessageDialog(this, "Se realizó el reporte sin problema"); 
            }
        }
    }

  
public void Reporteusuario(){
        String nombreReporte;
        File reporte;
        FileWriter fw;
        BufferedWriter br;
        String cadenaHTML;
        try {            
            nombreReporte = "Reporte.PDF";
            reporte = new File(nombreReporte);
            fw = new FileWriter(reporte);
            br = new BufferedWriter(fw);
            
            cadenaHTML = "<html>"
                    + "    <head>"
                    + "    <body>"
                    + "        <table border = 2>"
                    + "            <tr>"
                    + "                <td>Id</td>"
                    + "                <td>Usuario</td>"
                    + "                <td>Password</td>"
                    + "                <td>Tipo</td>"
                    + "                <td>Facultdad</td>"
                    + "                <td>Carrera</td>"
                    + "            </tr>";
                    
                    
            
            
            for(int i = 0; i < cUsuarios; i++){
                if(usuarios[i] != null){
                    cadenaHTML +=  "            <tr>"
                    + "                <td>"+ usuarios[i].getId()+ "</td>"
                    + "                <td>"+ usuarios[i].getNombre()+ "</td>"
                    + "                <td>"+ usuarios[i].getContrasena()+ "</td>"
                    + "                <td>"+ usuarios[i].getTipo()+ "</td>"
                    + "                <td>"+ usuarios[i].getFacultad()+ "</td>"
                    + "                <td>"+ usuarios[i].getCarrera()+ "</td>"
                    
                    + "            </tr>";
                }
            }
            
            cadenaHTML += "        </table>"
                        + "    </body>"
                        + "</html>";
            
            br.write(cadenaHTML);
            
            br.close();
            fw.close();
            
            crearPdf(cadenaHTML);
            
        } catch (IOException ex) {
            System.out.println("error escribiendo el reporte. Detalles " + ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed
    private void crearPdf(String html){
        try{
           
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
            String Nombre ="ReporteUsuarios_"+formato.format(LocalDateTime.now());
                Document document = new Document(PageSize.LETTER);
                PdfWriter.getInstance(document, new FileOutputStream(Nombre+".pdf"));

                document.open();
                document.addAuthor("Kevin Palacios");
                document.addCreator("Kevin Palacios");
                document.addSubject("ReporteDeUsuarios");
                document.addCreationDate();
                document.addTitle("ReporteDeUsuarios");

                HTMLWorker htmlWorker = new HTMLWorker(document);
                htmlWorker.parse(new StringReader(html));

                document.close();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
                String FECHA = dtf.format(LocalTime.now());
                //ObjetoRegistro rep= new ObjetoRegistro(FECHA, ReporteU,"Reporte 1");
                //crearreporte(rep);
        }catch(Exception e){
            System.out.println("Error escribiendo el reporte "+e.getMessage());
            e.printStackTrace();
        }
    }
    
            }

