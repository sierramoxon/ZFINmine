package org.intermine.model.bio;

public interface ExpressionResult extends org.intermine.model.InterMineObject
{
    public java.lang.String getAssay();
    public void setAssay(final java.lang.String assay);

    public java.lang.String getExpressionFound();
    public void setExpressionFound(final java.lang.String expressionFound);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public org.intermine.model.bio.ZFATerm getStartStage();
    public void setStartStage(final org.intermine.model.bio.ZFATerm startStage);
    public void proxyStartStage(final org.intermine.objectstore.proxy.ProxyReference startStage);
    public org.intermine.model.InterMineObject proxGetStartStage();

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public org.intermine.model.bio.ExternalLink getExternalLink();
    public void setExternalLink(final org.intermine.model.bio.ExternalLink externalLink);
    public void proxyExternalLink(final org.intermine.objectstore.proxy.ProxyReference externalLink);
    public org.intermine.model.InterMineObject proxGetExternalLink();

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public org.intermine.model.bio.ZFATerm getEndStage();
    public void setEndStage(final org.intermine.model.bio.ZFATerm endStage);
    public void proxyEndStage(final org.intermine.objectstore.proxy.ProxyReference endStage);
    public org.intermine.model.InterMineObject proxGetEndStage();

    public org.intermine.model.bio.OntologyTerm getSubterm();
    public void setSubterm(final org.intermine.model.bio.OntologyTerm subterm);
    public void proxySubterm(final org.intermine.objectstore.proxy.ProxyReference subterm);
    public org.intermine.model.InterMineObject proxGetSubterm();

    public org.intermine.model.bio.Antibody getAntibody();
    public void setAntibody(final org.intermine.model.bio.Antibody antibody);
    public void proxyAntibody(final org.intermine.objectstore.proxy.ProxyReference antibody);
    public org.intermine.model.InterMineObject proxGetAntibody();

    public org.intermine.model.bio.EFG geteFG();
    public void seteFG(final org.intermine.model.bio.EFG EFG);
    public void proxyeFG(final org.intermine.objectstore.proxy.ProxyReference EFG);
    public org.intermine.model.InterMineObject proxGeteFG();

    public org.intermine.model.bio.GenotypeEnvironment getGenotypeEnvironment();
    public void setGenotypeEnvironment(final org.intermine.model.bio.GenotypeEnvironment genotypeEnvironment);
    public void proxyGenotypeEnvironment(final org.intermine.objectstore.proxy.ProxyReference genotypeEnvironment);
    public org.intermine.model.InterMineObject proxGetGenotypeEnvironment();

    public org.intermine.model.bio.ZFATerm getAnatomy();
    public void setAnatomy(final org.intermine.model.bio.ZFATerm anatomy);
    public void proxyAnatomy(final org.intermine.objectstore.proxy.ProxyReference anatomy);
    public org.intermine.model.InterMineObject proxGetAnatomy();

    public org.intermine.model.bio.RNAClone getProbe();
    public void setProbe(final org.intermine.model.bio.RNAClone probe);
    public void proxyProbe(final org.intermine.objectstore.proxy.ProxyReference probe);
    public org.intermine.model.InterMineObject proxGetProbe();

    public java.util.Set<org.intermine.model.bio.Figure> getFigures();
    public void setFigures(final java.util.Set<org.intermine.model.bio.Figure> figures);
    public void addFigures(final org.intermine.model.bio.Figure arg);

}
