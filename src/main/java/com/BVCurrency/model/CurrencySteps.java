package com.BVCurrency.model;

import com.BVCurrency.constants.EndPoints;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CurrencySteps {

    @Step("Get all currency list")
    public Response getAllCurrency() {
        return SerenityRest.given().log().all().urlEncodingEnabled(false)
                .when()
                .get(EndPoints.CURRENCY_LIST);

    }

    @Step("Get single currency")
    public Response getSingleCurrency(String currency) {
        return SerenityRest.given().log().all().urlEncodingEnabled(false)
                .pathParam("variableFromArray", currency)
                .when()
                .get(EndPoints.CURRENCY);
    }
}
