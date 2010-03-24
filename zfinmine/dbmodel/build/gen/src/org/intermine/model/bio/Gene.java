package org.intermine.model.bio;

public interface Gene extends org.intermine.model.bio.Region
{
    public java.lang.String getvegaId();
    public void setvegaId(final java.lang.String VegaId);

    public java.lang.String getNcbiGeneNumber();
    public void setNcbiGeneNumber(final java.lang.String ncbiGeneNumber);

    public org.intermine.model.bio.IntergenicRegion getUpstreamIntergenicRegion();
    public void setUpstreamIntergenicRegion(final org.intermine.model.bio.IntergenicRegion upstreamIntergenicRegion);
    public void proxyUpstreamIntergenicRegion(final org.intermine.objectstore.proxy.ProxyReference upstreamIntergenicRegion);
    public org.intermine.model.InterMineObject proxGetUpstreamIntergenicRegion();

    public org.intermine.model.bio.IntergenicRegion getDownstreamIntergenicRegion();
    public void setDownstreamIntergenicRegion(final org.intermine.model.bio.IntergenicRegion downstreamIntergenicRegion);
    public void proxyDownstreamIntergenicRegion(final org.intermine.objectstore.proxy.ProxyReference downstreamIntergenicRegion);
    public org.intermine.model.InterMineObject proxGetDownstreamIntergenicRegion();

    public java.util.Set<org.intermine.model.bio.Genotype> getGenotypes();
    public void setGenotypes(final java.util.Set<org.intermine.model.bio.Genotype> genotypes);
    public void addGenotypes(final org.intermine.model.bio.Genotype arg);

    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressions();
    public void setExpressions(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressions);
    public void addExpressions(final org.intermine.model.bio.ExpressionResult arg);

    public java.util.Set<org.intermine.model.bio.RegulatoryRegion> getRegulatoryRegions();
    public void setRegulatoryRegions(final java.util.Set<org.intermine.model.bio.RegulatoryRegion> regulatoryRegions);
    public void addRegulatoryRegions(final org.intermine.model.bio.RegulatoryRegion arg);

    public java.util.Set<org.intermine.model.bio.Feature> getFeatures();
    public void setFeatures(final java.util.Set<org.intermine.model.bio.Feature> features);
    public void addFeatures(final org.intermine.model.bio.Feature arg);

    public java.util.Set<org.intermine.model.bio.UTR> getuTRs();
    public void setuTRs(final java.util.Set<org.intermine.model.bio.UTR> UTRs);
    public void adduTRs(final org.intermine.model.bio.UTR arg);

    public java.util.Set<org.intermine.model.bio.GeneFlankingRegion> getFlankingRegions();
    public void setFlankingRegions(final java.util.Set<org.intermine.model.bio.GeneFlankingRegion> flankingRegions);
    public void addFlankingRegions(final org.intermine.model.bio.GeneFlankingRegion arg);

    public java.util.Set<org.intermine.model.bio.Pathway> getPathways();
    public void setPathways(final java.util.Set<org.intermine.model.bio.Pathway> pathways);
    public void addPathways(final org.intermine.model.bio.Pathway arg);

    public java.util.Set<org.intermine.model.bio.Protein> getProteins();
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins);
    public void addProteins(final org.intermine.model.bio.Protein arg);

    public java.util.Set<org.intermine.model.bio.Antibody> getAntibodies();
    public void setAntibodies(final java.util.Set<org.intermine.model.bio.Antibody> antibodies);
    public void addAntibodies(final org.intermine.model.bio.Antibody arg);

    public java.util.Set<org.intermine.model.bio.Exon> getExons();
    public void setExons(final java.util.Set<org.intermine.model.bio.Exon> exons);
    public void addExons(final org.intermine.model.bio.Exon arg);

    public java.util.Set<org.intermine.model.bio.CDS> getcDSs();
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs);
    public void addcDSs(final org.intermine.model.bio.CDS arg);

    public java.util.Set<org.intermine.model.bio.Construct> getPromotes();
    public void setPromotes(final java.util.Set<org.intermine.model.bio.Construct> promotes);
    public void addPromotes(final org.intermine.model.bio.Construct arg);

    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts();
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts);
    public void addTranscripts(final org.intermine.model.bio.Transcript arg);

    public java.util.Set<org.intermine.model.bio.Morpholino> getMorpholinos();
    public void setMorpholinos(final java.util.Set<org.intermine.model.bio.Morpholino> morpholinos);
    public void addMorpholinos(final org.intermine.model.bio.Morpholino arg);

    public java.util.Set<org.intermine.model.bio.Clone> getCloneArtifacts();
    public void setCloneArtifacts(final java.util.Set<org.intermine.model.bio.Clone> cloneArtifacts);
    public void addCloneArtifacts(final org.intermine.model.bio.Clone arg);

    public java.util.Set<org.intermine.model.bio.Construct> getCodingSequenceOf();
    public void setCodingSequenceOf(final java.util.Set<org.intermine.model.bio.Construct> codingSequenceOf);
    public void addCodingSequenceOf(final org.intermine.model.bio.Construct arg);

    public java.util.Set<org.intermine.model.bio.Clone> getEncodes();
    public void setEncodes(final java.util.Set<org.intermine.model.bio.Clone> encodes);
    public void addEncodes(final org.intermine.model.bio.Clone arg);

    public java.util.Set<org.intermine.model.bio.GOAnnotation> getGoAnnotation();
    public void setGoAnnotation(final java.util.Set<org.intermine.model.bio.GOAnnotation> goAnnotation);
    public void addGoAnnotation(final org.intermine.model.bio.GOAnnotation arg);

    public java.util.Set<org.intermine.model.bio.SNP> getSnps();
    public void setSnps(final java.util.Set<org.intermine.model.bio.SNP> snps);
    public void addSnps(final org.intermine.model.bio.SNP arg);

    public java.util.Set<org.intermine.model.bio.Homologue> getHomologues();
    public void setHomologues(final java.util.Set<org.intermine.model.bio.Homologue> homologues);
    public void addHomologues(final org.intermine.model.bio.Homologue arg);

    public java.util.Set<org.intermine.model.bio.STS> getStss();
    public void setStss(final java.util.Set<org.intermine.model.bio.STS> stss);
    public void addStss(final org.intermine.model.bio.STS arg);

}
