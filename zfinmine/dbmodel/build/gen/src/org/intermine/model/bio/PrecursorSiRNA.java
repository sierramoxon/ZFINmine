package org.intermine.model.bio;

public interface PrecursorSiRNA extends org.intermine.model.bio.NcRNA
{
    public java.util.Set<org.intermine.model.bio.SiRNA> getSiRNAs();
    public void setSiRNAs(final java.util.Set<org.intermine.model.bio.SiRNA> siRNAs);
    public void addSiRNAs(final org.intermine.model.bio.SiRNA arg);

}
