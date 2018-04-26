package adresaIp;

import java.net.InetAddress;

public class TestAdresaIPSiNumeleStatieCurenta {
	public static void main(String[] args) {

		InetAddress inetAddress;
		try {
			inetAddress = InetAddress.getLocalHost();
			String name = inetAddress.getHostName();
			String ip = inetAddress.getHostAddress();
			System.out.println(name+ " and the Ip is: "+ ip);

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		

	}

}
