package org.hl7.fhir.dstu3.model;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.util.ElementUtil;
import lombok.Getter;
import lombok.Setter;

@ResourceDef(name = "CoordinateResource")
@Getter
@Setter
public class CoordinateResource extends DomainResource {

  @Child(name = "xCoordinate", min = 1, order = 0)
  private IntegerType xCoordinate;

  @Child(name = "yCoordinate", min = 1, order = 1)
  private IntegerType yCoordinate;

  @Child(name = "zCoordinate", order = 2)
  private IntegerType zCoordinate;

  @Override
  public DomainResource copy() {
    CoordinateResource copy = new CoordinateResource();
    super.copyValues(copy);
    copy.xCoordinate = xCoordinate;
    copy.yCoordinate = yCoordinate;
    copy.zCoordinate = zCoordinate;
    return copy;
  }

  @Override
  public ResourceType getResourceType() {
    return null;
  }

  @Override
  public FhirVersionEnum getStructureFhirVersionEnum() {
    return FhirVersionEnum.DSTU3;
  }

  @Override
  public boolean isEmpty() {
    return ElementUtil.isEmpty(xCoordinate, yCoordinate, zCoordinate);
  }

}
