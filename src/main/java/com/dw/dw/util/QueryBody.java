package com.dw.dw.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QueryBody {

    @JsonProperty("dateRanges")
    public DateRange[] dateRanges;

    @JsonProperty("titles")
    public String[] titles;

    @JsonProperty("actors")
    public String[] actors;

    @JsonProperty("directors")
    public String[] directors;

    @JsonProperty("genres")
    public String[] genres;
}
