package org.intermine.model.bio;

public interface Genotype extends org.intermine.model.InterMineObject
{
    public java.lang.String getBackgrounds();
    public void setBackgrounds(final java.lang.String backgrounds);

    public java.lang.String getParentalZygocity();
    public void setParentalZygocity(final java.lang.String parentalZygocity);

    public java.lang.String getGenoHandle();
    public void setGenoHandle(final java.lang.String genoHandle);

    public java.lang.String getGenoDisplayName();
    public void setGenoDisplayName(final java.lang.String genoDisplayName);

    public java.lang.Boolean getIsExtinct();
    public void setIsExtinct(final java.lang.Boolean isExtinct);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public java.lang.Boolean getIsWildType();
    public void setIsWildType(final java.lang.Boolean isWildType);

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

    public java.util.Set<org.intermine.model.bio.GenotypeFeature> getFeatures();
    public void setFeatures(final java.util.Set<org.intermine.model.bio.GenotypeFeature> features);
    public void addFeatures(final org.intermine.model.bio.GenotypeFeature arg);

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

    public java.util.Set<org.intermine.model.bio.GenotypeEnvironment> getGenotypeEnvironments();
    public void setGenotypeEnvironments(final java.util.Set<org.intermine.model.bio.GenotypeEnvironment> genotypeEnvironments);
    public void addGenotypeEnvironments(final org.intermine.model.bio.GenotypeEnvironment arg);

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

}
