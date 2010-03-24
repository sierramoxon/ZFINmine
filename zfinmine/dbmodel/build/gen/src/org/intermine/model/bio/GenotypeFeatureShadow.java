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
public class GenotypeFeatureShadow implements GenotypeFeature, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = GenotypeFeature.class;
    // Attr: org.intermine.model.bio.GenotypeFeature.featureZygosity
    protected java.lang.String featureZygosity;
    public java.lang.String getFeatureZygosity() { return featureZygosity; }
    public void setFeatureZygosity(final java.lang.String featureZygosity) { this.featureZygosity = featureZygosity; }

    // Attr: org.intermine.model.bio.GenotypeFeature.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Ref: org.intermine.model.bio.GenotypeFeature.genotype
    protected org.intermine.model.InterMineObject genotype;
    public org.intermine.model.bio.Genotype getGenotype() { if (genotype instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Genotype) ((org.intermine.objectstore.proxy.ProxyReference) genotype).getObject()); }; return (org.intermine.model.bio.Genotype) genotype; }
    public void setGenotype(final org.intermine.model.bio.Genotype genotype) { this.genotype = genotype; }
    public void proxyGenotype(final org.intermine.objectstore.proxy.ProxyReference genotype) { this.genotype = genotype; }
    public org.intermine.model.InterMineObject proxGetGenotype() { return genotype; }

    // Ref: org.intermine.model.bio.GenotypeFeature.feature
    protected org.intermine.model.InterMineObject feature;
    public org.intermine.model.bio.Feature getFeature() { if (feature instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Feature) ((org.intermine.objectstore.proxy.ProxyReference) feature).getObject()); }; return (org.intermine.model.bio.Feature) feature; }
    public void setFeature(final org.intermine.model.bio.Feature feature) { this.feature = feature; }
    public void proxyFeature(final org.intermine.objectstore.proxy.ProxyReference feature) { this.feature = feature; }
    public org.intermine.model.InterMineObject proxGetFeature() { return feature; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof GenotypeFeature && id != null) ? id.equals(((GenotypeFeature)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "GenotypeFeature [feature=" + (feature == null ? "null" : (feature.getId() == null ? "no id" : feature.getId().toString())) + ", featureZygosity=\"" + featureZygosity + "\", genotype=" + (genotype == null ? "null" : (genotype.getId() == null ? "no id" : genotype.getId().toString())) + ", id=\"" + id + "\", primaryIdentifier=\"" + primaryIdentifier + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("featureZygosity".equals(fieldName)) {
            return featureZygosity;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("genotype".equals(fieldName)) {
            if (genotype instanceof ProxyReference) {
                return ((ProxyReference) genotype).getObject();
            } else {
                return genotype;
            }
        }
        if ("feature".equals(fieldName)) {
            if (feature instanceof ProxyReference) {
                return ((ProxyReference) feature).getObject();
            } else {
                return feature;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GenotypeFeature.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("featureZygosity".equals(fieldName)) {
            return featureZygosity;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("genotype".equals(fieldName)) {
            return genotype;
        }
        if ("feature".equals(fieldName)) {
            return feature;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GenotypeFeature.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("featureZygosity".equals(fieldName)) {
            featureZygosity = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("genotype".equals(fieldName)) {
            genotype = (org.intermine.model.InterMineObject) value;
        } else if ("feature".equals(fieldName)) {
            feature = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.GenotypeFeature.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("featureZygosity".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("genotype".equals(fieldName)) {
            return org.intermine.model.bio.Genotype.class;
        }
        if ("feature".equals(fieldName)) {
            return org.intermine.model.bio.Feature.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.GenotypeFeature.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.GenotypeFeature.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.GenotypeFeature.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.GenotypeFeature");
        if (featureZygosity != null) {
            sb.append("$_^afeatureZygosity$_^");
            String string = featureZygosity;
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
        if (genotype != null) {
            sb.append("$_^rgenotype$_^").append(genotype.getId());
        }
        if (feature != null) {
            sb.append("$_^rfeature$_^").append(feature.getId());
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
        if (!org.intermine.model.bio.GenotypeFeature.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.GenotypeFeature)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "afeatureZygosity".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                featureZygosity = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) &&"rgenotype".equals(notXml[i])) {
                i++;
                genotype = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Genotype.class);
                i++;
            };
            if ((i < notXml.length) &&"rfeature".equals(notXml[i])) {
                i++;
                feature = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Feature.class);
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
            if (!org.intermine.model.bio.GenotypeFeature.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if (!org.intermine.model.bio.GenotypeFeature.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.GenotypeFeature.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
