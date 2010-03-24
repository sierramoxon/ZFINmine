package org.intermine.model.bio;

public interface RibosomeEntrySite extends org.intermine.model.bio.GenePart
{
    public java.util.Set<org.intermine.model.bio.UTR> getuTRs();
    public void setuTRs(final java.util.Set<org.intermine.model.bio.UTR> UTRs);
    public void adduTRs(final org.intermine.model.bio.UTR arg);

}
