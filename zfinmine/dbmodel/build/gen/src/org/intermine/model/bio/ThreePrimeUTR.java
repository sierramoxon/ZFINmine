package org.intermine.model.bio;

public interface ThreePrimeUTR extends org.intermine.model.bio.UTR
{
    public java.util.Set<org.intermine.model.bio.PolyASequence> getPolyASequences();
    public void setPolyASequences(final java.util.Set<org.intermine.model.bio.PolyASequence> polyASequences);
    public void addPolyASequences(final org.intermine.model.bio.PolyASequence arg);

}
