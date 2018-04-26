package toateAdreseleIpAleUnuiCalculator;

import java.net.InetAddress;

public class ToateAdreseleIpAleUnuiCalculator {

	 public static void main(String[] args) throws Exception 
	 {
		 InetAddress myInetAddress=InetAddress.getLocalHost();
		 InetAddress[] addr = InetAddress.getAllByName(myInetAddress.getHostName());
		    for (int i = 0; i < addr.length; i++)
		      System.out.println(addr[i]);
		  }

}
