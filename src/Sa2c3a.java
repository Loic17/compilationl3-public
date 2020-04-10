

public class Sa2c3a extends SaDepthFirstVisitor<C3aOperand> {

        private C3a c3a;

    public Sa2c3a(SaNode root){
        c3a=new C3a();
        root.accept(this);}

    public C3aOperand visit(SaExpAdd node){
        C3aTemp temp=C3a.newTemp();
        C3aOperand o1=visit(node.getOp1());
        C3aOperand o2=visit(node.getOp2());
        String msg="";

        c3a.ajouteInst(new C3aInstAdd(o1,o2,temp,msg));
        return temp;
        }


    public C3aOperand visit(SaExpDiv node){
        C3aTemp temp=C3a.newTemp();
        C3aOperand o1=visit(node.getOp1());
        C3aOperand o2=visit(node.getOp2());
        String msg="";

        c3a.ajouteInst(new C3aInstDiv(o1,o2,temp,msg));
        return temp;
        }

  public C3aOperand visit(SaExpSub node){
        C3aTemp temp=C3a.newTemp();
        C3aOperand o1=visit(node.getOp1());
        C3aOperand o2=visit(node.getOp2());
        String msg="";

        c3a.ajouteInst(new C3aInstSub(o1,o2,temp,msg));
        return temp;
        }

	public C3aOperand visit(SaExpDiv node){
        C3aTemp temp=C3a.newTemp();
        C3aOperand o1=visit(node.getOp1());
        C3aOperand o2=visit(node.getOp2());
        String msg="";

        c3a.ajouteInst(new C3aInstDiv(o1,o2,temp,msg));
        return temp;
        }

	
