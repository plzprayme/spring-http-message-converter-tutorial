package com.example.httpmessageconvertertutorial.config.objectmapper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class LocalDateTimeModule extends SimpleModule {
    public LocalDateTimeModule() {
        super();
        addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(doYouKnowKimchiFormat()));

    }

    private DateTimeFormatter doYouKnowKimchiFormat() {
        return new DateTimeFormatterBuilder()
            .appendValue(ChronoField.YEAR, 4).appendLiteral('년')
            .appendValue(ChronoField.MONTH_OF_YEAR, 2).appendLiteral('월')
            .appendValue(ChronoField.DAY_OF_MONTH, 2).appendLiteral('일')
            .appendValue(ChronoField.HOUR_OF_DAY, 2).appendLiteral('시')
            .appendValue(ChronoField.MINUTE_OF_HOUR, 2).appendLiteral('분')
            .toFormatter();
    }
}
