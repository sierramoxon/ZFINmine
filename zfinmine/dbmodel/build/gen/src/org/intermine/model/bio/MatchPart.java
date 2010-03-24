package org.intermine.model.bio;

public interface MatchPart extends org.intermine.model.bio.Match
{
    public java.util.Set<org.intermine.model.bio.MatchSet> getMatchSets();
    public void setMatchSets(final java.util.Set<org.intermine.model.bio.MatchSet> matchSets);
    public void addMatchSets(final org.intermine.model.bio.MatchSet arg);

}
