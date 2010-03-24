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
public class PhenotypeShadow implements Phenotype, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Phenotype.class;
    // Attr: org.intermine.model.bio.Phenotype.tag
    protected java.lang.String tag;
    public java.lang.String getTag() { return tag; }
    public void setTag(final java.lang.String tag) { this.tag = tag; }

    // Attr: org.intermine.model.bio.Phenotype.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Ref: org.intermine.model.bio.Phenotype.startStage
    protected org.intermine.model.InterMineObject startStage;
    public org.intermine.model.bio.OntologyTerm getStartStage() { if (startStage instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.OntologyTerm) ((org.intermine.objectstore.proxy.ProxyReference) startStage).getObject()); }; return (org.intermine.model.bio.OntologyTerm) startStage; }
    public void setStartStage(final org.intermine.model.bio.OntologyTerm startStage) { this.startStage = startStage; }
    public void proxyStartStage(final org.intermine.objectstore.proxy.ProxyReference startStage) { this.startStage = startStage; }
    public org.intermine.model.InterMineObject proxGetStartStage() { return startStage; }

    // Ref: org.intermine.model.bio.Phenotype.genotypeEnvironment
    protected org.intermine.model.InterMineObject genotypeEnvironment;
    public org.intermine.model.bio.GenotypeEnvironment getGenotypeEnvironment() { if (genotypeEnvironment instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.GenotypeEnvironment) ((org.intermine.objectstore.proxy.ProxyReference) genotypeEnvironment).getObject()); }; return (org.intermine.model.bio.GenotypeEnvironment) genotypeEnvironment; }
    public void setGenotypeEnvironment(final org.intermine.model.bio.GenotypeEnvironment genotypeEnvironment) { this.genotypeEnvironment = genotypeEnvironment; }
    public void proxyGenotypeEnvironment(final org.intermine.objectstore.proxy.ProxyReference genotypeEnvironment) { this.genotypeEnvironment = genotypeEnvironment; }
    public org.intermine.model.InterMineObject proxGetGenotypeEnvironment() { return genotypeEnvironment; }

    // Ref: org.intermine.model.bio.Phenotype.phenotypeTerm
    protected org.intermine.model.InterMineObject phenotypeTerm;
    public org.intermine.model.bio.PATOTerm getPhenotypeTerm() { if (phenotypeTerm instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.PATOTerm) ((org.intermine.objectstore.proxy.ProxyReference) phenotypeTerm).getObject()); }; return (org.intermine.model.bio.PATOTerm) phenotypeTerm; }
    public void setPhenotypeTerm(final org.intermine.model.bio.PATOTerm phenotypeTerm) { this.phenotypeTerm = phenotypeTerm; }
    public void proxyPhenotypeTerm(final org.intermine.objectstore.proxy.ProxyReference phenotypeTerm) { this.phenotypeTerm = phenotypeTerm; }
    public org.intermine.model.InterMineObject proxGetPhenotypeTerm() { return phenotypeTerm; }

    // Ref: org.intermine.model.bio.Phenotype.publication
    protected org.intermine.model.InterMineObject publication;
    public org.intermine.model.bio.Publication getPublication() { if (publication instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Publication) ((org.intermine.objectstore.proxy.ProxyReference) publication).getObject()); }; return (org.intermine.model.bio.Publication) publication; }
    public void setPublication(final org.intermine.model.bio.Publication publication) { this.publication = publication; }
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication) { this.publication = publication; }
    public org.intermine.model.InterMineObject proxGetPublication() { return publication; }

    // Ref: org.intermine.model.bio.Phenotype.superTerm
    protected org.intermine.model.InterMineObject superTerm;
    public org.intermine.model.bio.OntologyTerm getSuperTerm() { if (superTerm instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.OntologyTerm) ((org.intermine.objectstore.proxy.ProxyReference) superTerm).getObject()); }; return (org.intermine.model.bio.OntologyTerm) superTerm; }
    public void setSuperTerm(final org.intermine.model.bio.OntologyTerm superTerm) { this.superTerm = superTerm; }
    public void proxySuperTerm(final org.intermine.objectstore.proxy.ProxyReference superTerm) { this.superTerm = superTerm; }
    public org.intermine.model.InterMineObject proxGetSuperTerm() { return superTerm; }

    // Ref: org.intermine.model.bio.Phenotype.endStage
    protected org.intermine.model.InterMineObject endStage;
    public org.intermine.model.bio.OntologyTerm getEndStage() { if (endStage instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.OntologyTerm) ((org.intermine.objectstore.proxy.ProxyReference) endStage).getObject()); }; return (org.intermine.model.bio.OntologyTerm) endStage; }
    public void setEndStage(final org.intermine.model.bio.OntologyTerm endStage) { this.endStage = endStage; }
    public void proxyEndStage(final org.intermine.objectstore.proxy.ProxyReference endStage) { this.endStage = endStage; }
    public org.intermine.model.InterMineObject proxGetEndStage() { return endStage; }

    // Ref: org.intermine.model.bio.Phenotype.subTerm
    protected org.intermine.model.InterMineObject subTerm;
    public org.intermine.model.bio.OntologyTerm getSubTerm() { if (subTerm instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.OntologyTerm) ((org.intermine.objectstore.proxy.ProxyReference) subTerm).getObject()); }; return (org.intermine.model.bio.OntologyTerm) subTerm; }
    public void setSubTerm(final org.intermine.model.bio.OntologyTerm subTerm) { this.subTerm = subTerm; }
    public void proxySubTerm(final org.intermine.objectstore.proxy.ProxyReference subTerm) { this.subTerm = subTerm; }
    public org.intermine.model.InterMineObject proxGetSubTerm() { return subTerm; }

    // Col: org.intermine.model.bio.Phenotype.figures
    protected java.util.Set<org.intermine.model.bio.Figure> figures = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Figure> getFigures() { return figures; }
    public void setFigures(final java.util.Set<org.intermine.model.bio.Figure> figures) { this.figures = figures; }
    public void addFigures(final org.intermine.model.bio.Figure arg) { figures.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Phenotype && id != null) ? id.equals(((Phenotype)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Phenotype [endStage=" + (endStage == null ? "null" : (endStage.getId() == null ? "no id" : endStage.getId().toString())) + ", genotypeEnvironment=" + (genotypeEnvironment == null ? "null" : (genotypeEnvironment.getId() == null ? "no id" : genotypeEnvironment.getId().toString())) + ", id=\"" + id + "\", phenotypeTerm=" + (phenotypeTerm == null ? "null" : (phenotypeTerm.getId() == null ? "no id" : phenotypeTerm.getId().toString())) + ", primaryIdentifier=\"" + primaryIdentifier + "\", publication=" + (publication == null ? "null" : (publication.getId() == null ? "no id" : publication.getId().toString())) + ", startStage=" + (startStage == null ? "null" : (startStage.getId() == null ? "no id" : startStage.getId().toString())) + ", subTerm=" + (subTerm == null ? "null" : (subTerm.getId() == null ? "no id" : subTerm.getId().toString())) + ", superTerm=" + (superTerm == null ? "null" : (superTerm.getId() == null ? "no id" : superTerm.getId().toString())) + ", tag=\"" + tag + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("tag".equals(fieldName)) {
            return tag;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("startStage".equals(fieldName)) {
            if (startStage instanceof ProxyReference) {
                return ((ProxyReference) startStage).getObject();
            } else {
                return startStage;
            }
        }
        if ("genotypeEnvironment".equals(fieldName)) {
            if (genotypeEnvironment instanceof ProxyReference) {
                return ((ProxyReference) genotypeEnvironment).getObject();
            } else {
                return genotypeEnvironment;
            }
        }
        if ("phenotypeTerm".equals(fieldName)) {
            if (phenotypeTerm instanceof ProxyReference) {
                return ((ProxyReference) phenotypeTerm).getObject();
            } else {
                return phenotypeTerm;
            }
        }
        if ("publication".equals(fieldName)) {
            if (publication instanceof ProxyReference) {
                return ((ProxyReference) publication).getObject();
            } else {
                return publication;
            }
        }
        if ("superTerm".equals(fieldName)) {
            if (superTerm instanceof ProxyReference) {
                return ((ProxyReference) superTerm).getObject();
            } else {
                return superTerm;
            }
        }
        if ("endStage".equals(fieldName)) {
            if (endStage instanceof ProxyReference) {
                return ((ProxyReference) endStage).getObject();
            } else {
                return endStage;
            }
        }
        if ("subTerm".equals(fieldName)) {
            if (subTerm instanceof ProxyReference) {
                return ((ProxyReference) subTerm).getObject();
            } else {
                return subTerm;
            }
        }
        if ("figures".equals(fieldName)) {
            return figures;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Phenotype.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("tag".equals(fieldName)) {
            return tag;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("startStage".equals(fieldName)) {
            return startStage;
        }
        if ("genotypeEnvironment".equals(fieldName)) {
            return genotypeEnvironment;
        }
        if ("phenotypeTerm".equals(fieldName)) {
            return phenotypeTerm;
        }
        if ("publication".equals(fieldName)) {
            return publication;
        }
        if ("superTerm".equals(fieldName)) {
            return superTerm;
        }
        if ("endStage".equals(fieldName)) {
            return endStage;
        }
        if ("subTerm".equals(fieldName)) {
            return subTerm;
        }
        if ("figures".equals(fieldName)) {
            return figures;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Phenotype.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("tag".equals(fieldName)) {
            tag = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("startStage".equals(fieldName)) {
            startStage = (org.intermine.model.InterMineObject) value;
        } else if ("genotypeEnvironment".equals(fieldName)) {
            genotypeEnvironment = (org.intermine.model.InterMineObject) value;
        } else if ("phenotypeTerm".equals(fieldName)) {
            phenotypeTerm = (org.intermine.model.InterMineObject) value;
        } else if ("publication".equals(fieldName)) {
            publication = (org.intermine.model.InterMineObject) value;
        } else if ("superTerm".equals(fieldName)) {
            superTerm = (org.intermine.model.InterMineObject) value;
        } else if ("endStage".equals(fieldName)) {
            endStage = (org.intermine.model.InterMineObject) value;
        } else if ("subTerm".equals(fieldName)) {
            subTerm = (org.intermine.model.InterMineObject) value;
        } else if ("figures".equals(fieldName)) {
            figures = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Phenotype.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("tag".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("startStage".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTerm.class;
        }
        if ("genotypeEnvironment".equals(fieldName)) {
            return org.intermine.model.bio.GenotypeEnvironment.class;
        }
        if ("phenotypeTerm".equals(fieldName)) {
            return org.intermine.model.bio.PATOTerm.class;
        }
        if ("publication".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("superTerm".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTerm.class;
        }
        if ("endStage".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTerm.class;
        }
        if ("subTerm".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTerm.class;
        }
        if ("figures".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Phenotype.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Phenotype.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Phenotype.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Phenotype");
        if (tag != null) {
            sb.append("$_^atag$_^");
            String string = tag;
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
        if (startStage != null) {
            sb.append("$_^rstartStage$_^").append(startStage.getId());
        }
        if (genotypeEnvironment != null) {
            sb.append("$_^rgenotypeEnvironment$_^").append(genotypeEnvironment.getId());
        }
        if (phenotypeTerm != null) {
            sb.append("$_^rphenotypeTerm$_^").append(phenotypeTerm.getId());
        }
        if (publication != null) {
            sb.append("$_^rpublication$_^").append(publication.getId());
        }
        if (superTerm != null) {
            sb.append("$_^rsuperTerm$_^").append(superTerm.getId());
        }
        if (endStage != null) {
            sb.append("$_^rendStage$_^").append(endStage.getId());
        }
        if (subTerm != null) {
            sb.append("$_^rsubTerm$_^").append(subTerm.getId());
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
        if (!org.intermine.model.bio.Phenotype.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Phenotype)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "atag".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                tag = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) &&"rstartStage".equals(notXml[i])) {
                i++;
                startStage = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.OntologyTerm.class);
                i++;
            };
            if ((i < notXml.length) &&"rgenotypeEnvironment".equals(notXml[i])) {
                i++;
                genotypeEnvironment = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.GenotypeEnvironment.class);
                i++;
            };
            if ((i < notXml.length) &&"rphenotypeTerm".equals(notXml[i])) {
                i++;
                phenotypeTerm = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.PATOTerm.class);
                i++;
            };
            if ((i < notXml.length) &&"rpublication".equals(notXml[i])) {
                i++;
                publication = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Publication.class);
                i++;
            };
            if ((i < notXml.length) &&"rsuperTerm".equals(notXml[i])) {
                i++;
                superTerm = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.OntologyTerm.class);
                i++;
            };
            if ((i < notXml.length) &&"rendStage".equals(notXml[i])) {
                i++;
                endStage = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.OntologyTerm.class);
                i++;
            };
            if ((i < notXml.length) &&"rsubTerm".equals(notXml[i])) {
                i++;
                subTerm = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.OntologyTerm.class);
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
        figures = new ProxyCollection(os, this, "figures", org.intermine.model.bio.Figure.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("figures".equals(fieldName)) {
            figures.add((org.intermine.model.bio.Figure) element);
        } else {
            if (!org.intermine.model.bio.Phenotype.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("figures".equals(fieldName)) {
            return org.intermine.model.bio.Figure.class;
        }
        if (!org.intermine.model.bio.Phenotype.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Phenotype.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
