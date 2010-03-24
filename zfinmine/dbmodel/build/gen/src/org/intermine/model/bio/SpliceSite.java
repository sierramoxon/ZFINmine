package org.intermine.model.bio;

public interface SpliceSite extends org.intermine.model.bio.Junction
{
    public java.util.Set<org.intermine.model.bio.PrimaryTranscript> getPrimaryTranscripts();
    public void setPrimaryTranscripts(final java.util.Set<org.intermine.model.bio.PrimaryTranscript> primaryTranscripts);
    public void addPrimaryTranscripts(final org.intermine.model.bio.PrimaryTranscript arg);

}
