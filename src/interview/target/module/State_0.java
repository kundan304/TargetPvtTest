package interview.target.module;

import interview.target.service.Context;




public class State_0 implements State{
	   
	   public void doAction(Context context,String event) {
		   
		      boolean isValidEvent=false;
		      if (event!=null){
		    	  if(event.equals("1R")){
		    		  context.setState(new State_1());
		    		  isValidEvent=true;
		    	  }else if(event.equals("2R")){
		    		  context.setState(new State_2());	
		    		  isValidEvent=true;
		    	  }else if(event.equals("CANCEL")){
		    		  context.setState(new State_CANCELLED());	
		    		  isValidEvent=true;
		    	  }
		      }else{
		    	  context.setState(this);
		      }
		      
		      if(!isValidEvent){
		    	  System.err.println("Invalid Input.you are in "+context.getState()+"\t, Valid Input at this state is:1R,2R,CANCEL");
		      }else{
		    	  System.out.println("your status has been chnaged from 0S to "+context.getState());
		      }
		      
		   }

		   public String toString(){
		      return "0S";
		   }
}
