package org.intermine.model.bio;

public interface MarkerRelationship extends org.intermine.model.InterMineObject
{
    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public org.intermine.model.bio.Marker getMarker1();
    public void setMarker1(final org.intermine.model.bio.Marker marker1);
    public void proxyMarker1(final org.intermine.objectstore.proxy.ProxyReference marker1);
    public org.intermine.model.InterMineObject proxGetMarker1();

    public org.intermine.model.bio.Marker getMarker2();
    public void setMarker2(final org.intermine.model.bio.Marker marker2);
    public void proxyMarker2(final org.intermine.objectstore.proxy.ProxyReference marker2);
    public org.intermine.model.InterMineObject proxGetMarker2();

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

}
