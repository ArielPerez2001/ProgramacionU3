import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AccesoyRegistro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccesoyRegistro frame = new AccesoyRegistro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AccesoyRegistro() {
		this.login(this);
	}

	public void registro(JFrame frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 501, 823);
		panel.setBackground(Color.decode("#908DE5"));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel register_tag = new JLabel("Register",0);
		register_tag.setSize(300, 80);
		register_tag.setFont(new Font ("Arial",Font.BOLD,30));
		register_tag.setForeground(Color.yellow);
		register_tag.setLocation(110, 20);
		panel.add(register_tag);

		//Registro de usuario
		JLabel userName = new JLabel(" User name:");
		userName.setBounds(90,120,180,40);
		userName.setFont(new Font ("Agency FB", Font.BOLD, 25));
		userName.setForeground(Color.white);
		panel.add(userName);

		JTextField userField = new JTextField();
		userField.setBounds(80, 159, 180, 40);
		userField.setFont(new Font("Arial",Font.BOLD,20));
		userField.setOpaque(true);
		userField.setBackground(Color.white);
		panel.add(userField);

		JLabel lastName = new JLabel("Last name: ",0);
		lastName.setBounds(140, 120, 400, 40);
		lastName.setFont(new Font("Arial",Font.BOLD,20));
		lastName.setForeground(Color.white);
		panel.add(lastName);

		JTextField lastNameField = new JTextField();
		lastNameField.setBounds(280, 159, 180, 40);
		lastNameField.setFont(new Font("Arial",Font.BOLD,20));
		lastNameField.setOpaque(true);
		lastNameField.setBackground(Color.white);
		panel.add(lastNameField);

		JLabel email = new JLabel("Email: ",0);
		email.setBounds(70, 230, 400, 40);
		email.setFont(new Font("Arial",Font.BOLD,20));
		email.setForeground(Color.white);
		panel.add(email);
		
		JTextField emailField = new JTextField();
		emailField.setBounds(175, 280, 180, 40);
		emailField.setFont(new Font("Arial",Font.BOLD,20));
		emailField.setOpaque(true);
		emailField.setBackground(Color.white);
		panel.add(emailField);
		
		JLabel pass = new JLabel("Password: ",0);
		pass.setBounds(70, 330, 400, 40);
		pass.setFont(new Font("Arial",Font.BOLD,20));
		pass.setForeground(Color.white);
		panel.add(pass);
		
		JPasswordField pwdField = new JPasswordField();
		pwdField.setBounds(175, 370, 180, 40);
		pwdField.setFont(new Font("Arial",Font.BOLD,20));
		pwdField.setOpaque(true);
		pwdField.setBackground(Color.white);
		panel.add(pwdField);
		
		JLabel cofirmPwd = new JLabel("Confirm password: ",0);
		cofirmPwd.setBounds(70, 420, 400, 40);
		cofirmPwd.setFont(new Font("Arial",Font.BOLD,20));
		cofirmPwd.setForeground(Color.white);
		panel.add(cofirmPwd);
		
		JPasswordField pwdField2 = new JPasswordField();
		pwdField2.setBounds(175, 460, 180, 40);
		pwdField2.setFont(new Font("Arial",Font.BOLD,20));
		pwdField2.setOpaque(true);
		pwdField2.setBackground(Color.white);
		panel.add(pwdField2);

		JCheckBox acceptRadio = new JCheckBox("Accept terms and conditions");
		acceptRadio.setBounds(130, 500, 320, 40);
		acceptRadio.setFont(new Font("Arial",Font.BOLD,16));
		acceptRadio.setForeground(Color.white);
		acceptRadio.setOpaque(false);
		acceptRadio.setBackground(Color.red);
		panel.add(acceptRadio);

		JButton registerButton = new JButton("Create account");
		registerButton.setBounds(160, 550, 200, 40);
		registerButton.setFont(new Font("Arial",Font.BOLD,19));
		registerButton.setForeground(Color.black);
		registerButton.setOpaque(false);
		registerButton.setBackground(Color.yellow);
		panel.add(registerButton);
		
		registerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 	String password1 = new String(pwdField.getPassword());
			        String password2 = new String(pwdField2.getPassword());

			        if (password1.equals(password2)) {
			            // Contraseñas coinciden
			            JOptionPane.showMessageDialog(null, "Account created succesfully!",password2, JOptionPane.INFORMATION_MESSAGE);
			        } else {
			            // Contraseñas no coinciden
			            JOptionPane.showMessageDialog(null, "The password doesn´t match", "Error", JOptionPane.ERROR_MESSAGE);
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
		
		JButton lblNewLabel_1_1_1_1_1_1_1 = new JButton("Don´t have an account? Create one");
		lblNewLabel_1_1_1_1_1_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.remove(panel);
				
				login(frame);
				frame.repaint();
				frame.revalidate();	
			}
			
		});
		
		
	}
	
	public void recoverAccount(JFrame frame) {
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 720);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Account");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Register");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Login");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Recover account");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				recoverAccount(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		
		
		mntmNewMenuItem_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				login(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		
		mntmNewMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				registro(frame);
				
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("How can i create a user?");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				registro(frame);
			}
			
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("How to access the system?");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_4 = new JMenu("User");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Alta");
		mnNewMenu_4.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Baja");
		mnNewMenu_4.add(mntmNewMenuItem_6);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth(),this.getHeight());
		login.setBackground(Color.pink);
		getContentPane().add(login);
		login.setLayout(null);
		
		//User Login
				JLabel login_tag = new JLabel("Recover Account",0);
				login_tag.setBounds(105, 12, 300, 80);
				login_tag.setFont(new Font ("Segoe UI Black",Font.BOLD,32));
				login_tag.setForeground(Color.white);
				login.add(login_tag);

				//MyAccount
				JLabel myAccount = new JLabel("My Account",0);
				myAccount.setBounds(150, 120, 220, 40);
				myAccount.setFont(new Font ("Segoe UI Black", Font.BOLD, 35));
				myAccount.setForeground(Color.decode("#D9C943"));
				login.add(myAccount);

				//Titulo
				JLabel userName = new JLabel("Enter your Email");
				userName.setBounds(100, 170, 180, 40);
				userName.setFont(new Font ("Agency FB", Font.BOLD, 20));
				userName.setForeground(Color.white);
				login.add(userName);

				//Textbox del username

				JTextField typeUser = new JTextField();
				typeUser.setBounds(100, 210, 300, 35);
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
				iconFrame.setBounds(55, 212, 30, 30);
				iconFrame.setOpaque(true);
				iconFrame.setBackground(Color.decode("#D9C943"));
				login.add(iconFrame);

				//Boton de acceso
				JButton accessButton = new JButton("Recover");
				accessButton.setBounds(165, 287, 170, 50);
				accessButton.setBackground(Color.decode("#D9C943"));
				accessButton.setFont(new Font("Segoe UI Black",Font.BOLD,25));
				login.add(accessButton);
				
				//Don´t have an account?
				JLabel questionAcc = new JLabel("Don't have an account? Create one",0);
				questionAcc.setBounds(155, 450, 180, 40);
				questionAcc.setFont(new Font("Agency FB",Font.BOLD,20));
				questionAcc.setForeground(Color.white);
				login.add(questionAcc);

				//Sign Up
				JButton signUp = new JButton("Sign up");
				signUp.setBounds(165, 495, 160, 40);
				signUp.setBackground(Color.decode("#D9C943"));
				signUp.setFont(new Font("Segoe UI Black",Font.BOLD,20));
				login.add(signUp);
				
				signUp.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						frame.remove(login);
						
						registro(frame);
						
						frame.repaint();
						frame.revalidate();
						
					}
				});

				//Recuadro
				JLabel recuadro = new JLabel();
				recuadro.setBounds(25, 100, 450, 350);
				recuadro.setOpaque(true);
				recuadro.setBackground(Color.decode("#22396c"));
				login.add(recuadro);
				
				
		    
	}
	
	public void login(JFrame frame) {
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 720);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Account");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Register");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Login");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		mntmNewMenuItem_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				login(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		
		mntmNewMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				registro(frame);
				
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Recover account");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				recoverAccount(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("How can i create a user?");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				howCreateUser(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("How to access the system?");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Forgot Password?");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		mntmNewMenuItem_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				fgtPwd(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		
		mntmNewMenuItem_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				howAccessSystem(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		
		JMenu mnNewMenu_4 = new JMenu("User");
		menuBar.add(mnNewMenu_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth(),this.getHeight());
		login.setBackground(Color.decode("#30508f"));
		getContentPane().add(login);
		login.setLayout(null);
		
		//User Login
				JLabel login_tag = new JLabel("User Login",0);
				login_tag.setBounds(105, 12, 300, 80);
				login_tag.setFont(new Font ("Segoe UI Black",Font.BOLD,32));
				login_tag.setForeground(Color.white);
				login.add(login_tag);

				//MyAccount
				JLabel myAccount = new JLabel("My Account",0);
				myAccount.setBounds(150, 120, 220, 40);
				myAccount.setFont(new Font ("Segoe UI Black", Font.BOLD, 35));
				myAccount.setForeground(Color.decode("#D9C943"));
				login.add(myAccount);

				//Titulo
				JLabel userName = new JLabel("Enter Your Username");
				userName.setBounds(100, 170, 180, 40);
				userName.setFont(new Font ("Agency FB", Font.BOLD, 20));
				userName.setForeground(Color.white);
				login.add(userName);

				//Textbox del username

				JTextField typeUser = new JTextField();
				typeUser.setBounds(100, 210, 300, 35);
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
				iconFrame.setBounds(55, 212, 30, 30);
				iconFrame.setOpaque(true);
				iconFrame.setBackground(Color.decode("#D9C943"));
				login.add(iconFrame);

				//Contraseña
				JLabel pwd = new JLabel("Enter Your Password:");
				pwd.setBounds(100, 260, 180, 40);
				pwd.setFont(new Font("Agency FB",Font.BOLD,20));
				pwd.setForeground(Color.white);
				login.add(pwd);

				//Campo para la contraseña
				JPasswordField typePwd = new JPasswordField();
				typePwd.setBounds(100, 300, 300, 35);
				typePwd.setFont(new Font ("Agency FB", Font.BOLD, 25));
				login.add(typePwd);

				//Locker icon
				/*JLabel locker = new JLabel();
				locker.setIcon(new ImageIcon(getClass().getResource("candado.png")));
				locker.setBounds(60, 305, 20, 20);
				login.add(locker);/*/

				//lockerFrame
				JLabel lockerFrame = new JLabel();
				lockerFrame.setBounds(55, 300, 30, 30);
				lockerFrame.setOpaque(true);
				lockerFrame.setBackground(Color.decode("#D9C943"));
				login.add(lockerFrame);

				//Boton de acceso
				JButton accessButton = new JButton("Login");
				accessButton.setBounds(160, 370, 170, 50);
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
				
				//Don´t have an account?
				JLabel questionAcc = new JLabel("Don't have an account? Create one",0);
				questionAcc.setBounds(155, 450, 180, 40);
				questionAcc.setFont(new Font("Agency FB",Font.BOLD,20));
				questionAcc.setForeground(Color.white);
				login.add(questionAcc);

				//Sign Up
				JButton signUp = new JButton("Sign up");
				signUp.setBounds(165, 495, 160, 40);
				signUp.setBackground(Color.decode("#D9C943"));
				signUp.setFont(new Font("Segoe UI Black",Font.BOLD,20));
				login.add(signUp);
				
				signUp.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						frame.remove(login);
						
						registro(frame);
						
						frame.repaint();
						frame.revalidate();
						
					}
				});

				//Recuadro
				JLabel recuadro = new JLabel();
				recuadro.setBounds(25, 100, 450, 350);
				recuadro.setOpaque(true);
				recuadro.setBackground(Color.decode("#22396c"));
				login.add(recuadro);
				
				
		    }
	
	public void howAccessSystem(JFrame frame) {
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 720);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Account");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Register");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Login");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		mntmNewMenuItem_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				login(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		
		mntmNewMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				registro(frame);
				
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Recover account");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				recoverAccount(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("How can i create a user?");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				howCreateUser(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("How to access the system?");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				howAccessSystem(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		
		JMenu mnNewMenu_4 = new JMenu("User");
		menuBar.add(mnNewMenu_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth(),this.getHeight());
		login.setBackground(Color.decode("#30508f"));
		getContentPane().add(login);
		login.setLayout(null);
		
		//User Login
				JLabel login_tag = new JLabel("How to access the system?",0);
				login_tag.setBounds(24, 12, 444, 80);
				login_tag.setFont(new Font ("Segoe UI Black",Font.BOLD,32));
				login_tag.setForeground(Color.white);
				login.add(login_tag);

				//MyAccount
				JLabel myAccount = new JLabel("Requirements to access",0);
				myAccount.setBounds(39, 120, 429, 40);
				myAccount.setFont(new Font ("Segoe UI Black", Font.BOLD, 35));
				myAccount.setForeground(Color.decode("#D9C943"));
				login.add(myAccount);

				//Titulo
				JLabel userName = new JLabel("Enter Your Username");
				userName.setBounds(100, 170, 180, 40);
				userName.setFont(new Font ("Agency FB", Font.BOLD, 20));
				userName.setForeground(Color.white);
				login.add(userName);

				//Textbox del username

				JTextField typeUser = new JTextField();
				typeUser.setText("You must  type your username");
				typeUser.setBounds(100, 210, 300, 35);
				typeUser.setBackground(Color.white);
				login.add(typeUser);

				//Icono persona
				/*JLabel person = new JLabel();
				person.setIcon(new ImageIcon(getClass().getResource("persona.png")));
				person.setBounds(60, 218, 20, 20);
				login.add(person);/*/

				//personFrame
				JLabel iconFrame = new JLabel();
				iconFrame.setBounds(55, 212, 30, 30);
				iconFrame.setOpaque(true);
				iconFrame.setBackground(Color.decode("#D9C943"));
				login.add(iconFrame);

				//Contraseña
				JLabel pwd = new JLabel("Enter Your Password:");
				pwd.setBounds(100, 260, 180, 40);
				pwd.setFont(new Font("Agency FB",Font.BOLD,20));
				pwd.setForeground(Color.white);
				login.add(pwd);

				//Campo para la contraseña
				JPasswordField typePwd = new JPasswordField();
				typePwd.setToolTipText("Then type the password you created");
				typePwd.setBounds(100, 300, 300, 35);
				typePwd.setFont(new Font ("Agency FB", Font.BOLD, 25));
				login.add(typePwd);

				//Locker icon
				/*JLabel locker = new JLabel();
				locker.setIcon(new ImageIcon(getClass().getResource("candado.png")));
				locker.setBounds(60, 305, 20, 20);
				login.add(locker);/*/

				//lockerFrame
				JLabel lockerFrame = new JLabel();
				lockerFrame.setBounds(55, 300, 30, 30);
				lockerFrame.setOpaque(true);
				lockerFrame.setBackground(Color.decode("#D9C943"));
				login.add(lockerFrame);

				//Boton de acceso
				JButton accessButton = new JButton("Login");
				accessButton.setBounds(160, 370, 170, 50);
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
				
				//Don´t have an account?
				JLabel questionAcc = new JLabel("Don't have an account? Create one",0);
				questionAcc.setBounds(155, 450, 180, 40);
				questionAcc.setFont(new Font("Agency FB",Font.BOLD,20));
				questionAcc.setForeground(Color.white);
				login.add(questionAcc);

				//Sign Up
				JButton signUp = new JButton("Sign up");
				signUp.setBounds(165, 495, 160, 40);
				signUp.setBackground(Color.decode("#D9C943"));
				signUp.setFont(new Font("Segoe UI Black",Font.BOLD,20));
				login.add(signUp);
				
				signUp.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						frame.remove(login);
						
						registro(frame);
						
						frame.repaint();
						frame.revalidate();
						
					}
				});

				//Recuadro
				JLabel recuadro = new JLabel();
				recuadro.setBounds(25, 100, 450, 350);
				recuadro.setOpaque(true);
				recuadro.setBackground(Color.decode("#22396c"));
				login.add(recuadro);
				
				JLabel label = new JLabel("New label");
				label.setBounds(110, 221, 45, 13);
				login.add(label);
				
				
		    }
	
	public void howCreateUser(JFrame frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 501, 823);
		panel.setBackground(new Color(51, 204, 153));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel register_tag = new JLabel("How can i create a user?",0);
		register_tag.setSize(419, 80);
		register_tag.setFont(new Font ("Arial",Font.BOLD,30));
		register_tag.setForeground(Color.yellow);
		register_tag.setLocation(51, 30);
		panel.add(register_tag);

		//Registro de usuario
		JLabel userName = new JLabel(" User name:");
		userName.setBounds(90,120,180,40);
		userName.setFont(new Font ("Agency FB", Font.BOLD, 25));
		userName.setForeground(Color.white);
		panel.add(userName);

		JTextField userField = new JTextField();
		userField.setBounds(80, 159, 180, 40);
		userField.setFont(new Font("Arial",Font.BOLD,20));
		userField.setOpaque(true);
		userField.setBackground(Color.white);
		panel.add(userField);

		JLabel lastName = new JLabel("Last name: ",0);
		lastName.setBounds(140, 120, 400, 40);
		lastName.setFont(new Font("Arial",Font.BOLD,20));
		lastName.setForeground(Color.white);
		panel.add(lastName);

		JTextField lastNameField = new JTextField();
		lastNameField.setBounds(280, 159, 180, 40);
		lastNameField.setFont(new Font("Arial",Font.BOLD,20));
		lastNameField.setOpaque(true);
		lastNameField.setBackground(Color.white);
		panel.add(lastNameField);

		JLabel email = new JLabel("Email: ",0);
		email.setBounds(70, 211, 400, 40);
		email.setFont(new Font("Arial",Font.BOLD,20));
		email.setForeground(Color.white);
		panel.add(email);
		
		JTextField emailField = new JTextField();
		emailField.setBounds(175, 261, 180, 40);
		emailField.setFont(new Font("Arial",Font.BOLD,20));
		emailField.setOpaque(true);
		emailField.setBackground(Color.white);
		panel.add(emailField);
		
		JLabel pass = new JLabel("Password: ",0);
		pass.setBounds(70, 311, 400, 40);
		pass.setFont(new Font("Arial",Font.BOLD,20));
		pass.setForeground(Color.white);
		panel.add(pass);
		
		JPasswordField pwdField = new JPasswordField();
		pwdField.setBounds(175, 359, 180, 40);
		pwdField.setFont(new Font("Arial",Font.BOLD,20));
		pwdField.setOpaque(true);
		pwdField.setBackground(Color.white);
		panel.add(pwdField);
		
		JLabel cofirmPwd = new JLabel("Confirm password: ",0);
		cofirmPwd.setBounds(70, 410, 400, 40);
		cofirmPwd.setFont(new Font("Arial",Font.BOLD,20));
		cofirmPwd.setForeground(Color.white);
		panel.add(cofirmPwd);
		
		JPasswordField pwdField2 = new JPasswordField();
		pwdField2.setBounds(175, 454, 180, 40);
		pwdField2.setFont(new Font("Arial",Font.BOLD,20));
		pwdField2.setOpaque(true);
		pwdField2.setBackground(Color.white);
		panel.add(pwdField2);

		JCheckBox acceptRadio = new JCheckBox("Accept terms and conditions");
		acceptRadio.setBounds(130, 500, 320, 40);
		acceptRadio.setFont(new Font("Arial",Font.BOLD,16));
		acceptRadio.setForeground(Color.white);
		acceptRadio.setOpaque(false);
		acceptRadio.setBackground(Color.red);
		panel.add(acceptRadio);

		JButton registerButton = new JButton("To register");
		registerButton.setBounds(160, 550, 200, 40);
		registerButton.setFont(new Font("Arial",Font.BOLD,19));
		registerButton.setForeground(Color.black);
		registerButton.setOpaque(false);
		registerButton.setBackground(Color.yellow);
		panel.add(registerButton);
		
		registerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 	String password1 = new String(pwdField.getPassword());
			        String password2 = new String(pwdField2.getPassword());

			        if (password1.equals(password2)) {
			            // Contraseñas coinciden
			            JOptionPane.showMessageDialog(null, "Account created succesfully!",password2, JOptionPane.INFORMATION_MESSAGE);
			        } else {
			            // Contraseñas no coinciden
			            JOptionPane.showMessageDialog(null, "The password doesn´t match", "Error", JOptionPane.ERROR_MESSAGE);
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
		
		JButton lblNewLabel_1_1_1_1_1_1_1 = new JButton("Don´t have an account? Create one");
		lblNewLabel_1_1_1_1_1_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.remove(panel);
				
				login(frame);
				frame.repaint();
				frame.revalidate();	
			}
			
		});
	}
	
	public void fgtPwd(JFrame frame) {
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 720);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Account");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Register");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Login");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		mntmNewMenuItem_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				login(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		
		mntmNewMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				registro(frame);
				
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Recover account");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				recoverAccount(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("How can i create a user?");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				howCreateUser(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("How to access the system?");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Forgot Password?");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		mntmNewMenuItem_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				fgtPwd(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		
		mntmNewMenuItem_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				
				howAccessSystem(frame);
				
				frame.repaint();
				frame.revalidate();
			}
			
		});
		
		JMenu mnNewMenu_4 = new JMenu("User");
		menuBar.add(mnNewMenu_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth(),this.getHeight());
		login.setBackground(Color.decode("#30508f"));
		getContentPane().add(login);
		login.setLayout(null);
		
		//User Login
				JLabel login_tag = new JLabel("Forgot Password?",0);
				login_tag.setBounds(105, 12, 300, 80);
				login_tag.setFont(new Font ("Segoe UI Black",Font.BOLD,32));
				login_tag.setForeground(Color.white);
				login.add(login_tag);

				//MyAccount
				JLabel myAccount = new JLabel("Follow these steps",0);
				myAccount.setBounds(60, 120, 380, 40);
				myAccount.setFont(new Font ("Segoe UI Black", Font.BOLD, 35));
				myAccount.setForeground(Color.decode("#D9C943"));
				login.add(myAccount);

				//Titulo
				JLabel userName = new JLabel("Email");
				userName.setBounds(100, 170, 180, 40);
				userName.setFont(new Font ("Agency FB", Font.BOLD, 20));
				userName.setForeground(Color.white);
				login.add(userName);

				//Textbox del username

				JTextField typeUser = new JTextField();
				typeUser.setBounds(100, 210, 300, 35);
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
				iconFrame.setBounds(55, 212, 30, 30);
				iconFrame.setOpaque(true);
				iconFrame.setBackground(Color.decode("#D9C943"));
				login.add(iconFrame);

				//Contraseña
				JLabel pwd = new JLabel("Enter the new password");
				pwd.setBounds(100, 260, 180, 40);
				pwd.setFont(new Font("Agency FB",Font.BOLD,20));
				pwd.setForeground(Color.white);
				login.add(pwd);

				//Campo para la contraseña
				JPasswordField typePwd = new JPasswordField();
				typePwd.setBounds(100, 300, 300, 35);
				typePwd.setFont(new Font ("Agency FB", Font.BOLD, 25));
				login.add(typePwd);

				//Locker icon
				/*JLabel locker = new JLabel();
				locker.setIcon(new ImageIcon(getClass().getResource("candado.png")));
				locker.setBounds(60, 305, 20, 20);
				login.add(locker);/*/

				//lockerFrame
				JLabel lockerFrame = new JLabel();
				lockerFrame.setBounds(55, 300, 30, 30);
				lockerFrame.setOpaque(true);
				lockerFrame.setBackground(Color.decode("#D9C943"));
				login.add(lockerFrame);

				//Boton de acceso
				JButton accessButton = new JButton("Send ");
				accessButton.setBounds(160, 370, 170, 50);
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
				
				//Don´t have an account?
				JLabel questionAcc = new JLabel("Don't have an account? Create one",0);
				questionAcc.setBounds(155, 450, 180, 40);
				questionAcc.setFont(new Font("Agency FB",Font.BOLD,20));
				questionAcc.setForeground(Color.white);
				login.add(questionAcc);

				//Sign Up
				JButton signUp = new JButton("Sign up");
				signUp.setBounds(165, 495, 160, 40);
				signUp.setBackground(Color.decode("#D9C943"));
				signUp.setFont(new Font("Segoe UI Black",Font.BOLD,20));
				login.add(signUp);
				
				signUp.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						frame.remove(login);
						
						registro(frame);
						
						frame.repaint();
						frame.revalidate();
						
					}
				});

				//Recuadro
				JLabel recuadro = new JLabel();
				recuadro.setBounds(25, 100, 450, 350);
				recuadro.setOpaque(true);
				recuadro.setBackground(Color.decode("#22396c"));
				login.add(recuadro);
				
				
	}
}
	
