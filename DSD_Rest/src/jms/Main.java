package jms;

import org.apache.activemq.broker.BrokerService;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		crearBroker();

	}
	
	
	static void crearBroker(){
		
		try {
		BrokerService broker = new BrokerService();
		
			broker.setUseJmx(true);
			broker.addConnector("tcp://localhost:61616");
			
			broker.start();
			System.out.println("Broker JMS Iniciado OK");
			while(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
