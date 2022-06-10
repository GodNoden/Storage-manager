package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//VENTANA DE OPCIONES DE DISPOSITIVOS

public class Manager extends JFrame {

	private JPanel contentPane;
	JButton btnNewButtonUSB1 = new JButton("USB1");
	JButton btnNewButtonCD = new JButton("CD");
	JButton btnNewButtonUSB2 = new JButton("USB2");
	JButton btnROM = new JButton("ROM");
	JButton btnRAM = new JButton("RAM");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager frame = new Manager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// FUNCION ACTIVAR BOTONES QUE ACTIVA LOS BOTONES DE ROM Y RAM PARA LAS
	// OPERACIONES QUE PUEDEN USARLOS
	public void EnableBtns() {
		btnROM.setEnabled(true);
		btnRAM.setEnabled(true);
	}

	/**
	 * Create the frame.
	 */
	public Manager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// BOTON DE DISPOSITIVO USB1 (16GB)
		btnNewButtonUSB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// USO DE SWITCH PARA SABER QUE OPERACIÓN DE LA VENTANA DE VISUALIZACION DE
				// DISPOSITIVOS ESTA CONVOCANDO A ESTA
				switch (Storage_devices.opc) {
				case 1: // AÑADIR
					Storage_devices.progressBar_USB1.setValue(500);
					dispose();
					break;
				case 2:// DESCONECTAR
					Storage_devices.progressBar_USB1.setValue(0);
					dispose();
					break;
				case 3:// FORMATEAR
					Storage_devices.progressBar_USB1.setValue(500);
					dispose();
					break;
				case 4:// AÑADIR DATOS QUE INVOCA LA VENTANA DE INGRESO DE ENTERO PARA REPRESENTAR EL
						// TAMAÑO DE DATOS
						// OPC = 4 PARA SABER QUE DISPOSITIVO DEBERÁ MANIPULAR
					Data data = new Data();
					data.setVisible(true);
					data.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					Storage_devices.opc2 = 4;
					dispose();
					break;
				case 5:// BORRAR DATOS QUE INVOCA LA VENTANA DE INGRESO DE ENTERO PARA REPRESENTAR EL
						// TAMAÑO DE DATOS
						// OPC = 4 PARA SABER QUE DISPOSITIVO DEBERÁ MANIPULAR
					DataErase dataErase = new DataErase();
					dataErase.setVisible(true);
					dataErase.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					Storage_devices.opc2 = 4;
					dispose();
					break;
				default:
					break;
				}
			}
		});
		btnNewButtonUSB1.setBounds(63, 54, 89, 23);
		contentPane.add(btnNewButtonUSB1);

		// BOTON DE DISPOSITIVO CD (4.7GB)
		btnNewButtonCD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (Storage_devices.opc) {
				case 1:
					Storage_devices.progressBarCD.setValue(200);
					dispose();
					break;
				case 2:
					Storage_devices.progressBarCD.setValue(0);
					dispose();
					break;
				case 3:
					Storage_devices.progressBarCD.setValue(200);
					dispose();
					break;
				case 4:
					Data data = new Data();
					data.setVisible(true);
					data.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					Storage_devices.opc2 = 3;
					dispose();
					break;
				case 5:
					DataErase dataErase = new DataErase();
					dataErase.setVisible(true);
					dataErase.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					Storage_devices.opc2 = 3;
					dispose();
					break;
				default:
					break;
				}

			}
		});
		btnNewButtonCD.setBounds(63, 109, 89, 23);
		contentPane.add(btnNewButtonCD);

		// BOTON DE DISPOSITIVO USB2 (8GB)
		btnNewButtonUSB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				switch (Storage_devices.opc) {
				case 1:
					Storage_devices.progressBar_USB2.setValue(500);
					dispose();
					break;
				case 2:
					Storage_devices.progressBar_USB2.setValue(0);
					dispose();
					break;
				case 3:
					Storage_devices.progressBar_USB2.setValue(500);
					dispose();
					break;
				case 4:
					Data data = new Data();
					data.setVisible(true);
					data.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					Storage_devices.opc2 = 5;
					dispose();
					break;
				case 5:
					DataErase dataErase = new DataErase();
					dataErase.setVisible(true);
					dataErase.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					Storage_devices.opc2 = 5;
					dispose();
					break;
				default:
					break;
				}

			}
		});
		btnNewButtonUSB2.setBounds(249, 70, 89, 23);
		contentPane.add(btnNewButtonUSB2);

		// BOTON DE DISPOSITIVO ROM (1TB)
		btnROM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (Storage_devices.opc) {
				// OPCIONES 1 Y 2 NO DISPONIBLES PARA ESTE DISPOSITIVO YA QUE PARA EL EJEMPLO EL
				// SISTEMA YA INICIA CON ESTOS DISPOSITIVOS CONECTADOS Y NO ES POSIBLE
				// DESCONECTARLOS
				case 3:
					Storage_devices.progressBar_ROM.setValue(17000);
					dispose();
					break;
				case 4:
					Data data = new Data();
					data.setVisible(true);
					data.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					Storage_devices.opc2 = 1;
					dispose();
					break;
				case 5:
					DataErase dataErase = new DataErase();
					dataErase.setVisible(true);
					dataErase.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					Storage_devices.opc2 = 1;
					dispose();
					break;
				default:
					break;
				}
			}
		});
		btnROM.setEnabled(false);
		btnROM.setBounds(63, 167, 89, 23);
		contentPane.add(btnROM);

		// BOTON DE DISPOSITIVO RAM (16GB)
		btnRAM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (Storage_devices.opc) {
				// OPCIONES 1 Y 2 NO DISPONIBLES PARA ESTE DISPOSITIVO YA QUE PARA EL EJEMPLO EL
				// SISTEMA YA INICIA CON ESTOS DISPOSITIVOS CONECTADOS Y NO ES POSIBLE
				// DESCONECTARLOS
				case 3:
					Storage_devices.progressBar_RAM.setValue(2000);
					dispose();
					break;
				case 4:
					Data data = new Data();
					data.setVisible(true);
					data.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					Storage_devices.opc2 = 2;
					dispose();
					break;
				case 5:
					DataErase dataErase = new DataErase();
					dataErase.setVisible(true);
					dataErase.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					Storage_devices.opc2 = 2;
					dispose();
					break;
				default:
					break;
				}
			}
		});
		btnRAM.setEnabled(false);
		btnRAM.setBounds(249, 145, 89, 23);
		contentPane.add(btnRAM);
	}

}
