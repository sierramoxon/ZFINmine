package org.intermine.model.bio;

public interface ExonJunction extends org.intermine.model.bio.Junction
{
    public java.util.Set<org.intermine.model.bio.ProcessedTranscript> getProcessedTranscripts();
    public void setProcessedTranscripts(final java.util.Set<org.intermine.model.bio.ProcessedTranscript> processedTranscripts);
    public void addProcessedTranscripts(final org.intermine.model.bio.ProcessedTranscript arg);

}
