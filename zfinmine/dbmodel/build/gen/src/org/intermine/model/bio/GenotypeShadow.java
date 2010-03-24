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
public class GenotypeShadow implements Genotype, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Genotype.class;
    // Attr: org.intermine.model.bio.Genotype.backgrounds
    protected java.lang.String backgrounds;
    public java.lang.String getBackgrounds() { return backgrounds; }
    public void setBackgrounds(final java.lang.String backgrounds) { this.backgrounds = backgrounds; }

    // Attr: org.intermine.model.bio.Genotype.parentalZygocity
    protected java.lang.String parentalZygocity;
    public java.lang.String getParentalZygocity() { return parentalZygocity; }
    public void setParentalZygocity(final java.lang.String parentalZygocity) { this.parentalZygocity = parentalZygocity; }

    // Attr: org.intermine.model.bio.Genotype.genoHandle
    protected java.lang.String genoHandle;
    public java.lang.String getGenoHandle() { return genoHandle; }
    public void setGenoHandle(final java.lang.String genoHandle) { this.genoHandle = genoHandle; }

    // Attr: org.intermine.model.bio.Genotype.genoDisplayName
    protected java.lang.String genoDisplayName;
    public java.lang.String getGenoDisplayName() { return genoDisplayName; }
    public void setGenoDisplayName(final java.lang.String genoDisplayName) { this.genoDisplayName = genoDisplayName; }

    // Attr: org.intermine.model.bio.Genotype.isExtinct
    protected java.lang.Boolean isExtinct;
    public java.lang.Boolean getIsExtinct() { return isExtinct; }
    public void setIsExtinct(final java.lang.Boolean isExtinct) { this.isExtinct = isExtinct; }

    // Attr: org.intermine.model.bio.Genotype.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Attr: org.intermine.model.bio.Genotype.isWildType
    protected java.lang.Boolean isWildType;
    public java.lang.Boolean getIsWildType() { return isWildType; }
    public void setIsWildType(final java.lang.Boolean isWildType) { this.isWildType = isWildType; }

    // Ref: org.intermine.model.bio.Genotype.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.Genotype.features
    protected java.util.Set<org.intermine.model.bio.GenotypeFeature> features = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.GenotypeFeature> getFeatures() { return features; }
    public void setFeatures(final java.util.Set<org.intermine.model.bio.GenotypeFeature> features) { this.features = features; }
    public void addFeatures(final org.intermine.model.bio.GenotypeFeature arg) { features.add(arg); }

    // Col: org.intermine.model.bio.Genotype.genes
    protected java.util.Set<org.intermine.model.bio.Gene> genes = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Gene> getGenes() { return genes; }
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes) { this.genes = genes; }
    public void addGenes(final org.intermine.model.bio.Gene arg) { genes.add(arg); }

    // Col: org.intermine.model.bio.Genotype.genotypeEnvironments
    protected java.util.Set<org.intermine.model.bio.GenotypeEnvironment> genotypeEnvironments = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.GenotypeEnvironment> getGenotypeEnvironments() { return genotypeEnvironments; }
    public void setGenotypeEnvironments(final java.util.Set<org.intermine.model.bio.GenotypeEnvironment> genotypeEnvironments) { this.genotypeEnvironments = genotypeEnvironments; }
    public void addGenotypeEnvironments(final org.intermine.model.bio.GenotypeEnvironment arg) { genotypeEnvironments.add(arg); }

    // Col: org.intermine.model.bio.Genotype.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Genotype && id != null) ? id.equals(((Genotype)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Genotype [backgrounds=\"" + backgrounds + "\", genoDisplayName=\"" + genoDisplayName + "\", genoHandle=\"" + genoHandle + "\", id=\"" + id + "\", isExtinct=\"" + isExtinct + "\", isWildType=\"" + isWildType + "\", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", parentalZygocity=\"" + parentalZygocity + "\", primaryIdentifier=\"" + primaryIdentifier + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("backgrounds".equals(fieldName)) {
            return backgrounds;
        }
        if ("parentalZygocity".equals(fieldName)) {
            return parentalZygocity;
        }
        if ("genoHandle".equals(fieldName)) {
            return genoHandle;
        }
        if ("genoDisplayName".equals(fieldName)) {
            return genoDisplayName;
        }
        if ("isExtinct".equals(fieldName)) {
            return isExtinct;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("isWildType".equals(fieldName)) {
            return isWildType;
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("features".equals(fieldName)) {
            return features;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("genotypeEnvironments".equals(fieldName)) {
            return genotypeEnvironments;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Genotype.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("backgrounds".equals(fieldName)) {
            return backgrounds;
        }
        if ("parentalZygocity".equals(fieldName)) {
            return parentalZygocity;
        }
        if ("genoHandle".equals(fieldName)) {
            return genoHandle;
        }
        if ("genoDisplayName".equals(fieldName)) {
            return genoDisplayName;
        }
        if ("isExtinct".equals(fieldName)) {
            return isExtinct;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("isWildType".equals(fieldName)) {
            return isWildType;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("features".equals(fieldName)) {
            return features;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("genotypeEnvironments".equals(fieldName)) {
            return genotypeEnvironments;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Genotype.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("backgrounds".equals(fieldName)) {
            backgrounds = (java.lang.String) value;
        } else if ("parentalZygocity".equals(fieldName)) {
            parentalZygocity = (java.lang.String) value;
        } else if ("genoHandle".equals(fieldName)) {
            genoHandle = (java.lang.String) value;
        } else if ("genoDisplayName".equals(fieldName)) {
            genoDisplayName = (java.lang.String) value;
        } else if ("isExtinct".equals(fieldName)) {
            isExtinct = (java.lang.Boolean) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("isWildType".equals(fieldName)) {
            isWildType = (java.lang.Boolean) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("features".equals(fieldName)) {
            features = (java.util.Set) value;
        } else if ("genes".equals(fieldName)) {
            genes = (java.util.Set) value;
        } else if ("genotypeEnvironments".equals(fieldName)) {
            genotypeEnvironments = (java.util.Set) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Genotype.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("backgrounds".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("parentalZygocity".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("genoHandle".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("genoDisplayName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("isExtinct".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("isWildType".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("features".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("genes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("genotypeEnvironments".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Genotype.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Genotype.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Genotype.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Genotype");
        if (backgrounds != null) {
            sb.append("$_^abackgrounds$_^");
            String string = backgrounds;
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
        if (parentalZygocity != null) {
            sb.append("$_^aparentalZygocity$_^");
            String string = parentalZygocity;
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
        if (genoHandle != null) {
            sb.append("$_^agenoHandle$_^");
            String string = genoHandle;
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
        if (genoDisplayName != null) {
            sb.append("$_^agenoDisplayName$_^");
            String string = genoDisplayName;
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
        if (isExtinct != null) {
            sb.append("$_^aisExtinct$_^").append(isExtinct);
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
        if (isWildType != null) {
            sb.append("$_^aisWildType$_^").append(isWildType);
        }
        if (organism != null) {
            sb.append("$_^rorganism$_^").append(organism.getId());
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
        if (!org.intermine.model.bio.Genotype.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Genotype)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "abackgrounds".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                backgrounds = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aparentalZygocity".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                parentalZygocity = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "agenoHandle".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                genoHandle = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "agenoDisplayName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                genoDisplayName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aisExtinct".equals(notXml[i])) {
                i++;
                isExtinct = Boolean.valueOf(notXml[i]);
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
            if ((i < notXml.length) && "aisWildType".equals(notXml[i])) {
                i++;
                isWildType = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rorganism".equals(notXml[i])) {
                i++;
                organism = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Organism.class);
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
        features = new ProxyCollection(os, this, "features", org.intermine.model.bio.GenotypeFeature.class);
        genes = new ProxyCollection(os, this, "genes", org.intermine.model.bio.Gene.class);
        genotypeEnvironments = new ProxyCollection(os, this, "genotypeEnvironments", org.intermine.model.bio.GenotypeEnvironment.class);
        publications = new ProxyCollection(os, this, "publications", org.intermine.model.bio.Publication.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("features".equals(fieldName)) {
            features.add((org.intermine.model.bio.GenotypeFeature) element);
        } else if ("genes".equals(fieldName)) {
            genes.add((org.intermine.model.bio.Gene) element);
        } else if ("genotypeEnvironments".equals(fieldName)) {
            genotypeEnvironments.add((org.intermine.model.bio.GenotypeEnvironment) element);
        } else if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else {
            if (!org.intermine.model.bio.Genotype.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("features".equals(fieldName)) {
            return org.intermine.model.bio.GenotypeFeature.class;
        }
        if ("genes".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("genotypeEnvironments".equals(fieldName)) {
            return org.intermine.model.bio.GenotypeEnvironment.class;
        }
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if (!org.intermine.model.bio.Genotype.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Genotype.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
