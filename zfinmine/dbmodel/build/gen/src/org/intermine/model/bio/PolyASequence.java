package org.intermine.model.bio;

public interface PolyASequence extends org.intermine.model.bio.GenePart
{
    public java.util.Set<org.intermine.model.bio.ThreePrimeUTR> getThreePrimeUTRs();
    public void setThreePrimeUTRs(final java.util.Set<org.intermine.model.bio.ThreePrimeUTR> threePrimeUTRs);
    public void addThreePrimeUTRs(final org.intermine.model.bio.ThreePrimeUTR arg);

}
