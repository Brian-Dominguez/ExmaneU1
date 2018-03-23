import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
//Brian Alexis Dominguez Balam
public class Principal extends JFrame
{
    private JComboBox Moneda;
    private JComboBox Cambio;
	private JTextField txtMoneda;
	private JTextField txtCambio;
	private JButton btnConvertir;
	
	 public Principal(String Titulo) 
	 {
		 setTitle(Titulo);
		String[] TipoMoneda={"Pesos","Dolares","Euros"};
		Moneda = new JComboBox(TipoMoneda);
		txtMoneda = new JTextField(" 0");
		Cambio = new JComboBox(TipoMoneda);
		txtCambio = new JTextField("$ 0");
		btnConvertir = new JButton("Convertir");
		
		JPanel Vent = new JPanel();
		TitledBorder VentBor = BorderFactory.createTitledBorder("Cambio de Moneda");
		VentBor.setTitleColor(Color.BLUE);
		Vent.setBorder(VentBor);
		Vent.setLayout(new GridLayout(0,4));
		Vent.add(Moneda);
		Vent.add(txtMoneda);
		Vent.add(Cambio);
		Vent.add(txtCambio);
		
		
		JPanel Vent2 = new JPanel();
		TitledBorder VentBor2 = BorderFactory.createTitledBorder("");
		VentBor2.setTitleColor(Color.BLUE);
		Vent2.setBorder(VentBor2);
		JLabel picture = new JLabel(new ImageIcon("src/ImagenMoneda.jpg"));
		Vent2.add(picture);
		
		JPanel Vent3 = new JPanel();
		TitledBorder VentBor3 = BorderFactory.createTitledBorder("Convertidor");
		VentBor3.setTitleColor(Color.BLUE);
		Vent3.setBorder(VentBor3);
		Vent3.setLayout(new GridLayout(0,3));
		Vent3.add(new JLabel());
		Vent3.add(btnConvertir);
		Vent3.add(new JLabel());
		
		AccionBoton OyenteConvertir = new AccionBoton();
		btnConvertir.addActionListener(OyenteConvertir);
		 
		BorderLayout border= new BorderLayout();
	    getContentPane().setLayout(border);
	    getContentPane().add(Vent2,BorderLayout.NORTH);
		getContentPane().add(Vent,BorderLayout.CENTER);
		getContentPane().add(Vent3,BorderLayout.SOUTH);
		
	}

	public static void main(String[] args)
	    {
	        Principal Ventana = new Principal("Cambios de Monedas ");
	        Ventana.setSize(380,280);
			Ventana.setResizable(false);
	        Ventana.setVisible(true);
	        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	
	 class AccionBoton implements ActionListener
	    {
	    	@Override
	    	public void actionPerformed(ActionEvent e)
	    	{
	    		if (((JButton)e.getSource()) == btnConvertir)
	            {
	    		 double Pdolar = 0.054;
	    		 double Peuro = 0.04;
	    		 double Dpeso = 18.6671;
	    		 double Deuro = 0.8107;
	    		 double Epeso = 23.0253;
	    		 double Edolar = 1.2334;
	    		 double conversor;
	    		
	    		//Cambio de pesos a los 3 tipos de cambio
	    			if (Moneda.getSelectedItem() == "Pesos" && Cambio.getSelectedItem() == "Dolares")
	    			{
	    		     double pesos =Double.parseDouble(txtMoneda.getText());
	    		     conversor=pesos*Pdolar;
	    		     txtCambio.setText("$"+conversor);
	                 }
	    			
	    			if (Moneda.getSelectedItem() == "Pesos" && Cambio.getSelectedItem() == "Euros")
	    			{
	    		     double pesos =Double.parseDouble(txtMoneda.getText());
	    		     conversor=pesos*Peuro;
	    		     txtCambio.setText("€"+conversor);
	                 }
	    			
	    			if (Moneda.getSelectedItem() == "Pesos" && Cambio.getSelectedItem() == "Pesos")
	    			{
	    		     double pesos =Double.parseDouble(txtMoneda.getText());
	    		     conversor=pesos;
	    		     txtCambio.setText("$"+conversor);
	                 }
	    			//Cambio de Dolar a los 3 tipos de cambio
	    			if (Moneda.getSelectedItem() == "Dolares" && Cambio.getSelectedItem() == "Pesos")
	    			{
	    		      double pesos =Double.parseDouble(txtMoneda.getText());
	    		      conversor=pesos*Dpeso;
	    		      txtCambio.setText("$"+conversor);
	                 }
	    			
	    			if (Moneda.getSelectedItem() == "Dolares" && Cambio.getSelectedItem() == "Euros")
	    			{
	    		     double pesos =Double.parseDouble(txtMoneda.getText());
	    		     conversor=pesos*Deuro;
	    		     txtCambio.setText("€"+conversor);
	                }
	    			
	    			if (Moneda.getSelectedItem() == "Dolares" && Cambio.getSelectedItem() == "Dolares")
	    			{
	    		     double pesos =Double.parseDouble(txtMoneda.getText());
	    		     conversor=pesos;
	    		     txtCambio.setText("$"+conversor);
	                 }
	    			//Cambio de Euros a los 3 tipos de cambio
	    			
	    			if (Moneda.getSelectedItem() == "Euros" && Cambio.getSelectedItem() == "Pesos")
	    			{
	    		      double pesos =Double.parseDouble(txtMoneda.getText());
	    		      conversor=pesos*Epeso;
	    		      txtCambio.setText("$"+conversor);
	                 }
	    			
	    			if (Moneda.getSelectedItem() == "Euros" && Cambio.getSelectedItem() == "Dolares")
	    			{
	    		      double pesos =Double.parseDouble(txtMoneda.getText());
	    		      conversor=pesos*Edolar;
	    		      txtCambio.setText("$"+conversor);
	                }
	    			
	    			if (Moneda.getSelectedItem() == "Euros" && Cambio.getSelectedItem() == "Euros")
	    			{
	    		      double pesos =Double.parseDouble(txtMoneda.getText());
	    		      conversor=pesos;
	    		      txtCambio.setText("€"+conversor);
	                }
	            }
	    	}
	    }
}
