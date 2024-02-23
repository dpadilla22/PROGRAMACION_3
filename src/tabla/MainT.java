package tabla;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class MainT extends JFrame {

	public MainT() {
		setVisible(true);
		setTitle("Mi primera ventanita");
		setSize(600, 750);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		registro();
	}

	public void registro() {

		JPanel registro = new JPanel();
		registro.setSize(600, 600);
		registro.setLocation(0, 0);
		registro.setLayout(null);
		registro.setBackground(Color.black);
		add(registro);

		JLabel titulo = new JLabel("Registro", SwingConstants.CENTER);
		titulo.setBackground(Color.white);
		titulo.setLocation(10, 10);
		titulo.setSize(180, 40);
		titulo.setOpaque(true);
		registro.add(titulo);

		JLabel tableLabel = new JLabel("informacion alumnos ", SwingConstants.CENTER);
		tableLabel.setFont(new Font("Arial", Font.BOLD, 15));
		tableLabel.setBounds(40, 60, 100, 50);
		registro.add(tableLabel);

		String[] columnas = { "No. Control", "Nombre", "Apellidos", "Carrera" };
		String[][] datos = { { "1001", "Juan", "Perez", "Ingeniería" }, { "1002", "María", "López", "Medicina" },
				{ "1003", "Pedro", "García", "Derecho" }, { "1003", "Pedro", "García", "Derecho" },
				{ "1003", "Pedro", "García", "Derecho" }, { "1003", "Pedro", "García", "Derecho" },
				{ "1003", "Pedro", "García", "Derecho" }, { "1003", "Pedro", "García", "Derecho" },
				{ "1003", "Pedro", "García", "Derecho" }, { "1003", "Pedro", "García", "Derecho" },
				{ "1003", "Pedro", "García", "Derecho" }, { "1003", "Pedro", "García", "Derecho" },
				{ "1003", "Pedro", "García", "Derecho" }, { "1003", "Pedro", "García", "Derecho" },
				{ "1003", "Pedro", "García", "Derecho" }, { "1003", "Pedro", "García", "Derecho" },
				{ "1003", "Pedro", "García", "Derecho" }, { "1003", "Pedro", "García", "Derecho" },
				{ "1004", "Ana", "Martínez", "Arquitectura" } };

		JTable tabla = new JTable(datos, columnas);
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setBounds(40, 100, 500, 200);
		registro.add(scrollPane);
	}
}
