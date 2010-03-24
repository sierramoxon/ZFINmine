package org.intermine.model.bio;

public interface SequenceVariant extends org.intermine.model.bio.LocatedSequenceFeature
{
    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

}
