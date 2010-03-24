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
public class OrganismShadow implements Organism, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Organism.class;
    // Attr: org.intermine.model.bio.Organism.genus
    protected java.lang.String genus;
    public java.lang.String getGenus() { return genus; }
    public void setGenus(final java.lang.String genus) { this.genus = genus; }

    // Attr: org.intermine.model.bio.Organism.taxonId
    protected java.lang.Integer taxonId;
    public java.lang.Integer getTaxonId() { return taxonId; }
    public void setTaxonId(final java.lang.Integer taxonId) { this.taxonId = taxonId; }

    // Attr: org.intermine.model.bio.Organism.species
    protected java.lang.String species;
    public java.lang.String getSpecies() { return species; }
    public void setSpecies(final java.lang.String species) { this.species = species; }

    // Attr: org.intermine.model.bio.Organism.abbreviation
    protected java.lang.String abbreviation;
    public java.lang.String getAbbreviation() { return abbreviation; }
    public void setAbbreviation(final java.lang.String abbreviation) { this.abbreviation = abbreviation; }

    // Attr: org.intermine.model.bio.Organism.shortName
    protected java.lang.String shortName;
    public java.lang.String getShortName() { return shortName; }
    public void setShortName(final java.lang.String shortName) { this.shortName = shortName; }

    // Attr: org.intermine.model.bio.Organism.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Organism && id != null) ? id.equals(((Organism)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Organism [abbreviation=\"" + abbreviation + "\", genus=\"" + genus + "\", id=\"" + id + "\", name=\"" + name + "\", shortName=\"" + shortName + "\", species=\"" + species + "\", taxonId=\"" + taxonId + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("genus".equals(fieldName)) {
            return genus;
        }
        if ("taxonId".equals(fieldName)) {
            return taxonId;
        }
        if ("species".equals(fieldName)) {
            return species;
        }
        if ("abbreviation".equals(fieldName)) {
            return abbreviation;
        }
        if ("shortName".equals(fieldName)) {
            return shortName;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Organism.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("genus".equals(fieldName)) {
            return genus;
        }
        if ("taxonId".equals(fieldName)) {
            return taxonId;
        }
        if ("species".equals(fieldName)) {
            return species;
        }
        if ("abbreviation".equals(fieldName)) {
            return abbreviation;
        }
        if ("shortName".equals(fieldName)) {
            return shortName;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Organism.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("genus".equals(fieldName)) {
            genus = (java.lang.String) value;
        } else if ("taxonId".equals(fieldName)) {
            taxonId = (java.lang.Integer) value;
        } else if ("species".equals(fieldName)) {
            species = (java.lang.String) value;
        } else if ("abbreviation".equals(fieldName)) {
            abbreviation = (java.lang.String) value;
        } else if ("shortName".equals(fieldName)) {
            shortName = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Organism.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("genus".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("taxonId".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("species".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("abbreviation".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("shortName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Organism.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Organism.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Organism.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Organism");
        if (genus != null) {
            sb.append("$_^agenus$_^");
            String string = genus;
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
        if (taxonId != null) {
            sb.append("$_^ataxonId$_^").append(taxonId);
        }
        if (species != null) {
            sb.append("$_^aspecies$_^");
            String string = species;
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
        if (abbreviation != null) {
            sb.append("$_^aabbreviation$_^");
            String string = abbreviation;
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
        if (shortName != null) {
            sb.append("$_^ashortName$_^");
            String string = shortName;
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
        if (name != null) {
            sb.append("$_^aname$_^");
            String string = name;
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
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.Organism.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Organism)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "agenus".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                genus = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ataxonId".equals(notXml[i])) {
                i++;
                taxonId = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aspecies".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                species = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aabbreviation".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                abbreviation = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ashortName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                shortName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aname".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                name = string == null ? notXml[i] : string.toString();
                i++;
            }
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
            if (!org.intermine.model.bio.Organism.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if (!org.intermine.model.bio.Organism.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Organism.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
