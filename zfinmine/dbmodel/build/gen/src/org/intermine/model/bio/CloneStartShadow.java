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
public class CloneStartShadow implements CloneStart, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = CloneStart.class;
    // Attr: org.intermine.model.bio.LocatedSequenceFeature.length
    protected java.lang.Integer length;
    public java.lang.Integer getLength() { return length; }
    public void setLength(final java.lang.Integer length) { this.length = length; }

    // Ref: org.intermine.model.bio.LocatedSequenceFeature.sequence
    protected org.intermine.model.InterMineObject sequence;
    public org.intermine.model.bio.Sequence getSequence() { if (sequence instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Sequence) ((org.intermine.objectstore.proxy.ProxyReference) sequence).getObject()); }; return (org.intermine.model.bio.Sequence) sequence; }
    public void setSequence(final org.intermine.model.bio.Sequence sequence) { this.sequence = sequence; }
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence) { this.sequence = sequence; }
    public org.intermine.model.InterMineObject proxGetSequence() { return sequence; }

    // Ref: org.intermine.model.bio.LocatedSequenceFeature.chromosome
    protected org.intermine.model.InterMineObject chromosome;
    public org.intermine.model.bio.Chromosome getChromosome() { if (chromosome instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Chromosome) ((org.intermine.objectstore.proxy.ProxyReference) chromosome).getObject()); }; return (org.intermine.model.bio.Chromosome) chromosome; }
    public void setChromosome(final org.intermine.model.bio.Chromosome chromosome) { this.chromosome = chromosome; }
    public void proxyChromosome(final org.intermine.objectstore.proxy.ProxyReference chromosome) { this.chromosome = chromosome; }
    public org.intermine.model.InterMineObject proxGetChromosome() { return chromosome; }

    // Ref: org.intermine.model.bio.LocatedSequenceFeature.chromosomeLocation
    protected org.intermine.model.InterMineObject chromosomeLocation;
    public org.intermine.model.bio.Location getChromosomeLocation() { if (chromosomeLocation instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Location) ((org.intermine.objectstore.proxy.ProxyReference) chromosomeLocation).getObject()); }; return (org.intermine.model.bio.Location) chromosomeLocation; }
    public void setChromosomeLocation(final org.intermine.model.bio.Location chromosomeLocation) { this.chromosomeLocation = chromosomeLocation; }
    public void proxyChromosomeLocation(final org.intermine.objectstore.proxy.ProxyReference chromosomeLocation) { this.chromosomeLocation = chromosomeLocation; }
    public org.intermine.model.InterMineObject proxGetChromosomeLocation() { return chromosomeLocation; }

    // Col: org.intermine.model.bio.LocatedSequenceFeature.overlappingFeatures
    protected java.util.Set<org.intermine.model.bio.LocatedSequenceFeature> overlappingFeatures = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.LocatedSequenceFeature> getOverlappingFeatures() { return overlappingFeatures; }
    public void setOverlappingFeatures(final java.util.Set<org.intermine.model.bio.LocatedSequenceFeature> overlappingFeatures) { this.overlappingFeatures = overlappingFeatures; }
    public void addOverlappingFeatures(final org.intermine.model.bio.LocatedSequenceFeature arg) { overlappingFeatures.add(arg); }

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

    // Attr: org.intermine.model.bio.Clone.ThisseCloneRating
    protected java.lang.String ThisseCloneRating;
    public java.lang.String getthisseCloneRating() { return ThisseCloneRating; }
    public void setthisseCloneRating(final java.lang.String ThisseCloneRating) { this.ThisseCloneRating = ThisseCloneRating; }

    // Attr: org.intermine.model.bio.Clone.cloneSite
    protected java.lang.String cloneSite;
    public java.lang.String getCloneSite() { return cloneSite; }
    public void setCloneSite(final java.lang.String cloneSite) { this.cloneSite = cloneSite; }

    // Attr: org.intermine.model.bio.Clone.PCR
    protected java.lang.String PCR;
    public java.lang.String getpCR() { return PCR; }
    public void setpCR(final java.lang.String PCR) { this.PCR = PCR; }

    // Attr: org.intermine.model.bio.Clone.polymerase
    protected java.lang.String polymerase;
    public java.lang.String getPolymerase() { return polymerase; }
    public void setPolymerase(final java.lang.String polymerase) { this.polymerase = polymerase; }

    // Attr: org.intermine.model.bio.Clone.digest
    protected java.lang.String digest;
    public java.lang.String getDigest() { return digest; }
    public void setDigest(final java.lang.String digest) { this.digest = digest; }

    // Attr: org.intermine.model.bio.Clone.vector
    protected java.lang.String vector;
    public java.lang.String getVector() { return vector; }
    public void setVector(final java.lang.String vector) { this.vector = vector; }

    // Attr: org.intermine.model.bio.Clone.problemType
    protected java.lang.String problemType;
    public java.lang.String getProblemType() { return problemType; }
    public void setProblemType(final java.lang.String problemType) { this.problemType = problemType; }

    // Attr: org.intermine.model.bio.Clone.insertSize
    protected java.lang.String insertSize;
    public java.lang.String getInsertSize() { return insertSize; }
    public void setInsertSize(final java.lang.String insertSize) { this.insertSize = insertSize; }

    // Attr: org.intermine.model.bio.Clone.sequenceType
    protected java.lang.String sequenceType;
    public java.lang.String getSequenceType() { return sequenceType; }
    public void setSequenceType(final java.lang.String sequenceType) { this.sequenceType = sequenceType; }

    // Ref: org.intermine.model.bio.Clone.probeLibrary
    protected org.intermine.model.InterMineObject probeLibrary;
    public org.intermine.model.bio.ProbeLibrary getProbeLibrary() { if (probeLibrary instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.ProbeLibrary) ((org.intermine.objectstore.proxy.ProxyReference) probeLibrary).getObject()); }; return (org.intermine.model.bio.ProbeLibrary) probeLibrary; }
    public void setProbeLibrary(final org.intermine.model.bio.ProbeLibrary probeLibrary) { this.probeLibrary = probeLibrary; }
    public void proxyProbeLibrary(final org.intermine.objectstore.proxy.ProxyReference probeLibrary) { this.probeLibrary = probeLibrary; }
    public org.intermine.model.InterMineObject proxGetProbeLibrary() { return probeLibrary; }

    // Col: org.intermine.model.bio.Clone.transcripts
    protected java.util.Set<org.intermine.model.bio.Transcript> transcripts = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts() { return transcripts; }
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts) { this.transcripts = transcripts; }
    public void addTranscripts(final org.intermine.model.bio.Transcript arg) { transcripts.add(arg); }

    // Col: org.intermine.model.bio.Clone.artifacts
    protected java.util.Set<org.intermine.model.bio.Gene> artifacts = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Gene> getArtifacts() { return artifacts; }
    public void setArtifacts(final java.util.Set<org.intermine.model.bio.Gene> artifacts) { this.artifacts = artifacts; }
    public void addArtifacts(final org.intermine.model.bio.Gene arg) { artifacts.add(arg); }

    // Col: org.intermine.model.bio.Clone.genes
    protected java.util.Set<org.intermine.model.bio.Gene> genes = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Gene> getGenes() { return genes; }
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes) { this.genes = genes; }
    public void addGenes(final org.intermine.model.bio.Gene arg) { genes.add(arg); }

    // Col: org.intermine.model.bio.Clone.clones
    protected java.util.Set<org.intermine.model.bio.Clone> clones = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Clone> getClones() { return clones; }
    public void setClones(final java.util.Set<org.intermine.model.bio.Clone> clones) { this.clones = clones; }
    public void addClones(final org.intermine.model.bio.Clone arg) { clones.add(arg); }

    // Col: org.intermine.model.bio.Clone.contains
    protected java.util.Set<org.intermine.model.bio.Clone> contains = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Clone> getContains() { return contains; }
    public void setContains(final java.util.Set<org.intermine.model.bio.Clone> contains) { this.contains = contains; }
    public void addContains(final org.intermine.model.bio.Clone arg) { contains.add(arg); }

    // Attr: org.intermine.model.bio.Region.comments
    protected java.lang.String comments;
    public java.lang.String getComments() { return comments; }
    public void setComments(final java.lang.String comments) { this.comments = comments; }

    // Attr: org.intermine.model.bio.Region.symbol
    protected java.lang.String symbol;
    public java.lang.String getSymbol() { return symbol; }
    public void setSymbol(final java.lang.String symbol) { this.symbol = symbol; }

    // Attr: org.intermine.model.bio.Region.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Col: org.intermine.model.bio.Region.constructs
    protected java.util.Set<org.intermine.model.bio.Construct> constructs = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Construct> getConstructs() { return constructs; }
    public void setConstructs(final java.util.Set<org.intermine.model.bio.Construct> constructs) { this.constructs = constructs; }
    public void addConstructs(final org.intermine.model.bio.Construct arg) { constructs.add(arg); }

    // Col: org.intermine.model.bio.Region.externalLinks
    protected java.util.Set<org.intermine.model.bio.ExternalLink> externalLinks = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.ExternalLink> getExternalLinks() { return externalLinks; }
    public void setExternalLinks(final java.util.Set<org.intermine.model.bio.ExternalLink> externalLinks) { this.externalLinks = externalLinks; }
    public void addExternalLinks(final org.intermine.model.bio.ExternalLink arg) { externalLinks.add(arg); }

    public boolean equals(Object o) { return (o instanceof CloneStart && id != null) ? id.equals(((CloneStart)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "CloneStart [PCR=\"" + PCR + "\", ThisseCloneRating=\"" + ThisseCloneRating + "\", chromosome=" + (chromosome == null ? "null" : (chromosome.getId() == null ? "no id" : chromosome.getId().toString())) + ", chromosomeLocation=" + (chromosomeLocation == null ? "null" : (chromosomeLocation.getId() == null ? "no id" : chromosomeLocation.getId().toString())) + ", cloneSite=\"" + cloneSite + "\", comments=\"" + comments + "\", curated=\"" + curated + "\", digest=\"" + digest + "\", id=\"" + id + "\", insertSize=\"" + insertSize + "\", length=\"" + length + "\", name=\"" + name + "\", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", polymerase=\"" + polymerase + "\", primaryIdentifier=\"" + primaryIdentifier + "\", probeLibrary=" + (probeLibrary == null ? "null" : (probeLibrary.getId() == null ? "no id" : probeLibrary.getId().toString())) + ", problemType=\"" + problemType + "\", secondaryIdentifier=\"" + secondaryIdentifier + "\", sequence=" + (sequence == null ? "null" : (sequence.getId() == null ? "no id" : sequence.getId().toString())) + ", sequenceType=\"" + sequenceType + "\", symbol=\"" + symbol + "\", type=\"" + type + "\", vector=\"" + vector + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("length".equals(fieldName)) {
            return length;
        }
        if ("sequence".equals(fieldName)) {
            if (sequence instanceof ProxyReference) {
                return ((ProxyReference) sequence).getObject();
            } else {
                return sequence;
            }
        }
        if ("chromosome".equals(fieldName)) {
            if (chromosome instanceof ProxyReference) {
                return ((ProxyReference) chromosome).getObject();
            } else {
                return chromosome;
            }
        }
        if ("chromosomeLocation".equals(fieldName)) {
            if (chromosomeLocation instanceof ProxyReference) {
                return ((ProxyReference) chromosomeLocation).getObject();
            } else {
                return chromosomeLocation;
            }
        }
        if ("overlappingFeatures".equals(fieldName)) {
            return overlappingFeatures;
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
        if ("ThisseCloneRating".equals(fieldName)) {
            return ThisseCloneRating;
        }
        if ("cloneSite".equals(fieldName)) {
            return cloneSite;
        }
        if ("PCR".equals(fieldName)) {
            return PCR;
        }
        if ("polymerase".equals(fieldName)) {
            return polymerase;
        }
        if ("digest".equals(fieldName)) {
            return digest;
        }
        if ("vector".equals(fieldName)) {
            return vector;
        }
        if ("problemType".equals(fieldName)) {
            return problemType;
        }
        if ("insertSize".equals(fieldName)) {
            return insertSize;
        }
        if ("sequenceType".equals(fieldName)) {
            return sequenceType;
        }
        if ("probeLibrary".equals(fieldName)) {
            if (probeLibrary instanceof ProxyReference) {
                return ((ProxyReference) probeLibrary).getObject();
            } else {
                return probeLibrary;
            }
        }
        if ("transcripts".equals(fieldName)) {
            return transcripts;
        }
        if ("artifacts".equals(fieldName)) {
            return artifacts;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("clones".equals(fieldName)) {
            return clones;
        }
        if ("contains".equals(fieldName)) {
            return contains;
        }
        if ("comments".equals(fieldName)) {
            return comments;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("constructs".equals(fieldName)) {
            return constructs;
        }
        if ("externalLinks".equals(fieldName)) {
            return externalLinks;
        }
        if (!org.intermine.model.bio.CloneStart.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("length".equals(fieldName)) {
            return length;
        }
        if ("sequence".equals(fieldName)) {
            return sequence;
        }
        if ("chromosome".equals(fieldName)) {
            return chromosome;
        }
        if ("chromosomeLocation".equals(fieldName)) {
            return chromosomeLocation;
        }
        if ("overlappingFeatures".equals(fieldName)) {
            return overlappingFeatures;
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
        if ("ThisseCloneRating".equals(fieldName)) {
            return ThisseCloneRating;
        }
        if ("cloneSite".equals(fieldName)) {
            return cloneSite;
        }
        if ("PCR".equals(fieldName)) {
            return PCR;
        }
        if ("polymerase".equals(fieldName)) {
            return polymerase;
        }
        if ("digest".equals(fieldName)) {
            return digest;
        }
        if ("vector".equals(fieldName)) {
            return vector;
        }
        if ("problemType".equals(fieldName)) {
            return problemType;
        }
        if ("insertSize".equals(fieldName)) {
            return insertSize;
        }
        if ("sequenceType".equals(fieldName)) {
            return sequenceType;
        }
        if ("probeLibrary".equals(fieldName)) {
            return probeLibrary;
        }
        if ("transcripts".equals(fieldName)) {
            return transcripts;
        }
        if ("artifacts".equals(fieldName)) {
            return artifacts;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("clones".equals(fieldName)) {
            return clones;
        }
        if ("contains".equals(fieldName)) {
            return contains;
        }
        if ("comments".equals(fieldName)) {
            return comments;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("constructs".equals(fieldName)) {
            return constructs;
        }
        if ("externalLinks".equals(fieldName)) {
            return externalLinks;
        }
        if (!org.intermine.model.bio.CloneStart.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("length".equals(fieldName)) {
            length = (java.lang.Integer) value;
        } else if ("sequence".equals(fieldName)) {
            sequence = (org.intermine.model.InterMineObject) value;
        } else if ("chromosome".equals(fieldName)) {
            chromosome = (org.intermine.model.InterMineObject) value;
        } else if ("chromosomeLocation".equals(fieldName)) {
            chromosomeLocation = (org.intermine.model.InterMineObject) value;
        } else if ("overlappingFeatures".equals(fieldName)) {
            overlappingFeatures = (java.util.Set) value;
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
        } else if ("ThisseCloneRating".equals(fieldName)) {
            ThisseCloneRating = (java.lang.String) value;
        } else if ("cloneSite".equals(fieldName)) {
            cloneSite = (java.lang.String) value;
        } else if ("PCR".equals(fieldName)) {
            PCR = (java.lang.String) value;
        } else if ("polymerase".equals(fieldName)) {
            polymerase = (java.lang.String) value;
        } else if ("digest".equals(fieldName)) {
            digest = (java.lang.String) value;
        } else if ("vector".equals(fieldName)) {
            vector = (java.lang.String) value;
        } else if ("problemType".equals(fieldName)) {
            problemType = (java.lang.String) value;
        } else if ("insertSize".equals(fieldName)) {
            insertSize = (java.lang.String) value;
        } else if ("sequenceType".equals(fieldName)) {
            sequenceType = (java.lang.String) value;
        } else if ("probeLibrary".equals(fieldName)) {
            probeLibrary = (org.intermine.model.InterMineObject) value;
        } else if ("transcripts".equals(fieldName)) {
            transcripts = (java.util.Set) value;
        } else if ("artifacts".equals(fieldName)) {
            artifacts = (java.util.Set) value;
        } else if ("genes".equals(fieldName)) {
            genes = (java.util.Set) value;
        } else if ("clones".equals(fieldName)) {
            clones = (java.util.Set) value;
        } else if ("contains".equals(fieldName)) {
            contains = (java.util.Set) value;
        } else if ("comments".equals(fieldName)) {
            comments = (java.lang.String) value;
        } else if ("symbol".equals(fieldName)) {
            symbol = (java.lang.String) value;
        } else if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("constructs".equals(fieldName)) {
            constructs = (java.util.Set) value;
        } else if ("externalLinks".equals(fieldName)) {
            externalLinks = (java.util.Set) value;
        } else {
            if (!org.intermine.model.bio.CloneStart.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("length".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("sequence".equals(fieldName)) {
            return org.intermine.model.bio.Sequence.class;
        }
        if ("chromosome".equals(fieldName)) {
            return org.intermine.model.bio.Chromosome.class;
        }
        if ("chromosomeLocation".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("overlappingFeatures".equals(fieldName)) {
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
        if ("ThisseCloneRating".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("cloneSite".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("PCR".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("polymerase".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("digest".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("vector".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("problemType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("insertSize".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sequenceType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("probeLibrary".equals(fieldName)) {
            return org.intermine.model.bio.ProbeLibrary.class;
        }
        if ("transcripts".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("artifacts".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("genes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("clones".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("contains".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("comments".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("symbol".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("constructs".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("externalLinks".equals(fieldName)) {
            return java.util.Set.class;
        }
        if (!org.intermine.model.bio.CloneStart.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.CloneStart.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.CloneStart.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.CloneStart");
        if (length != null) {
            sb.append("$_^alength$_^").append(length);
        }
        if (sequence != null) {
            sb.append("$_^rsequence$_^").append(sequence.getId());
        }
        if (chromosome != null) {
            sb.append("$_^rchromosome$_^").append(chromosome.getId());
        }
        if (chromosomeLocation != null) {
            sb.append("$_^rchromosomeLocation$_^").append(chromosomeLocation.getId());
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
        if (ThisseCloneRating != null) {
            sb.append("$_^aThisseCloneRating$_^");
            String string = ThisseCloneRating;
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
        if (cloneSite != null) {
            sb.append("$_^acloneSite$_^");
            String string = cloneSite;
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
        if (PCR != null) {
            sb.append("$_^aPCR$_^");
            String string = PCR;
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
        if (polymerase != null) {
            sb.append("$_^apolymerase$_^");
            String string = polymerase;
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
        if (digest != null) {
            sb.append("$_^adigest$_^");
            String string = digest;
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
        if (vector != null) {
            sb.append("$_^avector$_^");
            String string = vector;
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
        if (problemType != null) {
            sb.append("$_^aproblemType$_^");
            String string = problemType;
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
        if (insertSize != null) {
            sb.append("$_^ainsertSize$_^");
            String string = insertSize;
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
        if (sequenceType != null) {
            sb.append("$_^asequenceType$_^");
            String string = sequenceType;
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
        if (probeLibrary != null) {
            sb.append("$_^rprobeLibrary$_^").append(probeLibrary.getId());
        }
        if (comments != null) {
            sb.append("$_^acomments$_^");
            String string = comments;
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
        if (symbol != null) {
            sb.append("$_^asymbol$_^");
            String string = symbol;
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
        if (type != null) {
            sb.append("$_^atype$_^");
            String string = type;
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
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.CloneStart.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.CloneStart)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "alength".equals(notXml[i])) {
                i++;
                length = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rsequence".equals(notXml[i])) {
                i++;
                sequence = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Sequence.class);
                i++;
            };
            if ((i < notXml.length) &&"rchromosome".equals(notXml[i])) {
                i++;
                chromosome = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Chromosome.class);
                i++;
            };
            if ((i < notXml.length) &&"rchromosomeLocation".equals(notXml[i])) {
                i++;
                chromosomeLocation = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Location.class);
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
            if ((i < notXml.length) && "aThisseCloneRating".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                ThisseCloneRating = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "acloneSite".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                cloneSite = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aPCR".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                PCR = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "apolymerase".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                polymerase = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "adigest".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                digest = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "avector".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                vector = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aproblemType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                problemType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ainsertSize".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                insertSize = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asequenceType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sequenceType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rprobeLibrary".equals(notXml[i])) {
                i++;
                probeLibrary = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.ProbeLibrary.class);
                i++;
            };
            if ((i < notXml.length) && "acomments".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                comments = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asymbol".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                symbol = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atype".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                type = string == null ? notXml[i] : string.toString();
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        overlappingFeatures = new ProxyCollection(os, this, "overlappingFeatures", org.intermine.model.bio.LocatedSequenceFeature.class);
        relations = new ProxyCollection(os, this, "relations", org.intermine.model.bio.SymmetricalRelation.class);
        subjects = new ProxyCollection(os, this, "subjects", org.intermine.model.bio.Relation.class);
        objects = new ProxyCollection(os, this, "objects", org.intermine.model.bio.Relation.class);
        annotations = new ProxyCollection(os, this, "annotations", org.intermine.model.bio.Annotation.class);
        synonyms = new ProxyCollection(os, this, "synonyms", org.intermine.model.bio.Synonym.class);
        evidence = new ProxyCollection(os, this, "evidence", org.intermine.model.bio.Evidence.class);
        dataSets = new ProxyCollection(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
        publications = new ProxyCollection(os, this, "publications", org.intermine.model.bio.Publication.class);
        transcripts = new ProxyCollection(os, this, "transcripts", org.intermine.model.bio.Transcript.class);
        artifacts = new ProxyCollection(os, this, "artifacts", org.intermine.model.bio.Gene.class);
        genes = new ProxyCollection(os, this, "genes", org.intermine.model.bio.Gene.class);
        clones = new ProxyCollection(os, this, "clones", org.intermine.model.bio.Clone.class);
        contains = new ProxyCollection(os, this, "contains", org.intermine.model.bio.Clone.class);
        constructs = new ProxyCollection(os, this, "constructs", org.intermine.model.bio.Construct.class);
        externalLinks = new ProxyCollection(os, this, "externalLinks", org.intermine.model.bio.ExternalLink.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("overlappingFeatures".equals(fieldName)) {
            overlappingFeatures.add((org.intermine.model.bio.LocatedSequenceFeature) element);
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
        } else if ("transcripts".equals(fieldName)) {
            transcripts.add((org.intermine.model.bio.Transcript) element);
        } else if ("artifacts".equals(fieldName)) {
            artifacts.add((org.intermine.model.bio.Gene) element);
        } else if ("genes".equals(fieldName)) {
            genes.add((org.intermine.model.bio.Gene) element);
        } else if ("clones".equals(fieldName)) {
            clones.add((org.intermine.model.bio.Clone) element);
        } else if ("contains".equals(fieldName)) {
            contains.add((org.intermine.model.bio.Clone) element);
        } else if ("constructs".equals(fieldName)) {
            constructs.add((org.intermine.model.bio.Construct) element);
        } else if ("externalLinks".equals(fieldName)) {
            externalLinks.add((org.intermine.model.bio.ExternalLink) element);
        } else {
            if (!org.intermine.model.bio.CloneStart.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("overlappingFeatures".equals(fieldName)) {
            return org.intermine.model.bio.LocatedSequenceFeature.class;
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
        if ("transcripts".equals(fieldName)) {
            return org.intermine.model.bio.Transcript.class;
        }
        if ("artifacts".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("genes".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("clones".equals(fieldName)) {
            return org.intermine.model.bio.Clone.class;
        }
        if ("contains".equals(fieldName)) {
            return org.intermine.model.bio.Clone.class;
        }
        if ("constructs".equals(fieldName)) {
            return org.intermine.model.bio.Construct.class;
        }
        if ("externalLinks".equals(fieldName)) {
            return org.intermine.model.bio.ExternalLink.class;
        }
        if (!org.intermine.model.bio.CloneStart.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.CloneStart.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
