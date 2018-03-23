import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal extends JFrame
{

	private JTextField txtPesos;
	private JTextField txtDolar;
	private JButton btnConvertir;
	
	 public Principal(String Titulo) 
	 {
		JLabel Pesos = new JLabel("Pesos");
		txtPesos = new JTextField("$ 0");
		JLabel Dolar= new JLabel("Dolares");
		txtDolar = new JTextField("$ 0");
		btnConvertir = new JButton("Convertir");
		
		JPanel Vent = new JPanel();
		Vent.setLayout(new GridLayout(3,2));
		Vent.add(Pesos);
		Vent.add(txtPesos);
		Vent.add(Dolar);
		Vent.add(txtDolar);
		Vent.add(new JLabel());
		Vent.add(btnConvertir);
		
		//Vent.setBackground(Color.RED);
		
		JPanel Vent2 = new JPanel();
		Vent2.setLayout(new GridLayout(0,3));
		//Vent2.add(btnConvertir);
		
		 AccionBoton OyenteConvertir = new AccionBoton();
		 btnConvertir.addActionListener(OyenteConvertir);
		 
		// BorderLayout border= new BorderLayout();
	     // getContentPane().setLayout(border);
		 getContentPane().add(Vent);
		 //getContentPane().add(Vent2,BorderLayout.CENTER);
		
	}

	public static void main(String[] args)
	    {
	        Principal Ventana = new Principal("Convertidor");
	        Ventana.setSize(300,200);
			Ventana.setResizable(false);

	       // Ventana.setLocation(200,100);
	        Ventana.setBackground(Color.GREEN); 
	        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        Ventana.setVisible(true);
	    }
	
	 class AccionBoton implements ActionListener
	    {
	    	
	    	@Override
	    	public void actionPerformed(ActionEvent e)
	    	{
	    		
	    		if (((JButton)e.getSource()) == btnConvertir)
	            {
	    		double dolares=0.054;
	    		double conversor;
	    		double pesos =Double.parseDouble(txtPesos.getText());
	    		conversor=pesos*dolares;
	    		txtDolar.setText("$"+conversor);
	            }
	    	}
	    	
	    }
	 }
