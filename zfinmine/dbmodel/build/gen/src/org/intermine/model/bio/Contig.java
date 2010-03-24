package org.intermine.model.bio;

public interface Contig extends org.intermine.model.bio.Assembly, org.intermine.model.bio.AssemblyComponent
{
    public java.util.Set<org.intermine.model.bio.Read> getReads();
    public void setReads(final java.util.Set<org.intermine.model.bio.Read> reads);
    public void addReads(final org.intermine.model.bio.Read arg);

    public java.util.Set<org.intermine.model.bio.Supercontig> getSupercontigs();
    public void setSupercontigs(final java.util.Set<org.intermine.model.bio.Supercontig> supercontigs);
    public void addSupercontigs(final org.intermine.model.bio.Supercontig arg);

    public java.util.Set<org.intermine.model.bio.ReadPair> getReadPairs();
    public void setReadPairs(final java.util.Set<org.intermine.model.bio.ReadPair> readPairs);
    public void addReadPairs(final org.intermine.model.bio.ReadPair arg);

}
