package org.intermine.model.bio;

public interface SpliceosomalIntron extends org.intermine.model.bio.Intron
{
    public java.util.Set<org.intermine.model.bio.BranchSite> getBranchSites();
    public void setBranchSites(final java.util.Set<org.intermine.model.bio.BranchSite> branchSites);
    public void addBranchSites(final org.intermine.model.bio.BranchSite arg);

    public java.util.Set<org.intermine.model.bio.PolypyrimidineTract> getPolypyrimidineTracts();
    public void setPolypyrimidineTracts(final java.util.Set<org.intermine.model.bio.PolypyrimidineTract> polypyrimidineTracts);
    public void addPolypyrimidineTracts(final org.intermine.model.bio.PolypyrimidineTract arg);

}
