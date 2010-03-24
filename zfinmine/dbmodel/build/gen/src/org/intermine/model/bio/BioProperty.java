package org.intermine.model.bio;

public interface BioProperty extends org.intermine.model.InterMineObject
{
    public java.util.Set<org.intermine.model.bio.Annotation> getAnnotations();
    public void setAnnotations(final java.util.Set<org.intermine.model.bio.Annotation> annotations);
    public void addAnnotations(final org.intermine.model.bio.Annotation arg);

    public java.util.Set<org.intermine.model.bio.Evidence> getEvidence();
    public void setEvidence(final java.util.Set<org.intermine.model.bio.Evidence> evidence);
    public void addEvidence(final org.intermine.model.bio.Evidence arg);

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}
