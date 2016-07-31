/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.statistics_api;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wind_now.statistics_api.beans.LatestResponse;
import com.wind_now.statistics_api.latest.Builder;
import com.wind_now.statistics_api.latest.Director;
import com.wind_now.statistics_api.latest.LatestBuilder;

/**
 *
 * @author ono
 */
public class Latest implements Serializable{

	private static final long serialVersionUID = 1L;
	static final Logger logger = LoggerFactory.getLogger(Latest.class);

	public LatestResponse latest(String title) {
		LatestResponse response = this.invoke(title, new LatestBuilder(), LatestResponse.class);
		logger.info("[{}] latest() - result {} daily views. Completed.",
			title,
			String.valueOf(response.getDailyViews().size()));
        return(response);
    }

	@SuppressWarnings("unchecked")
	private <T, S> T invoke(S arg, Builder builder, Class<T> clazz){
        T result;
        Director director = new Director(builder);
        result = (T)director.construct(arg, clazz);
        return result;
    }
}
