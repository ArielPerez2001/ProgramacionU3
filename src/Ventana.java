import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	

	public Ventana() {

		this.setSize(520,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200,200);
		this.setResizable(false);
		this.setTitle("ActionListener");
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,750));
		this.setLocationRelativeTo(null);
		this.iniciarComponentes();
		this.setLayout(null);
		this.setVisible(true);
	}
	
	public void iniciarComponentes() {
		
		//this.login();
		this.registro();
		
		this.repaint();
	}
	
	public void registro() {
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth(),this.getHeight());
		registro.setBackground(Color.cyan);
		registro.setLayout(null);

		JLabel register_tag = new JLabel("Registro",0);
		register_tag.setSize(300, 80);
		register_tag.setFont(new Font ("Arial",Font.BOLD,24));
		register_tag.setForeground(Color.black);
		register_tag.setLocation(110, 20);
		register_tag.setOpaque(true);//Fondo a la etiqueta
		register_tag.setBackground(Color.orange);
		registro.add(register_tag);

		//Registro de usuario
		JLabel userName = new JLabel(" Nombre de usuario:");
		userName.setBounds(90,120,180,40);
		userName.setFont(new Font ("Agency FB", Font.BOLD, 25));
		registro.add(userName);

		JTextField userField = new JTextField();
		userField.setBounds(80, 159, 180, 40);
		userField.setFont(new Font("Arial",Font.BOLD,20));
		userField.setOpaque(true);
		userField.setBackground(Color.white);
		registro.add(userField);

		JLabel lastName = new JLabel("Apellidos: ",0);
		lastName.setBounds(140, 120, 400, 40);
		lastName.setFont(new Font("Arial",Font.BOLD,20));
		registro.add(lastName);

		JTextField lastNameField = new JTextField();
		lastNameField.setBounds(280, 159, 180, 40);
		lastNameField.setFont(new Font("Arial",Font.BOLD,20));
		lastNameField.setOpaque(true);
		lastNameField.setBackground(Color.white);
		registro.add(lastNameField);

		JLabel email = new JLabel("Correo electronico: ",0);
		email.setBounds(70, 230, 400, 40);
		email.setFont(new Font("Arial",Font.BOLD,20));
		registro.add(email);
		
		JTextField emailField = new JTextField();
		emailField.setBounds(175, 280, 180, 40);
		emailField.setFont(new Font("Arial",Font.BOLD,20));
		emailField.setOpaque(true);
		emailField.setBackground(Color.white);
		registro.add(emailField);
		
		JLabel pass = new JLabel("Contraseña: ",0);
		pass.setBounds(70, 330, 400, 40);
		pass.setFont(new Font("Arial",Font.BOLD,20));
		registro.add(pass);
		
		JPasswordField pwdField = new JPasswordField();
		pwdField.setBounds(175, 370, 180, 40);
		pwdField.setFont(new Font("Arial",Font.BOLD,20));
		pwdField.setOpaque(true);
		pwdField.setBackground(Color.white);
		registro.add(pwdField);
		
		JLabel cofirmPwd = new JLabel("Confirmar contraseña: ",0);
		cofirmPwd.setBounds(70, 420, 400, 40);
		cofirmPwd.setFont(new Font("Arial",Font.BOLD,20));
		registro.add(cofirmPwd);
		
		JPasswordField pwdField2 = new JPasswordField();
		pwdField2.setBounds(175, 460, 180, 40);
		pwdField2.setFont(new Font("Arial",Font.BOLD,20));
		pwdField2.setOpaque(true);
		pwdField2.setBackground(Color.white);
		registro.add(pwdField2);

		JCheckBox acceptRadio = new JCheckBox("Acepto los terminos y condiciones");
		acceptRadio.setBounds(130, 500, 320, 40);
		acceptRadio.setFont(new Font("Arial",Font.BOLD,16));
		acceptRadio.setOpaque(false);
		acceptRadio.setBackground(Color.red);
		registro.add(acceptRadio);

		JButton registerButton = new JButton("Crear cuenta");
		registerButton.setBounds(160, 550, 200, 40);
		registerButton.setFont(new Font("Arial",Font.BOLD,19));
		registro.add(registerButton);
		
		registerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 	String password1 = new String(pwdField.getPassword());
			        String password2 = new String(pwdField2.getPassword());

			        if (password1.equals(password2)) {
			            // Contraseñas coinciden
			            JOptionPane.showMessageDialog(null, "¡Cuenta creada exitosamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
			        } else {
			            // Contraseñas no coinciden
			            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
			        }
					
					if(!acceptRadio.isSelected()) {
						acceptRadio.setBorderPainted(true);
						acceptRadio.setBorder(BorderFactory.createLineBorder(Color.red,2));
					}
					else {
						acceptRadio.setBorder(BorderFactory.createLineBorder(Color.green,2));

					}
			}
			
		});
		
		this.add(registro);
	}
	
	public void login() {
		JPanel login = new JPanel();
		login.setSize(this.getWidth(),this.getHeight());
		login.setBackground(Color.decode("#30508f"));
		login.setLayout(null);

		//User Login
		JLabel login_tag = new JLabel("User Login",0);
		login_tag.setSize(300, 80);
		login_tag.setFont(new Font ("Segoe UI Black",Font.BOLD,32));
		login_tag.setForeground(Color.white);
		login_tag.setLocation(105, 12);
		login.add(login_tag);

		//MyAccount
		JLabel myAccount = new JLabel("My Account",0);
		myAccount.setBounds(150,120,220,40);
		myAccount.setFont(new Font ("Segoe UI Black", Font.BOLD, 35));
		myAccount.setForeground(Color.decode("#D9C943"));
		login.add(myAccount);

		//Titulo
		JLabel userName = new JLabel("Enter Your Username");
		userName.setBounds(100,170,180,40);
		userName.setFont(new Font ("Agency FB", Font.BOLD, 20));
		userName.setForeground(Color.white);
		login.add(userName);

		//Textbox del username

		JTextField typeUser = new JTextField();
		typeUser.setBounds(100,210,300,35);
		typeUser.setOpaque(true);
		typeUser.setBackground(Color.white);
		login.add(typeUser);

		//Icono persona
		/*JLabel person = new JLabel();
		person.setIcon(new ImageIcon(getClass().getResource("persona.png")));
		person.setBounds(60, 218, 20, 20);
		login.add(person);/*/

		//personFrame
		JLabel iconFrame = new JLabel();
		iconFrame.setBounds(55,212,30,30);
		iconFrame.setOpaque(true);
		iconFrame.setBackground(Color.decode("#D9C943"));
		login.add(iconFrame);

		//Contraseña
		JLabel pwd = new JLabel("Enter Your Password:");
		pwd.setBounds(100,260,180,40);
		pwd.setFont(new Font("Agency FB",Font.BOLD,20));
		pwd.setForeground(Color.white);
		login.add(pwd);

		//Campo para la contraseña
		JPasswordField typePwd = new JPasswordField();
		typePwd.setBounds(100,300,300,35);
		typePwd.setFont(new Font ("Agency FB", Font.BOLD, 25));
		login.add(typePwd);

		//Locker icon
		/*JLabel locker = new JLabel();
		locker.setIcon(new ImageIcon(getClass().getResource("candado.png")));
		locker.setBounds(60, 305, 20, 20);
		login.add(locker);/*/

		//lockerFrame
		JLabel lockerFrame = new JLabel();
		lockerFrame.setBounds(55,300,30,30);
		lockerFrame.setOpaque(true);
		lockerFrame.setBackground(Color.decode("#D9C943"));
		login.add(lockerFrame);

		//Boton de acceso
		JButton accessButton = new JButton("Login");
		accessButton.setBounds(160,370,170,50);
		accessButton.setBackground(Color.decode("#D9C943"));
		accessButton.setFont(new Font("Segoe UI Black",Font.BOLD,25));
		login.add(accessButton);
		
		accessButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Hola");
				String usuario = typeUser.getText();
				String pwd = new String(typePwd.getPassword());
				login.setVisible(false);
				
				registro();
				if(usuario.length()<=0) {
					typeUser.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else {
					typeUser.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				if(pwd.length()<=0) {
					typePwd.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else {
					typePwd.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				if(usuario.equals("SuperUser")) {
					System.out.println("Bienvenido");
				}else {
					 JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error de acceso", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		//Recuadro
		JLabel frame = new JLabel();
		frame.setSize(450,350 );
		frame.setOpaque(true);
		frame.setBackground(Color.decode("#22396c"));
		frame.setLocation(25,100);
		login.add(frame);

		this.add(login);
	}
}
