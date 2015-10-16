import java.awt.EventQueue;

/*
 * @author Ajay Krishna Teja Kavuri
 * @website http://pseudoaj.com
 * This program coordinates with all the classes and ensures the flow
 * The main purpose of this program is to solve a classic collision detection problem
 * Input: (X,Y,Z) and height, width of the rectangle
 * Output: Overlap area between them
 * Estimated Time:1.30hrs-2hrs from 9.12 PM to 10.42 PM/11.12 PM
 * Measured Time: 3.15 hrs from 9.12 PM - 11PM and 1.30 am to 2.57AM
 * Why differed: Added GUI which took some time, basic bug fixes, unexpected interuption which costed in time to refocus
 * How to Imporve: Achieve basic functionality than commiting for more, bug fixes through quick searching and completing module in one go.
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * This is the flow of the actions:
		 * 1. Call for taking input(GUI)
		 * 2. Pass the parameters for other classes to use
		 * 3. Perform the actual area calculation logic
		 * 4. Return the final solution(GUI)
		 */
		
		//-------------------------------------------------------------------
		//Task 1 called
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUITakeInput frame = new GUITakeInput();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		System.out.println("Working");
	}

}
