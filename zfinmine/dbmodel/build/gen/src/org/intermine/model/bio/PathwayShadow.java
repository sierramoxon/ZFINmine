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
public class PathwayShadow implements Pathway, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Pathway.class;
    // Attr: org.intermine.model.bio.Pathway.identifier
    protected java.lang.String identifier;
    public java.lang.String getIdentifier() { return identifier; }
    public void setIdentifier(final java.lang.String identifier) { this.identifier = identifier; }

    // Attr: org.intermine.model.bio.Pathway.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Col: org.intermine.model.bio.Pathway.genes
    protected java.util.Set<org.intermine.model.bio.Gene> genes = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Gene> getGenes() { return genes; }
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes) { this.genes = genes; }
    public void addGenes(final org.intermine.model.bio.Gene arg) { genes.add(arg); }

    // Col: org.intermine.model.bio.BioProperty.annotations
    protected java.util.Set<org.intermine.model.bio.Annotation> annotations = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Annotation> getAnnotations() { return annotations; }
    public void setAnnotations(final java.util.Set<org.intermine.model.bio.Annotation> annotations) { this.annotations = annotations; }
    public void addAnnotations(final org.intermine.model.bio.Annotation arg) { annotations.add(arg); }

    // Col: org.intermine.model.bio.BioProperty.evidence
    protected java.util.Set<org.intermine.model.bio.Evidence> evidence = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Evidence> getEvidence() { return evidence; }
    public void setEvidence(final java.util.Set<org.intermine.model.bio.Evidence> evidence) { this.evidence = evidence; }
    public void addEvidence(final org.intermine.model.bio.Evidence arg) { evidence.add(arg); }

    // Col: org.intermine.model.bio.BioProperty.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Pathway && id != null) ? id.equals(((Pathway)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Pathway [id=\"" + id + "\", identifier=\"" + identifier + "\", name=\"" + name + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("annotations".equals(fieldName)) {
            return annotations;
        }
        if ("evidence".equals(fieldName)) {
            return evidence;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Pathway.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("annotations".equals(fieldName)) {
            return annotations;
        }
        if ("evidence".equals(fieldName)) {
            return evidence;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Pathway.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("identifier".equals(fieldName)) {
            identifier = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("genes".equals(fieldName)) {
            genes = (java.util.Set) value;
        } else if ("annotations".equals(fieldName)) {
            annotations = (java.util.Set) value;
        } else if ("evidence".equals(fieldName)) {
            evidence = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Pathway.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("identifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("genes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("annotations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("evidence".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Pathway.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Pathway.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Pathway.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Pathway");
        if (identifier != null) {
            sb.append("$_^aidentifier$_^");
            String string = identifier;
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
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.Pathway.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Pathway)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aidentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                identifier = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        genes = new ProxyCollection(os, this, "genes", org.intermine.model.bio.Gene.class);
        annotations = new ProxyCollection(os, this, "annotations", org.intermine.model.bio.Annotation.class);
        evidence = new ProxyCollection(os, this, "evidence", org.intermine.model.bio.Evidence.class);
        dataSets = new ProxyCollection(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("genes".equals(fieldName)) {
            genes.add((org.intermine.model.bio.Gene) element);
        } else if ("annotations".equals(fieldName)) {
            annotations.add((org.intermine.model.bio.Annotation) element);
        } else if ("evidence".equals(fieldName)) {
            evidence.add((org.intermine.model.bio.Evidence) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else {
            if (!org.intermine.model.bio.Pathway.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("genes".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("annotations".equals(fieldName)) {
            return org.intermine.model.bio.Annotation.class;
        }
        if ("evidence".equals(fieldName)) {
            return org.intermine.model.bio.Evidence.class;
        }
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if (!org.intermine.model.bio.Pathway.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Pathway.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
