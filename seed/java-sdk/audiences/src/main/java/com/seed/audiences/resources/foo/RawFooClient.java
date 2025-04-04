/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.audiences.resources.foo;

import com.seed.audiences.core.ClientOptions;
import com.seed.audiences.core.MediaTypes;
import com.seed.audiences.core.ObjectMappers;
import com.seed.audiences.core.QueryStringMapper;
import com.seed.audiences.core.RequestOptions;
import com.seed.audiences.core.SeedAudiencesApiException;
import com.seed.audiences.core.SeedAudiencesException;
import com.seed.audiences.core.SeedAudiencesHttpResponse;
import com.seed.audiences.resources.foo.requests.FindRequest;
import com.seed.audiences.resources.foo.types.ImportingType;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class RawFooClient {
    protected final ClientOptions clientOptions;

    public RawFooClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public SeedAudiencesHttpResponse<ImportingType> find(FindRequest request) {
        return find(request, null);
    }

    public SeedAudiencesHttpResponse<ImportingType> find(FindRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl =
                HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder();

        if (request.getOptionalString().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "optionalString", request.getOptionalString().get(), false);
        }
        Map<String, Object> properties = new HashMap<>();
        if (request.getPublicProperty().isPresent()) {
            properties.put("publicProperty", request.getPublicProperty());
        }
        if (request.getPrivateProperty().isPresent()) {
            properties.put("privateProperty", request.getPrivateProperty());
        }
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(properties), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return new SeedAudiencesHttpResponse<>(
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), ImportingType.class), response);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new SeedAudiencesApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new SeedAudiencesException("Network error executing HTTP request", e);
        }
    }
}
