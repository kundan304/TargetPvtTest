package interview.target.module;

import interview.target.service.Context;

public class State_Completed implements State{
	   public void doAction(Context context,String event) {
		      context.setState(this);	
		      System.out.println("This session has been completed.");
		   }

		   public String toString(){
		      return "COMPLETED";
		   }
}
