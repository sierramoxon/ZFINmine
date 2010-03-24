package org.intermine.model.bio;

public interface MatchSet extends org.intermine.model.bio.Match
{
    public java.util.Set<org.intermine.model.bio.MatchPart> getMatchParts();
    public void setMatchParts(final java.util.Set<org.intermine.model.bio.MatchPart> matchParts);
    public void addMatchParts(final org.intermine.model.bio.MatchPart arg);

}
