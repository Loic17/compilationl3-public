import sc.node.*;
import sc.analysis.*;
import sa.*;

public class Sc2sa extends DepthFirstAdapter {

    private SaNode returnValue;
    int depth = 0;


    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
	//for (int i = 0; i < depth; i++)
	//	System.out.print("  ");
	//depth++;
	//System.out.println("In" + node.getClass().getSimpleName());
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
	//depth--;
	//for (int i = 0; i < depth; i++)
	//	System.out.print("  ");
	//System.out.println("Out" + node.getClass().getSimpleName());
        // Do nothing
    }



    public SaNode getRoot()
    {
        return this.returnValue;
    }


    @Override
    public void caseADecvarldecfoncProgramme(ADecvarldecfoncProgramme node)
    {
        SaLDec op1 =null;
        SaLDec op2 =null;
        inADecvarldecfoncProgramme(node);
        if(node.getOptdecvar() != null)
        {
            node.getOptdecvar().apply(this);
            op1 = ( SaLDec)this.returnValue;
        }
        if(node.getListedecfonc() != null)
        {
            node.getListedecfonc().apply(this);
            op2 = ( SaLDec)this.returnValue;
        }
        outADecvarldecfoncProgramme(node);
        this.returnValue =new SaProg(op1,op2);
    }

    public void inALdecfoncProgramme(ALdecfoncProgramme node)
    {
        defaultIn(node);
    }

    public void outALdecfoncProgramme(ALdecfoncProgramme node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALdecfoncProgramme(ALdecfoncProgramme node)
    {
        SaLDec op1 =null;
        SaLDec op2 =null;
        inALdecfoncProgramme(node);
        if(node.getListedecfonc() != null)
        {
            node.getListedecfonc().apply(this);
            op1 = ( SaLDec)this.returnValue;
        }

        outALdecfoncProgramme(node);
        this.returnValue =new SaProg(op1,op2);

    }

    public void inAOptdecvar(AOptdecvar node)
    {
        defaultIn(node);
    }

   
    @Override
    public void caseAOptdecvar(AOptdecvar node)
    {
        SaDec op1 =null;
        SaLDec op2 =null;
        inAOptdecvar(node);
        if(node.getListedecvar() != null)
        {
            node.getListedecvar().apply(this);

        }
        if(node.getPointVirgule() != null)
        {
            node.getPointVirgule().apply(this);
            op1 = ( SaDec)this.returnValue;
        }
        outAOptdecvar(node);
        this.returnValue =new SaLDec(op1,op2);
    }


    @Override
    public void caseADecvarldecvarListedecvar(ADecvarldecvarListedecvar node)
    {
        SaDec op1 =null;
        SaLDec op2 =null;
        inADecvarldecvarListedecvar(node);
        if(node.getDecvar() != null)
        {
            node.getDecvar().apply(this);
            op1 = ( SaDec)this.returnValue;
        }
        if(node.getListedecvarbis() != null)
        {
            node.getListedecvarbis().apply(this);
            op2 = ( SaLDec)this.returnValue;
        }
        outADecvarldecvarListedecvar(node);
        this.returnValue =new SaLDec(op1,op2);
    }

    public void inADecvarListedecvar(ADecvarListedecvar node)
    {
        defaultIn(node);
    }

    public void outADecvarListedecvar(ADecvarListedecvar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecvarListedecvar(ADecvarListedecvar node)
    {
        SaDec op1 =null;
        SaLDec op2 =null;
        inADecvarListedecvar(node);
        if(node.getDecvar() != null)
        {
            node.getDecvar().apply(this);
            op1 = ( SaDec)this.returnValue;
        }
        outADecvarListedecvar(node);
        this.returnValue =new SaLDec(op1,op2);
    }

    public void inADecvarldecvarListedecvarbis(ADecvarldecvarListedecvarbis node)
    {
        defaultIn(node);
    }

    public void outADecvarldecvarListedecvarbis(ADecvarldecvarListedecvarbis node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecvarldecvarListedecvarbis(ADecvarldecvarListedecvarbis node)
    {
        SaDec op1 =null;
        SaLDec op2 =null;
        inADecvarldecvarListedecvarbis(node);
        if(node.getVirgule() != null)
        {
            node.getVirgule().apply(this);

        }
        if(node.getDecvar() != null)
        {
            node.getDecvar().apply(this);
            op1 = ( SaDec)this.returnValue;
        }
        if(node.getListedecvarbis() != null)
        {
            node.getListedecvarbis().apply(this);
            op2 = ( SaLDec)this.returnValue;
        }
        outADecvarldecvarListedecvarbis(node);
        this.returnValue =new SaLDec(op1,op2);
    }

    public void inADecvarListedecvarbis(ADecvarListedecvarbis node)
    {
        defaultIn(node);
    }

    public void outADecvarListedecvarbis(ADecvarListedecvarbis node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecvarListedecvarbis(ADecvarListedecvarbis node)
    {
        SaDec op1 =null;
        SaLDec op2 =null;
        inADecvarListedecvarbis(node);
        if(node.getVirgule() != null)
        {
            node.getVirgule().apply(this);

        }
        if(node.getDecvar() != null)
        {
            node.getDecvar().apply(this);
            op1 = ( SaDec)this.returnValue;
        }
        outADecvarListedecvarbis(node);
        this.returnValue =new SaLDec(op1,op2);
    }

    public void inADecvarentierDecvar(ADecvarentierDecvar node)
    {
        defaultIn(node);
    }

    public void outADecvarentierDecvar(ADecvarentierDecvar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecvarentierDecvar(ADecvarentierDecvar node)
    {
        String op1 =null;
        SaLDec op2 =null;
        inADecvarentierDecvar(node);
        if(node.getEntier() != null)
        {
            node.getEntier().apply(this);
            op2 = ( SaLDec) this.returnValue;
        }
        if(node.getIdentif() != null)
        {
         
            op1 = ( String) node.getIdentif().getText();
        }
        outADecvarentierDecvar(node);
        this.returnValue =new SaDecVar(op1);

    }

    public void inADecvartableauDecvar(ADecvartableauDecvar node)
    {
        defaultIn(node);
    }

    public void outADecvartableauDecvar(ADecvartableauDecvar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecvartableauDecvar(ADecvartableauDecvar node)
    {
        int op1= Integer.parseInt(null);
        String op2=null;

        inADecvartableauDecvar(node);
        if(node.getEntier() != null)
        {
            node.getEntier().apply(this);
           // op1 = (int) this.returnValue;

        }
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
            op2 = ( String) node.getIdentif().getText();
        }
        if(node.getCrochetOuvrant() != null)
        {
            node.getCrochetOuvrant().apply(this);

        }
        if(node.getNombre() != null)
        {
            node.getNombre().apply(this);

        }
        if(node.getCrochetFermant() != null)
        {
            node.getCrochetFermant().apply(this);

        }
        outADecvartableauDecvar(node);
        this.returnValue =new SaDecTab(op2, op1);
    }

    public void inALdecfoncrecListedecfonc(ALdecfoncrecListedecfonc node)
    {
        defaultIn(node);
    }

    public void outALdecfoncrecListedecfonc(ALdecfoncrecListedecfonc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALdecfoncrecListedecfonc(ALdecfoncrecListedecfonc node)
    {
        SaDec op1=null;
        SaLDec op2=null;
        inALdecfoncrecListedecfonc(node);
        if(node.getDecfonc() != null)
        {
            node.getDecfonc().apply(this);
            op1 = ( SaDec) this.returnValue;
        }
        if(node.getListedecfonc() != null)
        {
            node.getListedecfonc().apply(this);
            op2 = ( SaLDec) this.returnValue;
        }
        outALdecfoncrecListedecfonc(node);
        this.returnValue =new SaLDec(op1, op2);

    }

    public void inALdecfoncfinalListedecfonc(ALdecfoncfinalListedecfonc node)
    {
        defaultIn(node);
    }

    public void outALdecfoncfinalListedecfonc(ALdecfoncfinalListedecfonc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALdecfoncfinalListedecfonc(ALdecfoncfinalListedecfonc node)
    {
        inALdecfoncfinalListedecfonc(node);
	this.returnValue = null;
        outALdecfoncfinalListedecfonc(node);
    }

    public void inADecvarinstrDecfonc(ADecvarinstrDecfonc node)
    {
        defaultIn(node);
    }

    public void outADecvarinstrDecfonc(ADecvarinstrDecfonc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecvarinstrDecfonc(ADecvarinstrDecfonc node)
    {
        String op1=null;
        SaLDec op2=null;
        SaLDec op3=null;
        SaInst op4=null;

        inADecvarinstrDecfonc(node);
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
            op1 = ( String) node.getIdentif().getText();;
        }
        if(node.getListeparam() != null)
        {
            node.getListeparam().apply(this);
            op2 = ( SaLDec) this.returnValue;
        }
        if(node.getOptdecvar() != null)
        {
            node.getOptdecvar().apply(this);
            op3 = ( SaLDec) this.returnValue;
        }
        if(node.getInstrbloc() != null)
        {
            node.getInstrbloc().apply(this);
            op4 = ( SaInst) this.returnValue;
        }
        outADecvarinstrDecfonc(node);
        this.returnValue =new SaDecFonc(op1, op2,op3,op4);
    }

    public void inAInstrDecfonc(AInstrDecfonc node)
    {
        defaultIn(node);
    }

    public void outAInstrDecfonc(AInstrDecfonc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstrDecfonc(AInstrDecfonc node)
    {
        String op1=null;
        SaLDec op2=null;
        SaLDec op3=null;
        SaInst op4=null;
        inAInstrDecfonc(node);
        if(node.getIdentif() != null)

        {

            node.getIdentif().apply(this);
            op1 = ( String) node.getIdentif().getText();
        }
        if(node.getListeparam() != null)
        {
            node.getListeparam().apply(this);
            op2 = ( SaLDec) this.returnValue;
        }
        if(node.getInstrbloc() != null)
        {
            node.getInstrbloc().apply(this);
            op4 = ( SaInst) this.returnValue;
        }
        outAInstrDecfonc(node);
        this.returnValue =new SaDecFonc(op1, op2,op3,op4);
    }

    public void inASansparamListeparam(ASansparamListeparam node)
    {
        defaultIn(node);
    }

    public void outASansparamListeparam(ASansparamListeparam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASansparamListeparam(ASansparamListeparam node)
    {
        
        SaLDec op2=null;
        inASansparamListeparam(node);
        if(node.getParentheseOuvrante() != null)
        {
            node.getParentheseOuvrante().apply(this);
            
        }
        if(node.getParentheseFermante() != null)
        {
            node.getParentheseFermante().apply(this);
           
        }
        outASansparamListeparam(node);
        this.returnValue=op2;
      
    }

    public void inAAvecparamListeparam(AAvecparamListeparam node)
    {
        defaultIn(node);
    }

    public void outAAvecparamListeparam(AAvecparamListeparam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvecparamListeparam(AAvecparamListeparam node)
    {

        inAAvecparamListeparam(node);
        if(node.getParentheseOuvrante() != null)
        {
            node.getParentheseOuvrante().apply(this);

        }
        if(node.getListedecvar() != null)
        {
            node.getListedecvar().apply(this);

        }
        if(node.getParentheseFermante() != null)
        {
            node.getParentheseFermante().apply(this);

        }
        outAAvecparamListeparam(node);


    }

    public void inAInstraffectInstr(AInstraffectInstr node)
    {
        defaultIn(node);
    }

    public void outAInstraffectInstr(AInstraffectInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstraffectInstr(AInstraffectInstr node)
    {
        SaVar op1=null;
        SaExp op2=null;
        inAInstraffectInstr(node);
        if(node.getInstraffect() != null)
        {
            node.getInstraffect().apply(this);
            op1 = (SaVar) this.returnValue;
        }
        outAInstraffectInstr(node);
        this.returnValue =new SaInstAffect(op1, op2);
    }

    public void inAInstrblocInstr(AInstrblocInstr node)
    {
        defaultIn(node);
    }

    public void outAInstrblocInstr(AInstrblocInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstrblocInstr(AInstrblocInstr node)
    {
        SaLInst op=null;
        inAInstrblocInstr(node);
        if(node.getInstrbloc() != null)
        {
            node.getInstrbloc().apply(this);
            op = (SaLInst) this.returnValue;
        }
        outAInstrblocInstr(node);
        this.returnValue =new SaInstBloc(op);
    }

    public void inAInstrsiInstr(AInstrsiInstr node)
    {
        defaultIn(node);
    }

    public void outAInstrsiInstr(AInstrsiInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstrsiInstr(AInstrsiInstr node)
    {
        SaInst op1=null;
        SaLInst op2=null;
        inAInstrsiInstr(node);
        if(node.getInstrsi() != null)
        {
            node.getInstrsi().apply(this);
            op1 = (SaInst) this.returnValue;
        }
        outAInstrsiInstr(node);
        this.returnValue =new SaLInst(op1,op2);
    }

    public void inAInstrtantqueInstr(AInstrtantqueInstr node)
    {
        defaultIn(node);
    }

    public void outAInstrtantqueInstr(AInstrtantqueInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstrtantqueInstr(AInstrtantqueInstr node)
    {
        SaExp op1=null;
        SaInst op2=null;
        inAInstrtantqueInstr(node);
        if(node.getInstrtantque() != null)
        {
            node.getInstrtantque().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        outAInstrtantqueInstr(node);
        this.returnValue =new SaInstTantQue(op1,op2);
    }

    public void inAInstrappelInstr(AInstrappelInstr node)
    {
        defaultIn(node);
    }

    public void outAInstrappelInstr(AInstrappelInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstrappelInstr(AInstrappelInstr node)
    {

        inAInstrappelInstr(node);
        if(node.getInstrappel() != null)
        {
            node.getInstrappel().apply(this);


        }
        outAInstrappelInstr(node);


    }

    public void inAInstrretourInstr(AInstrretourInstr node)
    {
        defaultIn(node);
    }

    public void outAInstrretourInstr(AInstrretourInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstrretourInstr(AInstrretourInstr node)
    {
        SaExp op1=null;

        inAInstrretourInstr(node);
        if(node.getInstrretour() != null)
        {
            node.getInstrretour().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        outAInstrretourInstr(node);
        this.returnValue =new SaInstRetour(op1);
    }

    public void inAInstrecritureInstr(AInstrecritureInstr node)
    {
        defaultIn(node);
    }

    public void outAInstrecritureInstr(AInstrecritureInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstrecritureInstr(AInstrecritureInstr node)
    {
        SaExp op1=null;
        inAInstrecritureInstr(node);
        if(node.getInstrecriture() != null)
        {
            node.getInstrecriture().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        outAInstrecritureInstr(node);
        this.returnValue =new SaInstEcriture(op1);
    }

    public void inAInstrvideInstr(AInstrvideInstr node)
    {
        defaultIn(node);
    }

    public void outAInstrvideInstr(AInstrvideInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstrvideInstr(AInstrvideInstr node)
    {

        inAInstrvideInstr(node);
        if(node.getInstrvide() != null)
        {
            node.getInstrvide().apply(this);

        }
        outAInstrvideInstr(node);
        this.returnValue =null;
    }

    public void inAInstraffect(AInstraffect node)
    {
        defaultIn(node);
    }

    public void outAInstraffect(AInstraffect node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstraffect(AInstraffect node)
    {
        SaVar op1=null;
        SaExp op2=null;
        inAInstraffect(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
            op1 = (SaVar) this.returnValue;
        }
        if(node.getEgal() != null)
        {
            node.getEgal().apply(this);
            op2 = (SaExp) this.returnValue;
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
            op2 = (SaExp) this.returnValue;
        }
        if(node.getPointVirgule() != null)
        {
            node.getPointVirgule().apply(this);
            op2 = (SaExp) this.returnValue;
        }
        outAInstraffect(node);
        this.returnValue =new SaInstAffect(op1,op2);
    }

    public void inAInstrbloc(AInstrbloc node)
    {
        defaultIn(node);
    }

    public void outAInstrbloc(AInstrbloc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstrbloc(AInstrbloc node)
    {
        SaLInst op1=null;
        inAInstrbloc(node);
        if(node.getAccoladeOuvrante() != null)
        {
            node.getAccoladeOuvrante().apply(this);
        }
        if(node.getListeinst() != null)
        {
            node.getListeinst().apply(this);
            op1 = (SaLInst) this.returnValue;
        }
        if(node.getAccoladeFermante() != null)
        {
            node.getAccoladeFermante().apply(this);
            this.returnValue =new SaInstBloc(op1);

        }
        outAInstrbloc(node);
    }

    public void inALinstrecListeinst(ALinstrecListeinst node)
    {
        defaultIn(node);
    }

    public void outALinstrecListeinst(ALinstrecListeinst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALinstrecListeinst(ALinstrecListeinst node)
    {
        SaInst op1=null;
        SaLInst op2=null;
        inALinstrecListeinst(node);
        if(node.getInstr() != null)
        {
            node.getInstr().apply(this);
            op1 = (SaInst) this.returnValue;
        }
        if(node.getListeinst() != null)
        {
            node.getListeinst().apply(this);
            op2 = (SaLInst) this.returnValue;
        }
        outALinstrecListeinst(node);
        this.returnValue =new SaLInst(op1,op2);
    }

    public void inALinstfinalListeinst(ALinstfinalListeinst node)
    {
        defaultIn(node);
    }

    public void outALinstfinalListeinst(ALinstfinalListeinst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALinstfinalListeinst(ALinstfinalListeinst node)
    {
        inALinstfinalListeinst(node);
	this.returnValue = null;
        outALinstfinalListeinst(node);
    }

    public void inAAvecsinonInstrsi(AAvecsinonInstrsi node)
    {
        defaultIn(node);
    }

    public void outAAvecsinonInstrsi(AAvecsinonInstrsi node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvecsinonInstrsi(AAvecsinonInstrsi node)
    {
        SaExp op1=null;
        SaInst op2=null;
        SaInst op3=null;
        inAAvecsinonInstrsi(node);
        if(node.getSi() != null)
        {
            node.getSi().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        if(node.getAlors() != null)
        {
            node.getAlors().apply(this);
            op2 = (SaInst) this.returnValue;
        }
        if(node.getInstrbloc() != null)
        {
            node.getInstrbloc().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        if(node.getInstrsinon() != null)
        {
            node.getInstrsinon().apply(this);
            op3 = (SaInst) this.returnValue;
        }
        outAAvecsinonInstrsi(node);
        this.returnValue =new SaInstSi(op1,op2,op3);
    }

    public void inASanssinonInstrsi(ASanssinonInstrsi node)
    {
        defaultIn(node);
    }

    public void outASanssinonInstrsi(ASanssinonInstrsi node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASanssinonInstrsi(ASanssinonInstrsi node)
    {
        SaExp op1=null;
        SaInst op2=null;
        SaInst op3=null;
        inASanssinonInstrsi(node);
        if(node.getSi() != null)
        {
            node.getSi().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        if(node.getAlors() != null)
        {
            node.getAlors().apply(this);
            op2 = (SaInst) this.returnValue;
        }
        if(node.getInstrbloc() != null)
        {
            node.getInstrbloc().apply(this);
            op1 = (SaExp) this.returnValue;

        }
        outASanssinonInstrsi(node);
        this.returnValue =new SaInstSi(op1,op2,op3);
    }

    public void inAInstrsinon(AInstrsinon node)
    {
        defaultIn(node);
    }

    public void outAInstrsinon(AInstrsinon node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstrsinon(AInstrsinon node)
    {
        SaExp op1=null;
        SaInst op2=null;
        SaInst op3=null;
        inAInstrsinon(node);
        if(node.getSinon() != null)
        {
            node.getSinon().apply(this);
            op3 = (SaInst) this.returnValue;
        }
        if(node.getInstrbloc() != null)
        {
            node.getInstrbloc().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        outAInstrsinon(node);
        this.returnValue =new SaInstSi(op1,op2,op3);
    }

    public void inAInstrtantque(AInstrtantque node)
    {
        defaultIn(node);
    }

    public void outAInstrtantque(AInstrtantque node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstrtantque(AInstrtantque node)
    {
        SaExp op1=null;
        SaInst op2=null;
        inAInstrtantque(node);
        if(node.getTantque() != null)
        {
            node.getTantque().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        if(node.getFaire() != null)
        {
            node.getFaire().apply(this);
            op2 = (SaInst) this.returnValue;
        }
        if(node.getInstrbloc() != null)
        {
            node.getInstrbloc().apply(this);
            op2 = (SaInst) this.returnValue;
        }
        outAInstrtantque(node);
        this.returnValue =new SaInstTantQue(op1,op2);
    }

    public void inAInstrappel(AInstrappel node)
    {
        defaultIn(node);
    }

    public void outAInstrappel(AInstrappel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstrappel(AInstrappel node)
    {
        inAInstrappel(node);
        if(node.getAppelfct() != null)
        {
            node.getAppelfct().apply(this);
        }
        if(node.getPointVirgule() != null)
        {
            node.getPointVirgule().apply(this);
        }
        outAInstrappel(node);
    }

    public void inAInstrretour(AInstrretour node)
    {
        defaultIn(node);
    }

    public void outAInstrretour(AInstrretour node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstrretour(AInstrretour node)
    {
        SaExp op1=null;
        inAInstrretour(node);
        if(node.getRetour() != null)
        {
            node.getRetour().apply(this);
            op1 = (SaExp) this.returnValue;

        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        if(node.getPointVirgule() != null)
        {
            node.getPointVirgule().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        outAInstrretour(node);
        this.returnValue =new SaInstRetour(op1);
    }

    public void inAInstrecriture(AInstrecriture node)
    {
        defaultIn(node);
    }

    public void outAInstrecriture(AInstrecriture node)
    {
        defaultOut(node);
    }

//    @Override
//    public void caseAInstrecriture(AInstrecriture node)
//    {
//        SaExp op1=null;
//        inAInstrecriture(node);
//        if(node.getEcrire() != null)
//        {
//            node.getEcrire().apply(this);
//
//        }
//        if(node.getParentheseOuvrante() != null)
//        {
//            node.getParentheseOuvrante().apply(this);
//        }
//        if(node.getExp() != null)
//        {
//            node.getExp().apply(this);
//            op1 = (SaExp) this.returnValue;
//        }
//        if(node.getParentheseFermante() != null)
//        {
//            node.getParentheseFermante().apply(this);
//        }
//        if(node.getPointVirgule() != null)
//        {
//            node.getPointVirgule().apply(this);
//        }
//        outAInstrecriture(node);
//        this.returnValue = op1;
//
//    }

    public void inAInstrvide(AInstrvide node)
    {
        defaultIn(node);
    }

    public void outAInstrvide(AInstrvide node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstrvide(AInstrvide node)
    {
        inAInstrvide(node);
        if(node.getPointVirgule() != null)
        {
            node.getPointVirgule().apply(this);
        }
        outAInstrvide(node);
    }

    public void inAOuExp(AOuExp node)
    {
        defaultIn(node);
    }

    public void outAOuExp(AOuExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuExp(AOuExp node)
    {
        SaExp op1=null;
        SaExp op2=null;
        inAOuExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        if(node.getOu() != null)
        {
            node.getOu().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        outAOuExp(node);
        this.returnValue =new SaExpOr(op1,op2);
    }

    public void inAExp1Exp(AExp1Exp node)
    {
        defaultIn(node);
    }

    public void outAExp1Exp(AExp1Exp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp1Exp(AExp1Exp node)
    {
        inAExp1Exp(node);
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAExp1Exp(node);
    }

    public void inAEtExp1(AEtExp1 node)
    {
        defaultIn(node);
    }

    public void outAEtExp1(AEtExp1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEtExp1(AEtExp1 node)
    {
        SaExp op1=null;
        SaExp op2=null;
        inAEtExp1(node);
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        if(node.getEt() != null)
        {
            node.getEt().apply(this);
        }
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
            op2 = (SaExp) this.returnValue;
        }
        outAEtExp1(node);
        this.returnValue =new SaExpAnd(op1,op2);
    }

    public void inAExp2Exp1(AExp2Exp1 node)
    {
        defaultIn(node);
    }

    public void outAExp2Exp1(AExp2Exp1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp2Exp1(AExp2Exp1 node)
    {
        inAExp2Exp1(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        outAExp2Exp1(node);
    }

    public void inAInfExp2(AInfExp2 node)
    {
        defaultIn(node);
    }

    public void outAInfExp2(AInfExp2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInfExp2(AInfExp2 node)
    {
        SaExp op1=null;
        SaExp op2=null;
        inAInfExp2(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        if(node.getInferieur() != null)
        {
            node.getInferieur().apply(this);
        }
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
            op2 = (SaExp) this.returnValue;
        }
        outAInfExp2(node);
        this.returnValue =new SaExpInf(op1,op2);

    }

    public void inAEgalExp2(AEgalExp2 node)
    {
        defaultIn(node);
    }

    public void outAEgalExp2(AEgalExp2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEgalExp2(AEgalExp2 node)
    {
        SaExp op1=null;
        SaExp op2=null;
        inAEgalExp2(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
            op1 = (SaExp) this.returnValue;
        }
        if(node.getEgal() != null)
        {
            node.getEgal().apply(this);
        }
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
            op2 = (SaExp) this.returnValue;
        }
        outAEgalExp2(node);
        this.returnValue =new SaExpEqual(op1,op2);
    }

    public void inAExp3Exp2(AExp3Exp2 node)
    {
        defaultIn(node);
    }

    public void outAExp3Exp2(AExp3Exp2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp3Exp2(AExp3Exp2 node)
    {
        inAExp3Exp2(node);
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
        }
        outAExp3Exp2(node);
    }

    public void inAPlusExp3(APlusExp3 node)
    {
        defaultIn(node);
    }

    public void outAPlusExp3(APlusExp3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusExp3(APlusExp3 node)
    {
        SaExp op1 =null;
        SaExp op2 =null;
        inAPlusExp3(node);
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
            op1 = (SaExp)this.returnValue;
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
            ;
        }
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
            op2 = (SaExp)this.returnValue;
        }
        outAPlusExp3(node);
        this.returnValue =new SaExpAdd(op1, op2);
    }

    public void inAMoinsExp3(AMoinsExp3 node)
    {
        defaultIn(node);
    }

    public void outAMoinsExp3(AMoinsExp3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMoinsExp3(AMoinsExp3 node)
    {
        SaExp op1 =null;
        SaExp op2 =null;
        inAMoinsExp3(node);
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
            op1 = (SaExp)this.returnValue;
        }
        if(node.getMoins() != null)
        {
            node.getMoins().apply(this);
        }
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
            op2 = (SaExp)this.returnValue;
        }
        outAMoinsExp3(node);
        this.returnValue =new SaExpSub(op1, op2);
    }

    public void inAExp4Exp3(AExp4Exp3 node)
    {
        defaultIn(node);
    }

    public void outAExp4Exp3(AExp4Exp3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp4Exp3(AExp4Exp3 node)
    {
        inAExp4Exp3(node);
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
        }
        outAExp4Exp3(node);
    }

    public void inAFoisExp4(AFoisExp4 node)
    {
        defaultIn(node);
    }

    public void outAFoisExp4(AFoisExp4 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFoisExp4(AFoisExp4 node)
    {
        SaExp op1=null;
        SaExp op2=null;
        inAFoisExp4(node);
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
            op1= (SaExp)this.returnValue;
        }
        if(node.getFois() != null)
        {
            node.getFois().apply(this);
        }
        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
            op2 = (SaExp)this.returnValue;
        }
        outAFoisExp4(node);
        this.returnValue =new SaExpMult(op1, op2);
    }

    public void inADiviseExp4(ADiviseExp4 node)
    {
        defaultIn(node);
    }

    public void outADiviseExp4(ADiviseExp4 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiviseExp4(ADiviseExp4 node)
    {
        SaExp op1=null;
        SaExp op2=null;
        inADiviseExp4(node);
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
            op1 = (SaExp)this.returnValue;
        }
        if(node.getDivise() != null)
        {
            node.getDivise().apply(this);
        }
        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
            op2 = (SaExp)this.returnValue;
        }
        outADiviseExp4(node);
        this.returnValue =new SaExpDiv(op1, op2);
    }

    public void inAExp5Exp4(AExp5Exp4 node)
    {
        defaultIn(node);
    }

    public void outAExp5Exp4(AExp5Exp4 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp5Exp4(AExp5Exp4 node)
    {
        inAExp5Exp4(node);
        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
        }
        outAExp5Exp4(node);
    }

    public void inANonExp5(ANonExp5 node)
    {
        defaultIn(node);
    }

    public void outANonExp5(ANonExp5 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANonExp5(ANonExp5 node)
    {
        SaExp op1=null;
        inANonExp5(node);
        if(node.getNon() != null)
        {
            node.getNon().apply(this);

        }
        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
            op1 = (SaExp)this.returnValue;
        }
        outANonExp5(node);
        this.returnValue =new SaExpNot(op1);
    }

    public void inAExp6Exp5(AExp6Exp5 node)
    {
        defaultIn(node);
    }

    public void outAExp6Exp5(AExp6Exp5 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp6Exp5(AExp6Exp5 node)
    {
        inAExp6Exp5(node);
        if(node.getExp6() != null)
        {
            node.getExp6().apply(this);
        }
        outAExp6Exp5(node);
    }

    public void inANombreExp6(ANombreExp6 node)
    {
        defaultIn(node);
    }

    public void outANombreExp6(ANombreExp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANombreExp6(ANombreExp6 node)
    {
        int entier=0;
        inANombreExp6(node);
        if(node.getNombre() != null)
        {
            node.getNombre().apply(this);
            entier=Integer.parseInt(node.getNombre().getText());
        }
        outANombreExp6(node);
        this.returnValue= new SaExpInt(entier);
    }

    public void inAAppelfctExp6(AAppelfctExp6 node)
    {
        defaultIn(node);
    }

    public void outAAppelfctExp6(AAppelfctExp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAppelfctExp6(AAppelfctExp6 node)
    {
        inAAppelfctExp6(node);
        if(node.getAppelfct() != null)
        {
            node.getAppelfct().apply(this);
            this.returnValue = new SaExpVar((SaVar) this.returnValue);
        }
        outAAppelfctExp6(node);
    }

    public void inAVarExp6(AVarExp6 node)
    {
        defaultIn(node);
    }

    public void outAVarExp6(AVarExp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarExp6(AVarExp6 node)
    {
        inAVarExp6(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
            this.returnValue= new SaExpVar((SaVar) this.returnValue);
        }
        outAVarExp6(node);
    }

    public void inAParenthesesExp6(AParenthesesExp6 node)
    {
        defaultIn(node);
    }

    public void outAParenthesesExp6(AParenthesesExp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParenthesesExp6(AParenthesesExp6 node)
    {
        inAParenthesesExp6(node);
        if(node.getParentheseOuvrante() != null)
        {
            node.getParentheseOuvrante().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getParentheseFermante() != null)
        {
            node.getParentheseFermante().apply(this);
        }
        outAParenthesesExp6(node);
    }

    public void inALireExp6(ALireExp6 node)
    {
        defaultIn(node);
    }

    public void outALireExp6(ALireExp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALireExp6(ALireExp6 node)
    {
        inALireExp6(node);
        if(node.getLire() != null)
        {
            node.getLire().apply(this);
        }
        if(node.getParentheseOuvrante() != null)
        {
            node.getParentheseOuvrante().apply(this);
        }
        if(node.getParentheseFermante() != null)
        {
            node.getParentheseFermante().apply(this);
        }
        outALireExp6(node);
    this.returnValue=new SaExpLire();
    }

    public void inAVartabVar(AVartabVar node)
    {
        defaultIn(node);
    }

    public void outAVartabVar(AVartabVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVartabVar(AVartabVar node)
    {
        String nom=null;
        SaExp indice=null;
        inAVartabVar(node);
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
        nom = ( String) node.getIdentif().getText();
        }
        if(node.getCrochetOuvrant() != null)
        {
            node.getCrochetOuvrant().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        indice = ( SaExp) this.returnValue;
        }
        if(node.getCrochetFermant() != null)
        {
            node.getCrochetFermant().apply(this);
        }
        outAVartabVar(node);
        this.returnValue=new SaVarIndicee(nom, indice);
    }

    public void inAVarsimpleVar(AVarsimpleVar node)
    {
        defaultIn(node);
    }

    public void outAVarsimpleVar(AVarsimpleVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarsimpleVar(AVarsimpleVar node)
    {
        String nom=null;
        inAVarsimpleVar(node);
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
            nom = ( String) node.getIdentif().getText();

        }
        outAVarsimpleVar(node);
        this.returnValue =new SaVarSimple(nom);
    }

    public void inARecursifListeexp(ARecursifListeexp node)
    {
        defaultIn(node);
    }

    public void outARecursifListeexp(ARecursifListeexp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARecursifListeexp(ARecursifListeexp node)
    {
        SaExp tete =null;
        SaLExp queue=null;
        inARecursifListeexp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
            tete = (SaExp)this.returnValue;
        }
        if(node.getListeexpbis() != null)
        {
            node.getListeexpbis().apply(this);
            queue = (SaLExp)this.returnValue;
        }
        outARecursifListeexp(node);
        this.returnValue =new SaLExp(tete,queue);
    }

    public void inAFinalListeexp(AFinalListeexp node)
    {
        defaultIn(node);
    }

    public void outAFinalListeexp(AFinalListeexp node)
    {
        defaultOut(node);
    }

    @Override
   /* public void caseAFinalListeexp(AFinalListeexp node)
    {
        SaExp tete =null;
        SaLExp queue=null;
        inAFinalListeexp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
            tete = (SaExp)this.returnValue;
        }
        outAFinalListeexp(node);
        this.returnValue =new SaLExp(tete,queue);
    }*/

    public void inAFinalListeexpbis(AFinalListeexpbis node)
    {
        defaultIn(node);
    }

    public void outAFinalListeexpbis(AFinalListeexpbis node)
    {
        defaultOut(node);
    }

    @Override
   /* public void caseAFinalListeexpbis(AFinalListeexpbis node)
    {
        SaExp tete =null;
        SaLExp queue=null;
        inAFinalListeexpbis(node);
        if(node.getVirgule() != null)
        {
            node.getVirgule().apply(this);

        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
            tete = (SaExp)this.returnValue;
        }
        outAFinalListeexpbis(node);
        this.returnValue =new SaLExp(tete,queue);
    }*/

    public void inARecursifListeexpbis(ARecursifListeexpbis node)
    {
        defaultIn(node);
    }

    public void outARecursifListeexpbis(ARecursifListeexpbis node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARecursifListeexpbis(ARecursifListeexpbis node)
    {
        SaExp tete =null;
        SaLExp queue=null;
        inARecursifListeexpbis(node);
        if(node.getVirgule() != null)
        {
            node.getVirgule().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
            tete = (SaExp)this.returnValue;
        }
        if(node.getListeexpbis() != null)
        {
            node.getListeexpbis().apply(this);
            queue = (SaLExp)this.returnValue;
        }
        outARecursifListeexpbis(node);
        this.returnValue =new SaLExp(tete,queue);
    }
/*
    public void inAAvecparamAppelfct(AAvecparamAppelfct node)
    {
        defaultIn(node);
    }

    public void outAAvecparamAppelfct(AAvecparamAppelfct node)
    {
        defaultOut(node);
    }
*/
    //@Override
  /*  public void caseAAvecparamAppelfct(AAvecparamAppelfct node)
    {
        inAAvecparamAppelfct(node);
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
        }
        if(node.getParentheseOuvrante() != null)
        {
            node.getParentheseOuvrante().apply(this);
        }
        if(node.getListeexp() != null)
        {
            node.getListeexp().apply(this);
        }
        if(node.getParentheseFermante() != null)
        {
            node.getParentheseFermante().apply(this);
        }
        outAAvecparamAppelfct(node);
    }*/

   /* public void inASansparamAppelfct(ASansparamAppelfct node)
    {
        defaultIn(node);
    }

    public void outASansparamAppelfct(ASansparamAppelfct node)
    {
        defaultOut(node);
    }*/

   /* @Override
    public void caseASansparamAppelfct(ASansparamAppelfct node)
    {   SalDec param=null;
        inASansparamAppelfct(node);
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
        }
        if(node.getParentheseOuvrante() != null)
        {
            node.getParentheseOuvrante().apply(this);
        }
        if(node.getParentheseFermante() != null)
        {
            node.getParentheseFermante().apply(this);
        }
        outASansparamAppelfct(node);
        this.returnValue=param;
    }*/
}

