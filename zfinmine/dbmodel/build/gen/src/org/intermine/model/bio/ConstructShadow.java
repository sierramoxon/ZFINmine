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
public class ConstructShadow implements Construct, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Construct.class;
    // Attr: org.intermine.model.bio.Construct.symbol
    protected java.lang.String symbol;
    public java.lang.String getSymbol() { return symbol; }
    public void setSymbol(final java.lang.String symbol) { this.symbol = symbol; }

    // Attr: org.intermine.model.bio.Construct.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.Construct.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Attr: org.intermine.model.bio.Construct.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Ref: org.intermine.model.bio.Construct.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.Construct.CDS
    protected java.util.Set<org.intermine.model.bio.Gene> CDS = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Gene> getcDS() { return CDS; }
    public void setcDS(final java.util.Set<org.intermine.model.bio.Gene> CDS) { this.CDS = CDS; }
    public void addcDS(final org.intermine.model.bio.Gene arg) { CDS.add(arg); }

    // Col: org.intermine.model.bio.Construct.Promoter
    protected java.util.Set<org.intermine.model.bio.Gene> Promoter = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Gene> getpromoter() { return Promoter; }
    public void setpromoter(final java.util.Set<org.intermine.model.bio.Gene> Promoter) { this.Promoter = Promoter; }
    public void addpromoter(final org.intermine.model.bio.Gene arg) { Promoter.add(arg); }

    // Col: org.intermine.model.bio.Construct.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Col: org.intermine.model.bio.Construct.EFGs
    protected java.util.Set<org.intermine.model.bio.EFG> EFGs = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.EFG> geteFGs() { return EFGs; }
    public void seteFGs(final java.util.Set<org.intermine.model.bio.EFG> EFGs) { this.EFGs = EFGs; }
    public void addeFGs(final org.intermine.model.bio.EFG arg) { EFGs.add(arg); }

    // Col: org.intermine.model.bio.Construct.codingSequences
    protected java.util.Set<org.intermine.model.bio.Gene> codingSequences = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Gene> getCodingSequences() { return codingSequences; }
    public void setCodingSequences(final java.util.Set<org.intermine.model.bio.Gene> codingSequences) { this.codingSequences = codingSequences; }
    public void addCodingSequences(final org.intermine.model.bio.Gene arg) { codingSequences.add(arg); }

    // Col: org.intermine.model.bio.Construct.contains
    protected java.util.Set<org.intermine.model.bio.Region> contains = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Region> getContains() { return contains; }
    public void setContains(final java.util.Set<org.intermine.model.bio.Region> contains) { this.contains = contains; }
    public void addContains(final org.intermine.model.bio.Region arg) { contains.add(arg); }

    // Col: org.intermine.model.bio.Construct.promoters
    protected java.util.Set<org.intermine.model.bio.Gene> promoters = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Gene> getPromoters() { return promoters; }
    public void setPromoters(final java.util.Set<org.intermine.model.bio.Gene> promoters) { this.promoters = promoters; }
    public void addPromoters(final org.intermine.model.bio.Gene arg) { promoters.add(arg); }

    // Col: org.intermine.model.bio.Construct.externalLinks
    protected java.util.Set<org.intermine.model.bio.ExternalLink> externalLinks = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.ExternalLink> getExternalLinks() { return externalLinks; }
    public void setExternalLinks(final java.util.Set<org.intermine.model.bio.ExternalLink> externalLinks) { this.externalLinks = externalLinks; }
    public void addExternalLinks(final org.intermine.model.bio.ExternalLink arg) { externalLinks.add(arg); }

    // Col: org.intermine.model.bio.Construct.phenotypicAlleles
    protected java.util.Set<org.intermine.model.bio.Feature> phenotypicAlleles = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Feature> getPhenotypicAlleles() { return phenotypicAlleles; }
    public void setPhenotypicAlleles(final java.util.Set<org.intermine.model.bio.Feature> phenotypicAlleles) { this.phenotypicAlleles = phenotypicAlleles; }
    public void addPhenotypicAlleles(final org.intermine.model.bio.Feature arg) { phenotypicAlleles.add(arg); }

    // Col: org.intermine.model.bio.Construct.innocuousAlleles
    protected java.util.Set<org.intermine.model.bio.Feature> innocuousAlleles = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Feature> getInnocuousAlleles() { return innocuousAlleles; }
    public void setInnocuousAlleles(final java.util.Set<org.intermine.model.bio.Feature> innocuousAlleles) { this.innocuousAlleles = innocuousAlleles; }
    public void addInnocuousAlleles(final org.intermine.model.bio.Feature arg) { innocuousAlleles.add(arg); }

    // Col: org.intermine.model.bio.Construct.insertionAlleles
    protected java.util.Set<org.intermine.model.bio.Feature> insertionAlleles = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Feature> getInsertionAlleles() { return insertionAlleles; }
    public void setInsertionAlleles(final java.util.Set<org.intermine.model.bio.Feature> insertionAlleles) { this.insertionAlleles = insertionAlleles; }
    public void addInsertionAlleles(final org.intermine.model.bio.Feature arg) { insertionAlleles.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Construct && id != null) ? id.equals(((Construct)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Construct [id=\"" + id + "\", name=\"" + name + "\", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", primaryIdentifier=\"" + primaryIdentifier + "\", symbol=\"" + symbol + "\", type=\"" + type + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("name".equals(fieldName)) {
            return name;
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
        if ("CDS".equals(fieldName)) {
            return CDS;
        }
        if ("Promoter".equals(fieldName)) {
            return Promoter;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("EFGs".equals(fieldName)) {
            return EFGs;
        }
        if ("codingSequences".equals(fieldName)) {
            return codingSequences;
        }
        if ("contains".equals(fieldName)) {
            return contains;
        }
        if ("promoters".equals(fieldName)) {
            return promoters;
        }
        if ("externalLinks".equals(fieldName)) {
            return externalLinks;
        }
        if ("phenotypicAlleles".equals(fieldName)) {
            return phenotypicAlleles;
        }
        if ("innocuousAlleles".equals(fieldName)) {
            return innocuousAlleles;
        }
        if ("insertionAlleles".equals(fieldName)) {
            return insertionAlleles;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Construct.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("name".equals(fieldName)) {
            return name;
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
        if ("CDS".equals(fieldName)) {
            return CDS;
        }
        if ("Promoter".equals(fieldName)) {
            return Promoter;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("EFGs".equals(fieldName)) {
            return EFGs;
        }
        if ("codingSequences".equals(fieldName)) {
            return codingSequences;
        }
        if ("contains".equals(fieldName)) {
            return contains;
        }
        if ("promoters".equals(fieldName)) {
            return promoters;
        }
        if ("externalLinks".equals(fieldName)) {
            return externalLinks;
        }
        if ("phenotypicAlleles".equals(fieldName)) {
            return phenotypicAlleles;
        }
        if ("innocuousAlleles".equals(fieldName)) {
            return innocuousAlleles;
        }
        if ("insertionAlleles".equals(fieldName)) {
            return insertionAlleles;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Construct.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("symbol".equals(fieldName)) {
            symbol = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("CDS".equals(fieldName)) {
            CDS = (java.util.Set) value;
        } else if ("Promoter".equals(fieldName)) {
            Promoter = (java.util.Set) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("EFGs".equals(fieldName)) {
            EFGs = (java.util.Set) value;
        } else if ("codingSequences".equals(fieldName)) {
            codingSequences = (java.util.Set) value;
        } else if ("contains".equals(fieldName)) {
            contains = (java.util.Set) value;
        } else if ("promoters".equals(fieldName)) {
            promoters = (java.util.Set) value;
        } else if ("externalLinks".equals(fieldName)) {
            externalLinks = (java.util.Set) value;
        } else if ("phenotypicAlleles".equals(fieldName)) {
            phenotypicAlleles = (java.util.Set) value;
        } else if ("innocuousAlleles".equals(fieldName)) {
            innocuousAlleles = (java.util.Set) value;
        } else if ("insertionAlleles".equals(fieldName)) {
            insertionAlleles = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Construct.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("symbol".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
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
        if ("CDS".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("Promoter".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("EFGs".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("codingSequences".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("contains".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("promoters".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("externalLinks".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("phenotypicAlleles".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("innocuousAlleles".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("insertionAlleles".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Construct.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Construct.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Construct.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Construct");
        if (symbol != null) {
            sb.append("$_^asymbol$_^");
            String string = symbol;
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
        if (!org.intermine.model.bio.Construct.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Construct)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "asymbol".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                symbol = string == null ? notXml[i] : string.toString();
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
        CDS = new ProxyCollection(os, this, "CDS", org.intermine.model.bio.Gene.class);
        Promoter = new ProxyCollection(os, this, "Promoter", org.intermine.model.bio.Gene.class);
        publications = new ProxyCollection(os, this, "publications", org.intermine.model.bio.Publication.class);
        EFGs = new ProxyCollection(os, this, "EFGs", org.intermine.model.bio.EFG.class);
        codingSequences = new ProxyCollection(os, this, "codingSequences", org.intermine.model.bio.Gene.class);
        contains = new ProxyCollection(os, this, "contains", org.intermine.model.bio.Region.class);
        promoters = new ProxyCollection(os, this, "promoters", org.intermine.model.bio.Gene.class);
        externalLinks = new ProxyCollection(os, this, "externalLinks", org.intermine.model.bio.ExternalLink.class);
        phenotypicAlleles = new ProxyCollection(os, this, "phenotypicAlleles", org.intermine.model.bio.Feature.class);
        innocuousAlleles = new ProxyCollection(os, this, "innocuousAlleles", org.intermine.model.bio.Feature.class);
        insertionAlleles = new ProxyCollection(os, this, "insertionAlleles", org.intermine.model.bio.Feature.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("CDS".equals(fieldName)) {
            CDS.add((org.intermine.model.bio.Gene) element);
        } else if ("Promoter".equals(fieldName)) {
            Promoter.add((org.intermine.model.bio.Gene) element);
        } else if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else if ("EFGs".equals(fieldName)) {
            EFGs.add((org.intermine.model.bio.EFG) element);
        } else if ("codingSequences".equals(fieldName)) {
            codingSequences.add((org.intermine.model.bio.Gene) element);
        } else if ("contains".equals(fieldName)) {
            contains.add((org.intermine.model.bio.Region) element);
        } else if ("promoters".equals(fieldName)) {
            promoters.add((org.intermine.model.bio.Gene) element);
        } else if ("externalLinks".equals(fieldName)) {
            externalLinks.add((org.intermine.model.bio.ExternalLink) element);
        } else if ("phenotypicAlleles".equals(fieldName)) {
            phenotypicAlleles.add((org.intermine.model.bio.Feature) element);
        } else if ("innocuousAlleles".equals(fieldName)) {
            innocuousAlleles.add((org.intermine.model.bio.Feature) element);
        } else if ("insertionAlleles".equals(fieldName)) {
            insertionAlleles.add((org.intermine.model.bio.Feature) element);
        } else {
            if (!org.intermine.model.bio.Construct.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("CDS".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("Promoter".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("EFGs".equals(fieldName)) {
            return org.intermine.model.bio.EFG.class;
        }
        if ("codingSequences".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("contains".equals(fieldName)) {
            return org.intermine.model.bio.Region.class;
        }
        if ("promoters".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("externalLinks".equals(fieldName)) {
            return org.intermine.model.bio.ExternalLink.class;
        }
        if ("phenotypicAlleles".equals(fieldName)) {
            return org.intermine.model.bio.Feature.class;
        }
        if ("innocuousAlleles".equals(fieldName)) {
            return org.intermine.model.bio.Feature.class;
        }
        if ("insertionAlleles".equals(fieldName)) {
            return org.intermine.model.bio.Feature.class;
        }
        if (!org.intermine.model.bio.Construct.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Construct.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
