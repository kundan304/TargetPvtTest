package interview.target.module;

import interview.target.service.Context;





public class State_4 implements State{
	   public void doAction(Context context,String event) {
		   		boolean isValidEvent=false;
		      if (event!=null){
		    	  if(event.equals("BUY")){
		    		  context.setState(new State_Completed());	
		    		  isValidEvent=true;
		    	  }else if(event.equals("CANCEL")){
		    		  context.setState(new State_CANCELLED());	
		    		  isValidEvent=true;
		    	  }
		      }
		      
		      if(!isValidEvent){
		    	  System.err.println("Invalid Input.you are in "+context.getState()+"\t, Valid Input at this state is:CANCEL,BUY");
		      }else{
		    	  System.out.println("your status has been chnaged from 4S to "+context.getState());
		      }
		   }

		   public String toString(){
		      return "4S";
		   }
}
