package org.intermine.model.bio;

public interface Homologue extends org.intermine.model.InterMineObject
{
    public java.lang.Double getInParanoidScore();
    public void setInParanoidScore(final java.lang.Double inParanoidScore);

    public java.lang.Integer getBootstrapScore();
    public void setBootstrapScore(final java.lang.Integer bootstrapScore);

    public java.lang.Integer getHomologueBootstrapScore();
    public void setHomologueBootstrapScore(final java.lang.Integer homologueBootstrapScore);

    public java.lang.String getClusterName();
    public void setClusterName(final java.lang.String clusterName);

    public java.lang.String getlG();
    public void setlG(final java.lang.String LG);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public org.intermine.model.bio.Gene getHomologue();
    public void setHomologue(final org.intermine.model.bio.Gene homologue);
    public void proxyHomologue(final org.intermine.objectstore.proxy.ProxyReference homologue);
    public org.intermine.model.InterMineObject proxGetHomologue();

    public org.intermine.model.bio.Protein getHomologueProtein();
    public void setHomologueProtein(final org.intermine.model.bio.Protein homologueProtein);
    public void proxyHomologueProtein(final org.intermine.objectstore.proxy.ProxyReference homologueProtein);
    public org.intermine.model.InterMineObject proxGetHomologueProtein();

    public org.intermine.model.bio.Protein getProtein();
    public void setProtein(final org.intermine.model.bio.Protein protein);
    public void proxyProtein(final org.intermine.objectstore.proxy.ProxyReference protein);
    public org.intermine.model.InterMineObject proxGetProtein();

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

    public java.util.Set<org.intermine.model.bio.OrthologueEvidence> getEvidence();
    public void setEvidence(final java.util.Set<org.intermine.model.bio.OrthologueEvidence> evidence);
    public void addEvidence(final org.intermine.model.bio.OrthologueEvidence arg);

    public java.util.Set<org.intermine.model.bio.ExternalLink> getExternalLinks();
    public void setExternalLinks(final java.util.Set<org.intermine.model.bio.ExternalLink> externalLinks);
    public void addExternalLinks(final org.intermine.model.bio.ExternalLink arg);

}
