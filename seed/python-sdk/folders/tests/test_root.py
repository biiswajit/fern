# This file was auto-generated by Fern from our API Definition.

from seed import SeedApi
from seed import AsyncSeedApi


async def test_foo(client: SeedApi, async_client: AsyncSeedApi) -> None:
    # Type ignore to avoid mypy complaining about the function not being meant to return a value
    assert (
        client.foo()  # type: ignore[func-returns-value]
        is None
    )

    assert (
        await async_client.foo()  # type: ignore[func-returns-value]
        is None
    )
