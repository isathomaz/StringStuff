package third.controller;

import third.view.StringView;

/**
 * String Controller for the third project dealing with string in Java.
 * @author itho1735
 *
 */
public class StringController
	{
		//Declaration Section
		//All needed models and view objects
		private StringView myView;
		
		/**
		 * Creates a StringController object initializing all values.
		 */
		public StringController()
			{
				myView = new StringView();
			}
	
		/**
		 * starts the view by using the displayError method from StringView.
		 */
		public void start()
			{
//				myView.displayError();
//				String myResponse = myView.getResponse();
//				myView.showPassedValue(myResponse);
//				
//				myView.moreInteractive("Belra", myResponse);
				myView.testStringMethods();
				myView.replace('a','q');
			}
		
	}
