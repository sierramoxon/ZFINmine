package org.intermine.model.bio;

public interface MiRNA extends org.intermine.model.bio.SmallRegulatoryNcRNA
{
    public java.util.Set<org.intermine.model.bio.PrecursorMiRNA> getPrecursorMiRNAs();
    public void setPrecursorMiRNAs(final java.util.Set<org.intermine.model.bio.PrecursorMiRNA> precursorMiRNAs);
    public void addPrecursorMiRNAs(final org.intermine.model.bio.PrecursorMiRNA arg);

}
