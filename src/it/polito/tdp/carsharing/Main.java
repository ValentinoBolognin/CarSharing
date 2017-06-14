package it.polito.tdp.carsharing;

import it.polito.tdp.carsharing.model.Simulator;

public class Main {

	public static void main(String args[]) {

		Simulator sim = new Simulator(15) ;
		sim.setTRAVEL_MAX_NUM(5);
		
		for (int time = 8*60; time<=17*60 ; time = time + 8) {
			sim.addCliente(time);
		}
		
		sim.run();
		
		System.out.format("Clienti totali arrivati: %d\n", sim.getClientiTot());
		System.out.format("Clienti insoddisfatti  : %d\n", sim.getClientiInsoddisfatti());
	}

}
