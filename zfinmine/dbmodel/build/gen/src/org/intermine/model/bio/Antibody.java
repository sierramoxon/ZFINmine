package org.intermine.model.bio;

public interface Antibody extends org.intermine.model.InterMineObject
{
    public java.lang.String getImmunogenOrganism();
    public void setImmunogenOrganism(final java.lang.String immunogenOrganism);

    public java.lang.String getSymbol();
    public void setSymbol(final java.lang.String symbol);

    public java.lang.String getClonalType();
    public void setClonalType(final java.lang.String clonalType);

    public java.lang.String getHeavyChainIsotype();
    public void setHeavyChainIsotype(final java.lang.String heavyChainIsotype);

    public java.lang.String getLightChainIsotype();
    public void setLightChainIsotype(final java.lang.String lightChainIsotype);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public java.lang.String getHostOrganism();
    public void setHostOrganism(final java.lang.String hostOrganism);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressions();
    public void setExpressions(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressions);
    public void addExpressions(final org.intermine.model.bio.ExpressionResult arg);

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

    public java.util.Set<org.intermine.model.bio.ExternalLink> getExternalLinks();
    public void setExternalLinks(final java.util.Set<org.intermine.model.bio.ExternalLink> externalLinks);
    public void addExternalLinks(final org.intermine.model.bio.ExternalLink arg);

}
