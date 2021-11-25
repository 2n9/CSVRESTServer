package com.github.n9.csv.rest.api.server.CSVServer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

public class CSVData {

    @Getter @Setter
    private int id;

    @Getter @Setter
    private Map<String, String> elements;

}
