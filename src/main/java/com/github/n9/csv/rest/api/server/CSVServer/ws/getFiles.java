package com.github.n9.csv.rest.api.server.CSVServer.ws;

import com.github.n9.csv.rest.api.server.CSVServer.master.getFilesMaster;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping(value = "/api/v1/getfiles")
public class getFiles {

    @ResponseBody
    @RequestMapping(value = "", produces = "application/json")
    public getFilesMaster get() {
        getFilesMaster gfm = new getFilesMaster();
        gfm.setPath(new File(System.getProperty("user.dir"), "data").toPath());
        gfm.setFileCount(new File(System.getProperty("user.dir"), "data").listFiles().length);
        gfm.setFiles(new File(System.getProperty("user.dir"), "data").listFiles());
        return gfm;
    }

}
