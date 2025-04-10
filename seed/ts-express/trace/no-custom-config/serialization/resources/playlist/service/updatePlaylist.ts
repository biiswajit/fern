/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as SeedTrace from "../../../../api/index";
import * as core from "../../../../core";

export const Request: core.serialization.Schema<
    serializers.playlist.updatePlaylist.Request.Raw,
    SeedTrace.UpdatePlaylistRequest | undefined
> = core.serialization.lazyObject(() => serializers.UpdatePlaylistRequest).optional();

export declare namespace Request {
    export type Raw = serializers.UpdatePlaylistRequest.Raw | null | undefined;
}

export const Response: core.serialization.Schema<
    serializers.playlist.updatePlaylist.Response.Raw,
    SeedTrace.Playlist | undefined
> = core.serialization.lazyObject(() => serializers.Playlist).optional();

export declare namespace Response {
    export type Raw = serializers.Playlist.Raw | null | undefined;
}
