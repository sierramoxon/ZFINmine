package org.intermine.model.bio;

public interface PartialLocation extends org.intermine.model.bio.Location
{
    public java.lang.Integer getSubjectStart();
    public void setSubjectStart(final java.lang.Integer subjectStart);

    public java.lang.Integer getSubjectEnd();
    public void setSubjectEnd(final java.lang.Integer subjectEnd);

}
