package org.intermine.model.bio;

public interface SignalPeptide extends org.intermine.model.bio.BioEntity
{
    public java.util.Set<org.intermine.model.bio.Polypeptide> getPolypeptides();
    public void setPolypeptides(final java.util.Set<org.intermine.model.bio.Polypeptide> polypeptides);
    public void addPolypeptides(final org.intermine.model.bio.Polypeptide arg);

}
