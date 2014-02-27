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
package eu.fistar.api.model;

/**
 *
 * @author Panagiotis Gouvas - www.ubitech.eu
 */
public enum CertificateStatus {    
    VALID,
    INVALID,
    REVOKED_CERTIFICATE_HOLD,
    REVOKED_KEY_COMPROMISE,
    REVOKED_OTHER,
    EXPIRED,
    ERROR;
    
    /*
     * CERT_STATUS_REVOKED_CERT_HOLD=2;
     * CERT_STATUS_REVOKED_KEY_COMPROMISE=3;
     * CERT_STATUS_REVOKED_OTHER=20;
     * INTERNAL_ERROR=100;
     */        
    public static CertificateStatus getCertificateStatus(int code) {
        switch (code){
            case 0:
                return VALID;
            case 1:
                return INVALID;
            case 2:
                return REVOKED_CERTIFICATE_HOLD;
            case 3:
                return REVOKED_KEY_COMPROMISE;
            case 20:
                return REVOKED_OTHER;
            default:
                return ERROR;
        }
    }//EoM
    
}//EoC
