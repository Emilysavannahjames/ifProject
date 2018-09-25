package Controller;

import model.model; //import section
import javax.swing.JOptionPane;

public class controller
{
	/**
	 * Builds the instance of the controller
	 */
	private model myFlamingo;
	private model userFlamingo;
	//private Scanner inputScanner;
	 
	public controller()
	{
		myFlamingo = new model();
		userFlamingo = new model();
		//inputScanner = new Scanner(System.in);
	}
	/**
	 * This is where the program starts calling methods to run the program
	 */
	public void start()
	{
		JOptionPane.showMessageDialog(null, "jjjj");
		
	}
	private void loopy()
	{
		//define a variable before the loop
		boolean isFinished = false;
		int someCount = 0;
		//test code
		while (!isFinished)
		{
			//do code
			JOptionPane.showMessageDialog(null,  "annoy");
		
			someCount++;
			someCount +=1;
			
			//update the test variable
			if(someCount > 10)
			{
				isFinished = true;
			}
		}
		
		String response = JOptionPane.showInputDialog(null,"How ");
		while (!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "");
		}
		myFlamingo.howTall(Double.parseDouble(response));
	}
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to typ in a whole number! ");
		}
		
		return isValid;
	}
	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null,  "Type in ta decimal value AKA a number with a . int the middle.");
		}
		
		return isValid;
	}
}
