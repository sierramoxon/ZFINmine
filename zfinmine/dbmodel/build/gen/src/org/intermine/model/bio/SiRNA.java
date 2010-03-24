package org.intermine.model.bio;

public interface SiRNA extends org.intermine.model.bio.NcRNA
{
    public java.util.Set<org.intermine.model.bio.PrecursorSiRNA> getPrecursorSiRNAs();
    public void setPrecursorSiRNAs(final java.util.Set<org.intermine.model.bio.PrecursorSiRNA> precursorSiRNAs);
    public void addPrecursorSiRNAs(final org.intermine.model.bio.PrecursorSiRNA arg);

}
