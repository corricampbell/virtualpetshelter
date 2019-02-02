
public abstract class VirtualPet {
	
	private String name;
	private int hunger, thirst, boredom;
	
	protected VirtualPet(String name, int hunger, int thirst, int boredom) {}
	
	public abstract void printStatus();
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHunger() {
		return hunger;
	}


	public void setHunger(int hunger) {
		this.hunger = hunger;
	}


	public int getThirst() {
		return thirst;
	}


	public void setThirst(int thirst) {
		this.thirst = thirst;
	}


	public int getBoredom() {
		return boredom;
	}


	public void setBoredom(int boredom) {
		this.boredom = boredom;
	}


}
