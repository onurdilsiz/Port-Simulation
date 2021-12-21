
//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

package containers;

abstract public class Container {
	int ID;
	int weight;
	public Container(int iD, int weight) {
		ID = iD;
		this.weight = weight;
	}
	
	public double consumption() {
		return 1;
	}
	
	boolean equals(Container other) {
		return (this.ID==other.ID &&this.weight==other.weight );
	}
	
	
	
}



//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE

