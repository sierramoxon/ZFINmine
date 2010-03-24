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
public class EnvironmentShadow implements Environment, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Environment.class;
    // Attr: org.intermine.model.bio.Environment.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.Environment.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Ref: org.intermine.model.bio.Environment.publication
    protected org.intermine.model.InterMineObject publication;
    public org.intermine.model.bio.Publication getPublication() { if (publication instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Publication) ((org.intermine.objectstore.proxy.ProxyReference) publication).getObject()); }; return (org.intermine.model.bio.Publication) publication; }
    public void setPublication(final org.intermine.model.bio.Publication publication) { this.publication = publication; }
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication) { this.publication = publication; }
    public org.intermine.model.InterMineObject proxGetPublication() { return publication; }

    // Col: org.intermine.model.bio.Environment.conditions
    protected java.util.Set<org.intermine.model.bio.EnvironmentalCondition> conditions = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.EnvironmentalCondition> getConditions() { return conditions; }
    public void setConditions(final java.util.Set<org.intermine.model.bio.EnvironmentalCondition> conditions) { this.conditions = conditions; }
    public void addConditions(final org.intermine.model.bio.EnvironmentalCondition arg) { conditions.add(arg); }

    // Col: org.intermine.model.bio.Environment.genotypeEnvironments
    protected java.util.Set<org.intermine.model.bio.GenotypeEnvironment> genotypeEnvironments = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.GenotypeEnvironment> getGenotypeEnvironments() { return genotypeEnvironments; }
    public void setGenotypeEnvironments(final java.util.Set<org.intermine.model.bio.GenotypeEnvironment> genotypeEnvironments) { this.genotypeEnvironments = genotypeEnvironments; }
    public void addGenotypeEnvironments(final org.intermine.model.bio.GenotypeEnvironment arg) { genotypeEnvironments.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Environment && id != null) ? id.equals(((Environment)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Environment [id=\"" + id + "\", name=\"" + name + "\", primaryIdentifier=\"" + primaryIdentifier + "\", publication=" + (publication == null ? "null" : (publication.getId() == null ? "no id" : publication.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("publication".equals(fieldName)) {
            if (publication instanceof ProxyReference) {
                return ((ProxyReference) publication).getObject();
            } else {
                return publication;
            }
        }
        if ("conditions".equals(fieldName)) {
            return conditions;
        }
        if ("genotypeEnvironments".equals(fieldName)) {
            return genotypeEnvironments;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Environment.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("publication".equals(fieldName)) {
            return publication;
        }
        if ("conditions".equals(fieldName)) {
            return conditions;
        }
        if ("genotypeEnvironments".equals(fieldName)) {
            return genotypeEnvironments;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Environment.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("publication".equals(fieldName)) {
            publication = (org.intermine.model.InterMineObject) value;
        } else if ("conditions".equals(fieldName)) {
            conditions = (java.util.Set) value;
        } else if ("genotypeEnvironments".equals(fieldName)) {
            genotypeEnvironments = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Environment.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("publication".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("conditions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("genotypeEnvironments".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Environment.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Environment.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Environment.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Environment");
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
        if (!org.intermine.model.bio.Environment.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Environment)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
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
        conditions = new ProxyCollection(os, this, "conditions", org.intermine.model.bio.EnvironmentalCondition.class);
        genotypeEnvironments = new ProxyCollection(os, this, "genotypeEnvironments", org.intermine.model.bio.GenotypeEnvironment.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("conditions".equals(fieldName)) {
            conditions.add((org.intermine.model.bio.EnvironmentalCondition) element);
        } else if ("genotypeEnvironments".equals(fieldName)) {
            genotypeEnvironments.add((org.intermine.model.bio.GenotypeEnvironment) element);
        } else {
            if (!org.intermine.model.bio.Environment.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("conditions".equals(fieldName)) {
            return org.intermine.model.bio.EnvironmentalCondition.class;
        }
        if ("genotypeEnvironments".equals(fieldName)) {
            return org.intermine.model.bio.GenotypeEnvironment.class;
        }
        if (!org.intermine.model.bio.Environment.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Environment.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
