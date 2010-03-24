package org.intermine.model.bio;

public interface Comment extends org.intermine.model.InterMineObject
{
    public java.lang.String getText();
    public void setText(final java.lang.String text);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public org.intermine.model.bio.InfoSource getSource();
    public void setSource(final org.intermine.model.bio.InfoSource source);
    public void proxySource(final org.intermine.objectstore.proxy.ProxyReference source);
    public org.intermine.model.InterMineObject proxGetSource();

}
