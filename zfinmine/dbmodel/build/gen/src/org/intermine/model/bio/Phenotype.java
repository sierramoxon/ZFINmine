package org.intermine.model.bio;

public interface Phenotype extends org.intermine.model.InterMineObject
{
    public java.lang.String getTag();
    public void setTag(final java.lang.String tag);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public org.intermine.model.bio.OntologyTerm getStartStage();
    public void setStartStage(final org.intermine.model.bio.OntologyTerm startStage);
    public void proxyStartStage(final org.intermine.objectstore.proxy.ProxyReference startStage);
    public org.intermine.model.InterMineObject proxGetStartStage();

    public org.intermine.model.bio.GenotypeEnvironment getGenotypeEnvironment();
    public void setGenotypeEnvironment(final org.intermine.model.bio.GenotypeEnvironment genotypeEnvironment);
    public void proxyGenotypeEnvironment(final org.intermine.objectstore.proxy.ProxyReference genotypeEnvironment);
    public org.intermine.model.InterMineObject proxGetGenotypeEnvironment();

    public org.intermine.model.bio.PATOTerm getPhenotypeTerm();
    public void setPhenotypeTerm(final org.intermine.model.bio.PATOTerm phenotypeTerm);
    public void proxyPhenotypeTerm(final org.intermine.objectstore.proxy.ProxyReference phenotypeTerm);
    public org.intermine.model.InterMineObject proxGetPhenotypeTerm();

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public org.intermine.model.bio.OntologyTerm getSuperTerm();
    public void setSuperTerm(final org.intermine.model.bio.OntologyTerm superTerm);
    public void proxySuperTerm(final org.intermine.objectstore.proxy.ProxyReference superTerm);
    public org.intermine.model.InterMineObject proxGetSuperTerm();

    public org.intermine.model.bio.OntologyTerm getEndStage();
    public void setEndStage(final org.intermine.model.bio.OntologyTerm endStage);
    public void proxyEndStage(final org.intermine.objectstore.proxy.ProxyReference endStage);
    public org.intermine.model.InterMineObject proxGetEndStage();

    public org.intermine.model.bio.OntologyTerm getSubTerm();
    public void setSubTerm(final org.intermine.model.bio.OntologyTerm subTerm);
    public void proxySubTerm(final org.intermine.objectstore.proxy.ProxyReference subTerm);
    public org.intermine.model.InterMineObject proxGetSubTerm();

    public java.util.Set<org.intermine.model.bio.Figure> getFigures();
    public void setFigures(final java.util.Set<org.intermine.model.bio.Figure> figures);
    public void addFigures(final org.intermine.model.bio.Figure arg);

}
