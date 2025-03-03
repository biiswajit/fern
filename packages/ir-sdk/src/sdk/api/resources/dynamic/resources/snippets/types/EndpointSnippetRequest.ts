/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as FernIr from "../../../../../index";

/**
 * The user-facing request type used to generate a dynamic snippet.
 */
export interface EndpointSnippetRequest {
    endpoint: FernIr.dynamic.EndpointLocation;
    baseUrl: string | undefined;
    environment: FernIr.dynamic.EnvironmentValues | undefined;
    auth: FernIr.dynamic.AuthValues | undefined;
    pathParameters: FernIr.dynamic.Values | undefined;
    queryParameters: FernIr.dynamic.Values | undefined;
    headers: FernIr.dynamic.Values | undefined;
    requestBody: unknown | undefined;
}
