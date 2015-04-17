package ast;

public class NodoDecla extends NodoBase {
	private NodoBase part1;
	private NodoType part3;
	private String var;
	
	public NodoDecla (){
		super();
		this.part1 =null;
		this.part3 = null;
	}
	
	public NodoDecla (String part3,NodoBase a){
		super();
		this.part1= a;
		this.part3= new NodoType (part3);
		
	}
	
	public NodoDecla (NodoType part2){
		super();
		this.part1= null;
		this.part3= part2;		
	}
	
	public NodoBase getpart1(){
		return part1;
	}
	public NodoBase getpart3(){		
		return part3;
	}
	
	
	
}