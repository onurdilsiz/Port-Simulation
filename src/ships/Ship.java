
//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

package ships;

import java.util.ArrayList;

import containers.Container;
import interfaces.IShip;
import ports.Port;

public class Ship implements IShip {
	
	int ID;
	double fuel;
	Port currentPort;
	public Ship(int ID, Port p, int totalWeightCapacity, int
			maxNumberOfAllContainers, int maxNumberOfHeavyContainers, int
			maxNumberOfRefrigeratedContainers, int
			maxNumberOfLiquidContainers, double fuelConsumptionPerKM) {
		
	}
	
//	ArrayList<Container> getCurrentContainers(){
//		return ;
//	}
	@Override
	public boolean sailTo(Port p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reFuel(double newFuel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean load(Container cont) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unLoad(Container cont) {
		// TODO Auto-generated method stub
		return false;
	}
	
}



//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE

