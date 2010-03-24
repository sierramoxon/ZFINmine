package org.intermine.model.bio;

public interface Figure extends org.intermine.model.InterMineObject
{
    public java.lang.String getLabel();
    public void setLabel(final java.lang.String label);

    public java.lang.String getCaption();
    public void setCaption(final java.lang.String caption);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressionResults();
    public void setExpressionResults(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressionResults);
    public void addExpressionResults(final org.intermine.model.bio.ExpressionResult arg);

    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypes();
    public void setPhenotypes(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypes);
    public void addPhenotypes(final org.intermine.model.bio.Phenotype arg);

    public java.util.Set<org.intermine.model.bio.Image> getImages();
    public void setImages(final java.util.Set<org.intermine.model.bio.Image> images);
    public void addImages(final org.intermine.model.bio.Image arg);

}
