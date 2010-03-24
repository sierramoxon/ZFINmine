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
public class FigureShadow implements Figure, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Figure.class;
    // Attr: org.intermine.model.bio.Figure.label
    protected java.lang.String label;
    public java.lang.String getLabel() { return label; }
    public void setLabel(final java.lang.String label) { this.label = label; }

    // Attr: org.intermine.model.bio.Figure.caption
    protected java.lang.String caption;
    public java.lang.String getCaption() { return caption; }
    public void setCaption(final java.lang.String caption) { this.caption = caption; }

    // Attr: org.intermine.model.bio.Figure.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Ref: org.intermine.model.bio.Figure.publication
    protected org.intermine.model.InterMineObject publication;
    public org.intermine.model.bio.Publication getPublication() { if (publication instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Publication) ((org.intermine.objectstore.proxy.ProxyReference) publication).getObject()); }; return (org.intermine.model.bio.Publication) publication; }
    public void setPublication(final org.intermine.model.bio.Publication publication) { this.publication = publication; }
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication) { this.publication = publication; }
    public org.intermine.model.InterMineObject proxGetPublication() { return publication; }

    // Col: org.intermine.model.bio.Figure.expressionResults
    protected java.util.Set<org.intermine.model.bio.ExpressionResult> expressionResults = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressionResults() { return expressionResults; }
    public void setExpressionResults(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressionResults) { this.expressionResults = expressionResults; }
    public void addExpressionResults(final org.intermine.model.bio.ExpressionResult arg) { expressionResults.add(arg); }

    // Col: org.intermine.model.bio.Figure.phenotypes
    protected java.util.Set<org.intermine.model.bio.Phenotype> phenotypes = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypes() { return phenotypes; }
    public void setPhenotypes(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypes) { this.phenotypes = phenotypes; }
    public void addPhenotypes(final org.intermine.model.bio.Phenotype arg) { phenotypes.add(arg); }

    // Col: org.intermine.model.bio.Figure.images
    protected java.util.Set<org.intermine.model.bio.Image> images = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Image> getImages() { return images; }
    public void setImages(final java.util.Set<org.intermine.model.bio.Image> images) { this.images = images; }
    public void addImages(final org.intermine.model.bio.Image arg) { images.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Figure && id != null) ? id.equals(((Figure)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Figure [caption=\"" + caption + "\", id=\"" + id + "\", label=\"" + label + "\", primaryIdentifier=\"" + primaryIdentifier + "\", publication=" + (publication == null ? "null" : (publication.getId() == null ? "no id" : publication.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("label".equals(fieldName)) {
            return label;
        }
        if ("caption".equals(fieldName)) {
            return caption;
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
        if ("expressionResults".equals(fieldName)) {
            return expressionResults;
        }
        if ("phenotypes".equals(fieldName)) {
            return phenotypes;
        }
        if ("images".equals(fieldName)) {
            return images;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Figure.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("label".equals(fieldName)) {
            return label;
        }
        if ("caption".equals(fieldName)) {
            return caption;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("publication".equals(fieldName)) {
            return publication;
        }
        if ("expressionResults".equals(fieldName)) {
            return expressionResults;
        }
        if ("phenotypes".equals(fieldName)) {
            return phenotypes;
        }
        if ("images".equals(fieldName)) {
            return images;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Figure.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("label".equals(fieldName)) {
            label = (java.lang.String) value;
        } else if ("caption".equals(fieldName)) {
            caption = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("publication".equals(fieldName)) {
            publication = (org.intermine.model.InterMineObject) value;
        } else if ("expressionResults".equals(fieldName)) {
            expressionResults = (java.util.Set) value;
        } else if ("phenotypes".equals(fieldName)) {
            phenotypes = (java.util.Set) value;
        } else if ("images".equals(fieldName)) {
            images = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Figure.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("label".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("caption".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("publication".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("expressionResults".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("phenotypes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("images".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Figure.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Figure.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Figure.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Figure");
        if (label != null) {
            sb.append("$_^alabel$_^");
            String string = label;
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
        if (caption != null) {
            sb.append("$_^acaption$_^");
            String string = caption;
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
        if (!org.intermine.model.bio.Figure.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Figure)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "alabel".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                label = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "acaption".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                caption = string == null ? notXml[i] : string.toString();
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
        expressionResults = new ProxyCollection(os, this, "expressionResults", org.intermine.model.bio.ExpressionResult.class);
        phenotypes = new ProxyCollection(os, this, "phenotypes", org.intermine.model.bio.Phenotype.class);
        images = new ProxyCollection(os, this, "images", org.intermine.model.bio.Image.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("expressionResults".equals(fieldName)) {
            expressionResults.add((org.intermine.model.bio.ExpressionResult) element);
        } else if ("phenotypes".equals(fieldName)) {
            phenotypes.add((org.intermine.model.bio.Phenotype) element);
        } else if ("images".equals(fieldName)) {
            images.add((org.intermine.model.bio.Image) element);
        } else {
            if (!org.intermine.model.bio.Figure.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("expressionResults".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionResult.class;
        }
        if ("phenotypes".equals(fieldName)) {
            return org.intermine.model.bio.Phenotype.class;
        }
        if ("images".equals(fieldName)) {
            return org.intermine.model.bio.Image.class;
        }
        if (!org.intermine.model.bio.Figure.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Figure.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
