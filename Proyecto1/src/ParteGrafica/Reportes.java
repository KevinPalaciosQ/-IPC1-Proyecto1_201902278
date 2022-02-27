package ParteGrafica;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author kevin
 */
public class Reportes extends JPanel implements ActionListener{
    JPanel Libross;
    JButton GenerarReporte;
    private JComboBox<String> ComboBox;
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
        ComboBox.addItem("TipoReporte");
        ComboBox.addActionListener(this);   
        
        Libross = new JPanel();
        Libross.setBounds(400,220,350,300);
        Libross.setBackground(ColorJLabel);
        this.add(Libross);
        this.setBackground(ColorJLabel);
        this.setLayout(null);    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

  

}
