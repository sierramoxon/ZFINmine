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
public class AnnotationShadow implements Annotation, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Annotation.class;
    // Attr: org.intermine.model.bio.Annotation.qualifier
    protected java.lang.String qualifier;
    public java.lang.String getQualifier() { return qualifier; }
    public void setQualifier(final java.lang.String qualifier) { this.qualifier = qualifier; }

    // Ref: org.intermine.model.bio.Annotation.property
    protected org.intermine.model.InterMineObject property;
    public org.intermine.model.bio.BioProperty getProperty() { if (property instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioProperty) ((org.intermine.objectstore.proxy.ProxyReference) property).getObject()); }; return (org.intermine.model.bio.BioProperty) property; }
    public void setProperty(final org.intermine.model.bio.BioProperty property) { this.property = property; }
    public void proxyProperty(final org.intermine.objectstore.proxy.ProxyReference property) { this.property = property; }
    public org.intermine.model.InterMineObject proxGetProperty() { return property; }

    // Ref: org.intermine.model.bio.Annotation.subject
    protected org.intermine.model.InterMineObject subject;
    public org.intermine.model.bio.BioEntity getSubject() { if (subject instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) subject).getObject()); }; return (org.intermine.model.bio.BioEntity) subject; }
    public void setSubject(final org.intermine.model.bio.BioEntity subject) { this.subject = subject; }
    public void proxySubject(final org.intermine.objectstore.proxy.ProxyReference subject) { this.subject = subject; }
    public org.intermine.model.InterMineObject proxGetSubject() { return subject; }

    // Col: org.intermine.model.bio.Annotation.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Col: org.intermine.model.bio.Annotation.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Annotation && id != null) ? id.equals(((Annotation)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Annotation [id=\"" + id + "\", property=" + (property == null ? "null" : (property.getId() == null ? "no id" : property.getId().toString())) + ", qualifier=\"" + qualifier + "\", subject=" + (subject == null ? "null" : (subject.getId() == null ? "no id" : subject.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("qualifier".equals(fieldName)) {
            return qualifier;
        }
        if ("property".equals(fieldName)) {
            if (property instanceof ProxyReference) {
                return ((ProxyReference) property).getObject();
            } else {
                return property;
            }
        }
        if ("subject".equals(fieldName)) {
            if (subject instanceof ProxyReference) {
                return ((ProxyReference) subject).getObject();
            } else {
                return subject;
            }
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Annotation.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("qualifier".equals(fieldName)) {
            return qualifier;
        }
        if ("property".equals(fieldName)) {
            return property;
        }
        if ("subject".equals(fieldName)) {
            return subject;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Annotation.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("qualifier".equals(fieldName)) {
            qualifier = (java.lang.String) value;
        } else if ("property".equals(fieldName)) {
            property = (org.intermine.model.InterMineObject) value;
        } else if ("subject".equals(fieldName)) {
            subject = (org.intermine.model.InterMineObject) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Annotation.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("qualifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("property".equals(fieldName)) {
            return org.intermine.model.bio.BioProperty.class;
        }
        if ("subject".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Annotation.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Annotation.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Annotation.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Annotation");
        if (qualifier != null) {
            sb.append("$_^aqualifier$_^");
            String string = qualifier;
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
        if (property != null) {
            sb.append("$_^rproperty$_^").append(property.getId());
        }
        if (subject != null) {
            sb.append("$_^rsubject$_^").append(subject.getId());
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
        if (!org.intermine.model.bio.Annotation.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Annotation)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aqualifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                qualifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rproperty".equals(notXml[i])) {
                i++;
                property = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioProperty.class);
                i++;
            };
            if ((i < notXml.length) &&"rsubject".equals(notXml[i])) {
                i++;
                subject = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
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
        dataSets = new ProxyCollection(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
        publications = new ProxyCollection(os, this, "publications", org.intermine.model.bio.Publication.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else {
            if (!org.intermine.model.bio.Annotation.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if (!org.intermine.model.bio.Annotation.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Annotation.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
