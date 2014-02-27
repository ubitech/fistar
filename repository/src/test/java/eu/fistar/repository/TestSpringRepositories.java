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

package eu.fistar.repository;

import eu.fistar.repository.dao.IndividualRepository;
import eu.fistar.repository.dao.OrganizationRepository;
import eu.fistar.repository.dao.PseudonymRepository;
import eu.fistar.repository.dao.X509CertificateRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 *
 * @author Panagiotis Gouvas - www.ubitech.eu
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:repository-context.xml"})
public class TestSpringRepositories  {
    
    @Autowired
    IndividualRepository individualrepository;
    @Autowired
    OrganizationRepository organizationrepository;
    @Autowired
    PseudonymRepository pseudonymrepository;
    @Autowired
    X509CertificateRepository x509certificaterepository;
    
    //@Ignore
    @Test
    public void TestAutowiring(){
        Assert.notNull(individualrepository, "Repository not Null");
        Assert.notNull(organizationrepository, "Repository not Null");
        Assert.notNull(pseudonymrepository, "Repository not Null");
        Assert.notNull(x509certificaterepository, "Repository not Null");        
    }//EoM
        
} //End Of Test