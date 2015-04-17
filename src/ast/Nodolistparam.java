package ast;

public class Nodolistparam extends NodoBase {
	private NodoIdentificador part1;
	private NodoType part3;
	private String var;
	
	public Nodolistparam (){
		super();
		this.part1 =null;
		this.part3 = null;
	}
	
	public Nodolistparam (String part3,String a){
		super();
		this.part1= new NodoIdentificador(a.toString());
		this.part3= new NodoType (part3);
		
	}
	
	public Nodolistparam (NodoType part2){
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