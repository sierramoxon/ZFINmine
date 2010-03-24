package org.intermine.model.bio;

public interface FivePrimeUTR extends org.intermine.model.bio.UTR
{
    public java.util.Set<org.intermine.model.bio.Cap> getCaps();
    public void setCaps(final java.util.Set<org.intermine.model.bio.Cap> caps);
    public void addCaps(final org.intermine.model.bio.Cap arg);

}
