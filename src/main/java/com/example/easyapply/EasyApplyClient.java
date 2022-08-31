package com.example.easyapply;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "easyApply", url = "${easyApply.url}", configuration = {FeignConfig.class})
public interface EasyApplyClient {

    @PostMapping
    EasyApplyResponseDto create(EasyApplyRequestDto requestDto);
}