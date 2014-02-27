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

package eu.fistar.cagovernance;

import eu.fistar.api.exception.CAManagementException;
import eu.fistar.api.model.CertificateStatus;
import eu.fistar.api.model.Individual;
import eu.fistar.api.model.Organization;
import eu.fistar.api.model.Pseudonym;
import eu.fistar.api.model.RevocationReason;
import eu.fistar.api.model.X509Certificate;
import eu.fistar.api.services.cagovernance.CAManagementService;

/**
 *
 * @author Panagiotis Gouvas - www.ubitech.eu
 */
public class OpenSSLManagementService implements CAManagementService {

    @Override
    public boolean addOrganization(Organization organization) throws CAManagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addIndividual(Individual individual) throws CAManagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addPseudonym(Pseudonym pseudonum) throws CAManagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public X509Certificate getOrganizationCertificate(String OrganizationDescriptor) throws CAManagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public X509Certificate getIndividualCertificate(String IndividualDescriptor) throws CAManagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public X509Certificate getPseudonymCertificate(String PseudonymDescriptor) throws CAManagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CertificateStatus getOrganizationCertificateStatus(String OrganizationDescriptor) throws CAManagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CertificateStatus getIndividualCertificateStatus(String IndividualDescriptor) throws CAManagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CertificateStatus getPseudonymCertificateStatus(String PseudonymDescriptor) throws CAManagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean revokeCertificate(X509Certificate cert, RevocationReason reason) throws CAManagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean unrevokeCertificate(X509Certificate cert) throws CAManagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteOrganization(String OrganizationDescriptor) throws CAManagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteIndividual(String IndividualDescriptor) throws CAManagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletePseudonym(String PseudonymDescriptor) throws CAManagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
