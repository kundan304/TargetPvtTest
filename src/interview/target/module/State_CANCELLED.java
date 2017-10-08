package interview.target.module;

import interview.target.service.Context;


public class State_CANCELLED implements State{
	   public void doAction(Context context,String event) {
		      
		      context.setState(this);
		      System.out.println("Your order has been CANCELLED.");
		   }

		   public String toString(){
		      return "CANCELLED";
		   }
}
