/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.statistics_api.latest;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/**
 *
 * @author ono
 */
public class LatestBuilder extends Builder{

    @Override
    public URI getUri(String title) {
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("day", "30"));
        params.add(new BasicNameValuePair("title", title));
        return(getUri(params));
    }

}
