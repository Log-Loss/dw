package com.dw.dw.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DateRange {

    @JsonProperty("startDate")
    public String startDate;

    @JsonProperty("endDate")
    public String endDate;
}
