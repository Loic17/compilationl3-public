import sc.node.*;
import sc.analysis.*;
import sa.*;
import ts.*;

public class Sa2ts extends SaDepthFirstVisitor <Void>{
    public Ts table;
    public Ts current;

   

    public Sa2ts(SaNode root){
        this.table= new Ts();
	root.accept(this)
	

    }
 public Ts getTableGlobale(){
        return this.table;
    }

    public Void visit(SaDecFonc node)
    {
        this.current= new Ts();

        
        if(current.fonctions.containsKey(node.getNom())){
           
           System.out.println("error");
            System.exit(0);}
        if(node.getParametres()!=null){
            current.fonctions.put(node.getNom(),new TsItemFct(node.getNom(),node.getParametres().length() , current, node) );
            node.getParametres().accept(this);}
        current.fonctions.put(node.getNom(),new TsItemFct(node.getNom(),0 , table, node) );
        
        node.getCorps().accept(this);
        node.getVariable().accept(this);
        this.current=null;
        
        this.current=null;
        
        return null;
}
            
        
   public Void visit(SaDecVar node)
    {
            
        if(table.variables.containsKey(node.getNom())){
           System.out.println("error");
            System.exit(0);}
  	if(node.getNom()!=null){
            table.variables.put(node.getNom(),new TsItemVar(node.getNom(),node.getNom().length()));
			node.accept(this);}
	table.variables.put(node.getNom(), new TsItemVar(node.getNom(), 0));
	
        return null;
}
   public Void visit(SaDecTab node)
    {
            
        
    if(table.variables.containsKey(node.getNom())){
           System.out.println("error");
            System.exit(0);}
  	if(node.getTaille()!=0){
            table.variables.put(node.getNom(),new TsItemVar(node.getNom(),node.getTaille()));
			node.accept(this);}
	table.variables.put(node.getNom(), new TsItemVar(node.getNom(), 0));
        return null;
}
 
 public Void visit(SaAppel node)
    {
        this.current= new Ts();
        
        if(current.fonctions.containsKey(node.getNom())){
           System.out.println("error");
           System.exit(0);}
        if(node.getArguments()!=null)
            node.getArguments().accept(this);
        
        return null;
}
  public Void visit(SaVarSimple node)
    {
            
        
        if(table.variables.containsKey(node.getNom())){
           System.out.println("error");
            System.exit(0);}
 		if(node.getNom()!=null){
            table.variables.put(node.getNom(),new TsItemVar(node.getNom(),node.getNom().length()));
			node.accept(this);}
		table.variables.put(node.getNom(), new TsItemVar(node.getNom(), 0));
        return null;
 
}
public Void visit(SaVarIndicee node)
    {
            
        
        if(table.variables.containsKey(node.getNom())){
           System.out.println("error");
            System.exit(0);}
  	if(node.getIndice()!=null){
  	         node.getIndice().accept(this);}
	table.variables.put(node.getNom(), new TsItemVar(node.getNom(), 0));
        return null;
}


}
