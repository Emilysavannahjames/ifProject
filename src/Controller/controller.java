package Controller;

import model.model; //import section
import javax.swing.JOptionPane;

public class controller
{
	/**
	 * Builds the instance of the controller
	 */
	private model myCrossCountry;
	private model userCrossCountry;
	//private Scanner inputScanner;
	
	public controller()
	{
		myCrossCountry = new model("5k", 12, 1, 1.0);
		userCrossCountry = new model();
		//inputScanner = new Scanner(System.in);
	}
	/**
	 * This is where the program starts calling methods to run the program
	 */
	public void start()
	{
		JOptionPane.showMessageDialog(null,  myCrossCountry);
		System.out.println(myCrossCountry);
		
		JOptionPane.showInputDialog(null, )
	}
}
