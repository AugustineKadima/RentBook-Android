package com.moringaschool.rentbook.api;

import com.moringaschool.rentbook.modules.Property;
import com.moringaschool.rentbook.modules.Tenant;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceholderApi {

    @GET("tenants")
    Call<List<Tenant>> getTenants();

    @GET("properties")
    Call<List<Property>> getProperties();
}
