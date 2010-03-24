package org.intermine.model.bio;

public interface Image extends org.intermine.model.InterMineObject
{
    public java.lang.String getImageUrl();
    public void setImageUrl(final java.lang.String imageUrl);

    public java.lang.String getImageFileName();
    public void setImageFileName(final java.lang.String imageFileName);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public org.intermine.model.bio.Figure getFigure();
    public void setFigure(final org.intermine.model.bio.Figure figure);
    public void proxyFigure(final org.intermine.objectstore.proxy.ProxyReference figure);
    public org.intermine.model.InterMineObject proxGetFigure();

}
