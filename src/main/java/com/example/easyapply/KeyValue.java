package com.example.easyapply;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class KeyValue {
    private String key;
    private Integer value;

public KeyValue(String key, Integer value){
    this.key = key;
    this.value = value;
}
}
