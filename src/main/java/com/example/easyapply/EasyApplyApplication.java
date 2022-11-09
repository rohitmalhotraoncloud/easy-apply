package com.example.easyapply;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@SpringBootApplication
@EnableFeignClients
public class EasyApplyApplication {

    public static void main(String[] args) {

        System.err.println(isDateEqual(null, LocalDate.now()));
        System.err.println(isDateEqual(LocalDate.now(), null));
        System.err.println(isDateEqual(null, null));
        System.err.println(isDateEqual(LocalDate.now(), LocalDate.now()));
        System.err.println(isDateEqual(LocalDate.now(), LocalDate.now().minusDays(1)));
    }

    private static boolean isDateEqual(LocalDate date1, LocalDate date2) {
        return Objects.isNull(date1) ? Objects.isNull(date2) : date1.equals(date2);
    }
    //First Commit Again
}
//Editing Main File
