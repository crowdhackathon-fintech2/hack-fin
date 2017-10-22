package com.nbg.fintech.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.nbg.fintech.db.dto.ResponseGetChartsData;
import com.nbg.fintech.db.dto.ResponseSignIn;

@RestController
@RequestMapping(path = "/admin")
public interface AdminControllers {

    @RequestMapping(value = "/addRule", method = RequestMethod.GET )
    public @ResponseBody RedirectView addRule();

    @RequestMapping(value = "/signIn", method = RequestMethod.GET , produces = "application/json")
    public ResponseSignIn signInProducer(@RequestParam("username") String username);

//    @RequestMapping(value = "/getWeatherInfo", method = RequestMethod.GET )
//    public @ResponseBody String getWeatherInfo(@RequestParam("cityCode") String cityCode) throws JSONException;

    @RequestMapping(value = "/getChartsData", method = RequestMethod.GET , produces = "application/json")
    public List<ResponseGetChartsData> getChartsData();
}
