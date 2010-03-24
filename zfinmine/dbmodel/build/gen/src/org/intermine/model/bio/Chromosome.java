package org.intermine.model.bio;

public interface Chromosome extends org.intermine.model.bio.GenomeRegion
{
    public java.util.Set<org.intermine.model.bio.LocatedSequenceFeature> getFeatures();
    public void setFeatures(final java.util.Set<org.intermine.model.bio.LocatedSequenceFeature> features);
    public void addFeatures(final org.intermine.model.bio.LocatedSequenceFeature arg);

    public java.util.Set<org.intermine.model.bio.Exon> getExons();
    public void setExons(final java.util.Set<org.intermine.model.bio.Exon> exons);
    public void addExons(final org.intermine.model.bio.Exon arg);

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

    public java.util.Set<org.intermine.model.bio.CrossGenomeMatch> getCrossGenomeMatches();
    public void setCrossGenomeMatches(final java.util.Set<org.intermine.model.bio.CrossGenomeMatch> crossGenomeMatches);
    public void addCrossGenomeMatches(final org.intermine.model.bio.CrossGenomeMatch arg);

    public java.util.Set<org.intermine.model.bio.ChromosomeBand> getChromosomeBands();
    public void setChromosomeBands(final java.util.Set<org.intermine.model.bio.ChromosomeBand> chromosomeBands);
    public void addChromosomeBands(final org.intermine.model.bio.ChromosomeBand arg);

    public java.util.Set<org.intermine.model.bio.ChromosomalStructuralElement> getChromosomalStructuralElements();
    public void setChromosomalStructuralElements(final java.util.Set<org.intermine.model.bio.ChromosomalStructuralElement> chromosomalStructuralElements);
    public void addChromosomalStructuralElements(final org.intermine.model.bio.ChromosomalStructuralElement arg);

    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts();
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts);
    public void addTranscripts(final org.intermine.model.bio.Transcript arg);

}
