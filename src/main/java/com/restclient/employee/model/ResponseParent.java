package com.restclient.employee.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseParent {

    @JsonProperty("status_code")
    private Integer statusCode;
    @JsonProperty("description")
    private String description;

    public ResponseParent() {
    }

    public ResponseParent(Integer statusCode, String description) {
        this.statusCode = statusCode;
        this.description = description;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
