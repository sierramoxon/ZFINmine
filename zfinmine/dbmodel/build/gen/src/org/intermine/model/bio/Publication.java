package org.intermine.model.bio;

public interface Publication extends org.intermine.model.InterMineObject
{
    public java.lang.String getAuthorNames();
    public void setAuthorNames(final java.lang.String authorNames);

    public java.lang.Integer getYear();
    public void setYear(final java.lang.Integer year);

    public org.intermine.model.bio.Journal getJournal();
    public void setJournal(final org.intermine.model.bio.Journal journal);
    public void proxyJournal(final org.intermine.objectstore.proxy.ProxyReference journal);
    public org.intermine.model.InterMineObject proxGetJournal();

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public java.lang.String getIssue();
    public void setIssue(final java.lang.String issue);

    public java.lang.String getPubMedId();
    public void setPubMedId(final java.lang.String pubMedId);

    public java.lang.String getPages();
    public void setPages(final java.lang.String pages);

    public java.lang.String getPubAbstract();
    public void setPubAbstract(final java.lang.String pubAbstract);

    public java.lang.String getTitle();
    public void setTitle(final java.lang.String title);

    public java.lang.String getDoi();
    public void setDoi(final java.lang.String doi);

    public java.lang.String getFirstAuthor();
    public void setFirstAuthor(final java.lang.String firstAuthor);

    public java.lang.String getVolume();
    public void setVolume(final java.lang.String volume);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.String getAccessionNumber();
    public void setAccessionNumber(final java.lang.String accessionNumber);

    public java.util.Set<org.intermine.model.bio.SSLP> getsSLPs();
    public void setsSLPs(final java.util.Set<org.intermine.model.bio.SSLP> SSLPs);
    public void addsSLPs(final org.intermine.model.bio.SSLP arg);

    public java.util.Set<org.intermine.model.bio.ExpressionResult> getExpressions();
    public void setExpressions(final java.util.Set<org.intermine.model.bio.ExpressionResult> expressions);
    public void addExpressions(final org.intermine.model.bio.ExpressionResult arg);

    public java.util.Set<org.intermine.model.bio.Region> getRegions();
    public void setRegions(final java.util.Set<org.intermine.model.bio.Region> regions);
    public void addRegions(final org.intermine.model.bio.Region arg);

    public java.util.Set<org.intermine.model.bio.Figure> getFigures();
    public void setFigures(final java.util.Set<org.intermine.model.bio.Figure> figures);
    public void addFigures(final org.intermine.model.bio.Figure arg);

    public java.util.Set<org.intermine.model.bio.Author> getAuthors();
    public void setAuthors(final java.util.Set<org.intermine.model.bio.Author> authors);
    public void addAuthors(final org.intermine.model.bio.Author arg);

    public java.util.Set<org.intermine.model.bio.Antibody> getAntibodies();
    public void setAntibodies(final java.util.Set<org.intermine.model.bio.Antibody> antibodies);
    public void addAntibodies(final org.intermine.model.bio.Antibody arg);

    public java.util.Set<org.intermine.model.bio.Morpholino> getMorpholinos();
    public void setMorpholinos(final java.util.Set<org.intermine.model.bio.Morpholino> morpholinos);
    public void addMorpholinos(final org.intermine.model.bio.Morpholino arg);

    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypes();
    public void setPhenotypes(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypes);
    public void addPhenotypes(final org.intermine.model.bio.Phenotype arg);

    public java.util.Set<org.intermine.model.bio.Clone> getClones();
    public void setClones(final java.util.Set<org.intermine.model.bio.Clone> clones);
    public void addClones(final org.intermine.model.bio.Clone arg);

    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts();
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts);
    public void addTranscripts(final org.intermine.model.bio.Transcript arg);

    public java.util.Set<org.intermine.model.bio.Construct> getConstructs();
    public void setConstructs(final java.util.Set<org.intermine.model.bio.Construct> constructs);
    public void addConstructs(final org.intermine.model.bio.Construct arg);

    public java.util.Set<org.intermine.model.bio.SNP> getsNPs();
    public void setsNPs(final java.util.Set<org.intermine.model.bio.SNP> SNPs);
    public void addsNPs(final org.intermine.model.bio.SNP arg);

    public java.util.Set<org.intermine.model.bio.Environment> getEnvironments();
    public void setEnvironments(final java.util.Set<org.intermine.model.bio.Environment> environments);
    public void addEnvironments(final org.intermine.model.bio.Environment arg);

    public java.util.Set<org.intermine.model.bio.EFG> geteFGs();
    public void seteFGs(final java.util.Set<org.intermine.model.bio.EFG> EFGs);
    public void addeFGs(final org.intermine.model.bio.EFG arg);

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

    public java.util.Set<org.intermine.model.bio.STS> getsTSs();
    public void setsTSs(final java.util.Set<org.intermine.model.bio.STS> STSs);
    public void addsTSs(final org.intermine.model.bio.STS arg);

}
