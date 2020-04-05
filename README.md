# FHIR CareConnect Profiles

## Overview
The FHIR Extensions library provides additional types/resources defined by the CDS Implementation Guidance.

FHIR Extensions currently only include a definition for CoordinateResource, the resource used by the [EMS](https://kepler.bjss.com/display/NCTH/EMS+Test+Harness) to represent the answer to questions of type `imagemap`.

## Source Code Location
The repository for this library is located in a public GitLab space here:
https://gitlab.com/ems-test-harness/ems-poc-fhir-extensions

## Project Structure
### Implementation
FHIR Extensions is a Java library that includes a class defining the CoordinateResource type.

### Tests
No tests are provided for this library.

## Deployment
The library is deployed as a package within [a publicly accessible bintray repository](https://bintray.com/beta/#/ems-test-harness/EMS-Test-Harness). For deployment one must clone/pull the repository onto their local machine, setup their maven deployment settings (`%UserProfile%\.m2\settings.xml` on Windows) with their manager bintray credentials (can be obtained from the bintray repository setup guide) and run the following maven task:

```bash
mvn deploy
```