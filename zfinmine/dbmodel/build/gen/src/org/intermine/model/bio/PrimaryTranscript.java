package org.intermine.model.bio;

public interface PrimaryTranscript extends org.intermine.model.bio.Transcript
{
    public java.util.Set<org.intermine.model.bio.Clip> getClips();
    public void setClips(final java.util.Set<org.intermine.model.bio.Clip> clips);
    public void addClips(final org.intermine.model.bio.Clip arg);

    public java.util.Set<org.intermine.model.bio.TranscriptionStartSite> getTranscriptionStartSites();
    public void setTranscriptionStartSites(final java.util.Set<org.intermine.model.bio.TranscriptionStartSite> transcriptionStartSites);
    public void addTranscriptionStartSites(final org.intermine.model.bio.TranscriptionStartSite arg);

    public java.util.Set<org.intermine.model.bio.TranscriptionEndSite> getTranscriptionEndSites();
    public void setTranscriptionEndSites(final java.util.Set<org.intermine.model.bio.TranscriptionEndSite> transcriptionEndSites);
    public void addTranscriptionEndSites(final org.intermine.model.bio.TranscriptionEndSite arg);

    public java.util.Set<org.intermine.model.bio.ProcessedTranscript> getProcessedTranscripts();
    public void setProcessedTranscripts(final java.util.Set<org.intermine.model.bio.ProcessedTranscript> processedTranscripts);
    public void addProcessedTranscripts(final org.intermine.model.bio.ProcessedTranscript arg);

    public java.util.Set<org.intermine.model.bio.SpliceSite> getSpliceSites();
    public void setSpliceSites(final java.util.Set<org.intermine.model.bio.SpliceSite> spliceSites);
    public void addSpliceSites(final org.intermine.model.bio.SpliceSite arg);

}
