package classesandInterface;

interface parent {
	public void sample();

}

interface grandparent {
	public void grandparentsample();
}

interface child extends grandparent, parent {
	public void childmethod();

}

public class InterfacePolymorphism implements child {

	@Override
	public void grandparentsample() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sample() {
		// TODO Auto-generated method stub

	}

	@Override
	public void childmethod() {
		// TODO Auto-generated method stub

	}

}
