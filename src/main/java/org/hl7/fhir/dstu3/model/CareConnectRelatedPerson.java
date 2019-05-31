package org.hl7.fhir.dstu3.model;

import java.util.List;

import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.RelatedPerson;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.ResourceDef;

@ResourceDef(name="RelatedPerson", profile="https://fhir.hl7.org.uk/STU3/StructureDefinition/CareConnect-RelatedPerson-1")
public class CareConnectRelatedPerson extends RelatedPerson {

	private static final long serialVersionUID = 1L;

	/**
     * Identifier for a person within a particular scope.
     */
    @Child(name="identifier", type={CareConnectIdentifier.class}, order=Child.REPLACE_PARENT, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(
    	shortDefinition="A human identifier for this person", 
    	formalDefinition="Identifier for a person within a particular scope." 
    )
    protected List<CareConnectIdentifier> identifier;
    
    /**
     * The patient this person is related to.
     */
    @Child(name="patient", type={CareConnectPatient.class}, order=Child.REPLACE_PARENT, min=0, max=1, modifier=false, summary=true)
    @Description(
    	shortDefinition="The patient this person is related to", 
    	formalDefinition="The patient this person is related to." 
    )
    protected Reference patient;
}