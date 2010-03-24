package org.intermine.model.bio;

public interface ExternalLink extends org.intermine.model.InterMineObject
{
    public java.lang.String getLinkType();
    public void setLinkType(final java.lang.String linkType);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public java.lang.String getAccessionNumber();
    public void setAccessionNumber(final java.lang.String accessionNumber);

    public org.intermine.model.bio.ExternalDatabase getExternalDatabase();
    public void setExternalDatabase(final org.intermine.model.bio.ExternalDatabase externalDatabase);
    public void proxyExternalDatabase(final org.intermine.objectstore.proxy.ProxyReference externalDatabase);
    public org.intermine.model.InterMineObject proxGetExternalDatabase();

    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressions();
    public void setExpressions(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressions);
    public void addExpressions(final org.intermine.model.bio.ExpressionResult arg);

    public java.util.Set<org.intermine.model.bio.Feature> getFeatures();
    public void setFeatures(final java.util.Set<org.intermine.model.bio.Feature> features);
    public void addFeatures(final org.intermine.model.bio.Feature arg);

}
