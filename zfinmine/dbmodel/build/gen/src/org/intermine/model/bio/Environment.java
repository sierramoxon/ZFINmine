package org.intermine.model.bio;

public interface Environment extends org.intermine.model.InterMineObject
{
    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public java.util.Set<org.intermine.model.bio.EnvironmentalCondition> getConditions();
    public void setConditions(final java.util.Set<org.intermine.model.bio.EnvironmentalCondition> conditions);
    public void addConditions(final org.intermine.model.bio.EnvironmentalCondition arg);

    public java.util.Set<org.intermine.model.bio.GenotypeEnvironment> getGenotypeEnvironments();
    public void setGenotypeEnvironments(final java.util.Set<org.intermine.model.bio.GenotypeEnvironment> genotypeEnvironments);
    public void addGenotypeEnvironments(final org.intermine.model.bio.GenotypeEnvironment arg);

}
