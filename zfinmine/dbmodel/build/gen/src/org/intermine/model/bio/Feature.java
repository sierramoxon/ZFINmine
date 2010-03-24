package org.intermine.model.bio;

public interface Feature extends org.intermine.model.InterMineObject
{
    public java.lang.String getFeatureName();
    public void setFeatureName(final java.lang.String featureName);

    public java.lang.String getTypeDisplay();
    public void setTypeDisplay(final java.lang.String typeDisplay);

    public java.lang.String getFeatureAbbrev();
    public void setFeatureAbbrev(final java.lang.String featureAbbrev);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

    public java.util.Set<org.intermine.model.bio.GenotypeFeature> getGenotypes();
    public void setGenotypes(final java.util.Set<org.intermine.model.bio.GenotypeFeature> genotypes);
    public void addGenotypes(final org.intermine.model.bio.GenotypeFeature arg);

    public java.util.Set<org.intermine.model.bio.FeatureMarkerRelationship> getRelatedMarkers();
    public void setRelatedMarkers(final java.util.Set<org.intermine.model.bio.FeatureMarkerRelationship> relatedMarkers);
    public void addRelatedMarkers(final org.intermine.model.bio.FeatureMarkerRelationship arg);

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

    public java.util.Set<org.intermine.model.bio.ExternalLink> getExternalLinks();
    public void setExternalLinks(final java.util.Set<org.intermine.model.bio.ExternalLink> externalLinks);
    public void addExternalLinks(final org.intermine.model.bio.ExternalLink arg);

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

    public java.util.Set<org.intermine.model.bio.Construct> getInsertionConstructs();
    public void setInsertionConstructs(final java.util.Set<org.intermine.model.bio.Construct> insertionConstructs);
    public void addInsertionConstructs(final org.intermine.model.bio.Construct arg);

    public java.util.Set<org.intermine.model.bio.Construct> getInnocuousConstructs();
    public void setInnocuousConstructs(final java.util.Set<org.intermine.model.bio.Construct> innocuousConstructs);
    public void addInnocuousConstructs(final org.intermine.model.bio.Construct arg);

    public java.util.Set<org.intermine.model.bio.Construct> getPhenotypicConstructs();
    public void setPhenotypicConstructs(final java.util.Set<org.intermine.model.bio.Construct> phenotypicConstructs);
    public void addPhenotypicConstructs(final org.intermine.model.bio.Construct arg);

}
