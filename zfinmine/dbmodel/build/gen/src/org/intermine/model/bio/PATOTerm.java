package org.intermine.model.bio;

public interface PATOTerm extends org.intermine.model.bio.OntologyTerm
{
    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypes();
    public void setPhenotypes(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypes);
    public void addPhenotypes(final org.intermine.model.bio.Phenotype arg);

}
