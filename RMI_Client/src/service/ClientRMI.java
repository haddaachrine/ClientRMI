package service;

import java.net.MalformedURLException;
import java.rmi.Naming;


public class ClientRMI {

	public static void main(String[] args) {
     try {
		IBanqueRemot stub=(IBanqueRemot) Naming.lookup("rmi://localhost:1423/BK");
		System.out.println(stub.som(12,2)); 
		 System.out.println(stub.getServerDate());
	}  catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}