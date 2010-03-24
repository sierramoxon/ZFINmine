package org.intermine.model.bio;

public interface ProbeLibrary extends org.intermine.model.InterMineObject
{
    public java.lang.String getRestrictionSites();
    public void setRestrictionSites(final java.lang.String restrictionSites);

    public java.lang.String getSpecies();
    public void setSpecies(final java.lang.String species);

    public java.lang.String getTissue();
    public void setTissue(final java.lang.String tissue);

    public java.lang.String getHost();
    public void setHost(final java.lang.String host);

    public java.lang.String getStage();
    public void setStage(final java.lang.String stage);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public org.intermine.model.bio.Genotype getStrain();
    public void setStrain(final org.intermine.model.bio.Genotype strain);
    public void proxyStrain(final org.intermine.objectstore.proxy.ProxyReference strain);
    public org.intermine.model.InterMineObject proxGetStrain();

}
