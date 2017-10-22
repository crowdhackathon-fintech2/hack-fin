package com.nbg.fintech.controllers;

import com.nbg.fintech.db.dao.ProducerRepository;
import com.nbg.fintech.db.dto.*;
import com.nbg.fintech.db.entities.Producer;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.view.RedirectView;

import javax.xml.ws.Response;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Component
public class AdminControllersImpl implements AdminControllers {

    @Autowired
    ProducerRepository producerRepository;

    private static final Logger logger = LoggerFactory.getLogger(AdminControllersImpl.class);

    @Override
    public @ResponseBody RedirectView addRule(){
    	  return new RedirectView("/admin/AddRules.html");
    }

    @Override
    public ResponseSignIn signInProducer(@RequestParam("username") String username){
        //Producer producer = producerRepository.findProducerByUsername(username);
        ResponseSignIn responseSignIn = new ResponseSignIn("testUserName","testName","testSurname","test@gmail.com",25L,"testVariety","https://en.wikipedia.org/wiki/Main_Page");
        return responseSignIn;
    }
 

    @Override
    public List<ResponseGetChartsData> getChartsData(){

        List<ResponseGetChartsData> responseGetChartsData = new ArrayList<ResponseGetChartsData>();

        for(int i = 0;i < 10;i++) {
            responseGetChartsData.add(new ResponseGetChartsData(15L, 16L, 70L, 10L));
        }
        return  responseGetChartsData;
    }
 
}
