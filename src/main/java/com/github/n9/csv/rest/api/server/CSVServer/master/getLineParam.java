package com.github.n9.csv.rest.api.server.CSVServer.master;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class getLineParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter @Setter
    public String path;

}
