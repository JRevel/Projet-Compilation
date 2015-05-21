package fr.telecom.compil.asm;


public class BooleanOpHandler extends OpHandler
{
	private String jumpAdress;
	public BooleanOpHandler(String opName) {
		super(opName);
	}
	
	public void setJumpAdress(String jumpAdress)
	{
		this.jumpAdress = jumpAdress;
	}
	
	@Override
	public String genOpAction()
	{
		return "cmp r2, r1\n"
				+ opName + " 2\n"
				+ "jea @" + jumpAdress + "\n";
	}

}
