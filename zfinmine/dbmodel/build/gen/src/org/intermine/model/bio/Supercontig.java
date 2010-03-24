package org.intermine.model.bio;

public interface Supercontig extends org.intermine.model.bio.Assembly
{
    public java.util.Set<org.intermine.model.bio.Contig> getContigs();
    public void setContigs(final java.util.Set<org.intermine.model.bio.Contig> contigs);
    public void addContigs(final org.intermine.model.bio.Contig arg);

}
