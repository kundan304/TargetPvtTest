package interview.target.service;

import interview.target.module.State;
import interview.target.module.State_0;



public class Context {
	   
	   private State state;

	   public Context(){
	      state = new State_0();
	   }

	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
	}