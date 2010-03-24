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
public class SynonymShadow implements Synonym, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Synonym.class;
    // Attr: org.intermine.model.bio.Synonym.value
    protected java.lang.String value;
    public java.lang.String getValue() { return value; }
    public void setValue(final java.lang.String value) { this.value = value; }

    // Attr: org.intermine.model.bio.Synonym.isPrimary
    protected java.lang.Boolean isPrimary;
    public java.lang.Boolean getIsPrimary() { return isPrimary; }
    public void setIsPrimary(final java.lang.Boolean isPrimary) { this.isPrimary = isPrimary; }

    // Attr: org.intermine.model.bio.Synonym.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Ref: org.intermine.model.bio.Synonym.subject
    protected org.intermine.model.InterMineObject subject;
    public org.intermine.model.bio.BioEntity getSubject() { if (subject instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) subject).getObject()); }; return (org.intermine.model.bio.BioEntity) subject; }
    public void setSubject(final org.intermine.model.bio.BioEntity subject) { this.subject = subject; }
    public void proxySubject(final org.intermine.objectstore.proxy.ProxyReference subject) { this.subject = subject; }
    public org.intermine.model.InterMineObject proxGetSubject() { return subject; }

    // Col: org.intermine.model.bio.Synonym.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Synonym && id != null) ? id.equals(((Synonym)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Synonym [id=\"" + id + "\", isPrimary=\"" + isPrimary + "\", subject=" + (subject == null ? "null" : (subject.getId() == null ? "no id" : subject.getId().toString())) + ", type=\"" + type + "\", value=\"" + value + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("value".equals(fieldName)) {
            return value;
        }
        if ("isPrimary".equals(fieldName)) {
            return isPrimary;
        }
        if ("type".equals(fieldName)) {
            return type;
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
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Synonym.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("value".equals(fieldName)) {
            return value;
        }
        if ("isPrimary".equals(fieldName)) {
            return isPrimary;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("subject".equals(fieldName)) {
            return subject;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Synonym.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("value".equals(fieldName)) {
            this.value = (java.lang.String) value;
        } else if ("isPrimary".equals(fieldName)) {
            isPrimary = (java.lang.Boolean) value;
        } else if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("subject".equals(fieldName)) {
            subject = (org.intermine.model.InterMineObject) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Synonym.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("value".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("isPrimary".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("subject".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Synonym.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Synonym.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Synonym.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Synonym");
        if (value != null) {
            sb.append("$_^avalue$_^");
            String string = value;
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
        if (isPrimary != null) {
            sb.append("$_^aisPrimary$_^").append(isPrimary);
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
        if (!org.intermine.model.bio.Synonym.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Synonym)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "avalue".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                value = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aisPrimary".equals(notXml[i])) {
                i++;
                isPrimary = Boolean.valueOf(notXml[i]);
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
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else {
            if (!org.intermine.model.bio.Synonym.class.equals(getClass())) {
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
        if (!org.intermine.model.bio.Synonym.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Synonym.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
