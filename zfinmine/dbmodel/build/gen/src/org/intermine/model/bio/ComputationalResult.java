package org.intermine.model.bio;

public interface ComputationalResult extends org.intermine.model.bio.AnalysisResult
{
    public java.lang.Double getScore();
    public void setScore(final java.lang.Double score);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

}
