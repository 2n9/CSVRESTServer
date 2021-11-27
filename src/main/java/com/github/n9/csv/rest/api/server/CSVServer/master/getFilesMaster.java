package com.github.n9.csv.rest.api.server.CSVServer.master;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.Path;

public class getFilesMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter @Setter
    private int fileCount;

    @Getter @Setter
    private File[] files;

    @Getter @Setter
    private Path path;
}
