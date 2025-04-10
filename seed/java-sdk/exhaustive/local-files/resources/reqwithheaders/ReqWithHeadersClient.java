/**
 * This file was auto-generated by Fern from our API Definition.
 */

package com.fern.sdk.resources.reqwithheaders;

import com.fern.sdk.core.ClientOptions;
import com.fern.sdk.core.RequestOptions;
import com.fern.sdk.resources.reqwithheaders.requests.ReqWithHeaders;

public class ReqWithHeadersClient {
  protected final ClientOptions clientOptions;

  private final RawReqWithHeadersClient rawClient;

  public ReqWithHeadersClient(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
    this.rawClient = new RawReqWithHeadersClient(clientOptions);
  }

  /**
   * Get responses with HTTP metadata like headers
   */
  public RawReqWithHeadersClient withRawResponse() {
    return this.rawClient;
  }

  public void getWithCustomHeader(ReqWithHeaders request) {
    this.rawClient.getWithCustomHeader(request).body();
  }

  public void getWithCustomHeader(ReqWithHeaders request, RequestOptions requestOptions) {
    this.rawClient.getWithCustomHeader(request, requestOptions).body();
  }
}
