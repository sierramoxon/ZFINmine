package org.intermine.model.bio;

public interface PrecursorMiRNA extends org.intermine.model.bio.SmallRegulatoryNcRNA
{
    public java.util.Set<org.intermine.model.bio.MiRNA> getMiRNAs();
    public void setMiRNAs(final java.util.Set<org.intermine.model.bio.MiRNA> miRNAs);
    public void addMiRNAs(final org.intermine.model.bio.MiRNA arg);

}
