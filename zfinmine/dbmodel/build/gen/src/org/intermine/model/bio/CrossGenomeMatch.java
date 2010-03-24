package org.intermine.model.bio;

public interface CrossGenomeMatch extends org.intermine.model.bio.NucleotideMatch
{
    public java.lang.String getIdentifier();
    public void setIdentifier(final java.lang.String identifier);

    public org.intermine.model.bio.Location getTargetLocatedSequenceFeatureLocation();
    public void setTargetLocatedSequenceFeatureLocation(final org.intermine.model.bio.Location targetLocatedSequenceFeatureLocation);
    public void proxyTargetLocatedSequenceFeatureLocation(final org.intermine.objectstore.proxy.ProxyReference targetLocatedSequenceFeatureLocation);
    public org.intermine.model.InterMineObject proxGetTargetLocatedSequenceFeatureLocation();

    public org.intermine.model.bio.LocatedSequenceFeature getTargetLocatedSequenceFeature();
    public void setTargetLocatedSequenceFeature(final org.intermine.model.bio.LocatedSequenceFeature targetLocatedSequenceFeature);
    public void proxyTargetLocatedSequenceFeature(final org.intermine.objectstore.proxy.ProxyReference targetLocatedSequenceFeature);
    public org.intermine.model.InterMineObject proxGetTargetLocatedSequenceFeature();

    public org.intermine.model.bio.Organism getTargetOrganism();
    public void setTargetOrganism(final org.intermine.model.bio.Organism targetOrganism);
    public void proxyTargetOrganism(final org.intermine.objectstore.proxy.ProxyReference targetOrganism);
    public org.intermine.model.InterMineObject proxGetTargetOrganism();

}
