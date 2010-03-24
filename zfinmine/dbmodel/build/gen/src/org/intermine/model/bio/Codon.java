package org.intermine.model.bio;

public interface Codon extends org.intermine.model.bio.GenePart
{
    public java.util.Set<org.intermine.model.bio.MRNA> getmRNAs();
    public void setmRNAs(final java.util.Set<org.intermine.model.bio.MRNA> MRNAs);
    public void addmRNAs(final org.intermine.model.bio.MRNA arg);

}
