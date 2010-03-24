package org.intermine.model.bio;

public interface UTR extends org.intermine.model.bio.GenePart
{
    public org.intermine.model.bio.MRNA getmRNA();
    public void setmRNA(final org.intermine.model.bio.MRNA MRNA);
    public void proxymRNA(final org.intermine.objectstore.proxy.ProxyReference MRNA);
    public org.intermine.model.InterMineObject proxGetmRNA();

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public java.util.Set<org.intermine.model.bio.RibosomeEntrySite> getRibosomeEntrySites();
    public void setRibosomeEntrySites(final java.util.Set<org.intermine.model.bio.RibosomeEntrySite> ribosomeEntrySites);
    public void addRibosomeEntrySites(final org.intermine.model.bio.RibosomeEntrySite arg);

}
