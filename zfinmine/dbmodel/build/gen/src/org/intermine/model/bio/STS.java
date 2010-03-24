package org.intermine.model.bio;

public interface STS extends org.intermine.model.bio.Tag
{
    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

}
