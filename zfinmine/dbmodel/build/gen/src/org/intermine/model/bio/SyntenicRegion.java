package org.intermine.model.bio;

public interface SyntenicRegion extends org.intermine.model.bio.Region
{
    public org.intermine.model.bio.SyntenicRegion getTargetSyntenicRegion();
    public void setTargetSyntenicRegion(final org.intermine.model.bio.SyntenicRegion targetSyntenicRegion);
    public void proxyTargetSyntenicRegion(final org.intermine.objectstore.proxy.ProxyReference targetSyntenicRegion);
    public org.intermine.model.InterMineObject proxGetTargetSyntenicRegion();

    public org.intermine.model.bio.Organism getTargetOrganism();
    public void setTargetOrganism(final org.intermine.model.bio.Organism targetOrganism);
    public void proxyTargetOrganism(final org.intermine.objectstore.proxy.ProxyReference targetOrganism);
    public org.intermine.model.InterMineObject proxGetTargetOrganism();

}
