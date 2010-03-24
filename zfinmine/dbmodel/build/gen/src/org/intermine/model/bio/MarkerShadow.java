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
public class MarkerShadow implements Marker, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Marker.class;
    // Attr: org.intermine.model.bio.Marker.comments
    protected java.lang.String comments;
    public java.lang.String getComments() { return comments; }
    public void setComments(final java.lang.String comments) { this.comments = comments; }

    // Attr: org.intermine.model.bio.Marker.symbol
    protected java.lang.String symbol;
    public java.lang.String getSymbol() { return symbol; }
    public void setSymbol(final java.lang.String symbol) { this.symbol = symbol; }

    // Attr: org.intermine.model.bio.Marker.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.Marker.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Attr: org.intermine.model.bio.Marker.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Ref: org.intermine.model.bio.Marker.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.Marker.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Col: org.intermine.model.bio.Marker.marker1s
    protected java.util.Set<org.intermine.model.bio.MarkerRelationship> marker1s = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.MarkerRelationship> getMarker1s() { return marker1s; }
    public void setMarker1s(final java.util.Set<org.intermine.model.bio.MarkerRelationship> marker1s) { this.marker1s = marker1s; }
    public void addMarker1s(final org.intermine.model.bio.MarkerRelationship arg) { marker1s.add(arg); }

    // Col: org.intermine.model.bio.Marker.marker2s
    protected java.util.Set<org.intermine.model.bio.MarkerRelationship> marker2s = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.MarkerRelationship> getMarker2s() { return marker2s; }
    public void setMarker2s(final java.util.Set<org.intermine.model.bio.MarkerRelationship> marker2s) { this.marker2s = marker2s; }
    public void addMarker2s(final org.intermine.model.bio.MarkerRelationship arg) { marker2s.add(arg); }

    // Col: org.intermine.model.bio.Marker.relatedFeatures
    protected java.util.Set<org.intermine.model.bio.FeatureMarkerRelationship> relatedFeatures = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.FeatureMarkerRelationship> getRelatedFeatures() { return relatedFeatures; }
    public void setRelatedFeatures(final java.util.Set<org.intermine.model.bio.FeatureMarkerRelationship> relatedFeatures) { this.relatedFeatures = relatedFeatures; }
    public void addRelatedFeatures(final org.intermine.model.bio.FeatureMarkerRelationship arg) { relatedFeatures.add(arg); }

    // Col: org.intermine.model.bio.Marker.externalLinks
    protected java.util.Set<org.intermine.model.bio.ExternalLink> externalLinks = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.ExternalLink> getExternalLinks() { return externalLinks; }
    public void setExternalLinks(final java.util.Set<org.intermine.model.bio.ExternalLink> externalLinks) { this.externalLinks = externalLinks; }
    public void addExternalLinks(final org.intermine.model.bio.ExternalLink arg) { externalLinks.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Marker && id != null) ? id.equals(((Marker)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Marker [comments=\"" + comments + "\", id=\"" + id + "\", name=\"" + name + "\", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", primaryIdentifier=\"" + primaryIdentifier + "\", symbol=\"" + symbol + "\", type=\"" + type + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("comments".equals(fieldName)) {
            return comments;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("marker1s".equals(fieldName)) {
            return marker1s;
        }
        if ("marker2s".equals(fieldName)) {
            return marker2s;
        }
        if ("relatedFeatures".equals(fieldName)) {
            return relatedFeatures;
        }
        if ("externalLinks".equals(fieldName)) {
            return externalLinks;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Marker.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("comments".equals(fieldName)) {
            return comments;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("marker1s".equals(fieldName)) {
            return marker1s;
        }
        if ("marker2s".equals(fieldName)) {
            return marker2s;
        }
        if ("relatedFeatures".equals(fieldName)) {
            return relatedFeatures;
        }
        if ("externalLinks".equals(fieldName)) {
            return externalLinks;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Marker.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("comments".equals(fieldName)) {
            comments = (java.lang.String) value;
        } else if ("symbol".equals(fieldName)) {
            symbol = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("marker1s".equals(fieldName)) {
            marker1s = (java.util.Set) value;
        } else if ("marker2s".equals(fieldName)) {
            marker2s = (java.util.Set) value;
        } else if ("relatedFeatures".equals(fieldName)) {
            relatedFeatures = (java.util.Set) value;
        } else if ("externalLinks".equals(fieldName)) {
            externalLinks = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Marker.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("comments".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("symbol".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("marker1s".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("marker2s".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("relatedFeatures".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("externalLinks".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Marker.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Marker.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Marker.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Marker");
        if (comments != null) {
            sb.append("$_^acomments$_^");
            String string = comments;
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
        if (symbol != null) {
            sb.append("$_^asymbol$_^");
            String string = symbol;
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
        if (name != null) {
            sb.append("$_^aname$_^");
            String string = name;
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
        if (!org.intermine.model.bio.Marker.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Marker)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "acomments".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                comments = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asymbol".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                symbol = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aname".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                name = string == null ? notXml[i] : string.toString();
                i++;
            }
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
        publications = new ProxyCollection(os, this, "publications", org.intermine.model.bio.Publication.class);
        marker1s = new ProxyCollection(os, this, "marker1s", org.intermine.model.bio.MarkerRelationship.class);
        marker2s = new ProxyCollection(os, this, "marker2s", org.intermine.model.bio.MarkerRelationship.class);
        relatedFeatures = new ProxyCollection(os, this, "relatedFeatures", org.intermine.model.bio.FeatureMarkerRelationship.class);
        externalLinks = new ProxyCollection(os, this, "externalLinks", org.intermine.model.bio.ExternalLink.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else if ("marker1s".equals(fieldName)) {
            marker1s.add((org.intermine.model.bio.MarkerRelationship) element);
        } else if ("marker2s".equals(fieldName)) {
            marker2s.add((org.intermine.model.bio.MarkerRelationship) element);
        } else if ("relatedFeatures".equals(fieldName)) {
            relatedFeatures.add((org.intermine.model.bio.FeatureMarkerRelationship) element);
        } else if ("externalLinks".equals(fieldName)) {
            externalLinks.add((org.intermine.model.bio.ExternalLink) element);
        } else {
            if (!org.intermine.model.bio.Marker.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("marker1s".equals(fieldName)) {
            return org.intermine.model.bio.MarkerRelationship.class;
        }
        if ("marker2s".equals(fieldName)) {
            return org.intermine.model.bio.MarkerRelationship.class;
        }
        if ("relatedFeatures".equals(fieldName)) {
            return org.intermine.model.bio.FeatureMarkerRelationship.class;
        }
        if ("externalLinks".equals(fieldName)) {
            return org.intermine.model.bio.ExternalLink.class;
        }
        if (!org.intermine.model.bio.Marker.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Marker.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
