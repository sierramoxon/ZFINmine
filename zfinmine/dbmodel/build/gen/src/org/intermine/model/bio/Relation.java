package org.intermine.model.bio;

public interface Relation extends org.intermine.model.bio.SymmetricalRelation
{
    public org.intermine.model.bio.BioEntity getSubject();
    public void setSubject(final org.intermine.model.bio.BioEntity subject);
    public void proxySubject(final org.intermine.objectstore.proxy.ProxyReference subject);
    public org.intermine.model.InterMineObject proxGetSubject();

    public org.intermine.model.bio.BioEntity getObject();
    public void setObject(final org.intermine.model.bio.BioEntity object);
    public void proxyObject(final org.intermine.objectstore.proxy.ProxyReference object);
    public org.intermine.model.InterMineObject proxGetObject();

    public java.util.Set<org.intermine.model.bio.Evidence> getEvidence();
    public void setEvidence(final java.util.Set<org.intermine.model.bio.Evidence> evidence);
    public void addEvidence(final org.intermine.model.bio.Evidence arg);

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}
