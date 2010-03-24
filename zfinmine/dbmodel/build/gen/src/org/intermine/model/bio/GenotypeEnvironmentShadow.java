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
public class GenotypeEnvironmentShadow implements GenotypeEnvironment, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = GenotypeEnvironment.class;
    // Attr: org.intermine.model.bio.GenotypeEnvironment.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Ref: org.intermine.model.bio.GenotypeEnvironment.genotype
    protected org.intermine.model.InterMineObject genotype;
    public org.intermine.model.bio.Genotype getGenotype() { if (genotype instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Genotype) ((org.intermine.objectstore.proxy.ProxyReference) genotype).getObject()); }; return (org.intermine.model.bio.Genotype) genotype; }
    public void setGenotype(final org.intermine.model.bio.Genotype genotype) { this.genotype = genotype; }
    public void proxyGenotype(final org.intermine.objectstore.proxy.ProxyReference genotype) { this.genotype = genotype; }
    public org.intermine.model.InterMineObject proxGetGenotype() { return genotype; }

    // Ref: org.intermine.model.bio.GenotypeEnvironment.environment
    protected org.intermine.model.InterMineObject environment;
    public org.intermine.model.bio.Environment getEnvironment() { if (environment instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Environment) ((org.intermine.objectstore.proxy.ProxyReference) environment).getObject()); }; return (org.intermine.model.bio.Environment) environment; }
    public void setEnvironment(final org.intermine.model.bio.Environment environment) { this.environment = environment; }
    public void proxyEnvironment(final org.intermine.objectstore.proxy.ProxyReference environment) { this.environment = environment; }
    public org.intermine.model.InterMineObject proxGetEnvironment() { return environment; }

    // Col: org.intermine.model.bio.GenotypeEnvironment.phenotypes
    protected java.util.Set<org.intermine.model.bio.Phenotype> phenotypes = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypes() { return phenotypes; }
    public void setPhenotypes(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypes) { this.phenotypes = phenotypes; }
    public void addPhenotypes(final org.intermine.model.bio.Phenotype arg) { phenotypes.add(arg); }

    // Col: org.intermine.model.bio.GenotypeEnvironment.expressions
    protected java.util.Set<org.intermine.model.bio.ExpressionResult> expressions = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressions() { return expressions; }
    public void setExpressions(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressions) { this.expressions = expressions; }
    public void addExpressions(final org.intermine.model.bio.ExpressionResult arg) { expressions.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof GenotypeEnvironment && id != null) ? id.equals(((GenotypeEnvironment)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "GenotypeEnvironment [environment=" + (environment == null ? "null" : (environment.getId() == null ? "no id" : environment.getId().toString())) + ", genotype=" + (genotype == null ? "null" : (genotype.getId() == null ? "no id" : genotype.getId().toString())) + ", id=\"" + id + "\", primaryIdentifier=\"" + primaryIdentifier + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
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
        if ("environment".equals(fieldName)) {
            if (environment instanceof ProxyReference) {
                return ((ProxyReference) environment).getObject();
            } else {
                return environment;
            }
        }
        if ("phenotypes".equals(fieldName)) {
            return phenotypes;
        }
        if ("expressions".equals(fieldName)) {
            return expressions;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GenotypeEnvironment.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("genotype".equals(fieldName)) {
            return genotype;
        }
        if ("environment".equals(fieldName)) {
            return environment;
        }
        if ("phenotypes".equals(fieldName)) {
            return phenotypes;
        }
        if ("expressions".equals(fieldName)) {
            return expressions;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GenotypeEnvironment.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("genotype".equals(fieldName)) {
            genotype = (org.intermine.model.InterMineObject) value;
        } else if ("environment".equals(fieldName)) {
            environment = (org.intermine.model.InterMineObject) value;
        } else if ("phenotypes".equals(fieldName)) {
            phenotypes = (java.util.Set) value;
        } else if ("expressions".equals(fieldName)) {
            expressions = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.GenotypeEnvironment.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("genotype".equals(fieldName)) {
            return org.intermine.model.bio.Genotype.class;
        }
        if ("environment".equals(fieldName)) {
            return org.intermine.model.bio.Environment.class;
        }
        if ("phenotypes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("expressions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.GenotypeEnvironment.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.GenotypeEnvironment.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.GenotypeEnvironment.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.GenotypeEnvironment");
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
        if (environment != null) {
            sb.append("$_^renvironment$_^").append(environment.getId());
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
        if (!org.intermine.model.bio.GenotypeEnvironment.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.GenotypeEnvironment)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
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
            if ((i < notXml.length) &&"renvironment".equals(notXml[i])) {
                i++;
                environment = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Environment.class);
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
        phenotypes = new ProxyCollection(os, this, "phenotypes", org.intermine.model.bio.Phenotype.class);
        expressions = new ProxyCollection(os, this, "expressions", org.intermine.model.bio.ExpressionResult.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("phenotypes".equals(fieldName)) {
            phenotypes.add((org.intermine.model.bio.Phenotype) element);
        } else if ("expressions".equals(fieldName)) {
            expressions.add((org.intermine.model.bio.ExpressionResult) element);
        } else {
            if (!org.intermine.model.bio.GenotypeEnvironment.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("phenotypes".equals(fieldName)) {
            return org.intermine.model.bio.Phenotype.class;
        }
        if ("expressions".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionResult.class;
        }
        if (!org.intermine.model.bio.GenotypeEnvironment.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.GenotypeEnvironment.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
