package Controller;

import model.Flamingo; //import section

import java.util.ArrayList;

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
	 * This is where the program starts calling methods to the program
	 */
	public void start()
	{
		
	}
	/**
	 * This is where the program starts calling methods to run the program
	 */
	public void question()
	{
		
	}
	/**
	 * This is where the program starts calling questions
	 */
	private void askUser()
	{
		Flamingo userFlamingo = new Flamingo();
		
		//define a variable before the loop
		boolean isFinished = false;
		int someCount = 9;
		
		//test code
		//while (!isFinished)
		//{
			//do code
			//JOptionPane.showMessageDialog(null, " ");
		
			//someCount++;
			//someCount +=1;
			
			//update the test variable
			//if(someCount > 10)
			//{
				//isFinished = true;
			//}
	//}
		
		String response = JOptionPane.showInputDialog(null,"How many legs does your Flamingo have? ");
		while (response == null || !validDouble(response) || response.equals(""))
		{
			response = JOptionPane.showInputDialog(null, "Type is a valid number.");
		}
		userFlamingo.setLegCount(Double.parseDouble(response));
//		for (int index = 0; index < 10; index++)
//		{
//			JOptionPane.showMessageDialog(null, "This is execution number" + index);
//			
//		}	
		
		response = JOptionPane.showInputDialog(null, "What is the Flamingos name?");
		
		if (response.equalsIgnoreCase(""))
		{
			JOptionPane.showMessageDialog(null, "You typed nothing...");
		}
		
		JOptionPane.showMessageDialog(null, userFlamingo);
		
		
		
		String response2 = JOptionPane.showInputDialog(null," ");
		while (!validDouble(response2))
		{
			response2 = JOptionPane.showInputDialog(null, " ");
		}
		
		for (int index = 0; index < 10; index++)
		{
			JOptionPane.showMessageDialog(null, "This is execution number" + index);
			
		}
		
			
		myFlamingo.howTall(Double.parseDouble(response2));
		
	}
	/**
	 * This is where the program starts flamingoBuild
	 */
	public void flamingoBuild()
	{
		//local variable are only visible in the method they are defined in
		//they only have scope to that method
		
		ArrayList<Flamingo> myFlamingo = new ArrayList<Flamingo>();
		
		Flamingo sampleFlamingo = new Flamingo();
		Flamingo otherFlamingo = new Flamingo();
		
		myFlamingo.add(sampleFlamingo);
		myFlamingo.add(sampleFlamingo);
		myFlamingo.add(otherFlamingo);
		
		//standard forward loop
		//if used to remove you have to change index -= 1
		//remove we go backwards
		for (int index = 0; index < myFlamingo.size(); index += 1)
		{
			//good for display or minor changes
			JOptionPane.showMessageDialog(null,  myFlamingo.get(index).getName());
			
			//good for remove, replace, change multiple values 
			Flamingo currentFlamingo = myFlamingo.get(index);
			currentFlamingo.setName("The Flamingos name is " + index + ". ");
			
		}
		//standard backward loop
		//almost always best- save time & logic
		//don't have to worry about order
		//great for removing
		for (int index = myFlamingo.size() - 1; index >= 0; index -= 1)
		{
			JOptionPane.showMessageDialog(null, myFlamingo.get(index).getName());
		}
		//cannot remove or replace
		for (Flamingo current : myFlamingo)
		{
			JOptionPane.showMessageDialog(null, "The Flamingo is named: " + current.getName());
		}
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
