package org.intermine.model.bio;

public interface GoldenPathFragment extends org.intermine.model.bio.AssemblyComponent
{
    public java.util.Set<org.intermine.model.bio.GoldenPath> getGoldenPaths();
    public void setGoldenPaths(final java.util.Set<org.intermine.model.bio.GoldenPath> goldenPaths);
    public void addGoldenPaths(final org.intermine.model.bio.GoldenPath arg);

}
