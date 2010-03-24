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
public class ExternalLinkShadow implements ExternalLink, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = ExternalLink.class;
    // Attr: org.intermine.model.bio.ExternalLink.linkType
    protected java.lang.String linkType;
    public java.lang.String getLinkType() { return linkType; }
    public void setLinkType(final java.lang.String linkType) { this.linkType = linkType; }

    // Attr: org.intermine.model.bio.ExternalLink.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Attr: org.intermine.model.bio.ExternalLink.accessionNumber
    protected java.lang.String accessionNumber;
    public java.lang.String getAccessionNumber() { return accessionNumber; }
    public void setAccessionNumber(final java.lang.String accessionNumber) { this.accessionNumber = accessionNumber; }

    // Ref: org.intermine.model.bio.ExternalLink.externalDatabase
    protected org.intermine.model.InterMineObject externalDatabase;
    public org.intermine.model.bio.ExternalDatabase getExternalDatabase() { if (externalDatabase instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.ExternalDatabase) ((org.intermine.objectstore.proxy.ProxyReference) externalDatabase).getObject()); }; return (org.intermine.model.bio.ExternalDatabase) externalDatabase; }
    public void setExternalDatabase(final org.intermine.model.bio.ExternalDatabase externalDatabase) { this.externalDatabase = externalDatabase; }
    public void proxyExternalDatabase(final org.intermine.objectstore.proxy.ProxyReference externalDatabase) { this.externalDatabase = externalDatabase; }
    public org.intermine.model.InterMineObject proxGetExternalDatabase() { return externalDatabase; }

    // Col: org.intermine.model.bio.ExternalLink.expressions
    protected java.util.Set<org.intermine.model.bio.ExpressionResult> expressions = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressions() { return expressions; }
    public void setExpressions(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressions) { this.expressions = expressions; }
    public void addExpressions(final org.intermine.model.bio.ExpressionResult arg) { expressions.add(arg); }

    // Col: org.intermine.model.bio.ExternalLink.features
    protected java.util.Set<org.intermine.model.bio.Feature> features = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Feature> getFeatures() { return features; }
    public void setFeatures(final java.util.Set<org.intermine.model.bio.Feature> features) { this.features = features; }
    public void addFeatures(final org.intermine.model.bio.Feature arg) { features.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof ExternalLink && id != null) ? id.equals(((ExternalLink)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "ExternalLink [accessionNumber=\"" + accessionNumber + "\", externalDatabase=" + (externalDatabase == null ? "null" : (externalDatabase.getId() == null ? "no id" : externalDatabase.getId().toString())) + ", id=\"" + id + "\", linkType=\"" + linkType + "\", primaryIdentifier=\"" + primaryIdentifier + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("linkType".equals(fieldName)) {
            return linkType;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("accessionNumber".equals(fieldName)) {
            return accessionNumber;
        }
        if ("externalDatabase".equals(fieldName)) {
            if (externalDatabase instanceof ProxyReference) {
                return ((ProxyReference) externalDatabase).getObject();
            } else {
                return externalDatabase;
            }
        }
        if ("expressions".equals(fieldName)) {
            return expressions;
        }
        if ("features".equals(fieldName)) {
            return features;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExternalLink.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("linkType".equals(fieldName)) {
            return linkType;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("accessionNumber".equals(fieldName)) {
            return accessionNumber;
        }
        if ("externalDatabase".equals(fieldName)) {
            return externalDatabase;
        }
        if ("expressions".equals(fieldName)) {
            return expressions;
        }
        if ("features".equals(fieldName)) {
            return features;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExternalLink.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("linkType".equals(fieldName)) {
            linkType = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("accessionNumber".equals(fieldName)) {
            accessionNumber = (java.lang.String) value;
        } else if ("externalDatabase".equals(fieldName)) {
            externalDatabase = (org.intermine.model.InterMineObject) value;
        } else if ("expressions".equals(fieldName)) {
            expressions = (java.util.Set) value;
        } else if ("features".equals(fieldName)) {
            features = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ExternalLink.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("linkType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("accessionNumber".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("externalDatabase".equals(fieldName)) {
            return org.intermine.model.bio.ExternalDatabase.class;
        }
        if ("expressions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("features".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.ExternalLink.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ExternalLink.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ExternalLink.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ExternalLink");
        if (linkType != null) {
            sb.append("$_^alinkType$_^");
            String string = linkType;
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
        if (accessionNumber != null) {
            sb.append("$_^aaccessionNumber$_^");
            String string = accessionNumber;
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
        if (externalDatabase != null) {
            sb.append("$_^rexternalDatabase$_^").append(externalDatabase.getId());
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
        if (!org.intermine.model.bio.ExternalLink.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ExternalLink)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "alinkType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                linkType = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "aaccessionNumber".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                accessionNumber = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rexternalDatabase".equals(notXml[i])) {
                i++;
                externalDatabase = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.ExternalDatabase.class);
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
        expressions = new ProxyCollection(os, this, "expressions", org.intermine.model.bio.ExpressionResult.class);
        features = new ProxyCollection(os, this, "features", org.intermine.model.bio.Feature.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("expressions".equals(fieldName)) {
            expressions.add((org.intermine.model.bio.ExpressionResult) element);
        } else if ("features".equals(fieldName)) {
            features.add((org.intermine.model.bio.Feature) element);
        } else {
            if (!org.intermine.model.bio.ExternalLink.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("expressions".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionResult.class;
        }
        if ("features".equals(fieldName)) {
            return org.intermine.model.bio.Feature.class;
        }
        if (!org.intermine.model.bio.ExternalLink.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ExternalLink.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
