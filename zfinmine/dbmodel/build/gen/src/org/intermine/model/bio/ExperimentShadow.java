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
public class ExperimentShadow implements Experiment, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Experiment.class;
    // Ref: org.intermine.model.bio.Analysis.publication
    protected org.intermine.model.InterMineObject publication;
    public org.intermine.model.bio.Publication getPublication() { if (publication instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Publication) ((org.intermine.objectstore.proxy.ProxyReference) publication).getObject()); }; return (org.intermine.model.bio.Publication) publication; }
    public void setPublication(final org.intermine.model.bio.Publication publication) { this.publication = publication; }
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication) { this.publication = publication; }
    public org.intermine.model.InterMineObject proxGetPublication() { return publication; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Experiment && id != null) ? id.equals(((Experiment)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Experiment [id=\"" + id + "\", publication=" + (publication == null ? "null" : (publication.getId() == null ? "no id" : publication.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("publication".equals(fieldName)) {
            if (publication instanceof ProxyReference) {
                return ((ProxyReference) publication).getObject();
            } else {
                return publication;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Experiment.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("publication".equals(fieldName)) {
            return publication;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Experiment.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("publication".equals(fieldName)) {
            publication = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Experiment.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("publication".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Experiment.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Experiment.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Experiment.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Experiment");
        if (publication != null) {
            sb.append("$_^rpublication$_^").append(publication.getId());
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
        if (!org.intermine.model.bio.Experiment.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Experiment)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) &&"rpublication".equals(notXml[i])) {
                i++;
                publication = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Publication.class);
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
            if (!org.intermine.model.bio.Experiment.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if (!org.intermine.model.bio.Experiment.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Experiment.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
