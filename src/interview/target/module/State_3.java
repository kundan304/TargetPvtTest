package interview.target.module;

import interview.target.service.Context;



public class State_3 implements State{
	   public void doAction(Context context,String event) {
		   
		   boolean isValidEvent=false;
		      if (event!=null){
		    	  if(event.equals("1R")){
		    		  context.setState(new State_4());	
		    		  isValidEvent=true;
		    	  }else if(event.equals("CANCEL")){
		    		  context.setState(new State_CANCELLED());	
		    		  isValidEvent=true;
		    	  }
		      }
		      
		      if(!isValidEvent){
		    	  System.err.println("Invalid Input.you are in "+context.getState()+"\t, Valid Input at this state is:1R,CANCEL");
		      }else{
		    	  System.out.println("your status has been chnaged from 3S to "+context.getState());
		      }
		   }

		   public String toString(){
		      return "3S";
		   }
}
