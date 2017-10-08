package interview.target.service;

import interview.target.module.State;

public class Machine {
	Context ctx;
	public Machine(Context ctx){
		this.ctx=ctx;
	}
 public String getStateAfterThisEvent(String event){
		State st=ctx.getState();
		st.doAction(ctx, event);
		st=ctx.getState();
		System.out.println("<"+st);
		return st.toString();
 }
}
