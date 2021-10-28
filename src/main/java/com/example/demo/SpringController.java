package com.example.demo;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class SpringController {

    @RequestMapping(value = "/checkString", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, Object> checkString(@RequestParam("stringToCheck") String stringToCheck) {
        Analysis analysis =  new Analysis(stringToCheck);
        HashMap<String, Object> map = new HashMap<>();
        map.put("data",analysis.toString());
        return map;
    }
}