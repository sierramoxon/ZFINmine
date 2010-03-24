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
public class LocationShadow implements Location, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Location.class;
    // Attr: org.intermine.model.bio.Location.end
    protected java.lang.Integer end;
    public java.lang.Integer getEnd() { return end; }
    public void setEnd(final java.lang.Integer end) { this.end = end; }

    // Attr: org.intermine.model.bio.Location.endPhase
    protected java.lang.Integer endPhase;
    public java.lang.Integer getEndPhase() { return endPhase; }
    public void setEndPhase(final java.lang.Integer endPhase) { this.endPhase = endPhase; }

    // Attr: org.intermine.model.bio.Location.phase
    protected java.lang.Integer phase;
    public java.lang.Integer getPhase() { return phase; }
    public void setPhase(final java.lang.Integer phase) { this.phase = phase; }

    // Attr: org.intermine.model.bio.Location.start
    protected java.lang.Integer start;
    public java.lang.Integer getStart() { return start; }
    public void setStart(final java.lang.Integer start) { this.start = start; }

    // Attr: org.intermine.model.bio.Location.strand
    protected java.lang.String strand;
    public java.lang.String getStrand() { return strand; }
    public void setStrand(final java.lang.String strand) { this.strand = strand; }

    // Attr: org.intermine.model.bio.Location.endIsPartial
    protected java.lang.Boolean endIsPartial;
    public java.lang.Boolean getEndIsPartial() { return endIsPartial; }
    public void setEndIsPartial(final java.lang.Boolean endIsPartial) { this.endIsPartial = endIsPartial; }

    // Attr: org.intermine.model.bio.Location.startIsPartial
    protected java.lang.Boolean startIsPartial;
    public java.lang.Boolean getStartIsPartial() { return startIsPartial; }
    public void setStartIsPartial(final java.lang.Boolean startIsPartial) { this.startIsPartial = startIsPartial; }

    // Ref: org.intermine.model.bio.Relation.subject
    protected org.intermine.model.InterMineObject subject;
    public org.intermine.model.bio.BioEntity getSubject() { if (subject instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) subject).getObject()); }; return (org.intermine.model.bio.BioEntity) subject; }
    public void setSubject(final org.intermine.model.bio.BioEntity subject) { this.subject = subject; }
    public void proxySubject(final org.intermine.objectstore.proxy.ProxyReference subject) { this.subject = subject; }
    public org.intermine.model.InterMineObject proxGetSubject() { return subject; }

    // Ref: org.intermine.model.bio.Relation.object
    protected org.intermine.model.InterMineObject object;
    public org.intermine.model.bio.BioEntity getObject() { if (object instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) object).getObject()); }; return (org.intermine.model.bio.BioEntity) object; }
    public void setObject(final org.intermine.model.bio.BioEntity object) { this.object = object; }
    public void proxyObject(final org.intermine.objectstore.proxy.ProxyReference object) { this.object = object; }
    public org.intermine.model.InterMineObject proxGetObject() { return object; }

    // Col: org.intermine.model.bio.Relation.evidence
    protected java.util.Set<org.intermine.model.bio.Evidence> evidence = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Evidence> getEvidence() { return evidence; }
    public void setEvidence(final java.util.Set<org.intermine.model.bio.Evidence> evidence) { this.evidence = evidence; }
    public void addEvidence(final org.intermine.model.bio.Evidence arg) { evidence.add(arg); }

    // Col: org.intermine.model.bio.Relation.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Col: org.intermine.model.bio.SymmetricalRelation.bioEntities
    protected java.util.Set<org.intermine.model.bio.BioEntity> bioEntities = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.BioEntity> getBioEntities() { return bioEntities; }
    public void setBioEntities(final java.util.Set<org.intermine.model.bio.BioEntity> bioEntities) { this.bioEntities = bioEntities; }
    public void addBioEntities(final org.intermine.model.bio.BioEntity arg) { bioEntities.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Location && id != null) ? id.equals(((Location)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Location [end=\"" + end + "\", endIsPartial=\"" + endIsPartial + "\", endPhase=\"" + endPhase + "\", id=\"" + id + "\", object=" + (object == null ? "null" : (object.getId() == null ? "no id" : object.getId().toString())) + ", phase=\"" + phase + "\", start=\"" + start + "\", startIsPartial=\"" + startIsPartial + "\", strand=\"" + strand + "\", subject=" + (subject == null ? "null" : (subject.getId() == null ? "no id" : subject.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("end".equals(fieldName)) {
            return end;
        }
        if ("endPhase".equals(fieldName)) {
            return endPhase;
        }
        if ("phase".equals(fieldName)) {
            return phase;
        }
        if ("start".equals(fieldName)) {
            return start;
        }
        if ("strand".equals(fieldName)) {
            return strand;
        }
        if ("endIsPartial".equals(fieldName)) {
            return endIsPartial;
        }
        if ("startIsPartial".equals(fieldName)) {
            return startIsPartial;
        }
        if ("subject".equals(fieldName)) {
            if (subject instanceof ProxyReference) {
                return ((ProxyReference) subject).getObject();
            } else {
                return subject;
            }
        }
        if ("object".equals(fieldName)) {
            if (object instanceof ProxyReference) {
                return ((ProxyReference) object).getObject();
            } else {
                return object;
            }
        }
        if ("evidence".equals(fieldName)) {
            return evidence;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("bioEntities".equals(fieldName)) {
            return bioEntities;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Location.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("end".equals(fieldName)) {
            return end;
        }
        if ("endPhase".equals(fieldName)) {
            return endPhase;
        }
        if ("phase".equals(fieldName)) {
            return phase;
        }
        if ("start".equals(fieldName)) {
            return start;
        }
        if ("strand".equals(fieldName)) {
            return strand;
        }
        if ("endIsPartial".equals(fieldName)) {
            return endIsPartial;
        }
        if ("startIsPartial".equals(fieldName)) {
            return startIsPartial;
        }
        if ("subject".equals(fieldName)) {
            return subject;
        }
        if ("object".equals(fieldName)) {
            return object;
        }
        if ("evidence".equals(fieldName)) {
            return evidence;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("bioEntities".equals(fieldName)) {
            return bioEntities;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Location.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("end".equals(fieldName)) {
            end = (java.lang.Integer) value;
        } else if ("endPhase".equals(fieldName)) {
            endPhase = (java.lang.Integer) value;
        } else if ("phase".equals(fieldName)) {
            phase = (java.lang.Integer) value;
        } else if ("start".equals(fieldName)) {
            start = (java.lang.Integer) value;
        } else if ("strand".equals(fieldName)) {
            strand = (java.lang.String) value;
        } else if ("endIsPartial".equals(fieldName)) {
            endIsPartial = (java.lang.Boolean) value;
        } else if ("startIsPartial".equals(fieldName)) {
            startIsPartial = (java.lang.Boolean) value;
        } else if ("subject".equals(fieldName)) {
            subject = (org.intermine.model.InterMineObject) value;
        } else if ("object".equals(fieldName)) {
            object = (org.intermine.model.InterMineObject) value;
        } else if ("evidence".equals(fieldName)) {
            evidence = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("bioEntities".equals(fieldName)) {
            bioEntities = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Location.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("end".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("endPhase".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("phase".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("start".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("strand".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("endIsPartial".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("startIsPartial".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("subject".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("object".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("evidence".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("bioEntities".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Location.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Location.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Location.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Location");
        if (end != null) {
            sb.append("$_^aend$_^").append(end);
        }
        if (endPhase != null) {
            sb.append("$_^aendPhase$_^").append(endPhase);
        }
        if (phase != null) {
            sb.append("$_^aphase$_^").append(phase);
        }
        if (start != null) {
            sb.append("$_^astart$_^").append(start);
        }
        if (strand != null) {
            sb.append("$_^astrand$_^");
            String string = strand;
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
        if (endIsPartial != null) {
            sb.append("$_^aendIsPartial$_^").append(endIsPartial);
        }
        if (startIsPartial != null) {
            sb.append("$_^astartIsPartial$_^").append(startIsPartial);
        }
        if (subject != null) {
            sb.append("$_^rsubject$_^").append(subject.getId());
        }
        if (object != null) {
            sb.append("$_^robject$_^").append(object.getId());
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
        if (!org.intermine.model.bio.Location.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Location)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aend".equals(notXml[i])) {
                i++;
                end = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aendPhase".equals(notXml[i])) {
                i++;
                endPhase = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aphase".equals(notXml[i])) {
                i++;
                phase = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "astart".equals(notXml[i])) {
                i++;
                start = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "astrand".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                strand = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aendIsPartial".equals(notXml[i])) {
                i++;
                endIsPartial = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "astartIsPartial".equals(notXml[i])) {
                i++;
                startIsPartial = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rsubject".equals(notXml[i])) {
                i++;
                subject = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
                i++;
            };
            if ((i < notXml.length) &&"robject".equals(notXml[i])) {
                i++;
                object = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
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
        evidence = new ProxyCollection(os, this, "evidence", org.intermine.model.bio.Evidence.class);
        dataSets = new ProxyCollection(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
        bioEntities = new ProxyCollection(os, this, "bioEntities", org.intermine.model.bio.BioEntity.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("evidence".equals(fieldName)) {
            evidence.add((org.intermine.model.bio.Evidence) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else if ("bioEntities".equals(fieldName)) {
            bioEntities.add((org.intermine.model.bio.BioEntity) element);
        } else {
            if (!org.intermine.model.bio.Location.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("evidence".equals(fieldName)) {
            return org.intermine.model.bio.Evidence.class;
        }
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if ("bioEntities".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if (!org.intermine.model.bio.Location.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Location.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
