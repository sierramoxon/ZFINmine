package org.intermine.model.bio;

public interface Annotation extends org.intermine.model.InterMineObject
{
    public java.lang.String getQualifier();
    public void setQualifier(final java.lang.String qualifier);

    public org.intermine.model.bio.BioProperty getProperty();
    public void setProperty(final org.intermine.model.bio.BioProperty property);
    public void proxyProperty(final org.intermine.objectstore.proxy.ProxyReference property);
    public org.intermine.model.InterMineObject proxGetProperty();

    public org.intermine.model.bio.BioEntity getSubject();
    public void setSubject(final org.intermine.model.bio.BioEntity subject);
    public void proxySubject(final org.intermine.objectstore.proxy.ProxyReference subject);
    public org.intermine.model.InterMineObject proxGetSubject();

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

}
