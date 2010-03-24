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
public class PrimaryTranscriptShadow implements PrimaryTranscript, org.intermine.model.ShadowClass
{
    public static final Class shadowOf = PrimaryTranscript.class;
    // Col: org.intermine.model.bio.PrimaryTranscript.clips
    protected java.util.Set<org.intermine.model.bio.Clip> clips = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Clip> getClips() { return clips; }
    public void setClips(final java.util.Set<org.intermine.model.bio.Clip> clips) { this.clips = clips; }
    public void addClips(final org.intermine.model.bio.Clip arg) { clips.add(arg); }

    // Col: org.intermine.model.bio.PrimaryTranscript.transcriptionStartSites
    protected java.util.Set<org.intermine.model.bio.TranscriptionStartSite> transcriptionStartSites = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.TranscriptionStartSite> getTranscriptionStartSites() { return transcriptionStartSites; }
    public void setTranscriptionStartSites(final java.util.Set<org.intermine.model.bio.TranscriptionStartSite> transcriptionStartSites) { this.transcriptionStartSites = transcriptionStartSites; }
    public void addTranscriptionStartSites(final org.intermine.model.bio.TranscriptionStartSite arg) { transcriptionStartSites.add(arg); }

    // Col: org.intermine.model.bio.PrimaryTranscript.transcriptionEndSites
    protected java.util.Set<org.intermine.model.bio.TranscriptionEndSite> transcriptionEndSites = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.TranscriptionEndSite> getTranscriptionEndSites() { return transcriptionEndSites; }
    public void setTranscriptionEndSites(final java.util.Set<org.intermine.model.bio.TranscriptionEndSite> transcriptionEndSites) { this.transcriptionEndSites = transcriptionEndSites; }
    public void addTranscriptionEndSites(final org.intermine.model.bio.TranscriptionEndSite arg) { transcriptionEndSites.add(arg); }

    // Col: org.intermine.model.bio.PrimaryTranscript.processedTranscripts
    protected java.util.Set<org.intermine.model.bio.ProcessedTranscript> processedTranscripts = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.ProcessedTranscript> getProcessedTranscripts() { return processedTranscripts; }
    public void setProcessedTranscripts(final java.util.Set<org.intermine.model.bio.ProcessedTranscript> processedTranscripts) { this.processedTranscripts = processedTranscripts; }
    public void addProcessedTranscripts(final org.intermine.model.bio.ProcessedTranscript arg) { processedTranscripts.add(arg); }

    // Col: org.intermine.model.bio.PrimaryTranscript.spliceSites
    protected java.util.Set<org.intermine.model.bio.SpliceSite> spliceSites = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.SpliceSite> getSpliceSites() { return spliceSites; }
    public void setSpliceSites(final java.util.Set<org.intermine.model.bio.SpliceSite> spliceSites) { this.spliceSites = spliceSites; }
    public void addSpliceSites(final org.intermine.model.bio.SpliceSite arg) { spliceSites.add(arg); }

    // Attr: org.intermine.model.bio.Transcript.typeStatusDefinition
    protected java.lang.String typeStatusDefinition;
    public java.lang.String getTypeStatusDefinition() { return typeStatusDefinition; }
    public void setTypeStatusDefinition(final java.lang.String typeStatusDefinition) { this.typeStatusDefinition = typeStatusDefinition; }

    // Attr: org.intermine.model.bio.Transcript.VegaId
    protected java.lang.String VegaId;
    public java.lang.String getvegaId() { return VegaId; }
    public void setvegaId(final java.lang.String VegaId) { this.VegaId = VegaId; }

    // Attr: org.intermine.model.bio.Transcript.exonCount
    protected java.lang.Integer exonCount;
    public java.lang.Integer getExonCount() { return exonCount; }
    public void setExonCount(final java.lang.Integer exonCount) { this.exonCount = exonCount; }

    // Attr: org.intermine.model.bio.Transcript.status
    protected java.lang.String status;
    public java.lang.String getStatus() { return status; }
    public void setStatus(final java.lang.String status) { this.status = status; }

    // Attr: org.intermine.model.bio.Transcript.typeDefinition
    protected java.lang.String typeDefinition;
    public java.lang.String getTypeDefinition() { return typeDefinition; }
    public void setTypeDefinition(final java.lang.String typeDefinition) { this.typeDefinition = typeDefinition; }

