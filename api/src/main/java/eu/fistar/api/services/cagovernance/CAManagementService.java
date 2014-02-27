/*
 -  Copyright 2014 FI-STAR Project, https://www.fi-star.eu
 -
 -  Licensed under the Apache License, Version 2.0 (the "License");
 -  you may not use this file except in compliance with the License.
 -  You may obtain a copy of the License at
 -
 -     http://www.apache.org/licenses/LICENSE-2.0
 -
 -  Unless required by applicable law or agreed to in writing, software
 -  distributed under the License is distributed on an "AS IS" BASIS,
 -  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 -  See the License for the specific language governing permissions and
 -  limitations under the License.
 */
 
 package eu.fistar.api.services.cagovernance;

import eu.fistar.api.exception.CAManagementException;
import eu.fistar.api.model.CertificateStatus;
import eu.fistar.api.model.Individual;
import eu.fistar.api.model.Organization;
import eu.fistar.api.model.Pseudonym;
import eu.fistar.api.model.RevocationReason;
import eu.fistar.api.model.X509Certificate;


 /**
 *
 * @author Panagiotis Gouvas - www.ubitech.eu
 */ 
 public interface CAManagementService {
    /*     
     * An organization can obtain a PKCS#12 (soft certificate)
     */ 
    boolean addOrganization(Organization organization) throws CAManagementException;
    /*     
     * An Individual can obtain a PKCS#12 (soft) or PKCS#11 (Hardware Security Module)
     */     
    boolean addIndividual(Individual individual) throws CAManagementException;
    /*     
     * A pseudonym can obtain only a PKCS#12 (soft) certificate
     */     
    boolean addPseudonym(Pseudonym pseudonum) throws CAManagementException;    
    /*     
     * Query Certificate
     */    
    X509Certificate getOrganizationCertificate(String OrganizationDescriptor) throws CAManagementException;
    X509Certificate getIndividualCertificate(String IndividualDescriptor) throws CAManagementException;
    X509Certificate getPseudonymCertificate(String PseudonymDescriptor) throws CAManagementException;
    /*     
     * Query Certificate Status
     */     
    CertificateStatus getOrganizationCertificateStatus(String OrganizationDescriptor) throws CAManagementException;
    CertificateStatus getIndividualCertificateStatus(String IndividualDescriptor) throws CAManagementException;
    CertificateStatus getPseudonymCertificateStatus(String PseudonymDescriptor) throws CAManagementException;
    /*     
     * revoke Certificate
     */ 
    boolean revokeCertificate(X509Certificate cert, RevocationReason reason) throws CAManagementException;
    /*     
     * Query Certificate Status
     */         
    boolean unrevokeCertificate(X509Certificate cert) throws CAManagementException;
    /*     
     * Delete Entities (Automatic revocation)
     */         
    boolean deleteOrganization(String OrganizationDescriptor) throws CAManagementException;
    boolean deleteIndividual(String IndividualDescriptor) throws CAManagementException;
    boolean deletePseudonym(String PseudonymDescriptor) throws CAManagementException;
    	 
 }//EoC