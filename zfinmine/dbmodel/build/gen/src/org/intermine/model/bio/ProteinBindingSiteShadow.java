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
public class ProteinBindingSiteShadow implements ProteinBindingSite, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = ProteinBindingSite.class;
    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof ProteinBindingSite && id != null) ? id.equals(((ProteinBindingSite)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "ProteinBindingSite [id=\"" + id + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ProteinBindingSite.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ProteinBindingSite.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ProteinBindingSite.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.ProteinBindingSite.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ProteinBindingSite.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ProteinBindingSite.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ProteinBindingSite");
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.ProteinBindingSite.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ProteinBindingSite)");
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
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        {
            if (!org.intermine.model.bio.ProteinBindingSite.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if (!org.intermine.model.bio.ProteinBindingSite.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ProteinBindingSite.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
