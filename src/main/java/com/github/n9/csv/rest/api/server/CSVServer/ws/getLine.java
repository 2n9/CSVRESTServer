package com.github.n9.csv.rest.api.server.CSVServer.ws;

import com.github.n9.csv.rest.api.server.CSVServer.master.getLineMaster;
import com.github.n9.csv.rest.api.server.CSVServer.master.getLineParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/getline")
public class getLine {

    @ResponseBody
    @RequestMapping(value = "", produces = "application/json")
    public getLineMaster get(@RequestBody getLineParam param){
        getLineMaster glm = new getLineMaster();
        glm.setLine("");
        return glm;
    }
}
