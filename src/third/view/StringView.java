package third.view;

import javax.swing.JOptionPane;
/**
 * View object for the string project
 * @author itho1735
 *
 */
public class StringView
	{
		
		private String currentValue;
		private String response;

		/**
		 *Shows the Runtime Error when a non-integer is typed into the JOptionPane input field.
		 */
		public void displayError()

			{
				int test;
				String temp;
				
				JOptionPane.showMessageDialog(null, "let's watch the program crash");
				temp = JOptionPane.showInputDialog("type your favorite number");
				test = Integer.parseInt(temp);
				JOptionPane.showMessageDialog(null, "your favorite number is: " + test);
			}
		
		public String getResponse()
			{
				//must have a value assigned to a variable in a method, or you cannot use it and will cause an error.
				String response= null;
				JOptionPane.showMessageDialog(null,  "say something fun");
				response = JOptionPane.showInputDialog("say the funny thing now");
				return response;
			}
		
		
		public void showPassedValue(String currentValue)
			{
					JOptionPane.showMessageDialog(null, currentValue + " is supposed to be funny...");
			}

		public void moreInteractive(String first, String second)
			{
					JOptionPane.showMessageDialog(null, "Hey " + first + "\n" + "says: " + "\n" + second);
			}
		public void testStringMethods()
			{
				testSubString(13);
				testConcat("califragilisticexpealidocious");
				testReplace("bub" ,"blarf");
				testEndsWith("ing");
			}
		
		public void replace(char oldChar, char newChar)
			{
				JOptionPane.showMessageDialog(null, "flarf in your fedroom".replace('f', 'b'));
				JOptionPane.showMessageDialog(null, "The arf of war!".replace('f', 't'));
				JOptionPane.showMessageDialog(null,"Beetlewuice!".replace('w','j'));
				JOptionPane.showMessageDialog(null,  "Baberuth!".replace('r', 'w'));
			}
		
		private void testSubString(int startPosition)
			{
				String testString = "supercallifragilisticexpialidocious";
				JOptionPane.showMessageDialog(null, "The substring method test!");
				JOptionPane.showMessageDialog(null, " We are going to go from the " +  startPosition + "th letter in the test string.");
				JOptionPane.showMessageDialog(null, "The test string is: " + "\n" + testString);
				JOptionPane.showMessageDialog(null, "The testString.subtring(startPosition) call gives us: " + "\n" + testString.substring(startPosition));
			
			}
		
		private void testConcat(String addedString)
			{
				String testConcat = "bubhoolian";
				JOptionPane.showMessageDialog(null,  "The concat method test!");
				JOptionPane.showMessageDialog(null, "We are going to add  " + addedString + " in the concat method.");
				JOptionPane.showMessageDialog(null, "The concat method is: " + "\n" +testConcat);
				JOptionPane.showMessageDialog(null,  "The testConcat.concat(addedString) call gives us: " + "\n" + testConcat.concat(addedString)); 
			}
		
		private void testReplace(CharSequence target, CharSequence replacement)
			{
				String testReplace = "bubhooligan";
				JOptionPane.showMessageDialog(null,  "The replace method test!");
				JOptionPane.showMessageDialog(null, "We are going to replace " + target + " with " + replacement + " in the replace method." );
				JOptionPane.showMessageDialog(null, "The replace method is:  " + "\n" + testReplace);
				JOptionPane.showMessageDialog(null,  "the testReplace.replace(oldPhrase, newPhrase) call gives us: " + "\n" + testReplace.replace(target, replacement));
			}
		
		private void testEndsWith(String suffix)
			{
				String testEndsWith = "Juggling";
				JOptionPane.showMessageDialog(null, "The endsWith method test!");
				JOptionPane.showMessageDialog(null,  "We are going to check to see if : " + suffix + " is true.");
				JOptionPane.showMessageDialog(null, "The ends with method is: " + "\n" + testEndsWith);
				JOptionPane.showMessageDialog(null, "The testEndsWith.endsWith(suffix) call gives us: " + "\n" + testEndsWith.endsWith(suffix));
			}
	}
