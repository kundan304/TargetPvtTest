package interview.target;

import java.util.Scanner;





import interview.target.module.State;
import interview.target.service.Context;
import interview.target.service.Machine;

public class StartMachine {
public static void main(String[] args) {
	System.out.println("List Of Possible Event is : 1R,2R,CANCEL,BUY");
	StartMachine sc=new StartMachine();
	sc.start();
}

void start(){
	Context con=new Context();
	Machine mc=new Machine(con);
	Scanner sc=new Scanner(System.in);
	String st=null;
	do{
		System.out.print(">");
		String event=sc.nextLine();
		st=mc.getStateAfterThisEvent(event);
	}while(!((st.equals("CANCELLED") || st.equals("COMPLETED"))));
}
}
