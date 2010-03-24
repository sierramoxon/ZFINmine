package org.intermine.model.bio;

public interface RasiRNA extends org.intermine.model.bio.BioEntity
{
    public java.util.Set<org.intermine.model.bio.PrecursorRasiRNA> getPrecursorRasiRNAs();
    public void setPrecursorRasiRNAs(final java.util.Set<org.intermine.model.bio.PrecursorRasiRNA> precursorRasiRNAs);
    public void addPrecursorRasiRNAs(final org.intermine.model.bio.PrecursorRasiRNA arg);

}
