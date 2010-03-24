package org.intermine.model.bio;

public interface Polypeptide extends org.intermine.model.bio.BioEntity
{
    public org.intermine.model.bio.Sequence getSequence();
    public void setSequence(final org.intermine.model.bio.Sequence sequence);
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence);
    public org.intermine.model.InterMineObject proxGetSequence();

    public java.util.Set<org.intermine.model.bio.PolypeptideDomain> getPolypeptideDomains();
    public void setPolypeptideDomains(final java.util.Set<org.intermine.model.bio.PolypeptideDomain> polypeptideDomains);
    public void addPolypeptideDomains(final org.intermine.model.bio.PolypeptideDomain arg);

    public java.util.Set<org.intermine.model.bio.SignalPeptide> getSignalPeptides();
    public void setSignalPeptides(final java.util.Set<org.intermine.model.bio.SignalPeptide> signalPeptides);
    public void addSignalPeptides(final org.intermine.model.bio.SignalPeptide arg);

    public java.util.Set<org.intermine.model.bio.CDS> getcDSs();
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs);
    public void addcDSs(final org.intermine.model.bio.CDS arg);

}
