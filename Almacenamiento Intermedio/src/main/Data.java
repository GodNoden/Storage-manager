package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

//VENTANA AÑADIR DATOS 

public class Data extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Data frame = new Data();
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
	public Data() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 242, 168);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		spinner.setBounds(20, 48, 54, 20);
		//SPINNER PARA EXTRAER DATOS ENTEROS 
		contentPane.add(spinner);

		//BOTON AÑADIR DATOS 
		JButton btnNewButtonAdd = new JButton("Add Data");
		btnNewButtonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = (int) spinner.getValue();
				switch (Storage_devices.opc2) {//SWITCH QUE EVALUA QUE DISPOSITIVO FUE ELEGIDO PARA AÑADIR LOS DATOS 
				case 1:
					Storage_devices.progressBar_ROM.setValue(Storage_devices.progressBar_ROM.getValue() + (int) spinner.getValue());
					dispose();
					break;
				case 2:
					Storage_devices.progressBar_RAM.setValue(Storage_devices.progressBar_RAM.getValue() + i);
					dispose();
					break;

				case 3:
					Storage_devices.progressBarCD.setValue(Storage_devices.progressBarCD.getValue() + i);
					dispose();
					break;

				case 4:
					Storage_devices.progressBar_USB1.setValue(Storage_devices.progressBar_USB1.getValue() + i);
					dispose();
					break;

				case 5:
					Storage_devices.progressBar_USB2.setValue(Storage_devices.progressBar_USB2.getValue() + i);
					dispose();
					break;

				default:
					break;
				}

			}
		});
		btnNewButtonAdd.setBounds(97, 47, 89, 23);
		contentPane.add(btnNewButtonAdd);
	}

}
