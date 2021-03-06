package structure.proxy.gumball.state;

import structure.proxy.gumball.RemoteGumballMachine;
import structure.proxy.gumball.inf.IState;

public class NoQuarter implements IState
{

	/**
	 * 这里最好要加上序列化ID,会抛出InvalidClassException
	 * http://stackoverflow.com/questions/7173352/java-io-invalidclassexception
	 */
	private static final long serialVersionUID = 2383247520489250193L;
	
	private transient RemoteGumballMachine machine;

	public NoQuarter(RemoteGumballMachine mach)
	{
		this.machine = mach;
	}

	@Override
	public void insertQuarter()
	{
		System.out.println("You have insert a quarter!");
		machine.setState(machine.getHasQuarter());
	}

	@Override
	public void ejectQuarter()
	{
		System.out.println("No quarter, this operation is forbidden!");

	}

	@Override
	public void turnCrank()
	{
		System.out.println("No quarter, this operation is forbidden!");

	}

	@Override
	public void dispense()
	{
		System.out.println("No quarter, this operation is forbidden!");

	}

}
