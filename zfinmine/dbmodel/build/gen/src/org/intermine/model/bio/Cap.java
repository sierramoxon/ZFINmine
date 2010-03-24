package org.intermine.model.bio;

public interface Cap extends org.intermine.model.bio.GenePart
{
    public java.util.Set<org.intermine.model.bio.ProcessedTranscript> getProcessedTranscripts();
    public void setProcessedTranscripts(final java.util.Set<org.intermine.model.bio.ProcessedTranscript> processedTranscripts);
    public void addProcessedTranscripts(final org.intermine.model.bio.ProcessedTranscript arg);

    public java.util.Set<org.intermine.model.bio.FivePrimeUTR> getFivePrimeUTRs();
    public void setFivePrimeUTRs(final java.util.Set<org.intermine.model.bio.FivePrimeUTR> fivePrimeUTRs);
    public void addFivePrimeUTRs(final org.intermine.model.bio.FivePrimeUTR arg);

}
