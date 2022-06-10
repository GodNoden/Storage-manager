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


//VENTANA BORRAR DATOS 

public class DataErase extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataErase frame = new DataErase();
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
	public DataErase() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 242, 168);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(22, 47, 60, 20);
		//SPINNER PARA EXTRAER DATOS ENTEROS 
		contentPane.add(spinner);
		
		//BOTON BORRAR DATOS 
		JButton btnNewButtonErase = new JButton("Erase Data");
		btnNewButtonErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = (int) spinner.getValue();
				switch (Storage_devices.opc2) {//SWITCH QUE EVALUA QUE DISPOSITIVO FUE ELEGIDO PARA BORRAR LOS DATOS 
				case 1:
					Storage_devices.progressBar_ROM.setValue(Storage_devices.progressBar_ROM.getValue() - i);
					dispose();
					break;
				case 2:
					Storage_devices.progressBar_RAM.setValue(Storage_devices.progressBar_RAM.getValue() - i);
					dispose();
					break;

				case 3:
					Storage_devices.progressBarCD.setValue(Storage_devices.progressBarCD.getValue() - i);
					dispose();
					break;

				case 4:
					Storage_devices.progressBar_USB1.setValue(Storage_devices.progressBar_USB1.getValue() - i);
					dispose();
					break;

				case 5:		
					Storage_devices.progressBar_USB2.setValue(Storage_devices.progressBar_USB2.getValue() - i);
					dispose();
					break;

				default:
					break;
				}
			}
		});
		btnNewButtonErase.setBounds(112, 46, 89, 23);
		contentPane.add(btnNewButtonErase);
	}

}
