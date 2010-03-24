package org.intermine.model.bio;

public interface PrecursorRasiRNA extends org.intermine.model.bio.PrecursorSiRNA
{
    public java.util.Set<org.intermine.model.bio.RasiRNA> getRasiRNAs();
    public void setRasiRNAs(final java.util.Set<org.intermine.model.bio.RasiRNA> rasiRNAs);
    public void addRasiRNAs(final org.intermine.model.bio.RasiRNA arg);

}
