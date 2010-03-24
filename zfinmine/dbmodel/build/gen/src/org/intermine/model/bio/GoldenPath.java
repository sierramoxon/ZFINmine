package org.intermine.model.bio;

public interface GoldenPath extends org.intermine.model.bio.Assembly
{
    public java.util.Set<org.intermine.model.bio.GoldenPathFragment> getGoldenPathFragments();
    public void setGoldenPathFragments(final java.util.Set<org.intermine.model.bio.GoldenPathFragment> goldenPathFragments);
    public void addGoldenPathFragments(final org.intermine.model.bio.GoldenPathFragment arg);

}
