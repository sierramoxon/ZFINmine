package org.intermine.model.bio;

public interface OntologyTerm extends org.intermine.model.bio.BioProperty
{
    public java.lang.String getStageStartHour();
    public void setStageStartHour(final java.lang.String stageStartHour);

    public java.lang.String getIdentifier();
    public void setIdentifier(final java.lang.String identifier);

    public java.lang.String getStageAbbreviation();
    public void setStageAbbreviation(final java.lang.String stageAbbreviation);

    public java.lang.String getStageEndHour();
    public void setStageEndHour(final java.lang.String stageEndHour);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.Boolean getObsolete();
    public void setObsolete(final java.lang.Boolean obsolete);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public java.lang.String getNamespace();
    public void setNamespace(final java.lang.String namespace);

    public org.intermine.model.bio.Ontology getOntology();
    public void setOntology(final org.intermine.model.bio.Ontology ontology);
    public void proxyOntology(final org.intermine.objectstore.proxy.ProxyReference ontology);
    public org.intermine.model.InterMineObject proxGetOntology();

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypesEndStg();
    public void setPhenotypesEndStg(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypesEndStg);
    public void addPhenotypesEndStg(final org.intermine.model.bio.Phenotype arg);

    public java.util.Set<org.intermine.model.bio.OntologyTerm> getParents();
    public void setParents(final java.util.Set<org.intermine.model.bio.OntologyTerm> parents);
    public void addParents(final org.intermine.model.bio.OntologyTerm arg);

    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressionResultsEnd();
    public void setExpressionResultsEnd(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressionResultsEnd);
    public void addExpressionResultsEnd(final org.intermine.model.bio.ExpressionResult arg);

    public java.util.Set<org.intermine.model.bio.OntologyTermSynonym> getSynonyms();
    public void setSynonyms(final java.util.Set<org.intermine.model.bio.OntologyTermSynonym> synonyms);
    public void addSynonyms(final org.intermine.model.bio.OntologyTermSynonym arg);

    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypesStartStg();
    public void setPhenotypesStartStg(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypesStartStg);
    public void addPhenotypesStartStg(final org.intermine.model.bio.Phenotype arg);

    public java.util.Set<org.intermine.model.bio.OntologyAnnotation> getOntologyAnnotations();
    public void setOntologyAnnotations(final java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations);
    public void addOntologyAnnotations(final org.intermine.model.bio.OntologyAnnotation arg);

    public java.util.Set<org.intermine.model.bio.OntologyRelation> getRelations();
    public void setRelations(final java.util.Set<org.intermine.model.bio.OntologyRelation> relations);
    public void addRelations(final org.intermine.model.bio.OntologyRelation arg);

    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressionResultsStart();
    public void setExpressionResultsStart(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressionResultsStart);
    public void addExpressionResultsStart(final org.intermine.model.bio.ExpressionResult arg);

    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressionResultSubterms();
    public void setExpressionResultSubterms(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressionResultSubterms);
    public void addExpressionResultSubterms(final org.intermine.model.bio.ExpressionResult arg);

}
