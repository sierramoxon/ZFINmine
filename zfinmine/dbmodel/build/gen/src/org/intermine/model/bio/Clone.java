package org.intermine.model.bio;

public interface Clone extends org.intermine.model.bio.Reagent
{
    public java.lang.String getthisseCloneRating();
    public void setthisseCloneRating(final java.lang.String ThisseCloneRating);

    public java.lang.String getCloneSite();
    public void setCloneSite(final java.lang.String cloneSite);

    public java.lang.String getpCR();
    public void setpCR(final java.lang.String PCR);

    public java.lang.String getPolymerase();
    public void setPolymerase(final java.lang.String polymerase);

    public java.lang.String getDigest();
    public void setDigest(final java.lang.String digest);

    public java.lang.String getVector();
    public void setVector(final java.lang.String vector);

    public java.lang.String getProblemType();
    public void setProblemType(final java.lang.String problemType);

    public java.lang.String getInsertSize();
    public void setInsertSize(final java.lang.String insertSize);

    public java.lang.String getSequenceType();
    public void setSequenceType(final java.lang.String sequenceType);

    public org.intermine.model.bio.ProbeLibrary getProbeLibrary();
    public void setProbeLibrary(final org.intermine.model.bio.ProbeLibrary probeLibrary);
    public void proxyProbeLibrary(final org.intermine.objectstore.proxy.ProxyReference probeLibrary);
    public org.intermine.model.InterMineObject proxGetProbeLibrary();

    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts();
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts);
    public void addTranscripts(final org.intermine.model.bio.Transcript arg);

    public java.util.Set<org.intermine.model.bio.Gene> getArtifacts();
    public void setArtifacts(final java.util.Set<org.intermine.model.bio.Gene> artifacts);
    public void addArtifacts(final org.intermine.model.bio.Gene arg);

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

    public java.util.Set<org.intermine.model.bio.Clone> getClones();
    public void setClones(final java.util.Set<org.intermine.model.bio.Clone> clones);
    public void addClones(final org.intermine.model.bio.Clone arg);

    public java.util.Set<org.intermine.model.bio.Clone> getContains();
    public void setContains(final java.util.Set<org.intermine.model.bio.Clone> contains);
    public void addContains(final org.intermine.model.bio.Clone arg);

}
