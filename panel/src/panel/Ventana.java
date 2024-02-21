package panel;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {
	public Ventana(){
		setVisible(true);
		setTitle("mi primer ventanita");
		setSize (500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.componentes();
		
	}
	
	public void componentes() {
		JPanel login=new JPanel();
		login.setSize(600,600);
		login.setLocation(0,0);
		login.setLayout(null);
		login.setBackground(Color.gray);
		
		JLabel title= new JLabel ("Bienvendio a la ventana");
		title.setBackground(Color.white);
		title.setLocation(10,10);
		title.setSize(130,40);
		title.setOpaque(true);
		login.add(title);
		
		
		JLabel usuario=new JLabel("Usuario", SwingConstants.CENTER);
		usuario.setBackground(Color.white);
		usuario.setLocation(10,80);
		usuario.setSize(180,30);
		usuario.setOpaque(true);
		login.add(usuario);
		
		JTextField usuarioField=new JTextField();
		usuarioField.setBounds(10, 130, 180, 30);
		login.add(usuarioField);
		add(login);
		
		JLabel contraseña=new JLabel("contraseña",SwingConstants.CENTER);
		contraseña.setBackground(Color.white);
		contraseña.setLocation(10,180);
		contraseña.setSize(180,30);
		contraseña.setOpaque(true);
		login.add(contraseña);
		
		JPasswordField contraseñaField=new JPasswordField();
		contraseñaField.setBounds(10, 220, 180, 30);
		contraseñaField.setOpaque(true);
		login.add(contraseñaField);

		JButton acceder =new JButton("Acceder");
		
		acceder.setBounds(10,270,180,30);
		login.add(acceder);
		
		
		JPanel registro= new JPanel();
		registro.setSize(this.getWidth()/2,this.getHeight());
		registro.setLocation(this.getWidth()/2,0);
		registro.setLayout(null);
		registro.setBackground(Color.pink);
		login.add(registro);
		
		JLabel titulo=new JLabel("Registro",SwingConstants.CENTER);
		titulo.setBackground(Color.black);
		titulo.setLocation(10,10);
		titulo.setSize(180,40);
		titulo.setOpaque(true);
		registro.add(titulo);
		
		
		JLabel name =new JLabel("Nombre completo: ", SwingConstants.CENTER);
		name.setBackground(Color.white);
		name.setLocation(10,80);
		name.setSize(180,30);
		name.setOpaque(true);
		registro.add(name);
		
		JTextField nameField=new JTextField();
		nameField.setBounds(10, 130, 250, 30);
		registro.add(nameField);
		
		JCheckBox eleccion=new JCheckBox("gatos"); 
		eleccion.setBounds(10, 170, 300, 35);
		registro.add(eleccion);
		
		JCheckBox eleccion2=new JCheckBox("perros"); 
		eleccion2.setBounds(10, 215, 300, 35);
		registro.add(eleccion2);
		
		JRadioButton tipo=new JRadioButton("one piece");
		tipo.setBounds(10, 255, 300, 35);
		registro.add(tipo);
		
		JRadioButton tipo2=new JRadioButton("naruto");
		tipo2.setBounds(10, 295, 300, 35);
		registro.add(tipo2);
		
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(tipo);
		grupo.add(tipo2);
	
		ButtonGroup grupo2=new ButtonGroup();
		
		grupo2.add(eleccion);
		grupo2.add(eleccion2);
		
		
		JTextArea bio=new JTextArea(10,10);
		bio.setLocation(10,345);
		bio.setSize(300,100);
		registro.add(bio);
		add(login);
		this.repaint();
		
	}
}


