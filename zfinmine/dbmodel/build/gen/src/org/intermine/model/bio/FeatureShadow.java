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
public class FeatureShadow implements Feature, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Feature.class;
    // Attr: org.intermine.model.bio.Feature.featureName
    protected java.lang.String featureName;
    public java.lang.String getFeatureName() { return featureName; }
    public void setFeatureName(final java.lang.String featureName) { this.featureName = featureName; }

    // Attr: org.intermine.model.bio.Feature.typeDisplay
    protected java.lang.String typeDisplay;
    public java.lang.String getTypeDisplay() { return typeDisplay; }
    public void setTypeDisplay(final java.lang.String typeDisplay) { this.typeDisplay = typeDisplay; }

    // Attr: org.intermine.model.bio.Feature.featureAbbrev
    protected java.lang.String featureAbbrev;
    public java.lang.String getFeatureAbbrev() { return featureAbbrev; }
    public void setFeatureAbbrev(final java.lang.String featureAbbrev) { this.featureAbbrev = featureAbbrev; }

    // Attr: org.intermine.model.bio.Feature.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Attr: org.intermine.model.bio.Feature.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Ref: org.intermine.model.bio.Feature.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.Feature.genotypes
    protected java.util.Set<org.intermine.model.bio.GenotypeFeature> genotypes = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.GenotypeFeature> getGenotypes() { return genotypes; }
    public void setGenotypes(final java.util.Set<org.intermine.model.bio.GenotypeFeature> genotypes) { this.genotypes = genotypes; }
    public void addGenotypes(final org.intermine.model.bio.GenotypeFeature arg) { genotypes.add(arg); }

    // Col: org.intermine.model.bio.Feature.relatedMarkers
    protected java.util.Set<org.intermine.model.bio.FeatureMarkerRelationship> relatedMarkers = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.FeatureMarkerRelationship> getRelatedMarkers() { return relatedMarkers; }
    public void setRelatedMarkers(final java.util.Set<org.intermine.model.bio.FeatureMarkerRelationship> relatedMarkers) { this.relatedMarkers = relatedMarkers; }
    public void addRelatedMarkers(final org.intermine.model.bio.FeatureMarkerRelationship arg) { relatedMarkers.add(arg); }

    // Col: org.intermine.model.bio.Feature.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Col: org.intermine.model.bio.Feature.externalLinks
    protected java.util.Set<org.intermine.model.bio.ExternalLink> externalLinks = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.ExternalLink> getExternalLinks() { return externalLinks; }
    public void setExternalLinks(final java.util.Set<org.intermine.model.bio.ExternalLink> externalLinks) { this.externalLinks = externalLinks; }
    public void addExternalLinks(final org.intermine.model.bio.ExternalLink arg) { externalLinks.add(arg); }

    // Col: org.intermine.model.bio.Feature.genes
    protected java.util.Set<org.intermine.model.bio.Gene> genes = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Gene> getGenes() { return genes; }
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes) { this.genes = genes; }
    public void addGenes(final org.intermine.model.bio.Gene arg) { genes.add(arg); }

    // Col: org.intermine.model.bio.Feature.insertionConstructs
    protected java.util.Set<org.intermine.model.bio.Construct> insertionConstructs = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Construct> getInsertionConstructs() { return insertionConstructs; }
    public void setInsertionConstructs(final java.util.Set<org.intermine.model.bio.Construct> insertionConstructs) { this.insertionConstructs = insertionConstructs; }
    public void addInsertionConstructs(final org.intermine.model.bio.Construct arg) { insertionConstructs.add(arg); }

    // Col: org.intermine.model.bio.Feature.innocuousConstructs
    protected java.util.Set<org.intermine.model.bio.Construct> innocuousConstructs = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Construct> getInnocuousConstructs() { return innocuousConstructs; }
    public void setInnocuousConstructs(final java.util.Set<org.intermine.model.bio.Construct> innocuousConstructs) { this.innocuousConstructs = innocuousConstructs; }
    public void addInnocuousConstructs(final org.intermine.model.bio.Construct arg) { innocuousConstructs.add(arg); }

    // Col: org.intermine.model.bio.Feature.phenotypicConstructs
    protected java.util.Set<org.intermine.model.bio.Construct> phenotypicConstructs = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Construct> getPhenotypicConstructs() { return phenotypicConstructs; }
    public void setPhenotypicConstructs(final java.util.Set<org.intermine.model.bio.Construct> phenotypicConstructs) { this.phenotypicConstructs = phenotypicConstructs; }
    public void addPhenotypicConstructs(final org.intermine.model.bio.Construct arg) { phenotypicConstructs.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Feature && id != null) ? id.equals(((Feature)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Feature [featureAbbrev=\"" + featureAbbrev + "\", featureName=\"" + featureName + "\", id=\"" + id + "\", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", primaryIdentifier=\"" + primaryIdentifier + "\", type=\"" + type + "\", typeDisplay=\"" + typeDisplay + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("featureName".equals(fieldName)) {
            return featureName;
        }
        if ("typeDisplay".equals(fieldName)) {
            return typeDisplay;
        }
        if ("featureAbbrev".equals(fieldName)) {
            return featureAbbrev;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("genotypes".equals(fieldName)) {
            return genotypes;
        }
        if ("relatedMarkers".equals(fieldName)) {
            return relatedMarkers;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("externalLinks".equals(fieldName)) {
            return externalLinks;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("insertionConstructs".equals(fieldName)) {
            return insertionConstructs;
        }
        if ("innocuousConstructs".equals(fieldName)) {
            return innocuousConstructs;
        }
        if ("phenotypicConstructs".equals(fieldName)) {
            return phenotypicConstructs;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Feature.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("featureName".equals(fieldName)) {
            return featureName;
        }
        if ("typeDisplay".equals(fieldName)) {
            return typeDisplay;
        }
        if ("featureAbbrev".equals(fieldName)) {
            return featureAbbrev;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("genotypes".equals(fieldName)) {
            return genotypes;
        }
        if ("relatedMarkers".equals(fieldName)) {
            return relatedMarkers;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("externalLinks".equals(fieldName)) {
            return externalLinks;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("insertionConstructs".equals(fieldName)) {
            return insertionConstructs;
        }
        if ("innocuousConstructs".equals(fieldName)) {
            return innocuousConstructs;
        }
        if ("phenotypicConstructs".equals(fieldName)) {
            return phenotypicConstructs;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Feature.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("featureName".equals(fieldName)) {
            featureName = (java.lang.String) value;
        } else if ("typeDisplay".equals(fieldName)) {
            typeDisplay = (java.lang.String) value;
        } else if ("featureAbbrev".equals(fieldName)) {
            featureAbbrev = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("genotypes".equals(fieldName)) {
            genotypes = (java.util.Set) value;
        } else if ("relatedMarkers".equals(fieldName)) {
            relatedMarkers = (java.util.Set) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("externalLinks".equals(fieldName)) {
            externalLinks = (java.util.Set) value;
        } else if ("genes".equals(fieldName)) {
            genes = (java.util.Set) value;
        } else if ("insertionConstructs".equals(fieldName)) {
            insertionConstructs = (java.util.Set) value;
        } else if ("innocuousConstructs".equals(fieldName)) {
            innocuousConstructs = (java.util.Set) value;
        } else if ("phenotypicConstructs".equals(fieldName)) {
            phenotypicConstructs = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Feature.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("featureName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("typeDisplay".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("featureAbbrev".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("genotypes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("relatedMarkers".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("externalLinks".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("genes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("insertionConstructs".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("innocuousConstructs".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("phenotypicConstructs".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Feature.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Feature.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Feature.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Feature");
        if (featureName != null) {
            sb.append("$_^afeatureName$_^");
            String string = featureName;
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
        if (typeDisplay != null) {
            sb.append("$_^atypeDisplay$_^");
            String string = typeDisplay;
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
        if (featureAbbrev != null) {
            sb.append("$_^afeatureAbbrev$_^");
            String string = featureAbbrev;
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
        if (!org.intermine.model.bio.Feature.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Feature)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "afeatureName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                featureName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atypeDisplay".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                typeDisplay = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "afeatureAbbrev".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                featureAbbrev = string == null ? notXml[i] : string.toString();
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
        genotypes = new ProxyCollection(os, this, "genotypes", org.intermine.model.bio.GenotypeFeature.class);
        relatedMarkers = new ProxyCollection(os, this, "relatedMarkers", org.intermine.model.bio.FeatureMarkerRelationship.class);
        publications = new ProxyCollection(os, this, "publications", org.intermine.model.bio.Publication.class);
        externalLinks = new ProxyCollection(os, this, "externalLinks", org.intermine.model.bio.ExternalLink.class);
        genes = new ProxyCollection(os, this, "genes", org.intermine.model.bio.Gene.class);
        insertionConstructs = new ProxyCollection(os, this, "insertionConstructs", org.intermine.model.bio.Construct.class);
        innocuousConstructs = new ProxyCollection(os, this, "innocuousConstructs", org.intermine.model.bio.Construct.class);
        phenotypicConstructs = new ProxyCollection(os, this, "phenotypicConstructs", org.intermine.model.bio.Construct.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("genotypes".equals(fieldName)) {
            genotypes.add((org.intermine.model.bio.GenotypeFeature) element);
        } else if ("relatedMarkers".equals(fieldName)) {
            relatedMarkers.add((org.intermine.model.bio.FeatureMarkerRelationship) element);
        } else if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else if ("externalLinks".equals(fieldName)) {
            externalLinks.add((org.intermine.model.bio.ExternalLink) element);
        } else if ("genes".equals(fieldName)) {
            genes.add((org.intermine.model.bio.Gene) element);
        } else if ("insertionConstructs".equals(fieldName)) {
            insertionConstructs.add((org.intermine.model.bio.Construct) element);
        } else if ("innocuousConstructs".equals(fieldName)) {
            innocuousConstructs.add((org.intermine.model.bio.Construct) element);
        } else if ("phenotypicConstructs".equals(fieldName)) {
            phenotypicConstructs.add((org.intermine.model.bio.Construct) element);
        } else {
            if (!org.intermine.model.bio.Feature.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("genotypes".equals(fieldName)) {
            return org.intermine.model.bio.GenotypeFeature.class;
        }
        if ("relatedMarkers".equals(fieldName)) {
            return org.intermine.model.bio.FeatureMarkerRelationship.class;
        }
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("externalLinks".equals(fieldName)) {
            return org.intermine.model.bio.ExternalLink.class;
        }
        if ("genes".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("insertionConstructs".equals(fieldName)) {
            return org.intermine.model.bio.Construct.class;
        }
        if ("innocuousConstructs".equals(fieldName)) {
            return org.intermine.model.bio.Construct.class;
        }
        if ("phenotypicConstructs".equals(fieldName)) {
            return org.intermine.model.bio.Construct.class;
        }
        if (!org.intermine.model.bio.Feature.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Feature.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
