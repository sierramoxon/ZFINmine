package org.intermine.model.bio;

public interface BioEntity extends org.intermine.model.InterMineObject
{
    public java.lang.Boolean getCurated();
    public void setCurated(final java.lang.Boolean curated);

    public java.lang.String getSecondaryIdentifier();
    public void setSecondaryIdentifier(final java.lang.String secondaryIdentifier);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

    public java.util.Set<org.intermine.model.bio.SymmetricalRelation> getRelations();
    public void setRelations(final java.util.Set<org.intermine.model.bio.SymmetricalRelation> relations);
    public void addRelations(final org.intermine.model.bio.SymmetricalRelation arg);

    public java.util.Set<org.intermine.model.bio.Relation> getSubjects();
    public void setSubjects(final java.util.Set<org.intermine.model.bio.Relation> subjects);
    public void addSubjects(final org.intermine.model.bio.Relation arg);

    public java.util.Set<org.intermine.model.bio.Relation> getObjects();
    public void setObjects(final java.util.Set<org.intermine.model.bio.Relation> objects);
    public void addObjects(final org.intermine.model.bio.Relation arg);

    public java.util.Set<org.intermine.model.bio.Annotation> getAnnotations();
    public void setAnnotations(final java.util.Set<org.intermine.model.bio.Annotation> annotations);
    public void addAnnotations(final org.intermine.model.bio.Annotation arg);

    public java.util.Set<org.intermine.model.bio.Synonym> getSynonyms();
    public void setSynonyms(final java.util.Set<org.intermine.model.bio.Synonym> synonyms);
    public void addSynonyms(final org.intermine.model.bio.Synonym arg);

    public java.util.Set<org.intermine.model.bio.Evidence> getEvidence();
    public void setEvidence(final java.util.Set<org.intermine.model.bio.Evidence> evidence);
    public void addEvidence(final org.intermine.model.bio.Evidence arg);

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

}
