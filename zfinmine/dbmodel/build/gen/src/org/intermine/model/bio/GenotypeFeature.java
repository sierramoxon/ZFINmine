package org.intermine.model.bio;

public interface GenotypeFeature extends org.intermine.model.InterMineObject
{
    public java.lang.String getFeatureZygosity();
    public void setFeatureZygosity(final java.lang.String featureZygosity);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public org.intermine.model.bio.Genotype getGenotype();
    public void setGenotype(final org.intermine.model.bio.Genotype genotype);
    public void proxyGenotype(final org.intermine.objectstore.proxy.ProxyReference genotype);
    public org.intermine.model.InterMineObject proxGetGenotype();

    public org.intermine.model.bio.Feature getFeature();
    public void setFeature(final org.intermine.model.bio.Feature feature);
    public void proxyFeature(final org.intermine.objectstore.proxy.ProxyReference feature);
    public org.intermine.model.InterMineObject proxGetFeature();

}
