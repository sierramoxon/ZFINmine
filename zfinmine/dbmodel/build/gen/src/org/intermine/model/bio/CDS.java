package org.intermine.model.bio;

public interface CDS extends org.intermine.model.bio.GenePart
{
    public org.intermine.model.bio.MRNA getmRNA();
    public void setmRNA(final org.intermine.model.bio.MRNA MRNA);
    public void proxymRNA(final org.intermine.objectstore.proxy.ProxyReference MRNA);
    public org.intermine.model.InterMineObject proxGetmRNA();

    public org.intermine.model.bio.Protein getProtein();
    public void setProtein(final org.intermine.model.bio.Protein protein);
    public void proxyProtein(final org.intermine.objectstore.proxy.ProxyReference protein);
    public org.intermine.model.InterMineObject proxGetProtein();

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public java.util.Set<org.intermine.model.bio.Polypeptide> getPolypeptides();
    public void setPolypeptides(final java.util.Set<org.intermine.model.bio.Polypeptide> polypeptides);
    public void addPolypeptides(final org.intermine.model.bio.Polypeptide arg);

}
