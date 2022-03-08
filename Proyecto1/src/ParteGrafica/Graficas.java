package ParteGrafica;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Graficas extends JPanel implements ActionListener{
    
    JPanel Libross;
    public Graficas(){
        JLabel titulo;
        Color oscuro = new Color(22, 28, 31);
        Color ColorJLabel = new Color ( 184, 224, 222 );//Este es el Color que va en el JLabel
        //Etiqueta de Usuarios Registrados en el sistema 
        titulo = new JLabel("Tipo de Usuarios Registrados en el Sistema");
        titulo.setBounds(20,550,380,25);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo); //añadir a la ventana 
        
        //Etiqueta de Cantidad de Libros Prestados por Fecha
        titulo = new JLabel("Cantidad de Libros Prestados por Fecha");
        titulo.setBounds(450,70,380,25);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo);//añadir a la ventana 
        
        //Etiqueta de Tipo de Libros Registrados en el Sistema
        titulo = new JLabel("Tipo de Libros Registrados en el Sistema");
        titulo.setBounds(850,550,380,25);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo); //añadir a la ventana 
  
        //Pestaña de Copias
        titulo = new JLabel("Copias");
        titulo.setBounds(20,130,100,20);//Medidas de la Pestaña
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//añadir a la ventana 
               
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

