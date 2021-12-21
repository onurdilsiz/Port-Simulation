
//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

package ports;

import java.util.ArrayList;

import containers.Container;
import interfaces.IPort;
import ships.Ship;

public class Port implements IPort{
	
	int ID;
	double X;
	double Y;
	ArrayList<Container> containers;
	public Port(int iD, double x, double y) {
		super();
		ID = iD;
		X = x;
		Y = y;
	}

	ArrayList<Ship> history ;//: keeps track of every ship that has visited
	
	ArrayList<Ship> current;// : keeps track of the ships currently here
	
	
	public double getDistance(Port other) {
		return 1;
	}
	@Override
	public void incomingShip(Ship s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void outgoingShip(Ship s) {
		// TODO Auto-generated method stub
		
	}
	
}



//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE

