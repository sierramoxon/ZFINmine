package org.intermine.model.bio;

public interface ExternalDatabase extends org.intermine.model.InterMineObject
{
    public java.lang.String getUrl();
    public void setUrl(final java.lang.String url);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

}
