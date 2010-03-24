package org.intermine.model.bio;

public interface TilingPathFragment extends org.intermine.model.bio.AssemblyComponent
{
    public java.util.Set<org.intermine.model.bio.TilingPath> getTilingPaths();
    public void setTilingPaths(final java.util.Set<org.intermine.model.bio.TilingPath> tilingPaths);
    public void addTilingPaths(final org.intermine.model.bio.TilingPath arg);

}
