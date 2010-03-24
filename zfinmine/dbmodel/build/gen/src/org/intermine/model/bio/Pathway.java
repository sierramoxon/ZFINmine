package org.intermine.model.bio;

public interface Pathway extends org.intermine.model.bio.BioProperty
{
    public java.lang.String getIdentifier();
    public void setIdentifier(final java.lang.String identifier);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

}
