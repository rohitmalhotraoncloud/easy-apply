package com.example.easyapply;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class EasyApplyResponseDto {

    @JsonProperty("developer_message")
    private String developerMessage;

    private String[] errors;
    private Info info;

    @Data
    public static class Info {

        @JsonProperty("person_id")
        private String personId;

        @JsonProperty("bearer_token")
        private String bearerToken;

        @JsonProperty("job_id")
        private String jobId;
    }
}