    // Ref: org.intermine.model.bio.Transcript.protein
    protected org.intermine.model.InterMineObject protein;
    public org.intermine.model.bio.Protein getProtein() { if (protein instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Protein) ((org.intermine.objectstore.proxy.ProxyReference) protein).getObject()); }; return (org.intermine.model.bio.Protein) protein; }
    public void setProtein(final org.intermine.model.bio.Protein protein) { this.protein = protein; }
    public void proxyProtein(final org.intermine.objectstore.proxy.ProxyReference protein) { this.protein = protein; }
    public org.intermine.model.InterMineObject proxGetProtein() { return protein; }

    // Ref: org.intermine.model.bio.Transcript.gene
    protected org.intermine.model.InterMineObject gene;
    public org.intermine.model.bio.Gene getGene() { if (gene instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) gene).getObject()); }; return (org.intermine.model.bio.Gene) gene; }
    public void setGene(final org.intermine.model.bio.Gene gene) { this.gene = gene; }
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene) { this.gene = gene; }
    public org.intermine.model.InterMineObject proxGetGene() { return gene; }

    // Col: org.intermine.model.bio.Transcript.clones
    protected java.util.Set<org.intermine.model.bio.Clone> clones = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Clone> getClones() { return clones; }
    public void setClones(final java.util.Set<org.intermine.model.bio.Clone> clones) { this.clones = clones; }
    public void addClones(final org.intermine.model.bio.Clone arg) { clones.add(arg); }

    // Col: org.intermine.model.bio.Transcript.exons
    protected java.util.Set<org.intermine.model.bio.Exon> exons = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Exon> getExons() { return exons; }
    public void setExons(final java.util.Set<org.intermine.model.bio.Exon> exons) { this.exons = exons; }
    public void addExons(final org.intermine.model.bio.Exon arg) { exons.add(arg); }

    // Col: org.intermine.model.bio.Transcript.introns
    protected java.util.Set<org.intermine.model.bio.Intron> introns = new java.util.HashSet();
    public java.util.Set<org.intermine.model.bio.Intron> getIntrons() { return introns; }
    public void setIntrons(final java.util.Set<org.intermine.model.bio.Intron> introns) { this.introns = introns; }
    public void addIntrons(final org.intermine.model.bio.Intron arg) { introns.add(arg); }

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

    public boolean equals(Object o) { return (o instanceof PrimaryTranscript && id != null) ? id.equals(((PrimaryTranscript)o).getId()) : this == o; }
    public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    public String toString() { return "PrimaryTranscript [VegaId=\"" + VegaId + "\", chromosome=" + (chromosome == null ? "null" : (chromosome.getId() == null ? "no id" : chromosome.getId().toString())) + ", chromosomeLocation=" + (chromosomeLocation == null ? "null" : (chromosomeLocation.getId() == null ? "no id" : chromosomeLocation.getId().toString())) + ", comments=\"" + comments + "\", curated=\"" + curated + "\", exonCount=\"" + exonCount + "\", gene=" + (gene == null ? "null" : (gene.getId() == null ? "no id" : gene.getId().toString())) + ", id=\"" + id + "\", length=\"" + length + "\", name=\"" + name + "\", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", primaryIdentifier=\"" + primaryIdentifier + "\", protein=" + (protein == null ? "null" : (protein.getId() == null ? "no id" : protein.getId().toString())) + ", secondaryIdentifier=\"" + secondaryIdentifier + "\", sequence=" + (sequence == null ? "null" : (sequence.getId() == null ? "no id" : sequence.getId().toString())) + ", status=\"" + status + "\", symbol=\"" + symbol + "\", type=\"" + type + "\", typeDefinition=\"" + typeDefinition + "\", typeStatusDefinition=\"" + typeStatusDefinition + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("clips".equals(fieldName)) {
            return clips;
        }
        if ("transcriptionStartSites".equals(fieldName)) {
            return transcriptionStartSites;
        }
        if ("transcriptionEndSites".equals(fieldName)) {
            return transcriptionEndSites;
        }
        if ("processedTranscripts".equals(fieldName)) {
            return processedTranscripts;
        }
        if ("spliceSites".equals(fieldName)) {
            return spliceSites;
        }
        if ("typeStatusDefinition".equals(fieldName)) {
            return typeStatusDefinition;
        }
        if ("VegaId".equals(fieldName)) {
            return VegaId;
        }
        if ("exonCount".equals(fieldName)) {
            return exonCount;
        }
        if ("status".equals(fieldName)) {
            return status;
        }
        if ("typeDefinition".equals(fieldName)) {
            return typeDefinition;
        }
        if ("protein".equals(fieldName)) {
            if (protein instanceof ProxyReference) {
                return ((ProxyReference) protein).getObject();
            } else {
                return protein;
            }
        }
        if ("gene".equals(fieldName)) {
            if (gene instanceof ProxyReference) {
                return ((ProxyReference) gene).getObject();
            } else {
                return gene;
            }
        }
        if ("clones".equals(fieldName)) {
            return clones;
        }
        if ("exons".equals(fieldName)) {
            return exons;
        }
        if ("introns".equals(fieldName)) {
            return introns;
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
        if (!org.intermine.model.bio.PrimaryTranscript.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("clips".equals(fieldName)) {
            return clips;
        }
        if ("transcriptionStartSites".equals(fieldName)) {
            return transcriptionStartSites;
        }
        if ("transcriptionEndSites".equals(fieldName)) {
            return transcriptionEndSites;
        }
        if ("processedTranscripts".equals(fieldName)) {
            return processedTranscripts;
        }
        if ("spliceSites".equals(fieldName)) {
            return spliceSites;
        }
        if ("typeStatusDefinition".equals(fieldName)) {
            return typeStatusDefinition;
        }
        if ("VegaId".equals(fieldName)) {
            return VegaId;
        }
        if ("exonCount".equals(fieldName)) {
            return exonCount;
        }
        if ("status".equals(fieldName)) {
            return status;
        }
        if ("typeDefinition".equals(fieldName)) {
            return typeDefinition;
        }
        if ("protein".equals(fieldName)) {
            return protein;
        }
        if ("gene".equals(fieldName)) {
            return gene;
        }
        if ("clones".equals(fieldName)) {
            return clones;
        }
        if ("exons".equals(fieldName)) {
            return exons;
        }
        if ("introns".equals(fieldName)) {
            return introns;
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
        if (!org.intermine.model.bio.PrimaryTranscript.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("clips".equals(fieldName)) {
            clips = (java.util.Set) value;
        } else if ("transcriptionStartSites".equals(fieldName)) {
            transcriptionStartSites = (java.util.Set) value;
        } else if ("transcriptionEndSites".equals(fieldName)) {
            transcriptionEndSites = (java.util.Set) value;
        } else if ("processedTranscripts".equals(fieldName)) {
            processedTranscripts = (java.util.Set) value;
        } else if ("spliceSites".equals(fieldName)) {
            spliceSites = (java.util.Set) value;
        } else if ("typeStatusDefinition".equals(fieldName)) {
            typeStatusDefinition = (java.lang.String) value;
        } else if ("VegaId".equals(fieldName)) {
            VegaId = (java.lang.String) value;
        } else if ("exonCount".equals(fieldName)) {
            exonCount = (java.lang.Integer) value;
        } else if ("status".equals(fieldName)) {
            status = (java.lang.String) value;
        } else if ("typeDefinition".equals(fieldName)) {
            typeDefinition = (java.lang.String) value;
        } else if ("protein".equals(fieldName)) {
            protein = (org.intermine.model.InterMineObject) value;
        } else if ("gene".equals(fieldName)) {
            gene = (org.intermine.model.InterMineObject) value;
        } else if ("clones".equals(fieldName)) {
            clones = (java.util.Set) value;
        } else if ("exons".equals(fieldName)) {
            exons = (java.util.Set) value;
        } else if ("introns".equals(fieldName)) {
            introns = (java.util.Set) value;
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
        } else if ("length".equals(fieldName)) {
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
        } else {
            if (!org.intermine.model.bio.PrimaryTranscript.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class getFieldType(final String fieldName) {
        if ("clips".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("transcriptionStartSites".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("transcriptionEndSites".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("processedTranscripts".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("spliceSites".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("typeStatusDefinition".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("VegaId".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("exonCount".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("status".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("typeDefinition".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("protein".equals(fieldName)) {
            return org.intermine.model.bio.Protein.class;
        }
        if ("gene".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("clones".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("exons".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("introns".equals(fieldName)) {
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
        if (!org.intermine.model.bio.PrimaryTranscript.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.PrimaryTranscript.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.PrimaryTranscript.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.PrimaryTranscript");
        if (typeStatusDefinition != null) {
            sb.append("$_^atypeStatusDefinition$_^");
            String string = typeStatusDefinition;
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
        if (VegaId != null) {
            sb.append("$_^aVegaId$_^");
            String string = VegaId;
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
        if (exonCount != null) {
            sb.append("$_^aexonCount$_^").append(exonCount);
        }
        if (status != null) {
            sb.append("$_^astatus$_^");
            String string = status;
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
        if (typeDefinition != null) {
            sb.append("$_^atypeDefinition$_^");
            String string = typeDefinition;
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
        if (protein != null) {
            sb.append("$_^rprotein$_^").append(protein.getId());
        }
        if (gene != null) {
            sb.append("$_^rgene$_^").append(gene.getId());
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
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.PrimaryTranscript.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.PrimaryTranscript)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "atypeStatusDefinition".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                typeStatusDefinition = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aVegaId".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                VegaId = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aexonCount".equals(notXml[i])) {
                i++;
                exonCount = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "astatus".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                status = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atypeDefinition".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                typeDefinition = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rprotein".equals(notXml[i])) {
                i++;
                protein = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Protein.class);
                i++;
            };
            if ((i < notXml.length) &&"rgene".equals(notXml[i])) {
                i++;
                gene = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Gene.class);
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
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        clips = new ProxyCollection(os, this, "clips", org.intermine.model.bio.Clip.class);
        transcriptionStartSites = new ProxyCollection(os, this, "transcriptionStartSites", org.intermine.model.bio.TranscriptionStartSite.class);
        transcriptionEndSites = new ProxyCollection(os, this, "transcriptionEndSites", org.intermine.model.bio.TranscriptionEndSite.class);
        processedTranscripts = new ProxyCollection(os, this, "processedTranscripts", org.intermine.model.bio.ProcessedTranscript.class);
        spliceSites = new ProxyCollection(os, this, "spliceSites", org.intermine.model.bio.SpliceSite.class);
        clones = new ProxyCollection(os, this, "clones", org.intermine.model.bio.Clone.class);
        exons = new ProxyCollection(os, this, "exons", org.intermine.model.bio.Exon.class);
        introns = new ProxyCollection(os, this, "introns", org.intermine.model.bio.Intron.class);
        constructs = new ProxyCollection(os, this, "constructs", org.intermine.model.bio.Construct.class);
        externalLinks = new ProxyCollection(os, this, "externalLinks", org.intermine.model.bio.ExternalLink.class);
        overlappingFeatures = new ProxyCollection(os, this, "overlappingFeatures", org.intermine.model.bio.LocatedSequenceFeature.class);
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
        if ("clips".equals(fieldName)) {
            clips.add((org.intermine.model.bio.Clip) element);
        } else if ("transcriptionStartSites".equals(fieldName)) {
            transcriptionStartSites.add((org.intermine.model.bio.TranscriptionStartSite) element);
        } else if ("transcriptionEndSites".equals(fieldName)) {
            transcriptionEndSites.add((org.intermine.model.bio.TranscriptionEndSite) element);
        } else if ("processedTranscripts".equals(fieldName)) {
            processedTranscripts.add((org.intermine.model.bio.ProcessedTranscript) element);
        } else if ("spliceSites".equals(fieldName)) {
            spliceSites.add((org.intermine.model.bio.SpliceSite) element);
        } else if ("clones".equals(fieldName)) {
            clones.add((org.intermine.model.bio.Clone) element);
        } else if ("exons".equals(fieldName)) {
            exons.add((org.intermine.model.bio.Exon) element);
        } else if ("introns".equals(fieldName)) {
            introns.add((org.intermine.model.bio.Intron) element);
        } else if ("constructs".equals(fieldName)) {
            constructs.add((org.intermine.model.bio.Construct) element);
        } else if ("externalLinks".equals(fieldName)) {
            externalLinks.add((org.intermine.model.bio.ExternalLink) element);
        } else if ("overlappingFeatures".equals(fieldName)) {
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
        } else {
            if (!org.intermine.model.bio.PrimaryTranscript.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class getElementType(final String fieldName) {
        if ("clips".equals(fieldName)) {
            return org.intermine.model.bio.Clip.class;
        }
        if ("transcriptionStartSites".equals(fieldName)) {
            return org.intermine.model.bio.TranscriptionStartSite.class;
        }
        if ("transcriptionEndSites".equals(fieldName)) {
            return org.intermine.model.bio.TranscriptionEndSite.class;
        }
        if ("processedTranscripts".equals(fieldName)) {
            return org.intermine.model.bio.ProcessedTranscript.class;
        }
        if ("spliceSites".equals(fieldName)) {
            return org.intermine.model.bio.SpliceSite.class;
        }
        if ("clones".equals(fieldName)) {
            return org.intermine.model.bio.Clone.class;
        }
        if ("exons".equals(fieldName)) {
            return org.intermine.model.bio.Exon.class;
        }
        if ("introns".equals(fieldName)) {
            return org.intermine.model.bio.Intron.class;
        }
        if ("constructs".equals(fieldName)) {
            return org.intermine.model.bio.Construct.class;
        }
        if ("externalLinks".equals(fieldName)) {
            return org.intermine.model.bio.ExternalLink.class;
        }
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
        if (!org.intermine.model.bio.PrimaryTranscript.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.PrimaryTranscript.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
