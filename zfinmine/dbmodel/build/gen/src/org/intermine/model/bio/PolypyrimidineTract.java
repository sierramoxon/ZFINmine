package org.intermine.model.bio;

public interface PolypyrimidineTract extends org.intermine.model.bio.GenePart
{
    public java.util.Set<org.intermine.model.bio.SpliceosomalIntron> getSpliceosomalIntrons();
    public void setSpliceosomalIntrons(final java.util.Set<org.intermine.model.bio.SpliceosomalIntron> spliceosomalIntrons);
    public void addSpliceosomalIntrons(final org.intermine.model.bio.SpliceosomalIntron arg);

}
