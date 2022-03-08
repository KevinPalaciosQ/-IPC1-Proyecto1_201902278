package ParteGrafica;
import Clases.ObjetoPrestamos;
import static ParteGrafica.Libros.tabla;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import com.google.gson.JsonObject;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import proyecto1.Proyecto1;

public class Prestamos extends JPanel implements ActionListener {

    JPanel Prestamo;
    JButton prestar;
    JButton cargamasiva2;
    JTextField llenarusuario;
    JTextField identidadl;
    JTextField FechadeEntrega;
    JLabel img;
    //atributos 
    String contenido = "";
    File archivo;
    FileReader fr;
    BufferedReader br;
    static Object[][] data;
    public Prestamos() {
        JLabel titulo;
        Color ColorJLabel = new Color(184, 224, 222);//Este es el Color que va en el JLabel
        Color oscuro = new Color(22, 28, 31);

        //Espacio Para llenar usuario 
        llenarusuario = new JTextField();
        llenarusuario.setBounds(150, 40, 100, 25);//Posición x, Posición y, Ancho, Largo
        llenarusuario.setFont(new Font("Comic Sans MS", Font.ITALIC, 14));//Tipo de Letra
        llenarusuario.setVisible(true);//mostrar espacio
        this.add(llenarusuario);

        //Etiqueta de usuario
        titulo = new JLabel("Usuario ");
        titulo.setBounds(20, 40, 100, 20);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo);//añadir la etiqueta

        //Espacio para id Libro
        identidadl = new JTextField();
        identidadl.setBounds(150, 70, 100, 25);//Posición x, Posición y, Ancho, Largo
        identidadl.setFont(new Font("Comic Sans MS", Font.ITALIC, 14));//Tipo de Letra
        identidadl.setVisible(true);//mostrar espacio
        this.add(identidadl);

        //Etiqueta Libro
        titulo = new JLabel("Libro");
        titulo.setBounds(20, 70, 100, 20);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo);//añadir la etiqueta

        //Espacio para llenar Fecha de Entrega
        FechadeEntrega = new JTextField();
        FechadeEntrega.setBounds(150, 100, 100, 25);//Posición x, Posición y, Ancho, Largo
        FechadeEntrega.setFont(new Font("Comic Sans MS", Font.ITALIC, 14));//Tipo de Letra
        FechadeEntrega.setVisible(true);//mostrar espacio
        this.add(FechadeEntrega);

        //Etiqueta Fecha Entrega
        titulo = new JLabel("Fecha Entrega");
        titulo.setBounds(20, 100, 130, 26);//Posición x, Posición y, Ancho, Largo
        titulo.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));//Tipo de Letra
        titulo.setForeground(oscuro);//color de texto
        titulo.setVisible(true);//mostrar etiqueta
        this.add(titulo); //añadir la etiqueta

        //Boton Prestar Libro
        prestar = new JButton("Prestar Libro");
        prestar.setFont(new Font("ARIAL BLACK", Font.BOLD, 12));
        prestar.setBounds(129, 135, 120, 30);
        prestar.setVisible(true);
        prestar.addActionListener(this);
        this.add(prestar);

        //Boton Para segunda carga masiva 
        cargamasiva2 = new JButton("Carga Masiva");
        cargamasiva2.setFont(new Font("ARIAL BLACK", Font.BOLD, 14));
        cargamasiva2.setBounds(1120, 580, 155, 30);
        cargamasiva2.setVisible(true);
        cargamasiva2.addActionListener(this);
        this.add(cargamasiva2);
        //diseño de la pestaña
        Prestamo = new JPanel();
        Prestamo.setBounds(400, 220, 350, 300);
        this.add(Prestamo);
        this.setBackground(ColorJLabel);
        this.setLayout(null);

        //AQUÍ EMPIEZA LA TABLA
        String[] e = {"Nombre Usuario", "Libro", "Fecha Entrega","Status"};
        //data = Proyecto1.Prestamista();
        data = Proyecto1.Prestamista();
        tabla = new JTable(data, e);
        JScrollPane diseño = new JScrollPane(tabla);
        this.setLayout(null);
        diseño.setBounds(270, 10, 600, 600);
        this.add(diseño);
        //tabla.setEnabled (false);
        //tabla.getTableHeader().setReorderingAllowed(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == cargamasiva2) {
            System.out.println("Accediste a carga masiva");
            leerArchivos();

            System.out.println(contenido);
            //acá se empieza a modificar

        } else if (ae.getSource() == prestar) {//para cargar el registro    
            int idlib = Integer.parseInt(identidadl.getText());
            int idusuario = Integer.parseInt(llenarusuario.getText());
            String calendario = FechadeEntrega.getText();
            String estoy = estado(calendario);
            ObjetoPrestamos objeto2 = new ObjetoPrestamos(idlib, idusuario, calendario,estoy);
            Proyecto1.crear2(objeto2);
            identidadl.setText("");
            llenarusuario.setText("");
            FechadeEntrega.setText("");     
        }
    }

    public void leerArchivos() {

        try {

            JFileChooser fc = new JFileChooser();
            int op = fc.showOpenDialog(this);
            if (op == JFileChooser.APPROVE_OPTION) {
                archivo = fc.getSelectedFile();
            }

            // HACEMOS LA LECTURA DEL ARCHIVO COMO TAL
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            // LEER LINEA POR LINEA
            while ((linea = br.readLine()) != null) {
                contenido += linea;
            }
            System.out.println(contenido);
            JsonParser parser = new JsonParser();
            // JsonArray arreglo de objetos JSON.
            Object hola = parser.parse(contenido);
            JsonObject objetoo = (JsonObject) hola;
            Object objeto1 = objetoo.get("Prestamos");
            JsonArray arreglo = (JsonArray) objeto1;
            System.out.println("Cantidad de Objetos: " + arreglo.size());
            // RECORRER MI ARREGLO
            for (int i = 0; i < arreglo.size(); i++) {
                // JsonObject -> Tomar el Objeto del Arreglo
                JsonObject objeto = arreglo.get(i).getAsJsonObject();
                int IdLibros = objeto.get("IDLibro").getAsInt();
                int IdEstudiante = objeto.get("IDUsuario").getAsInt();
                String FechaEntrega = objeto.get("FechaEntrega").getAsString();
                String Estatus = estado(FechaEntrega);
                ObjetoPrestamos nuevo = new ObjetoPrestamos(IdLibros, IdEstudiante, FechaEntrega,Estatus);
                Proyecto1.crear2(nuevo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
//Muestra el estado actual del libro
    public String estado(String Fecha){
        String form = "";
        try {
            SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha1 = dateformat.parse(Fecha);
            Calendar calendar = Calendar.getInstance();
            Date fechaObjeto = calendar.getTime();
            String actual = dateformat.format(fechaObjeto);
            Date fecha2 = dateformat.parse(actual);
            if (fecha1.before(fecha2)) {
                form = "Entregado";
            } else {
                form = "Prestado";
            }
        } catch (ParseException ex) {
        }
        return form;
    }
}
