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
public class SymmetricalRelationShadow implements SymmetricalRelation, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = SymmetricalRelation.class;
    // Col: org.intermine.model.bio.SymmetricalRelation.bioEntities
    protected java.util.Set<org.intermine.model.bio.BioEntity> bioEntities = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.BioEntity> getBioEntities() { return bioEntities; }
    public void setBioEntities(final java.util.Set<org.intermine.model.bio.BioEntity> bioEntities) { this.bioEntities = bioEntities; }
    public void addBioEntities(final org.intermine.model.bio.BioEntity arg) { bioEntities.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof SymmetricalRelation && id != null) ? id.equals(((SymmetricalRelation)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "SymmetricalRelation [id=\"" + id + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("bioEntities".equals(fieldName)) {
            return bioEntities;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.SymmetricalRelation.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("bioEntities".equals(fieldName)) {
            return bioEntities;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.SymmetricalRelation.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("bioEntities".equals(fieldName)) {
            bioEntities = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.SymmetricalRelation.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("bioEntities".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.SymmetricalRelation.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.SymmetricalRelation.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.SymmetricalRelation.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.SymmetricalRelation");
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.SymmetricalRelation.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.SymmetricalRelation)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        bioEntities = new ProxyCollection(os, this, "bioEntities", org.intermine.model.bio.BioEntity.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("bioEntities".equals(fieldName)) {
            bioEntities.add((org.intermine.model.bio.BioEntity) element);
        } else {
            if (!org.intermine.model.bio.SymmetricalRelation.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("bioEntities".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if (!org.intermine.model.bio.SymmetricalRelation.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.SymmetricalRelation.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
