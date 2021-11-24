package com.github.n9.csv.rest.api.server.CSVServer.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/getfiles")
public class getFiles {

    @ResponseBody
    @RequestMapping(value = "/", produces = "application/json")
    public String get() {
        String str = hoge;
        // todo: add get all file
    }

}
