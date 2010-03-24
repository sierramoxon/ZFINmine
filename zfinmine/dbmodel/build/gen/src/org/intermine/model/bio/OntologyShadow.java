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
public class OntologyShadow implements Ontology, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Ontology.class;
    // Attr: org.intermine.model.bio.Ontology.url
    protected java.lang.String url;
    public java.lang.String getUrl() { return url; }
    public void setUrl(final java.lang.String url) { this.url = url; }

    // Attr: org.intermine.model.bio.InfoSource.title
    protected java.lang.String title;
    public java.lang.String getTitle() { return title; }
    public void setTitle(final java.lang.String title) { this.title = title; }

    // Col: org.intermine.model.bio.Evidence.relations
    protected java.util.Set<org.intermine.model.bio.Relation> relations = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Relation> getRelations() { return relations; }
    public void setRelations(final java.util.Set<org.intermine.model.bio.Relation> relations) { this.relations = relations; }
    public void addRelations(final org.intermine.model.bio.Relation arg) { relations.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Ontology && id != null) ? id.equals(((Ontology)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Ontology [id=\"" + id + "\", title=\"" + title + "\", url=\"" + url + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("url".equals(fieldName)) {
            return url;
        }
        if ("title".equals(fieldName)) {
            return title;
        }
        if ("relations".equals(fieldName)) {
            return relations;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Ontology.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("url".equals(fieldName)) {
            return url;
        }
        if ("title".equals(fieldName)) {
            return title;
        }
        if ("relations".equals(fieldName)) {
            return relations;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Ontology.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("url".equals(fieldName)) {
            url = (java.lang.String) value;
        } else if ("title".equals(fieldName)) {
            title = (java.lang.String) value;
        } else if ("relations".equals(fieldName)) {
            relations = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Ontology.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("url".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("title".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("relations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Ontology.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Ontology.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Ontology.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Ontology");
        if (url != null) {
            sb.append("$_^aurl$_^");
            String string = url;
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
        if (title != null) {
            sb.append("$_^atitle$_^");
            String string = title;
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
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.Ontology.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Ontology)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aurl".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                url = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atitle".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                title = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        relations = new ProxyCollection(os, this, "relations", org.intermine.model.bio.Relation.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("relations".equals(fieldName)) {
            relations.add((org.intermine.model.bio.Relation) element);
        } else {
            if (!org.intermine.model.bio.Ontology.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("relations".equals(fieldName)) {
            return org.intermine.model.bio.Relation.class;
        }
        if (!org.intermine.model.bio.Ontology.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Ontology.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
