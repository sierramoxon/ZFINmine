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
public class OrthologueEvidenceShadow implements OrthologueEvidence, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = OrthologueEvidence.class;
    // Attr: org.intermine.model.bio.OrthologueEvidence.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Ref: org.intermine.model.bio.OrthologueEvidence.evidenceCode
    protected org.intermine.model.InterMineObject evidenceCode;
    public org.intermine.model.bio.OrthologueEvidenceCode getEvidenceCode() { if (evidenceCode instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.OrthologueEvidenceCode) ((org.intermine.objectstore.proxy.ProxyReference) evidenceCode).getObject()); }; return (org.intermine.model.bio.OrthologueEvidenceCode) evidenceCode; }
    public void setEvidenceCode(final org.intermine.model.bio.OrthologueEvidenceCode evidenceCode) { this.evidenceCode = evidenceCode; }
    public void proxyEvidenceCode(final org.intermine.objectstore.proxy.ProxyReference evidenceCode) { this.evidenceCode = evidenceCode; }
    public org.intermine.model.InterMineObject proxGetEvidenceCode() { return evidenceCode; }

    // Col: org.intermine.model.bio.OrthologueEvidence.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof OrthologueEvidence && id != null) ? id.equals(((OrthologueEvidence)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "OrthologueEvidence [evidenceCode=" + (evidenceCode == null ? "null" : (evidenceCode.getId() == null ? "no id" : evidenceCode.getId().toString())) + ", id=\"" + id + "\", primaryIdentifier=\"" + primaryIdentifier + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("evidenceCode".equals(fieldName)) {
            if (evidenceCode instanceof ProxyReference) {
                return ((ProxyReference) evidenceCode).getObject();
            } else {
                return evidenceCode;
            }
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.OrthologueEvidence.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("evidenceCode".equals(fieldName)) {
            return evidenceCode;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.OrthologueEvidence.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("evidenceCode".equals(fieldName)) {
            evidenceCode = (org.intermine.model.InterMineObject) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.OrthologueEvidence.class.equals(getClass())) {
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
        if ("evidenceCode".equals(fieldName)) {
            return org.intermine.model.bio.OrthologueEvidenceCode.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.OrthologueEvidence.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.OrthologueEvidence.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.OrthologueEvidence.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.OrthologueEvidence");
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
        if (evidenceCode != null) {
            sb.append("$_^revidenceCode$_^").append(evidenceCode.getId());
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
        if (!org.intermine.model.bio.OrthologueEvidence.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.OrthologueEvidence)");
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
            if ((i < notXml.length) &&"revidenceCode".equals(notXml[i])) {
                i++;
                evidenceCode = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.OrthologueEvidenceCode.class);
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
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else {
            if (!org.intermine.model.bio.OrthologueEvidence.class.equals(getClass())) {
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
        if (!org.intermine.model.bio.OrthologueEvidence.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.OrthologueEvidence.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
