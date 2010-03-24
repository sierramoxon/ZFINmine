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
public class EnvironmentalConditionShadow implements EnvironmentalCondition, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = EnvironmentalCondition.class;
    // Attr: org.intermine.model.bio.EnvironmentalCondition.value
    protected java.lang.String value;
    public java.lang.String getValue() { return value; }
    public void setValue(final java.lang.String value) { this.value = value; }

    // Attr: org.intermine.model.bio.EnvironmentalCondition.conditionGroup
    protected java.lang.String conditionGroup;
    public java.lang.String getConditionGroup() { return conditionGroup; }
    public void setConditionGroup(final java.lang.String conditionGroup) { this.conditionGroup = conditionGroup; }

    // Attr: org.intermine.model.bio.EnvironmentalCondition.conditionName
    protected java.lang.String conditionName;
    public java.lang.String getConditionName() { return conditionName; }
    public void setConditionName(final java.lang.String conditionName) { this.conditionName = conditionName; }

    // Attr: org.intermine.model.bio.EnvironmentalCondition.unit
    protected java.lang.String unit;
    public java.lang.String getUnit() { return unit; }
    public void setUnit(final java.lang.String unit) { this.unit = unit; }

    // Attr: org.intermine.model.bio.EnvironmentalCondition.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Ref: org.intermine.model.bio.EnvironmentalCondition.environment
    protected org.intermine.model.InterMineObject environment;
    public org.intermine.model.bio.Environment getEnvironment() { if (environment instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Environment) ((org.intermine.objectstore.proxy.ProxyReference) environment).getObject()); }; return (org.intermine.model.bio.Environment) environment; }
    public void setEnvironment(final org.intermine.model.bio.Environment environment) { this.environment = environment; }
    public void proxyEnvironment(final org.intermine.objectstore.proxy.ProxyReference environment) { this.environment = environment; }
    public org.intermine.model.InterMineObject proxGetEnvironment() { return environment; }

    // Ref: org.intermine.model.bio.EnvironmentalCondition.morpholino
    protected org.intermine.model.InterMineObject morpholino;
    public org.intermine.model.bio.Morpholino getMorpholino() { if (morpholino instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Morpholino) ((org.intermine.objectstore.proxy.ProxyReference) morpholino).getObject()); }; return (org.intermine.model.bio.Morpholino) morpholino; }
    public void setMorpholino(final org.intermine.model.bio.Morpholino morpholino) { this.morpholino = morpholino; }
    public void proxyMorpholino(final org.intermine.objectstore.proxy.ProxyReference morpholino) { this.morpholino = morpholino; }
    public org.intermine.model.InterMineObject proxGetMorpholino() { return morpholino; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof EnvironmentalCondition && id != null) ? id.equals(((EnvironmentalCondition)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "EnvironmentalCondition [conditionGroup=\"" + conditionGroup + "\", conditionName=\"" + conditionName + "\", environment=" + (environment == null ? "null" : (environment.getId() == null ? "no id" : environment.getId().toString())) + ", id=\"" + id + "\", morpholino=" + (morpholino == null ? "null" : (morpholino.getId() == null ? "no id" : morpholino.getId().toString())) + ", primaryIdentifier=\"" + primaryIdentifier + "\", unit=\"" + unit + "\", value=\"" + value + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("value".equals(fieldName)) {
            return value;
        }
        if ("conditionGroup".equals(fieldName)) {
            return conditionGroup;
        }
        if ("conditionName".equals(fieldName)) {
            return conditionName;
        }
        if ("unit".equals(fieldName)) {
            return unit;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("environment".equals(fieldName)) {
            if (environment instanceof ProxyReference) {
                return ((ProxyReference) environment).getObject();
            } else {
                return environment;
            }
        }
        if ("morpholino".equals(fieldName)) {
            if (morpholino instanceof ProxyReference) {
                return ((ProxyReference) morpholino).getObject();
            } else {
                return morpholino;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.EnvironmentalCondition.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("value".equals(fieldName)) {
            return value;
        }
        if ("conditionGroup".equals(fieldName)) {
            return conditionGroup;
        }
        if ("conditionName".equals(fieldName)) {
            return conditionName;
        }
        if ("unit".equals(fieldName)) {
            return unit;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("environment".equals(fieldName)) {
            return environment;
        }
        if ("morpholino".equals(fieldName)) {
            return morpholino;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.EnvironmentalCondition.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("value".equals(fieldName)) {
            this.value = (java.lang.String) value;
        } else if ("conditionGroup".equals(fieldName)) {
            conditionGroup = (java.lang.String) value;
        } else if ("conditionName".equals(fieldName)) {
            conditionName = (java.lang.String) value;
        } else if ("unit".equals(fieldName)) {
            unit = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("environment".equals(fieldName)) {
            environment = (org.intermine.model.InterMineObject) value;
        } else if ("morpholino".equals(fieldName)) {
            morpholino = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.EnvironmentalCondition.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("value".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("conditionGroup".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("conditionName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("unit".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("environment".equals(fieldName)) {
            return org.intermine.model.bio.Environment.class;
        }
        if ("morpholino".equals(fieldName)) {
            return org.intermine.model.bio.Morpholino.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.EnvironmentalCondition.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.EnvironmentalCondition.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.EnvironmentalCondition.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.EnvironmentalCondition");
        if (value != null) {
            sb.append("$_^avalue$_^");
            String string = value;
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
        if (conditionGroup != null) {
            sb.append("$_^aconditionGroup$_^");
            String string = conditionGroup;
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
        if (conditionName != null) {
            sb.append("$_^aconditionName$_^");
            String string = conditionName;
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
        if (unit != null) {
            sb.append("$_^aunit$_^");
            String string = unit;
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
        if (environment != null) {
            sb.append("$_^renvironment$_^").append(environment.getId());
        }
        if (morpholino != null) {
            sb.append("$_^rmorpholino$_^").append(morpholino.getId());
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
        if (!org.intermine.model.bio.EnvironmentalCondition.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.EnvironmentalCondition)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "avalue".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                value = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aconditionGroup".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                conditionGroup = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aconditionName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                conditionName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aunit".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                unit = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) &&"renvironment".equals(notXml[i])) {
                i++;
                environment = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Environment.class);
                i++;
            };
            if ((i < notXml.length) &&"rmorpholino".equals(notXml[i])) {
                i++;
                morpholino = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Morpholino.class);
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
            if (!org.intermine.model.bio.EnvironmentalCondition.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if (!org.intermine.model.bio.EnvironmentalCondition.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.EnvironmentalCondition.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
