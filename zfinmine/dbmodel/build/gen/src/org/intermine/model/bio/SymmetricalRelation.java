package org.intermine.model.bio;

public interface SymmetricalRelation extends org.intermine.model.InterMineObject
{
    public java.util.Set<org.intermine.model.bio.BioEntity> getBioEntities();
    public void setBioEntities(final java.util.Set<org.intermine.model.bio.BioEntity> bioEntities);
    public void addBioEntities(final org.intermine.model.bio.BioEntity arg);

}
