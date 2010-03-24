package org.intermine.model.bio;

public interface Evidence extends org.intermine.model.InterMineObject
{
    public java.util.Set<org.intermine.model.bio.Relation> getRelations();
    public void setRelations(final java.util.Set<org.intermine.model.bio.Relation> relations);
    public void addRelations(final org.intermine.model.bio.Relation arg);

}
