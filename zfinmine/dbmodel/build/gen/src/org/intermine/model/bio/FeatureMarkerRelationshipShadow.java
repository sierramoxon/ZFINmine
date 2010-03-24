package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.util.StringConstructor;
import org.intermine.util.StringUtil;
import org.intermine.util.TypeUtil;
import org.intermine.model.ShadowClass;
public class FeatureMarkerRelationshipShadow implements FeatureMarkerRelationship, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = FeatureMarkerRelationship.class;
    // Attr: org.intermine.model.bio.FeatureMarkerRelationship.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Attr: org.intermine.model.bio.FeatureMarkerRelationship.relationshipType
    protected java.lang.String relationshipType;
    public java.lang.String getRelationshipType() { return relationshipType; }
    public void setRelationshipType(final java.lang.String relationshipType) { this.relationshipType = relationshipType; }

    // Ref: org.intermine.model.bio.FeatureMarkerRelationship.feature
    protected org.intermine.model.InterMineObject feature;
    public org.intermine.model.bio.Feature getFeature() { if (feature instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Feature) ((org.intermine.objectstore.proxy.ProxyReference) feature).getObject()); }; return (org.intermine.model.bio.Feature) feature; }
    public void setFeature(final org.intermine.model.bio.Feature feature) { this.feature = feature; }
    public void proxyFeature(final org.intermine.objectstore.proxy.ProxyReference feature) { this.feature = feature; }
    public org.intermine.model.InterMineObject proxGetFeature() { return feature; }

    // Ref: org.intermine.model.bio.FeatureMarkerRelationship.marker
    protected org.intermine.model.InterMineObject marker;
    public org.intermine.model.bio.Marker getMarker() { if (marker instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Marker) ((org.intermine.objectstore.proxy.ProxyReference) marker).getObject()); }; return (org.intermine.model.bio.Marker) marker; }
    public void setMarker(final org.intermine.model.bio.Marker marker) { this.marker = marker; }
    public void proxyMarker(final org.intermine.objectstore.proxy.ProxyReference marker) { this.marker = marker; }
    public org.intermine.model.InterMineObject proxGetMarker() { return marker; }

    // Ref: org.intermine.model.bio.FeatureMarkerRelationship.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof FeatureMarkerRelationship && id != null) ? id.equals(((FeatureMarkerRelationship)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "FeatureMarkerRelationship [feature=" + (feature == null ? "null" : (feature.getId() == null ? "no id" : feature.getId().toString())) + ", id=\"" + id + "\", marker=" + (marker == null ? "null" : (marker.getId() == null ? "no id" : marker.getId().toString())) + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", primaryIdentifier=\"" + primaryIdentifier + "\", relationshipType=\"" + relationshipType + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("relationshipType".equals(fieldName)) {
            return relationshipType;
        }
        if ("feature".equals(fieldName)) {
            if (feature instanceof ProxyReference) {
                return ((ProxyReference) feature).getObject();
            } else {
                return feature;
            }
        }
        if ("marker".equals(fieldName)) {
            if (marker instanceof ProxyReference) {
                return ((ProxyReference) marker).getObject();
            } else {
                return marker;
            }
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.FeatureMarkerRelationship.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("relationshipType".equals(fieldName)) {
            return relationshipType;
        }
        if ("feature".equals(fieldName)) {
            return feature;
        }
        if ("marker".equals(fieldName)) {
            return marker;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.FeatureMarkerRelationship.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("relationshipType".equals(fieldName)) {
            relationshipType = (java.lang.String) value;
        } else if ("feature".equals(fieldName)) {
            feature = (org.intermine.model.InterMineObject) value;
        } else if ("marker".equals(fieldName)) {
            marker = (org.intermine.model.InterMineObject) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.FeatureMarkerRelationship.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("relationshipType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("feature".equals(fieldName)) {
            return org.intermine.model.bio.Feature.class;
        }
        if ("marker".equals(fieldName)) {
            return org.intermine.model.bio.Marker.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.FeatureMarkerRelationship.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.FeatureMarkerRelationship.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.FeatureMarkerRelationship.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.FeatureMarkerRelationship");
        if (primaryIdentifier != null) {
            sb.append("$_^aprimaryIdentifier$_^");
            String string = primaryIdentifier;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (relationshipType != null) {
            sb.append("$_^arelationshipType$_^");
            String string = relationshipType;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (feature != null) {
            sb.append("$_^rfeature$_^").append(feature.getId());
        }
        if (marker != null) {
            sb.append("$_^rmarker$_^").append(marker.getId());
        }
        if (organism != null) {
            sb.append("$_^rorganism$_^").append(organism.getId());
        }
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.FeatureMarkerRelationship.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.FeatureMarkerRelationship)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aprimaryIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                primaryIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "arelationshipType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                relationshipType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rfeature".equals(notXml[i])) {
                i++;
                feature = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Feature.class);
                i++;
            };
            if ((i < notXml.length) &&"rmarker".equals(notXml[i])) {
                i++;
                marker = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Marker.class);
                i++;
            };
            if ((i < notXml.length) &&"rorganism".equals(notXml[i])) {
                i++;
                organism = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Organism.class);
                i++;
            };
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        {
            if (!org.intermine.model.bio.FeatureMarkerRelationship.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if (!org.intermine.model.bio.FeatureMarkerRelationship.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.FeatureMarkerRelationship.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
