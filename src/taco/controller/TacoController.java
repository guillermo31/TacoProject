package taco.controller;
import taco.model.Taco;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class TacoController
{
	//data members 
	private Taco asadaTaco;
	private Taco[] tacos = new Taco[5];
	private ImageIcon [] icons = new ImageIcon[5];
	
	public TacoController()
	{
		asadaTaco =  new Taco(); 
		
		//loop to add instances of taco object to tacos array
		for(int index = 0; index < tacos.length; index += 1)
		{
			tacos[index] = new Taco();
		}
		
		//loop to add images to icons array
		for(int index = 0; index < icons.length; index +=1)
		{
			icons[index] = new ImageIcon(getClass().getResource("/taco/view/images/taco1.jpg"));
		}
		
	}
	
	
	public void start()
	{
		JOptionPane.showMessageDialog(null, "This is an array of tacos!", "Arrays", JOptionPane.INFORMATION_MESSAGE, icons[3]);
		JOptionPane.showMessageDialog(null, icons);

	}
	
	
	
	
}
