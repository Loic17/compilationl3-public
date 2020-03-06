import sc.node.*;
import sc.analysis.*;
import sa.*;
import ts.*;

public class Sa2ts extends SaDepthFirstVisitor <Void>{
    public Ts table;

    public Sa2ts(SaProg node){
        

    }

    public Void visit(SaDecFonc node)
    {
        Ts ts= new Ts();
        
        if(ts.fonctions.containsKey(node.getNom())){
           System.out.println("error");
            System.exit(0);}
        if(node.getParametres()!=null)
            ts.fonctions.put(node.getNom(),new TsItemFct(node.getNom(),node.getParametres().length() , ts, node) );
        ts.fonctions.put(node.getNom(),new TsItemFct(node.getNom(),0 , ts, node) );
return null;
}
            
        
 /*  public Void visit(SaDecVar node)
    {
            //ici pas besoin de nouvelle table , comprendre table locale table globale
        
        if(table.variables.containsKey(node.getNom()))
           System.out.println("error");
            System.exit(0);
  	if(node.getNom()!=null)
            table.variables.put(node.getNom(),new TsItemVar(node.getNom(),node.getNom().length()));
	table.variables.put(node.getNom(), new TsItemVar(node.getNom(), 0));
        return null;
}
   public Void visit(SaDecTab node)
    {
            
        
        if(table.variables.containsKey(node.getNom()))
           System.out.println("error");
            System.exit(0);
  	if(node.getTaille()!=null)
            table.variables.put(node.getNom(),new TsItemVar(node.getNom(),node.getTaille().length()));
	table.variables.put(node.getNom(), new TsItemVar(node.getNom(), 0));
        return null;
}
 /*
 public Void visit(SaAppel node)
    {
        Ts ts= new Ts();
        
        if(ts.fonctions.containsKey(node.getNom())){
           System.out.println("error");
            System.exit(0);}
        if(node.getArguments()!=null)
            ts.fonctions.put(node.getNom(),new TsItemFct(node.getNom(),node.getArguments().length(), ts, node ));
        ts.fonctions.put(node.getNom(),new TsItemFct(node.getNom(),0 , ts, node) );
return null;
}*/

/*   public Void visit(SaVarSimple node)
    {
            
        
        if(table.variables.containsKey(node.getNom()))
           System.out.println("error");
            System.exit(0);
  	if(node.getNom()!=null)
            table.variables.put(node.getNom(),new TsItemVar(node.getNom(),node.getNom().length()));
	table.variables.put(node.getNom(), new TsItemVar(node.getNom(), 0));
        return null;
}
 public Void visit(SaVarIndicee node)
    {
            
        
        if(table.variables.containsKey(node.getNom()))
           System.out.println("error");
            System.exit(0);
  	if(node.getIndice()!=null)
            table.variables.put(node.getNom(),new TsItemVar(node.getNom(),node.getIndice().length()));
	table.variables.put(node.getNom(), new TsItemVar(node.getNom(), 0));
        return null;
}*/

}
