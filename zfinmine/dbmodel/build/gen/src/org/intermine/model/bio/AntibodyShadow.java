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
public class AntibodyShadow implements Antibody, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Antibody.class;
    // Attr: org.intermine.model.bio.Antibody.immunogenOrganism
    protected java.lang.String immunogenOrganism;
    public java.lang.String getImmunogenOrganism() { return immunogenOrganism; }
    public void setImmunogenOrganism(final java.lang.String immunogenOrganism) { this.immunogenOrganism = immunogenOrganism; }

    // Attr: org.intermine.model.bio.Antibody.symbol
    protected java.lang.String symbol;
    public java.lang.String getSymbol() { return symbol; }
    public void setSymbol(final java.lang.String symbol) { this.symbol = symbol; }

    // Attr: org.intermine.model.bio.Antibody.clonalType
    protected java.lang.String clonalType;
    public java.lang.String getClonalType() { return clonalType; }
    public void setClonalType(final java.lang.String clonalType) { this.clonalType = clonalType; }

    // Attr: org.intermine.model.bio.Antibody.heavyChainIsotype
    protected java.lang.String heavyChainIsotype;
    public java.lang.String getHeavyChainIsotype() { return heavyChainIsotype; }
    public void setHeavyChainIsotype(final java.lang.String heavyChainIsotype) { this.heavyChainIsotype = heavyChainIsotype; }

    // Attr: org.intermine.model.bio.Antibody.lightChainIsotype
    protected java.lang.String lightChainIsotype;
    public java.lang.String getLightChainIsotype() { return lightChainIsotype; }
    public void setLightChainIsotype(final java.lang.String lightChainIsotype) { this.lightChainIsotype = lightChainIsotype; }

    // Attr: org.intermine.model.bio.Antibody.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.Antibody.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Attr: org.intermine.model.bio.Antibody.hostOrganism
    protected java.lang.String hostOrganism;
    public java.lang.String getHostOrganism() { return hostOrganism; }
    public void setHostOrganism(final java.lang.String hostOrganism) { this.hostOrganism = hostOrganism; }

    // Attr: org.intermine.model.bio.Antibody.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Ref: org.intermine.model.bio.Antibody.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.Antibody.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Col: org.intermine.model.bio.Antibody.expressions
    protected java.util.Set<org.intermine.model.bio.ExpressionResult> expressions = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressions() { return expressions; }
    public void setExpressions(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressions) { this.expressions = expressions; }
    public void addExpressions(final org.intermine.model.bio.ExpressionResult arg) { expressions.add(arg); }

    // Col: org.intermine.model.bio.Antibody.genes
    protected java.util.Set<org.intermine.model.bio.Gene> genes = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Gene> getGenes() { return genes; }
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes) { this.genes = genes; }
    public void addGenes(final org.intermine.model.bio.Gene arg) { genes.add(arg); }

    // Col: org.intermine.model.bio.Antibody.externalLinks
    protected java.util.Set<org.intermine.model.bio.ExternalLink> externalLinks = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.ExternalLink> getExternalLinks() { return externalLinks; }
    public void setExternalLinks(final java.util.Set<org.intermine.model.bio.ExternalLink> externalLinks) { this.externalLinks = externalLinks; }
    public void addExternalLinks(final org.intermine.model.bio.ExternalLink arg) { externalLinks.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Antibody && id != null) ? id.equals(((Antibody)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Antibody [clonalType=\"" + clonalType + "\", heavyChainIsotype=\"" + heavyChainIsotype + "\", hostOrganism=\"" + hostOrganism + "\", id=\"" + id + "\", immunogenOrganism=\"" + immunogenOrganism + "\", lightChainIsotype=\"" + lightChainIsotype + "\", name=\"" + name + "\", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", primaryIdentifier=\"" + primaryIdentifier + "\", symbol=\"" + symbol + "\", type=\"" + type + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("immunogenOrganism".equals(fieldName)) {
            return immunogenOrganism;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("clonalType".equals(fieldName)) {
            return clonalType;
        }
        if ("heavyChainIsotype".equals(fieldName)) {
            return heavyChainIsotype;
        }
        if ("lightChainIsotype".equals(fieldName)) {
            return lightChainIsotype;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("hostOrganism".equals(fieldName)) {
            return hostOrganism;
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
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("expressions".equals(fieldName)) {
            return expressions;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("externalLinks".equals(fieldName)) {
            return externalLinks;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Antibody.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("immunogenOrganism".equals(fieldName)) {
            return immunogenOrganism;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("clonalType".equals(fieldName)) {
            return clonalType;
        }
        if ("heavyChainIsotype".equals(fieldName)) {
            return heavyChainIsotype;
        }
        if ("lightChainIsotype".equals(fieldName)) {
            return lightChainIsotype;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("hostOrganism".equals(fieldName)) {
            return hostOrganism;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("expressions".equals(fieldName)) {
            return expressions;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("externalLinks".equals(fieldName)) {
            return externalLinks;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Antibody.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("immunogenOrganism".equals(fieldName)) {
            immunogenOrganism = (java.lang.String) value;
        } else if ("symbol".equals(fieldName)) {
            symbol = (java.lang.String) value;
        } else if ("clonalType".equals(fieldName)) {
            clonalType = (java.lang.String) value;
        } else if ("heavyChainIsotype".equals(fieldName)) {
            heavyChainIsotype = (java.lang.String) value;
        } else if ("lightChainIsotype".equals(fieldName)) {
            lightChainIsotype = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("hostOrganism".equals(fieldName)) {
            hostOrganism = (java.lang.String) value;
        } else if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("expressions".equals(fieldName)) {
            expressions = (java.util.Set) value;
        } else if ("genes".equals(fieldName)) {
            genes = (java.util.Set) value;
        } else if ("externalLinks".equals(fieldName)) {
            externalLinks = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Antibody.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("immunogenOrganism".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("symbol".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("clonalType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("heavyChainIsotype".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("lightChainIsotype".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("hostOrganism".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("expressions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("genes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("externalLinks".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Antibody.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Antibody.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Antibody.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Antibody");
        if (immunogenOrganism != null) {
            sb.append("$_^aimmunogenOrganism$_^");
            String string = immunogenOrganism;
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
        if (clonalType != null) {
            sb.append("$_^aclonalType$_^");
            String string = clonalType;
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
        if (heavyChainIsotype != null) {
            sb.append("$_^aheavyChainIsotype$_^");
            String string = heavyChainIsotype;
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
        if (lightChainIsotype != null) {
            sb.append("$_^alightChainIsotype$_^");
            String string = lightChainIsotype;
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
        if (hostOrganism != null) {
            sb.append("$_^ahostOrganism$_^");
            String string = hostOrganism;
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
        if (!org.intermine.model.bio.Antibody.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Antibody)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aimmunogenOrganism".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                immunogenOrganism = string == null ? notXml[i] : string.toString();
                i++;
            }
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
            if ((i < notXml.length) && "aclonalType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                clonalType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aheavyChainIsotype".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                heavyChainIsotype = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alightChainIsotype".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                lightChainIsotype = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "ahostOrganism".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                hostOrganism = string == null ? notXml[i] : string.toString();
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
        publications = new ProxyCollection(os, this, "publications", org.intermine.model.bio.Publication.class);
        expressions = new ProxyCollection(os, this, "expressions", org.intermine.model.bio.ExpressionResult.class);
        genes = new ProxyCollection(os, this, "genes", org.intermine.model.bio.Gene.class);
        externalLinks = new ProxyCollection(os, this, "externalLinks", org.intermine.model.bio.ExternalLink.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else if ("expressions".equals(fieldName)) {
            expressions.add((org.intermine.model.bio.ExpressionResult) element);
        } else if ("genes".equals(fieldName)) {
            genes.add((org.intermine.model.bio.Gene) element);
        } else if ("externalLinks".equals(fieldName)) {
            externalLinks.add((org.intermine.model.bio.ExternalLink) element);
        } else {
            if (!org.intermine.model.bio.Antibody.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("expressions".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionResult.class;
        }
        if ("genes".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("externalLinks".equals(fieldName)) {
            return org.intermine.model.bio.ExternalLink.class;
        }
        if (!org.intermine.model.bio.Antibody.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Antibody.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
