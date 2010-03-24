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
public class PATOTermShadow implements PATOTerm, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = PATOTerm.class;
    // Col: org.intermine.model.bio.PATOTerm.phenotypes
    protected java.util.Set<org.intermine.model.bio.Phenotype> phenotypes = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypes() { return phenotypes; }
    public void setPhenotypes(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypes) { this.phenotypes = phenotypes; }
    public void addPhenotypes(final org.intermine.model.bio.Phenotype arg) { phenotypes.add(arg); }

    // Attr: org.intermine.model.bio.OntologyTerm.stageStartHour
    protected java.lang.String stageStartHour;
    public java.lang.String getStageStartHour() { return stageStartHour; }
    public void setStageStartHour(final java.lang.String stageStartHour) { this.stageStartHour = stageStartHour; }

    // Attr: org.intermine.model.bio.OntologyTerm.identifier
    protected java.lang.String identifier;
    public java.lang.String getIdentifier() { return identifier; }
    public void setIdentifier(final java.lang.String identifier) { this.identifier = identifier; }

    // Attr: org.intermine.model.bio.OntologyTerm.stageAbbreviation
    protected java.lang.String stageAbbreviation;
    public java.lang.String getStageAbbreviation() { return stageAbbreviation; }
    public void setStageAbbreviation(final java.lang.String stageAbbreviation) { this.stageAbbreviation = stageAbbreviation; }

    // Attr: org.intermine.model.bio.OntologyTerm.stageEndHour
    protected java.lang.String stageEndHour;
    public java.lang.String getStageEndHour() { return stageEndHour; }
    public void setStageEndHour(final java.lang.String stageEndHour) { this.stageEndHour = stageEndHour; }

    // Attr: org.intermine.model.bio.OntologyTerm.description
    protected java.lang.String description;
    public java.lang.String getDescription() { return description; }
    public void setDescription(final java.lang.String description) { this.description = description; }

    // Attr: org.intermine.model.bio.OntologyTerm.obsolete
    protected java.lang.Boolean obsolete;
    public java.lang.Boolean getObsolete() { return obsolete; }
    public void setObsolete(final java.lang.Boolean obsolete) { this.obsolete = obsolete; }

    // Attr: org.intermine.model.bio.OntologyTerm.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.OntologyTerm.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Attr: org.intermine.model.bio.OntologyTerm.namespace
    protected java.lang.String namespace;
    public java.lang.String getNamespace() { return namespace; }
    public void setNamespace(final java.lang.String namespace) { this.namespace = namespace; }

    // Ref: org.intermine.model.bio.OntologyTerm.ontology
    protected org.intermine.model.InterMineObject ontology;
    public org.intermine.model.bio.Ontology getOntology() { if (ontology instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Ontology) ((org.intermine.objectstore.proxy.ProxyReference) ontology).getObject()); }; return (org.intermine.model.bio.Ontology) ontology; }
    public void setOntology(final org.intermine.model.bio.Ontology ontology) { this.ontology = ontology; }
    public void proxyOntology(final org.intermine.objectstore.proxy.ProxyReference ontology) { this.ontology = ontology; }
    public org.intermine.model.InterMineObject proxGetOntology() { return ontology; }

    // Ref: org.intermine.model.bio.OntologyTerm.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.OntologyTerm.phenotypesEndStg
    protected java.util.Set<org.intermine.model.bio.Phenotype> phenotypesEndStg = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypesEndStg() { return phenotypesEndStg; }
    public void setPhenotypesEndStg(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypesEndStg) { this.phenotypesEndStg = phenotypesEndStg; }
    public void addPhenotypesEndStg(final org.intermine.model.bio.Phenotype arg) { phenotypesEndStg.add(arg); }

    // Col: org.intermine.model.bio.OntologyTerm.parents
    protected java.util.Set<org.intermine.model.bio.OntologyTerm> parents = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.OntologyTerm> getParents() { return parents; }
    public void setParents(final java.util.Set<org.intermine.model.bio.OntologyTerm> parents) { this.parents = parents; }
    public void addParents(final org.intermine.model.bio.OntologyTerm arg) { parents.add(arg); }

    // Col: org.intermine.model.bio.OntologyTerm.expressionResultsEnd
    protected java.util.Set<org.intermine.model.bio.ExpressionResult> expressionResultsEnd = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressionResultsEnd() { return expressionResultsEnd; }
    public void setExpressionResultsEnd(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressionResultsEnd) { this.expressionResultsEnd = expressionResultsEnd; }
    public void addExpressionResultsEnd(final org.intermine.model.bio.ExpressionResult arg) { expressionResultsEnd.add(arg); }

    // Col: org.intermine.model.bio.OntologyTerm.synonyms
    protected java.util.Set<org.intermine.model.bio.OntologyTermSynonym> synonyms = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.OntologyTermSynonym> getSynonyms() { return synonyms; }
    public void setSynonyms(final java.util.Set<org.intermine.model.bio.OntologyTermSynonym> synonyms) { this.synonyms = synonyms; }
    public void addSynonyms(final org.intermine.model.bio.OntologyTermSynonym arg) { synonyms.add(arg); }

    // Col: org.intermine.model.bio.OntologyTerm.phenotypesStartStg
    protected java.util.Set<org.intermine.model.bio.Phenotype> phenotypesStartStg = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypesStartStg() { return phenotypesStartStg; }
    public void setPhenotypesStartStg(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypesStartStg) { this.phenotypesStartStg = phenotypesStartStg; }
    public void addPhenotypesStartStg(final org.intermine.model.bio.Phenotype arg) { phenotypesStartStg.add(arg); }

    // Col: org.intermine.model.bio.OntologyTerm.ontologyAnnotations
    protected java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.OntologyAnnotation> getOntologyAnnotations() { return ontologyAnnotations; }
    public void setOntologyAnnotations(final java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations) { this.ontologyAnnotations = ontologyAnnotations; }
    public void addOntologyAnnotations(final org.intermine.model.bio.OntologyAnnotation arg) { ontologyAnnotations.add(arg); }

    // Col: org.intermine.model.bio.OntologyTerm.relations
    protected java.util.Set<org.intermine.model.bio.OntologyRelation> relations = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.OntologyRelation> getRelations() { return relations; }
    public void setRelations(final java.util.Set<org.intermine.model.bio.OntologyRelation> relations) { this.relations = relations; }
    public void addRelations(final org.intermine.model.bio.OntologyRelation arg) { relations.add(arg); }

    // Col: org.intermine.model.bio.OntologyTerm.expressionResultsStart
    protected java.util.Set<org.intermine.model.bio.ExpressionResult> expressionResultsStart = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressionResultsStart() { return expressionResultsStart; }
    public void setExpressionResultsStart(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressionResultsStart) { this.expressionResultsStart = expressionResultsStart; }
    public void addExpressionResultsStart(final org.intermine.model.bio.ExpressionResult arg) { expressionResultsStart.add(arg); }

    // Col: org.intermine.model.bio.OntologyTerm.expressionResultSubterms
    protected java.util.Set<org.intermine.model.bio.ExpressionResult> expressionResultSubterms = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressionResultSubterms() { return expressionResultSubterms; }
    public void setExpressionResultSubterms(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressionResultSubterms) { this.expressionResultSubterms = expressionResultSubterms; }
    public void addExpressionResultSubterms(final org.intermine.model.bio.ExpressionResult arg) { expressionResultSubterms.add(arg); }

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

    public boolean equals(Object o) { return (o instanceof PATOTerm && id != null) ? id.equals(((PATOTerm)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "PATOTerm [description=\"" + description + "\", id=\"" + id + "\", identifier=\"" + identifier + "\", name=\"" + name + "\", namespace=\"" + namespace + "\", obsolete=\"" + obsolete + "\", ontology=" + (ontology == null ? "null" : (ontology.getId() == null ? "no id" : ontology.getId().toString())) + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", primaryIdentifier=\"" + primaryIdentifier + "\", stageAbbreviation=\"" + stageAbbreviation + "\", stageEndHour=\"" + stageEndHour + "\", stageStartHour=\"" + stageStartHour + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("phenotypes".equals(fieldName)) {
            return phenotypes;
        }
        if ("stageStartHour".equals(fieldName)) {
            return stageStartHour;
        }
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("stageAbbreviation".equals(fieldName)) {
            return stageAbbreviation;
        }
        if ("stageEndHour".equals(fieldName)) {
            return stageEndHour;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("obsolete".equals(fieldName)) {
            return obsolete;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("namespace".equals(fieldName)) {
            return namespace;
        }
        if ("ontology".equals(fieldName)) {
            if (ontology instanceof ProxyReference) {
                return ((ProxyReference) ontology).getObject();
            } else {
                return ontology;
            }
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("phenotypesEndStg".equals(fieldName)) {
            return phenotypesEndStg;
        }
        if ("parents".equals(fieldName)) {
            return parents;
        }
        if ("expressionResultsEnd".equals(fieldName)) {
            return expressionResultsEnd;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("phenotypesStartStg".equals(fieldName)) {
            return phenotypesStartStg;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return ontologyAnnotations;
        }
        if ("relations".equals(fieldName)) {
            return relations;
        }
        if ("expressionResultsStart".equals(fieldName)) {
            return expressionResultsStart;
        }
        if ("expressionResultSubterms".equals(fieldName)) {
            return expressionResultSubterms;
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
        if (!org.intermine.model.bio.PATOTerm.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("phenotypes".equals(fieldName)) {
            return phenotypes;
        }
        if ("stageStartHour".equals(fieldName)) {
            return stageStartHour;
        }
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("stageAbbreviation".equals(fieldName)) {
            return stageAbbreviation;
        }
        if ("stageEndHour".equals(fieldName)) {
            return stageEndHour;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("obsolete".equals(fieldName)) {
            return obsolete;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("namespace".equals(fieldName)) {
            return namespace;
        }
        if ("ontology".equals(fieldName)) {
            return ontology;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("phenotypesEndStg".equals(fieldName)) {
            return phenotypesEndStg;
        }
        if ("parents".equals(fieldName)) {
            return parents;
        }
        if ("expressionResultsEnd".equals(fieldName)) {
            return expressionResultsEnd;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("phenotypesStartStg".equals(fieldName)) {
            return phenotypesStartStg;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return ontologyAnnotations;
        }
        if ("relations".equals(fieldName)) {
            return relations;
        }
        if ("expressionResultsStart".equals(fieldName)) {
            return expressionResultsStart;
        }
        if ("expressionResultSubterms".equals(fieldName)) {
            return expressionResultSubterms;
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
        if (!org.intermine.model.bio.PATOTerm.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("phenotypes".equals(fieldName)) {
            phenotypes = (java.util.Set) value;
        } else if ("stageStartHour".equals(fieldName)) {
            stageStartHour = (java.lang.String) value;
        } else if ("identifier".equals(fieldName)) {
            identifier = (java.lang.String) value;
        } else if ("stageAbbreviation".equals(fieldName)) {
            stageAbbreviation = (java.lang.String) value;
        } else if ("stageEndHour".equals(fieldName)) {
            stageEndHour = (java.lang.String) value;
        } else if ("description".equals(fieldName)) {
            description = (java.lang.String) value;
        } else if ("obsolete".equals(fieldName)) {
            obsolete = (java.lang.Boolean) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("namespace".equals(fieldName)) {
            namespace = (java.lang.String) value;
        } else if ("ontology".equals(fieldName)) {
            ontology = (org.intermine.model.InterMineObject) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("phenotypesEndStg".equals(fieldName)) {
            phenotypesEndStg = (java.util.Set) value;
        } else if ("parents".equals(fieldName)) {
            parents = (java.util.Set) value;
        } else if ("expressionResultsEnd".equals(fieldName)) {
            expressionResultsEnd = (java.util.Set) value;
        } else if ("synonyms".equals(fieldName)) {
            synonyms = (java.util.Set) value;
        } else if ("phenotypesStartStg".equals(fieldName)) {
            phenotypesStartStg = (java.util.Set) value;
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations = (java.util.Set) value;
        } else if ("relations".equals(fieldName)) {
            relations = (java.util.Set) value;
        } else if ("expressionResultsStart".equals(fieldName)) {
            expressionResultsStart = (java.util.Set) value;
        } else if ("expressionResultSubterms".equals(fieldName)) {
            expressionResultSubterms = (java.util.Set) value;
        } else if ("annotations".equals(fieldName)) {
            annotations = (java.util.Set) value;
        } else if ("evidence".equals(fieldName)) {
            evidence = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.PATOTerm.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("phenotypes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("stageStartHour".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("identifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("stageAbbreviation".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("stageEndHour".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("description".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("obsolete".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("namespace".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("ontology".equals(fieldName)) {
            return org.intermine.model.bio.Ontology.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("phenotypesEndStg".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("parents".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("expressionResultsEnd".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("synonyms".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("phenotypesStartStg".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("relations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("expressionResultsStart".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("expressionResultSubterms".equals(fieldName)) {
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
        if (!org.intermine.model.bio.PATOTerm.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.PATOTerm.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.PATOTerm.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.PATOTerm");
        if (stageStartHour != null) {
            sb.append("$_^astageStartHour$_^");
            String string = stageStartHour;
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
        if (stageAbbreviation != null) {
            sb.append("$_^astageAbbreviation$_^");
            String string = stageAbbreviation;
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
        if (stageEndHour != null) {
            sb.append("$_^astageEndHour$_^");
            String string = stageEndHour;
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
        if (description != null) {
            sb.append("$_^adescription$_^");
            String string = description;
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
        if (obsolete != null) {
            sb.append("$_^aobsolete$_^").append(obsolete);
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
        if (namespace != null) {
            sb.append("$_^anamespace$_^");
            String string = namespace;
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
        if (ontology != null) {
            sb.append("$_^rontology$_^").append(ontology.getId());
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
        if (!org.intermine.model.bio.PATOTerm.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.PATOTerm)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "astageStartHour".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                stageStartHour = string == null ? notXml[i] : string.toString();
                i++;
            }
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
            if ((i < notXml.length) && "astageAbbreviation".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                stageAbbreviation = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "astageEndHour".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                stageEndHour = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "adescription".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                description = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aobsolete".equals(notXml[i])) {
                i++;
                obsolete = Boolean.valueOf(notXml[i]);
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
            if ((i < notXml.length) && "anamespace".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                namespace = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rontology".equals(notXml[i])) {
                i++;
                ontology = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Ontology.class);
                i++;
            };
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
        phenotypes = new ProxyCollection(os, this, "phenotypes", org.intermine.model.bio.Phenotype.class);
        phenotypesEndStg = new ProxyCollection(os, this, "phenotypesEndStg", org.intermine.model.bio.Phenotype.class);
        parents = new ProxyCollection(os, this, "parents", org.intermine.model.bio.OntologyTerm.class);
        expressionResultsEnd = new ProxyCollection(os, this, "expressionResultsEnd", org.intermine.model.bio.ExpressionResult.class);
        synonyms = new ProxyCollection(os, this, "synonyms", org.intermine.model.bio.OntologyTermSynonym.class);
        phenotypesStartStg = new ProxyCollection(os, this, "phenotypesStartStg", org.intermine.model.bio.Phenotype.class);
        ontologyAnnotations = new ProxyCollection(os, this, "ontologyAnnotations", org.intermine.model.bio.OntologyAnnotation.class);
        relations = new ProxyCollection(os, this, "relations", org.intermine.model.bio.OntologyRelation.class);
        expressionResultsStart = new ProxyCollection(os, this, "expressionResultsStart", org.intermine.model.bio.ExpressionResult.class);
        expressionResultSubterms = new ProxyCollection(os, this, "expressionResultSubterms", org.intermine.model.bio.ExpressionResult.class);
        annotations = new ProxyCollection(os, this, "annotations", org.intermine.model.bio.Annotation.class);
        evidence = new ProxyCollection(os, this, "evidence", org.intermine.model.bio.Evidence.class);
        dataSets = new ProxyCollection(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("phenotypes".equals(fieldName)) {
            phenotypes.add((org.intermine.model.bio.Phenotype) element);
        } else if ("phenotypesEndStg".equals(fieldName)) {
            phenotypesEndStg.add((org.intermine.model.bio.Phenotype) element);
        } else if ("parents".equals(fieldName)) {
            parents.add((org.intermine.model.bio.OntologyTerm) element);
        } else if ("expressionResultsEnd".equals(fieldName)) {
            expressionResultsEnd.add((org.intermine.model.bio.ExpressionResult) element);
        } else if ("synonyms".equals(fieldName)) {
            synonyms.add((org.intermine.model.bio.OntologyTermSynonym) element);
        } else if ("phenotypesStartStg".equals(fieldName)) {
            phenotypesStartStg.add((org.intermine.model.bio.Phenotype) element);
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations.add((org.intermine.model.bio.OntologyAnnotation) element);
        } else if ("relations".equals(fieldName)) {
            relations.add((org.intermine.model.bio.OntologyRelation) element);
        } else if ("expressionResultsStart".equals(fieldName)) {
            expressionResultsStart.add((org.intermine.model.bio.ExpressionResult) element);
        } else if ("expressionResultSubterms".equals(fieldName)) {
            expressionResultSubterms.add((org.intermine.model.bio.ExpressionResult) element);
        } else if ("annotations".equals(fieldName)) {
            annotations.add((org.intermine.model.bio.Annotation) element);
        } else if ("evidence".equals(fieldName)) {
            evidence.add((org.intermine.model.bio.Evidence) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else {
            if (!org.intermine.model.bio.PATOTerm.class.equals(getClass())) {
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
        if ("phenotypesEndStg".equals(fieldName)) {
            return org.intermine.model.bio.Phenotype.class;
        }
        if ("parents".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTerm.class;
        }
        if ("expressionResultsEnd".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionResult.class;
        }
        if ("synonyms".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTermSynonym.class;
        }
        if ("phenotypesStartStg".equals(fieldName)) {
            return org.intermine.model.bio.Phenotype.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return org.intermine.model.bio.OntologyAnnotation.class;
        }
        if ("relations".equals(fieldName)) {
            return org.intermine.model.bio.OntologyRelation.class;
        }
        if ("expressionResultsStart".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionResult.class;
        }
        if ("expressionResultSubterms".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionResult.class;
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
        if (!org.intermine.model.bio.PATOTerm.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.PATOTerm.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
