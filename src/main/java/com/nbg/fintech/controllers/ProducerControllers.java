package com.nbg.fintech.controllers;

import org.json.JSONException;
import org.springframework.web.bind.annotation.*;

import com.nbg.fintech.db.dto.ResponseGetChartsData;
import com.nbg.fintech.db.dto.ResponseSignIn;

import java.util.List;

@RestController
@RequestMapping(path = "/producer")
public interface ProducerControllers {

    @RequestMapping(value = "/signUp", method = RequestMethod.GET )
    public @ResponseBody String signUpProducer(@RequestParam("username") String username,@RequestParam("password") String password);

    @RequestMapping(value = "/signIn", method = RequestMethod.GET , produces = "application/json")
    public ResponseSignIn signInProducer(@RequestParam("username") String username);

    @RequestMapping(value = "/getWeatherInfo", method = RequestMethod.GET )
    public @ResponseBody String getWeatherInfo(@RequestParam("cityCode") String cityCode) throws JSONException;

    @RequestMapping(value = "/getChartsData", method = RequestMethod.GET , produces = "application/json")
    public List<ResponseGetChartsData> getChartsData();
}
