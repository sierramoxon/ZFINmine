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
public class PolypeptideShadow implements Polypeptide, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = Polypeptide.class;
    // Ref: org.intermine.model.bio.Polypeptide.sequence
    protected org.intermine.model.InterMineObject sequence;
    public org.intermine.model.bio.Sequence getSequence() { if (sequence instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Sequence) ((org.intermine.objectstore.proxy.ProxyReference) sequence).getObject()); }; return (org.intermine.model.bio.Sequence) sequence; }
    public void setSequence(final org.intermine.model.bio.Sequence sequence) { this.sequence = sequence; }
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence) { this.sequence = sequence; }
    public org.intermine.model.InterMineObject proxGetSequence() { return sequence; }

    // Col: org.intermine.model.bio.Polypeptide.polypeptideDomains
    protected java.util.Set<org.intermine.model.bio.PolypeptideDomain> polypeptideDomains = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.PolypeptideDomain> getPolypeptideDomains() { return polypeptideDomains; }
    public void setPolypeptideDomains(final java.util.Set<org.intermine.model.bio.PolypeptideDomain> polypeptideDomains) { this.polypeptideDomains = polypeptideDomains; }
    public void addPolypeptideDomains(final org.intermine.model.bio.PolypeptideDomain arg) { polypeptideDomains.add(arg); }

    // Col: org.intermine.model.bio.Polypeptide.signalPeptides
    protected java.util.Set<org.intermine.model.bio.SignalPeptide> signalPeptides = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.SignalPeptide> getSignalPeptides() { return signalPeptides; }
    public void setSignalPeptides(final java.util.Set<org.intermine.model.bio.SignalPeptide> signalPeptides) { this.signalPeptides = signalPeptides; }
    public void addSignalPeptides(final org.intermine.model.bio.SignalPeptide arg) { signalPeptides.add(arg); }

    // Col: org.intermine.model.bio.Polypeptide.CDSs
    protected java.util.Set<org.intermine.model.bio.CDS> CDSs = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.CDS> getcDSs() { return CDSs; }
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs) { this.CDSs = CDSs; }
    public void addcDSs(final org.intermine.model.bio.CDS arg) { CDSs.add(arg); }

    // Attr: org.intermine.model.bio.BioEntity.curated
    protected java.lang.Boolean curated;
    public java.lang.Boolean getCurated() { return curated; }
    public void setCurated(final java.lang.Boolean curated) { this.curated = curated; }

    // Attr: org.intermine.model.bio.BioEntity.secondaryIdentifier
    protected java.lang.String secondaryIdentifier;
    public java.lang.String getSecondaryIdentifier() { return secondaryIdentifier; }
    public void setSecondaryIdentifier(final java.lang.String secondaryIdentifier) { this.secondaryIdentifier = secondaryIdentifier; }

    // Attr: org.intermine.model.bio.BioEntity.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.BioEntity.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Ref: org.intermine.model.bio.BioEntity.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.BioEntity.relations
    protected java.util.Set<org.intermine.model.bio.SymmetricalRelation> relations = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.SymmetricalRelation> getRelations() { return relations; }
    public void setRelations(final java.util.Set<org.intermine.model.bio.SymmetricalRelation> relations) { this.relations = relations; }
    public void addRelations(final org.intermine.model.bio.SymmetricalRelation arg) { relations.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.subjects
    protected java.util.Set<org.intermine.model.bio.Relation> subjects = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Relation> getSubjects() { return subjects; }
    public void setSubjects(final java.util.Set<org.intermine.model.bio.Relation> subjects) { this.subjects = subjects; }
    public void addSubjects(final org.intermine.model.bio.Relation arg) { subjects.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.objects
    protected java.util.Set<org.intermine.model.bio.Relation> objects = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Relation> getObjects() { return objects; }
    public void setObjects(final java.util.Set<org.intermine.model.bio.Relation> objects) { this.objects = objects; }
    public void addObjects(final org.intermine.model.bio.Relation arg) { objects.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.annotations
    protected java.util.Set<org.intermine.model.bio.Annotation> annotations = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Annotation> getAnnotations() { return annotations; }
    public void setAnnotations(final java.util.Set<org.intermine.model.bio.Annotation> annotations) { this.annotations = annotations; }
    public void addAnnotations(final org.intermine.model.bio.Annotation arg) { annotations.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.synonyms
    protected java.util.Set<org.intermine.model.bio.Synonym> synonyms = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Synonym> getSynonyms() { return synonyms; }
    public void setSynonyms(final java.util.Set<org.intermine.model.bio.Synonym> synonyms) { this.synonyms = synonyms; }
    public void addSynonyms(final org.intermine.model.bio.Synonym arg) { synonyms.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.evidence
    protected java.util.Set<org.intermine.model.bio.Evidence> evidence = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Evidence> getEvidence() { return evidence; }
    public void setEvidence(final java.util.Set<org.intermine.model.bio.Evidence> evidence) { this.evidence = evidence; }
    public void addEvidence(final org.intermine.model.bio.Evidence arg) { evidence.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    public boolean equals(Object o) { return (o instanceof Polypeptide && id != null) ? id.equals(((Polypeptide)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "Polypeptide [curated=\"" + curated + "\", id=\"" + id + "\", name=\"" + name + "\", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", primaryIdentifier=\"" + primaryIdentifier + "\", secondaryIdentifier=\"" + secondaryIdentifier + "\", sequence=" + (sequence == null ? "null" : (sequence.getId() == null ? "no id" : sequence.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("sequence".equals(fieldName)) {
            if (sequence instanceof ProxyReference) {
                return ((ProxyReference) sequence).getObject();
            } else {
                return sequence;
            }
        }
        if ("polypeptideDomains".equals(fieldName)) {
            return polypeptideDomains;
        }
        if ("signalPeptides".equals(fieldName)) {
            return signalPeptides;
        }
        if ("CDSs".equals(fieldName)) {
            return CDSs;
        }
        if ("curated".equals(fieldName)) {
            return curated;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("relations".equals(fieldName)) {
            return relations;
        }
        if ("subjects".equals(fieldName)) {
            return subjects;
        }
        if ("objects".equals(fieldName)) {
            return objects;
        }
        if ("annotations".equals(fieldName)) {
            return annotations;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("evidence".equals(fieldName)) {
            return evidence;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Polypeptide.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("sequence".equals(fieldName)) {
            return sequence;
        }
        if ("polypeptideDomains".equals(fieldName)) {
            return polypeptideDomains;
        }
        if ("signalPeptides".equals(fieldName)) {
            return signalPeptides;
        }
        if ("CDSs".equals(fieldName)) {
            return CDSs;
        }
        if ("curated".equals(fieldName)) {
            return curated;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("relations".equals(fieldName)) {
            return relations;
        }
        if ("subjects".equals(fieldName)) {
            return subjects;
        }
        if ("objects".equals(fieldName)) {
            return objects;
        }
        if ("annotations".equals(fieldName)) {
            return annotations;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("evidence".equals(fieldName)) {
            return evidence;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Polypeptide.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("sequence".equals(fieldName)) {
            sequence = (org.intermine.model.InterMineObject) value;
        } else if ("polypeptideDomains".equals(fieldName)) {
            polypeptideDomains = (java.util.Set) value;
        } else if ("signalPeptides".equals(fieldName)) {
            signalPeptides = (java.util.Set) value;
        } else if ("CDSs".equals(fieldName)) {
            CDSs = (java.util.Set) value;
        } else if ("curated".equals(fieldName)) {
            curated = (java.lang.Boolean) value;
        } else if ("secondaryIdentifier".equals(fieldName)) {
            secondaryIdentifier = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("relations".equals(fieldName)) {
            relations = (java.util.Set) value;
        } else if ("subjects".equals(fieldName)) {
            subjects = (java.util.Set) value;
        } else if ("objects".equals(fieldName)) {
            objects = (java.util.Set) value;
        } else if ("annotations".equals(fieldName)) {
            annotations = (java.util.Set) value;
        } else if ("synonyms".equals(fieldName)) {
            synonyms = (java.util.Set) value;
        } else if ("evidence".equals(fieldName)) {
            evidence = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Polypeptide.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("sequence".equals(fieldName)) {
            return org.intermine.model.bio.Sequence.class;
        }
        if ("polypeptideDomains".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("signalPeptides".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("CDSs".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("curated".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("relations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("subjects".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("objects".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("annotations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("synonyms".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("evidence".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Polypeptide.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Polypeptide.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.Polypeptide.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Polypeptide");
        if (sequence != null) {
            sb.append("$_^rsequence$_^").append(sequence.getId());
        }
        if (curated != null) {
            sb.append("$_^acurated$_^").append(curated);
        }
        if (secondaryIdentifier != null) {
            sb.append("$_^asecondaryIdentifier$_^");
            String string = secondaryIdentifier;
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
        if (organism != null) {
            sb.append("$_^rorganism$_^").append(organism.getId());
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
        if (!org.intermine.model.bio.Polypeptide.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Polypeptide)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) &&"rsequence".equals(notXml[i])) {
                i++;
                sequence = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Sequence.class);
                i++;
            };
            if ((i < notXml.length) && "acurated".equals(notXml[i])) {
                i++;
                curated = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "asecondaryIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                secondaryIdentifier = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) &&"rorganism".equals(notXml[i])) {
                i++;
                organism = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Organism.class);
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
        polypeptideDomains = new ProxyCollection(os, this, "polypeptideDomains", org.intermine.model.bio.PolypeptideDomain.class);
        signalPeptides = new ProxyCollection(os, this, "signalPeptides", org.intermine.model.bio.SignalPeptide.class);
        CDSs = new ProxyCollection(os, this, "CDSs", org.intermine.model.bio.CDS.class);
        relations = new ProxyCollection(os, this, "relations", org.intermine.model.bio.SymmetricalRelation.class);
        subjects = new ProxyCollection(os, this, "subjects", org.intermine.model.bio.Relation.class);
        objects = new ProxyCollection(os, this, "objects", org.intermine.model.bio.Relation.class);
        annotations = new ProxyCollection(os, this, "annotations", org.intermine.model.bio.Annotation.class);
        synonyms = new ProxyCollection(os, this, "synonyms", org.intermine.model.bio.Synonym.class);
        evidence = new ProxyCollection(os, this, "evidence", org.intermine.model.bio.Evidence.class);
        dataSets = new ProxyCollection(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
        publications = new ProxyCollection(os, this, "publications", org.intermine.model.bio.Publication.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("polypeptideDomains".equals(fieldName)) {
            polypeptideDomains.add((org.intermine.model.bio.PolypeptideDomain) element);
        } else if ("signalPeptides".equals(fieldName)) {
            signalPeptides.add((org.intermine.model.bio.SignalPeptide) element);
        } else if ("CDSs".equals(fieldName)) {
            CDSs.add((org.intermine.model.bio.CDS) element);
        } else if ("relations".equals(fieldName)) {
            relations.add((org.intermine.model.bio.SymmetricalRelation) element);
        } else if ("subjects".equals(fieldName)) {
            subjects.add((org.intermine.model.bio.Relation) element);
        } else if ("objects".equals(fieldName)) {
            objects.add((org.intermine.model.bio.Relation) element);
        } else if ("annotations".equals(fieldName)) {
            annotations.add((org.intermine.model.bio.Annotation) element);
        } else if ("synonyms".equals(fieldName)) {
            synonyms.add((org.intermine.model.bio.Synonym) element);
        } else if ("evidence".equals(fieldName)) {
            evidence.add((org.intermine.model.bio.Evidence) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else {
            if (!org.intermine.model.bio.Polypeptide.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("polypeptideDomains".equals(fieldName)) {
            return org.intermine.model.bio.PolypeptideDomain.class;
        }
        if ("signalPeptides".equals(fieldName)) {
            return org.intermine.model.bio.SignalPeptide.class;
        }
        if ("CDSs".equals(fieldName)) {
            return org.intermine.model.bio.CDS.class;
        }
        if ("relations".equals(fieldName)) {
            return org.intermine.model.bio.SymmetricalRelation.class;
        }
        if ("subjects".equals(fieldName)) {
            return org.intermine.model.bio.Relation.class;
        }
        if ("objects".equals(fieldName)) {
            return org.intermine.model.bio.Relation.class;
        }
        if ("annotations".equals(fieldName)) {
            return org.intermine.model.bio.Annotation.class;
        }
        if ("synonyms".equals(fieldName)) {
            return org.intermine.model.bio.Synonym.class;
        }
        if ("evidence".equals(fieldName)) {
            return org.intermine.model.bio.Evidence.class;
        }
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if (!org.intermine.model.bio.Polypeptide.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Polypeptide.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
