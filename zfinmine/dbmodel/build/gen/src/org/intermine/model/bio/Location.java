package org.intermine.model.bio;

public interface Location extends org.intermine.model.bio.Relation
{
    public java.lang.Integer getEnd();
    public void setEnd(final java.lang.Integer end);

    public java.lang.Integer getEndPhase();
    public void setEndPhase(final java.lang.Integer endPhase);

    public java.lang.Integer getPhase();
    public void setPhase(final java.lang.Integer phase);

    public java.lang.Integer getStart();
    public void setStart(final java.lang.Integer start);

    public java.lang.String getStrand();
    public void setStrand(final java.lang.String strand);

    public java.lang.Boolean getEndIsPartial();
    public void setEndIsPartial(final java.lang.Boolean endIsPartial);

    public java.lang.Boolean getStartIsPartial();
    public void setStartIsPartial(final java.lang.Boolean startIsPartial);

}
