/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AInstrtantqueInstr extends PInstr
{
    private PInstrtantque _instrtantque_;

    public AInstrtantqueInstr()
    {
        // Constructor
    }

    public AInstrtantqueInstr(
        @SuppressWarnings("hiding") PInstrtantque _instrtantque_)
    {
        // Constructor
        setInstrtantque(_instrtantque_);

    }

    @Override
    public Object clone()
    {
        return new AInstrtantqueInstr(
            cloneNode(this._instrtantque_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInstrtantqueInstr(this);
    }

    public PInstrtantque getInstrtantque()
    {
        return this._instrtantque_;
    }

    public void setInstrtantque(PInstrtantque node)
    {
        if(this._instrtantque_ != null)
        {
            this._instrtantque_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._instrtantque_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._instrtantque_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._instrtantque_ == child)
        {
            this._instrtantque_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._instrtantque_ == oldChild)
        {
            setInstrtantque((PInstrtantque) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
