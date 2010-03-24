package org.intermine.model.bio;

public interface Scaffold extends org.intermine.model.bio.LocatedSequenceFeature
{
    public java.util.Set<org.intermine.model.bio.CrossGenomeMatch> getCrossGenomeMatches();
    public void setCrossGenomeMatches(final java.util.Set<org.intermine.model.bio.CrossGenomeMatch> crossGenomeMatches);
    public void addCrossGenomeMatches(final org.intermine.model.bio.CrossGenomeMatch arg);

}
