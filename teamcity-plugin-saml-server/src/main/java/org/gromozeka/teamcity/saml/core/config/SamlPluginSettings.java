package org.gromozeka.teamcity.saml.core.config;

import lombok.Data;

@Data
public class SamlPluginSettings {
    private String issuerUrl;
    private String entityId;
    private String ssoEndpoint;
    private String publicCertificate;
}