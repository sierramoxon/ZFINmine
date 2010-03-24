package org.intermine.model.bio;

public interface Sequence extends org.intermine.model.InterMineObject
{
    public int getLength();
    public void setLength(final int length);

    public java.lang.String getMd5checksum();
    public void setMd5checksum(final java.lang.String md5checksum);

    public java.lang.String getResidues();
    public void setResidues(final java.lang.String residues);

}
