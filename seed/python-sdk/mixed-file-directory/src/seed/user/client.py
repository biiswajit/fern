# This file was auto-generated by Fern from our API Definition.

from ..core.client_wrapper import SyncClientWrapper
from .events.client import EventsClient
import typing
from ..core.request_options import RequestOptions
from .types.user import User
from ..core.pydantic_utilities import parse_obj_as
from json.decoder import JSONDecodeError
from ..core.api_error import ApiError
from ..core.client_wrapper import AsyncClientWrapper
from .events.client import AsyncEventsClient


class UserClient:
    def __init__(self, *, client_wrapper: SyncClientWrapper):
        self._client_wrapper = client_wrapper
        self.events = EventsClient(client_wrapper=self._client_wrapper)

    def list(
        self,
        *,
        limit: typing.Optional[int] = None,
        request_options: typing.Optional[RequestOptions] = None,
    ) -> typing.List[User]:
        """
        List all users.

        Parameters
        ----------
        limit : typing.Optional[int]
            The maximum number of results to return.

        request_options : typing.Optional[RequestOptions]
            Request-specific configuration.

        Returns
        -------
        typing.List[User]

        Examples
        --------
        from seed import SeedMixedFileDirectory

        client = SeedMixedFileDirectory(
            base_url="https://yourhost.com/path/to/api",
        )
        client.user.list(
            limit=1,
        )
        """
        _response = self._client_wrapper.httpx_client.request(
            "users/",
            method="GET",
            params={
                "limit": limit,
            },
            request_options=request_options,
        )
        try:
            if 200 <= _response.status_code < 300:
                return typing.cast(
                    typing.List[User],
                    parse_obj_as(
                        type_=typing.List[User],  # type: ignore
                        object_=_response.json(),
                    ),
                )
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)


class AsyncUserClient:
    def __init__(self, *, client_wrapper: AsyncClientWrapper):
        self._client_wrapper = client_wrapper
        self.events = AsyncEventsClient(client_wrapper=self._client_wrapper)

    async def list(
        self,
        *,
        limit: typing.Optional[int] = None,
        request_options: typing.Optional[RequestOptions] = None,
    ) -> typing.List[User]:
        """
        List all users.

        Parameters
        ----------
        limit : typing.Optional[int]
            The maximum number of results to return.

        request_options : typing.Optional[RequestOptions]
            Request-specific configuration.

        Returns
        -------
        typing.List[User]

        Examples
        --------
        import asyncio

        from seed import AsyncSeedMixedFileDirectory

        client = AsyncSeedMixedFileDirectory(
            base_url="https://yourhost.com/path/to/api",
        )


        async def main() -> None:
            await client.user.list(
                limit=1,
            )


        asyncio.run(main())
        """
        _response = await self._client_wrapper.httpx_client.request(
            "users/",
            method="GET",
            params={
                "limit": limit,
            },
            request_options=request_options,
        )
        try:
            if 200 <= _response.status_code < 300:
                return typing.cast(
                    typing.List[User],
                    parse_obj_as(
                        type_=typing.List[User],  # type: ignore
                        object_=_response.json(),
                    ),
                )
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)
