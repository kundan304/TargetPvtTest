package interview.target.module;

import interview.target.service.Context;


public interface State {
	   public void doAction(Context context,String event);
	}
