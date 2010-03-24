package org.intermine.model.bio;

public interface Synonym extends org.intermine.model.InterMineObject
{
    public java.lang.String getValue();
    public void setValue(final java.lang.String value);

    public java.lang.Boolean getIsPrimary();
    public void setIsPrimary(final java.lang.Boolean isPrimary);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public org.intermine.model.bio.BioEntity getSubject();
    public void setSubject(final org.intermine.model.bio.BioEntity subject);
    public void proxySubject(final org.intermine.objectstore.proxy.ProxyReference subject);
    public org.intermine.model.InterMineObject proxGetSubject();

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}
