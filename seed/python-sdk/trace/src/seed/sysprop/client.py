# This file was auto-generated by Fern from our API Definition.

from ..core.client_wrapper import SyncClientWrapper
from ..commons.types.language import Language
import typing
from ..core.request_options import RequestOptions
from ..core.jsonable_encoder import jsonable_encoder
from json.decoder import JSONDecodeError
from ..core.api_error import ApiError
from ..core.pydantic_utilities import parse_obj_as
from ..core.client_wrapper import AsyncClientWrapper


class SyspropClient:
    def __init__(self, *, client_wrapper: SyncClientWrapper):
        self._client_wrapper = client_wrapper

    def set_num_warm_instances(
        self,
        language: Language,
        num_warm_instances: int,
        *,
        request_options: typing.Optional[RequestOptions] = None,
    ) -> None:
        """
        Parameters
        ----------
        language : Language

        num_warm_instances : int

        request_options : typing.Optional[RequestOptions]
            Request-specific configuration.

        Returns
        -------
        None

        Examples
        --------
        from seed import SeedTrace

        client = SeedTrace(
            x_random_header="YOUR_X_RANDOM_HEADER",
            token="YOUR_TOKEN",
        )
        client.sysprop.set_num_warm_instances(
            language="JAVA",
            num_warm_instances=1,
        )
        """
        _response = self._client_wrapper.httpx_client.request(
            f"sysprop/num-warm-instances/{jsonable_encoder(language)}/{jsonable_encoder(num_warm_instances)}",
            method="PUT",
            request_options=request_options,
        )
        if 200 <= _response.status_code < 300:
            return
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)

    def get_num_warm_instances(
        self, *, request_options: typing.Optional[RequestOptions] = None
    ) -> typing.Dict[Language, int]:
        """
        Parameters
        ----------
        request_options : typing.Optional[RequestOptions]
            Request-specific configuration.

        Returns
        -------
        typing.Dict[Language, int]

        Examples
        --------
        from seed import SeedTrace

        client = SeedTrace(
            x_random_header="YOUR_X_RANDOM_HEADER",
            token="YOUR_TOKEN",
        )
        client.sysprop.get_num_warm_instances()
        """
        _response = self._client_wrapper.httpx_client.request(
            "sysprop/num-warm-instances",
            method="GET",
            request_options=request_options,
        )
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        if 200 <= _response.status_code < 300:
            return typing.cast(
                typing.Dict[Language, int],
                parse_obj_as(
                    type_=typing.Dict[Language, int],  # type: ignore
                    object_=_response_json,
                ),
            )
        raise ApiError(status_code=_response.status_code, body=_response_json)


class AsyncSyspropClient:
    def __init__(self, *, client_wrapper: AsyncClientWrapper):
        self._client_wrapper = client_wrapper

    async def set_num_warm_instances(
        self,
        language: Language,
        num_warm_instances: int,
        *,
        request_options: typing.Optional[RequestOptions] = None,
    ) -> None:
        """
        Parameters
        ----------
        language : Language

        num_warm_instances : int

        request_options : typing.Optional[RequestOptions]
            Request-specific configuration.

        Returns
        -------
        None

        Examples
        --------
        import asyncio

        from seed import AsyncSeedTrace

        client = AsyncSeedTrace(
            x_random_header="YOUR_X_RANDOM_HEADER",
            token="YOUR_TOKEN",
        )


        async def main() -> None:
            await client.sysprop.set_num_warm_instances(
                language="JAVA",
                num_warm_instances=1,
            )


        asyncio.run(main())
        """
        _response = await self._client_wrapper.httpx_client.request(
            f"sysprop/num-warm-instances/{jsonable_encoder(language)}/{jsonable_encoder(num_warm_instances)}",
            method="PUT",
            request_options=request_options,
        )
        if 200 <= _response.status_code < 300:
            return
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)

    async def get_num_warm_instances(
        self, *, request_options: typing.Optional[RequestOptions] = None
    ) -> typing.Dict[Language, int]:
        """
        Parameters
        ----------
        request_options : typing.Optional[RequestOptions]
            Request-specific configuration.

        Returns
        -------
        typing.Dict[Language, int]

        Examples
        --------
        import asyncio

        from seed import AsyncSeedTrace

        client = AsyncSeedTrace(
            x_random_header="YOUR_X_RANDOM_HEADER",
            token="YOUR_TOKEN",
        )


        async def main() -> None:
            await client.sysprop.get_num_warm_instances()


        asyncio.run(main())
        """
        _response = await self._client_wrapper.httpx_client.request(
            "sysprop/num-warm-instances",
            method="GET",
            request_options=request_options,
        )
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        if 200 <= _response.status_code < 300:
            return typing.cast(
                typing.Dict[Language, int],
                parse_obj_as(
                    type_=typing.Dict[Language, int],  # type: ignore
                    object_=_response_json,
                ),
            )
        raise ApiError(status_code=_response.status_code, body=_response_json)
