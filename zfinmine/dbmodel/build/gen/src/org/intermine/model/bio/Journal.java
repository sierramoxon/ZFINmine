package org.intermine.model.bio;

public interface Journal extends org.intermine.model.InterMineObject
{
    public java.lang.String getAbbrev();
    public void setAbbrev(final java.lang.String abbrev);

    public java.lang.String getPublisher();
    public void setPublisher(final java.lang.String publisher);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

}
