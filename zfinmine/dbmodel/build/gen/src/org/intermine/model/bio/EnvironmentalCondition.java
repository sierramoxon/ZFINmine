package org.intermine.model.bio;

public interface EnvironmentalCondition extends org.intermine.model.InterMineObject
{
    public java.lang.String getValue();
    public void setValue(final java.lang.String value);

    public java.lang.String getConditionGroup();
    public void setConditionGroup(final java.lang.String conditionGroup);

    public java.lang.String getConditionName();
    public void setConditionName(final java.lang.String conditionName);

    public java.lang.String getUnit();
    public void setUnit(final java.lang.String unit);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public org.intermine.model.bio.Environment getEnvironment();
    public void setEnvironment(final org.intermine.model.bio.Environment environment);
    public void proxyEnvironment(final org.intermine.objectstore.proxy.ProxyReference environment);
    public org.intermine.model.InterMineObject proxGetEnvironment();

    public org.intermine.model.bio.Morpholino getMorpholino();
    public void setMorpholino(final org.intermine.model.bio.Morpholino morpholino);
    public void proxyMorpholino(final org.intermine.objectstore.proxy.ProxyReference morpholino);
    public org.intermine.model.InterMineObject proxGetMorpholino();

}
