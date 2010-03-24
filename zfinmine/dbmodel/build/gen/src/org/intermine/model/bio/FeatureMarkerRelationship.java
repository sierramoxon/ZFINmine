package org.intermine.model.bio;

public interface FeatureMarkerRelationship extends org.intermine.model.InterMineObject
{
    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public java.lang.String getRelationshipType();
    public void setRelationshipType(final java.lang.String relationshipType);

    public org.intermine.model.bio.Feature getFeature();
    public void setFeature(final org.intermine.model.bio.Feature feature);
    public void proxyFeature(final org.intermine.objectstore.proxy.ProxyReference feature);
    public org.intermine.model.InterMineObject proxGetFeature();

    public org.intermine.model.bio.Marker getMarker();
    public void setMarker(final org.intermine.model.bio.Marker marker);
    public void proxyMarker(final org.intermine.objectstore.proxy.ProxyReference marker);
    public org.intermine.model.InterMineObject proxGetMarker();

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

}
