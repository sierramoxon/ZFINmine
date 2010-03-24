package org.intermine.model.bio;

public interface Region extends org.intermine.model.bio.LocatedSequenceFeature
{
    public java.lang.String getComments();
    public void setComments(final java.lang.String comments);

    public java.lang.String getSymbol();
    public void setSymbol(final java.lang.String symbol);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.util.Set<org.intermine.model.bio.Construct> getConstructs();
    public void setConstructs(final java.util.Set<org.intermine.model.bio.Construct> constructs);
    public void addConstructs(final org.intermine.model.bio.Construct arg);

    public java.util.Set<org.intermine.model.bio.ExternalLink> getExternalLinks();
    public void setExternalLinks(final java.util.Set<org.intermine.model.bio.ExternalLink> externalLinks);
    public void addExternalLinks(final org.intermine.model.bio.ExternalLink arg);

}
