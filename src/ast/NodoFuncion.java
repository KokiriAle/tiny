package ast;

public class NodoFuncion extends NodoBase {
	private NodoBase part1;
	private NodoBase part2;
	private NodoType part3;
	private String var;
	
	public NodoFuncion (){
		super();
		this.part1 =null;
		this.part2 = null;
	}
	
	public NodoFuncion (String var,String part3,NodoBase part1, NodoBase part2){
		super();
		this.part1= part1;
		this.part2= part2;		
		this.var=var;
		this.part3= new NodoType (part3);
		
	}
	
	public NodoFuncion (NodoBase part2){
		super();
		this.part1= null;
		this.part2= part2;		
	}
	
	public NodoBase getpart1(){
		return part1;
	}
	public NodoBase getpart2(){		
		return part2;
	}
	
	
	
}