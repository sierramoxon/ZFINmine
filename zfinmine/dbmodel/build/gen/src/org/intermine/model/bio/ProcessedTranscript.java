package org.intermine.model.bio;

public interface ProcessedTranscript extends org.intermine.model.bio.Transcript
{
    public java.util.Set<org.intermine.model.bio.PolyASite> getPolyASites();
    public void setPolyASites(final java.util.Set<org.intermine.model.bio.PolyASite> polyASites);
    public void addPolyASites(final org.intermine.model.bio.PolyASite arg);

    public java.util.Set<org.intermine.model.bio.PrimaryTranscript> getPrimaryTranscripts();
    public void setPrimaryTranscripts(final java.util.Set<org.intermine.model.bio.PrimaryTranscript> primaryTranscripts);
    public void addPrimaryTranscripts(final org.intermine.model.bio.PrimaryTranscript arg);

    public java.util.Set<org.intermine.model.bio.Cap> getCaps();
    public void setCaps(final java.util.Set<org.intermine.model.bio.Cap> caps);
    public void addCaps(final org.intermine.model.bio.Cap arg);

    public java.util.Set<org.intermine.model.bio.ExonJunction> getExonJunctions();
    public void setExonJunctions(final java.util.Set<org.intermine.model.bio.ExonJunction> exonJunctions);
    public void addExonJunctions(final org.intermine.model.bio.ExonJunction arg);

}
