package com.example.easyapply;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class EasyApplyController {

    EasyApplyClient easyApplyClient;

    public EasyApplyController(EasyApplyClient easyApplyClient) {
        this.easyApplyClient = easyApplyClient;
    }

    @GetMapping
    public ResponseEntity<String> test() {
        EasyApplyResponseDto response = easyApplyClient.create(getRequestBody());
        String token = response.getInfo().getBearerToken();
        return ResponseEntity.ok(token);
    }

    private EasyApplyRequestDto getRequestBody() {
        return EasyApplyRequestDto.builder()
            .applicant(EasyApplyRequestDto.Applicant.builder()
                .email("someemail@gmail.com")
                .fullName("Some full name")
                .phoneNumber("+1738748374")
                .resume(new String[]{"Abc", "Def"})
                .build())
            .enqueue(true)
            .getPersonToken(String.valueOf(1))
            .job(Collections.singletonMap("jobId", "42"))
            .partnerAttributes(EasyApplyRequestDto.PartnerAttributes.builder()
                .redirectApply("http://someurl.com")
                .build())
            .build();
    }
}
