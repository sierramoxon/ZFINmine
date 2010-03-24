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
public class MarkerRelationshipShadow implements MarkerRelationship, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = MarkerRelationship.class;
    // Attr: org.intermine.model.bio.MarkerRelationship.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Attr: org.intermine.model.bio.MarkerRelationship.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Ref: org.intermine.model.bio.MarkerRelationship.marker1
    protected org.intermine.model.InterMineObject marker1;
    public org.intermine.model.bio.Marker getMarker1() { if (marker1 instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Marker) ((org.intermine.objectstore.proxy.ProxyReference) marker1).getObject()); }; return (org.intermine.model.bio.Marker) marker1; }
    public void setMarker1(final org.intermine.model.bio.Marker marker1) { this.marker1 = marker1; }
    public void proxyMarker1(final org.intermine.objectstore.proxy.ProxyReference marker1) { this.marker1 = marker1; }
    public org.intermine.model.InterMineObject proxGetMarker1() { return marker1; }

    // Ref: org.intermine.model.bio.MarkerRelationship.marker2
    protected org.intermine.model.InterMineObject marker2;
    public org.intermine.model.bio.Marker getMarker2() { if (marker2 instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Marker) ((org.intermine.objectstore.proxy.ProxyReference) marker2).getObject()); }; return (org.intermine.model.bio.Marker) marker2; }
    public void setMarker2(final org.intermine.model.bio.Marker marker2) { this.marker2 = marker2; }
    public void proxyMarker2(final org.intermine.objectstore.proxy.ProxyReference marker2) { this.marker2 = marker2; }
    public org.intermine.model.InterMineObject proxGetMarker2() { return marker2; }

    // Ref: org.intermine.model.bio.MarkerRelationship.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof MarkerRelationship && id != null) ? id.equals(((MarkerRelationship)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "MarkerRelationship [id=\"" + id + "\", marker1=" + (marker1 == null ? "null" : (marker1.getId() == null ? "no id" : marker1.getId().toString())) + ", marker2=" + (marker2 == null ? "null" : (marker2.getId() == null ? "no id" : marker2.getId().toString())) + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", primaryIdentifier=\"" + primaryIdentifier + "\", type=\"" + type + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("marker1".equals(fieldName)) {
            if (marker1 instanceof ProxyReference) {
                return ((ProxyReference) marker1).getObject();
            } else {
                return marker1;
            }
        }
        if ("marker2".equals(fieldName)) {
            if (marker2 instanceof ProxyReference) {
                return ((ProxyReference) marker2).getObject();
            } else {
                return marker2;
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
        if (!org.intermine.model.bio.MarkerRelationship.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("marker1".equals(fieldName)) {
            return marker1;
        }
        if ("marker2".equals(fieldName)) {
            return marker2;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.MarkerRelationship.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("marker1".equals(fieldName)) {
            marker1 = (org.intermine.model.InterMineObject) value;
        } else if ("marker2".equals(fieldName)) {
            marker2 = (org.intermine.model.InterMineObject) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.MarkerRelationship.class.equals(getClass())) {
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
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("marker1".equals(fieldName)) {
            return org.intermine.model.bio.Marker.class;
        }
        if ("marker2".equals(fieldName)) {
            return org.intermine.model.bio.Marker.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.MarkerRelationship.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.MarkerRelationship.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.MarkerRelationship.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.MarkerRelationship");
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
        if (type != null) {
            sb.append("$_^atype$_^");
            String string = type;
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
        if (marker1 != null) {
            sb.append("$_^rmarker1$_^").append(marker1.getId());
        }
        if (marker2 != null) {
            sb.append("$_^rmarker2$_^").append(marker2.getId());
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
        if (!org.intermine.model.bio.MarkerRelationship.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.MarkerRelationship)");
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
            if ((i < notXml.length) && "atype".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                type = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rmarker1".equals(notXml[i])) {
                i++;
                marker1 = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Marker.class);
                i++;
            };
            if ((i < notXml.length) &&"rmarker2".equals(notXml[i])) {
                i++;
                marker2 = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Marker.class);
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
            if (!org.intermine.model.bio.MarkerRelationship.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if (!org.intermine.model.bio.MarkerRelationship.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.MarkerRelationship.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
