package Controller;

import model.Flamingo; //import section
import javax.swing.JOptionPane;

public class controller
{
	/**
	 * Builds the instance of the controller
	 */
	private Flamingo myFlamingo;
	private Flamingo userFlamingo;
	//private Scanner inputScanner;
	 
	public controller()
	{
		myFlamingo = new Flamingo();
		userFlamingo = new Flamingo();
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
		int someCount = 9;
		
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
		
		for (int index = 0; index < 10; index++)
		{
			JOptionPane.showMessageDialog(null, "This is execution number" + index);
			
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
			JOptionPane.showMessageDialog(null, " ");
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
			JOptionPane.showMessageDialog(null,  " ");
		}
		
		return isValid;
	}
}
