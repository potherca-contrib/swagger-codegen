package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Client;
import java.util.Date;
import java.math.BigDecimal;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public abstract class FakeApiService {
    public abstract Response testClientModel(Client body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testEndpointParameters(BigDecimal number,Double _double,String string,byte[] _byte,Integer integer,Integer int32,Long int64,Float _float,byte[] binary,Date date,Date dateTime,String password,SecurityContext securityContext) throws NotFoundException;
    public abstract Response testEnumQueryParameters(String enumQueryString,BigDecimal enumQueryInteger,Double enumQueryDouble,SecurityContext securityContext) throws NotFoundException;
}
