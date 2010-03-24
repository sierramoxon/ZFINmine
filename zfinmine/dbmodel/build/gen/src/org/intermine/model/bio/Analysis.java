package org.intermine.model.bio;

public interface Analysis extends org.intermine.model.InterMineObject
{
    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

}
