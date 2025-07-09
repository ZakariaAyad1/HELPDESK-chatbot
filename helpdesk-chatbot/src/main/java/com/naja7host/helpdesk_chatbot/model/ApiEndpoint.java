package com.naja7host.helpdesk_chatbot.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ApiEndpoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "request_key", unique = true, nullable = false)
    private String requestKey;

    @Column(name = "endpoint_url", nullable = false)
    private String endpointUrl;

    @Column(name = "http_method", nullable = false)
    private String httpMethod; // e.g., "GET", "POST"

}
