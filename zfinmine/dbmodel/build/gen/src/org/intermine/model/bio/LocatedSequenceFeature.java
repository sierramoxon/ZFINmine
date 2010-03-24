package org.intermine.model.bio;

public interface LocatedSequenceFeature extends org.intermine.model.bio.BioEntity
{
    public java.lang.Integer getLength();
    public void setLength(final java.lang.Integer length);

    public org.intermine.model.bio.Sequence getSequence();
    public void setSequence(final org.intermine.model.bio.Sequence sequence);
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence);
    public org.intermine.model.InterMineObject proxGetSequence();

    public org.intermine.model.bio.Chromosome getChromosome();
    public void setChromosome(final org.intermine.model.bio.Chromosome chromosome);
    public void proxyChromosome(final org.intermine.objectstore.proxy.ProxyReference chromosome);
    public org.intermine.model.InterMineObject proxGetChromosome();

    public org.intermine.model.bio.Location getChromosomeLocation();
    public void setChromosomeLocation(final org.intermine.model.bio.Location chromosomeLocation);
    public void proxyChromosomeLocation(final org.intermine.objectstore.proxy.ProxyReference chromosomeLocation);
    public org.intermine.model.InterMineObject proxGetChromosomeLocation();

    public java.util.Set<org.intermine.model.bio.LocatedSequenceFeature> getOverlappingFeatures();
    public void setOverlappingFeatures(final java.util.Set<org.intermine.model.bio.LocatedSequenceFeature> overlappingFeatures);
    public void addOverlappingFeatures(final org.intermine.model.bio.LocatedSequenceFeature arg);

}
