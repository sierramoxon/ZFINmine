package org.intermine.model.bio;

public interface GenotypeEnvironment extends org.intermine.model.InterMineObject
{
    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public org.intermine.model.bio.Genotype getGenotype();
    public void setGenotype(final org.intermine.model.bio.Genotype genotype);
    public void proxyGenotype(final org.intermine.objectstore.proxy.ProxyReference genotype);
    public org.intermine.model.InterMineObject proxGetGenotype();

    public org.intermine.model.bio.Environment getEnvironment();
    public void setEnvironment(final org.intermine.model.bio.Environment environment);
    public void proxyEnvironment(final org.intermine.objectstore.proxy.ProxyReference environment);
    public org.intermine.model.InterMineObject proxGetEnvironment();

    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypes();
    public void setPhenotypes(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypes);
    public void addPhenotypes(final org.intermine.model.bio.Phenotype arg);

    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressions();
    public void setExpressions(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressions);
    public void addExpressions(final org.intermine.model.bio.ExpressionResult arg);

}
