package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.util.StringConstructor;
import org.intermine.util.StringUtil;
import org.intermine.util.TypeUtil;
import org.intermine.model.ShadowClass;
public class ImageShadow implements Image, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Image.class;
    // Attr: org.intermine.model.bio.Image.imageUrl
    protected java.lang.String imageUrl;
    public java.lang.String getImageUrl() { return imageUrl; }
    public void setImageUrl(final java.lang.String imageUrl) { this.imageUrl = imageUrl; }

    // Attr: org.intermine.model.bio.Image.imageFileName
    protected java.lang.String imageFileName;
    public java.lang.String getImageFileName() { return imageFileName; }
    public void setImageFileName(final java.lang.String imageFileName) { this.imageFileName = imageFileName; }

    // Attr: org.intermine.model.bio.Image.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Ref: org.intermine.model.bio.Image.figure
    protected org.intermine.model.InterMineObject figure;
    public org.intermine.model.bio.Figure getFigure() { if (figure instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Figure) ((org.intermine.objectstore.proxy.ProxyReference) figure).getObject()); }; return (org.intermine.model.bio.Figure) figure; }
    public void setFigure(final org.intermine.model.bio.Figure figure) { this.figure = figure; }
    public void proxyFigure(final org.intermine.objectstore.proxy.ProxyReference figure) { this.figure = figure; }
    public org.intermine.model.InterMineObject proxGetFigure() { return figure; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Image && id != null) ? id.equals(((Image)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Image [figure=" + (figure == null ? "null" : (figure.getId() == null ? "no id" : figure.getId().toString())) + ", id=\"" + id + "\", imageFileName=\"" + imageFileName + "\", imageUrl=\"" + imageUrl + "\", primaryIdentifier=\"" + primaryIdentifier + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("imageUrl".equals(fieldName)) {
            return imageUrl;
        }
        if ("imageFileName".equals(fieldName)) {
            return imageFileName;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("figure".equals(fieldName)) {
            if (figure instanceof ProxyReference) {
                return ((ProxyReference) figure).getObject();
            } else {
                return figure;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Image.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("imageUrl".equals(fieldName)) {
            return imageUrl;
        }
        if ("imageFileName".equals(fieldName)) {
            return imageFileName;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("figure".equals(fieldName)) {
            return figure;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Image.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("imageUrl".equals(fieldName)) {
            imageUrl = (java.lang.String) value;
        } else if ("imageFileName".equals(fieldName)) {
            imageFileName = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("figure".equals(fieldName)) {
            figure = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Image.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("imageUrl".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("imageFileName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("figure".equals(fieldName)) {
            return org.intermine.model.bio.Figure.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Image.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Image.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Image.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Image");
        if (imageUrl != null) {
            sb.append("$_^aimageUrl$_^");
            String string = imageUrl;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (imageFileName != null) {
            sb.append("$_^aimageFileName$_^");
            String string = imageFileName;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (primaryIdentifier != null) {
            sb.append("$_^aprimaryIdentifier$_^");
            String string = primaryIdentifier;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (figure != null) {
            sb.append("$_^rfigure$_^").append(figure.getId());
        }
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.Image.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Image)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aimageUrl".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                imageUrl = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aimageFileName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                imageFileName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aprimaryIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                primaryIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rfigure".equals(notXml[i])) {
                i++;
                figure = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Figure.class);
                i++;
            };
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        {
            if (!org.intermine.model.bio.Image.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if (!org.intermine.model.bio.Image.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Image.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
