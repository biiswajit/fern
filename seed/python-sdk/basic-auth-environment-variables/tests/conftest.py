# This file was auto-generated by Fern from our API Definition.

from seed import SeedBasicAuthEnvironmentVariables
import os
import pytest
from seed import AsyncSeedBasicAuthEnvironmentVariables


@pytest.fixture
def client() -> SeedBasicAuthEnvironmentVariables:
    return SeedBasicAuthEnvironmentVariables(
        username=os.getenv("ENV_USERNAME", "username"),
        access_token=os.getenv("ENV_ACCESS_TOKEN", "access_token"),
        base_url=os.getenv("TESTS_BASE_URL", "base_url"),
    )


@pytest.fixture
def async_client() -> AsyncSeedBasicAuthEnvironmentVariables:
    return AsyncSeedBasicAuthEnvironmentVariables(
        username=os.getenv("ENV_USERNAME", "username"),
        access_token=os.getenv("ENV_ACCESS_TOKEN", "access_token"),
        base_url=os.getenv("TESTS_BASE_URL", "base_url"),
    )
