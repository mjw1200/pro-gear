package helix;

import org.apache.axis2.AxisFault;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			OSCClient cli = new OSCClient();
			String res = cli.runReport(176);
			System.out.println("result:"+res);
			
			
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
