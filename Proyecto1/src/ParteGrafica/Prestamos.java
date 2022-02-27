package ParteGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author kevin
 */
public class Prestamos extends JPanel implements ActionListener{
    
    JPanel Prestamo;
    JButton registrarlibro ;
    JButton  cargamasiva;
    JTextField llenarusuario;
    JTextField Libro;  
    JTextField FechadeEntrega;
    JLabel img;
  
 //   private JComboBox<String> combo1;
    public Prestamos(){
        JLabel titulo; 
        Color ColorJLabel = new Color ( 184, 224, 222 );//Este es el Color que va en el JLabel
        Color oscuro = new Color( 22, 28, 31  );
        /*
        Image imag = new ImageIcon("LogoIngUsac.png").getImage();
        ImageIcon imge = new ImageIcon(imag.getScaledInstance(65, 65, Image.SCALE_SMOOTH));
        img = new JLabel(imge);
        img.setLayout(null);
        img.setBounds(3940,400, 200, 90);
        img.setVisible(true);
        this.add(img);       
*/
    //Espacio Para llenar usuario 
        llenarusuario = new JTextField();
        llenarusuario.setBounds(150,40,100,25);//Posición x, Posición y, Ancho, Largo
        llenarusuario.setFont(new Font("Comic Sans MS", Font.ITALIC,14));//Tipo de Letra
        llenarusuario.setVisible(true);//mostrar espacio
        this.add(llenarusuario);   
        
        //Etiqueta de usuario
        titulo = new JLabel("Usuario ");
        titulo.setBounds(20,40,100,20);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo);//añadir la etiqueta
                
    //Espacio Para llenar Libro 
        Libro = new JTextField();
        Libro.setBounds(150,70,100,25);//Posición x, Posición y, Ancho, Largo
        Libro.setFont(new Font("Comic Sans MS", Font.ITALIC,14));//Tipo de Letra
        Libro.setVisible(true);//mostrar espacio
        this.add(Libro);   
        
        //Etiqueta Libro
        titulo = new JLabel("Libro");
        titulo.setBounds(20,70,100,20);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo);//añadir la etiqueta
            
        //Espacio para llenar Fecha de Entrega
        FechadeEntrega = new JTextField();
        FechadeEntrega.setBounds(150,100,100,25);//Posición x, Posición y, Ancho, Largo
        FechadeEntrega.setFont(new Font("Comic Sans MS", Font.ITALIC,20));//Tipo de Letra
        FechadeEntrega.setVisible(true);//mostrar espacio
        this.add(FechadeEntrega);   
        
        //Etiqueta Fecha Entrega
        titulo = new JLabel("Fecha Entrega");
        titulo.setBounds(20,100,130,26);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC,18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo); //añadir la etiqueta
    
  
        //Boton Prestar Libro
        registrarlibro = new JButton("Prestar Libro");
        registrarlibro.setFont(new Font("ARIAL BLACK", Font.BOLD,12));
        registrarlibro.setBounds(129,135,120,30);
        registrarlibro.setVisible(true);
        registrarlibro.addActionListener(this);
        this.add(registrarlibro);      
    
        //Boton Prestar Libro
        cargamasiva = new JButton("Carga Masiva");
        cargamasiva.setFont(new Font("ARIAL BLACK", Font.BOLD,14));
        cargamasiva.setBounds(1120,580,155,30);
        cargamasiva.setVisible(true);
        cargamasiva.addActionListener(this);
        this.add(cargamasiva);  
     
        
    Prestamo = new JPanel();
        Prestamo.setBounds(400,220,350,300);
        Prestamo.setBackground(ColorJLabel);
        this.add(Prestamo);
        this.setBackground(ColorJLabel);
        this.setLayout(null);    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

}

