package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class Storage_devices extends JFrame {

	private JPanel contentPane;
	public static JProgressBar progressBar_USB2 = new JProgressBar();

	public static JProgressBar progressBarCD = new JProgressBar();
	
	public static JProgressBar progressBar_ROM = new JProgressBar();
	public static JProgressBar progressBar_RAM = new JProgressBar();
	public static JProgressBar progressBar_USB1 = new JProgressBar();
	
	public static int opc;
	public static int opc2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Storage_devices frame = new Storage_devices();
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
	
	//FRAME DE LA REPRESENTACION DE ALMACENAMIENTO DE LOS DIFERENTES DISPOSITIVOS
	public Storage_devices() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("ROM");

		JLabel lblNewLabel_1 = new JLabel("RAM");

		JLabel lblNewLabel_2 = new JLabel("CD");

		JLabel lblNewLabel_3 = new JLabel("USB1");
		progressBar_ROM.setMaximum(1000000);

		//VALORES INICIALES DEL ROM Y RAM
		progressBar_ROM.setValue(17000);
		progressBar_RAM.setMaximum(16000);

		
		progressBar_RAM.setValue(2000);

		
		//BOTON AÑADIR DATOS QUE INVOCA LA VENTANA DE OPCIONES DE DISPOSITIVOS
		// CON OPC = 4 QUE ES LA OPERACIÓN QUE EVALUARÁ Y EJECUTARÁ 
		JButton btnAddData = new JButton("Add Data");
		btnAddData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opc = 4;
				Manager manager = new Manager();
				manager.EnableBtns();
				manager.setVisible(true);
				manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				
				
			}
		});

		//BOTON BORRAR DATOS QUE INVOCA LA VENTANA DE OPCIONES DE DISPOSITIVOS
		// CON OPC = 5 QUE ES LA OPERACIÓN QUE EVALUARÁ Y EJECUTARÁ 
		JButton btnEraseData = new JButton("Erase Data");
		btnEraseData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opc = 5;
				
				Manager manager = new Manager();
				manager.setVisible(true);
				if(progressBar_RAM.getValue() > 2000|| progressBar_ROM.getValue() > 17000) {
					manager.EnableBtns();
				}
				
				manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
			}
		});

		JLabel lblNewLabel_4 = new JLabel("USB2");

		

		JButton btnAddDevice = new JButton("Add Device");

		//BOTON DESCONECTAR DISPOSITIVO QUE INVOCA LA VENTANA DE OPCIONES DE DISPOSITIVOS
		// CON OPC = 2 QUE ES LA OPERACIÓN QUE EVALUARÁ Y EJECUTARÁ 
		JButton btnDisconnect = new JButton("Disconect Device");
		btnDisconnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opc = 2;
				Manager manager = new Manager();
				manager.setVisible(true);
				manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});

		JButton btnFormatear = new JButton("Formatear");
		
		
		
		//BOTON AÑADIR DISPOSITIVO QUE INVOCA LA VENTANA DE OPCIONES DE DISPOSITIVOS
		// CON OPC = 1 QUE ES LA OPERACIÓN QUE EVALUARÁ Y EJECUTARÁ 
		btnAddDevice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opc = 1;
				Manager manager = new Manager();
				manager.setVisible(true);
				manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				
				
			}
		});

		//BOTON FORMATEAR DISPOSITVO QUE INVOCA LA VENTANA DE OPCIONES DE DISPOSITIVOS
		// CON OPC = 3 QUE ES LA OPERACIÓN QUE EVALUARÁ Y EJECUTARÁ 
		btnFormatear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opc = 3;
				
				Manager manager = new Manager();
				manager.setVisible(true);
				manager.EnableBtns();
				manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		
		

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(progressBarCD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(progressBar_USB2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_4)
									.addContainerGap())
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(progressBar_USB1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_3)
											.addContainerGap())
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblNewLabel_1)
												.addContainerGap())
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
													.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(lblNewLabel_2)
														.addGap(309)
														.addComponent(btnFormatear, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
													.addGroup(gl_contentPane.createSequentialGroup()
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
															.addComponent(progressBar_ROM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
															.addComponent(lblNewLabel)
															.addComponent(progressBar_RAM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
															.addComponent(btnEraseData, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
															.addComponent(btnDisconnect, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
															.addComponent(btnAddDevice, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
															.addComponent(btnAddData, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
												.addContainerGap(140, Short.MAX_VALUE)))))))))
		);
		progressBarCD.setMaximum(4700);
		progressBar_USB1.setMaximum(16000);
		progressBar_USB2.setMaximum(8000);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(progressBar_ROM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnAddDevice))
					.addGap(18)
					.addComponent(lblNewLabel_1)
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnDisconnect)
						.addComponent(progressBar_RAM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(18)
							.addComponent(progressBarCD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(lblNewLabel_3))
						.addComponent(btnFormatear))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAddData)
					.addGap(5)
					.addComponent(progressBar_USB1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(lblNewLabel_4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(btnEraseData))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(27)
							.addComponent(progressBar_USB2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(54, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
