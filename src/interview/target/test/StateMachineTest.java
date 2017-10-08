package interview.target.test;

import static org.junit.Assert.*;

import interview.target.service.Context;
import interview.target.service.Machine;

import org.junit.Test;

public class StateMachineTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Context con=new Context();
		Machine mc=new Machine(con);
	//	{"event","stateAfterEvent"}
		String testCase1[][]={{"1R","1S"},{"1R","2S"},{"1R","3S"},{"1R","4S"},{"BUY","COMPLETED"}};
		//String testCase2[][]={{"2R","2S"},{"1R","3S"},{"CANCEL","CANCELLED"}};
		//String testCase3[][]={{"2R","2S"},{"1R","3S"},{"2R","3S"},{"1R","4S"},{"BUY","COMPLETED"}};
		//String testCase4[][]={{"2R","2S"},{"1R","3S"},{"2R","3S"},{"1R","4S"},{"CANCEL","CANCELLED"}};
        
        for(String ss[]:testCase1){
        	String st=mc.getStateAfterThisEvent(ss[0]);
        	assertEquals(ss[1],st);
        }
		
		
	}

}
