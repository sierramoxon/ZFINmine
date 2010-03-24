package org.intermine.model.bio;

public interface TilingPath extends org.intermine.model.bio.Assembly
{
    public java.util.Set<org.intermine.model.bio.TilingPathFragment> getTilingPathFragments();
    public void setTilingPathFragments(final java.util.Set<org.intermine.model.bio.TilingPathFragment> tilingPathFragments);
    public void addTilingPathFragments(final org.intermine.model.bio.TilingPathFragment arg);

}
