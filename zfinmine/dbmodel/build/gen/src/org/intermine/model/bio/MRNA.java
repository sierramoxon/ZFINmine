package org.intermine.model.bio;

public interface MRNA extends org.intermine.model.bio.ProcessedTranscript
{
    public org.intermine.model.bio.FivePrimeUTR getFivePrimeUTR();
    public void setFivePrimeUTR(final org.intermine.model.bio.FivePrimeUTR fivePrimeUTR);
    public void proxyFivePrimeUTR(final org.intermine.objectstore.proxy.ProxyReference fivePrimeUTR);
    public org.intermine.model.InterMineObject proxGetFivePrimeUTR();

    public org.intermine.model.bio.ThreePrimeUTR getThreePrimeUTR();
    public void setThreePrimeUTR(final org.intermine.model.bio.ThreePrimeUTR threePrimeUTR);
    public void proxyThreePrimeUTR(final org.intermine.objectstore.proxy.ProxyReference threePrimeUTR);
    public org.intermine.model.InterMineObject proxGetThreePrimeUTR();

    public java.util.Set<org.intermine.model.bio.UTR> getuTRs();
    public void setuTRs(final java.util.Set<org.intermine.model.bio.UTR> UTRs);
    public void adduTRs(final org.intermine.model.bio.UTR arg);

    public java.util.Set<org.intermine.model.bio.Codon> getCodons();
    public void setCodons(final java.util.Set<org.intermine.model.bio.Codon> codons);
    public void addCodons(final org.intermine.model.bio.Codon arg);

    public java.util.Set<org.intermine.model.bio.CDS> getcDSs();
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs);
    public void addcDSs(final org.intermine.model.bio.CDS arg);

    public java.util.Set<org.intermine.model.bio.EST> geteSTs();
    public void seteSTs(final java.util.Set<org.intermine.model.bio.EST> ESTs);
    public void addeSTs(final org.intermine.model.bio.EST arg);

}
