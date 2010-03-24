package org.intermine.model.bio;

public interface AnalysisResult extends org.intermine.model.bio.Evidence
{
    public java.lang.Float getConfidence();
    public void setConfidence(final java.lang.Float confidence);

    public org.intermine.model.bio.Analysis getAnalysis();
    public void setAnalysis(final org.intermine.model.bio.Analysis analysis);
    public void proxyAnalysis(final org.intermine.objectstore.proxy.ProxyReference analysis);
    public org.intermine.model.InterMineObject proxGetAnalysis();

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}
