package com.example.easyapply;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class EasyApplyRequestDto {

    private Applicant applicant;

    @JsonProperty("get_person_token")
    private String getPersonToken;
    private Boolean enqueue;
    private Map job;

    @JsonProperty("partner_attributes")
    private PartnerAttributes partnerAttributes;


    @Data
    @Builder
    public static class Applicant {

        private String email;
        private String fullName;
        private String phoneNumber;
        private String[] resume;

    }

    @Data
    @Builder
    public static class PartnerAttributes {

        private Boolean sponsored;

        @JsonProperty("redirect_apply")
        private String redirectApply;

    }
}

