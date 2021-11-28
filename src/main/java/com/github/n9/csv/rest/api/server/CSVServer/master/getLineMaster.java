package com.github.n9.csv.rest.api.server.CSVServer.master;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.Serializable;
import java.util.Map;

public class getLineMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter @Setter
    private int line;

    @Getter @Setter
    private File file;

    @Getter @Setter
    private boolean byParts;

    @Getter @Setter
    private Map<String, String> elements;

}
