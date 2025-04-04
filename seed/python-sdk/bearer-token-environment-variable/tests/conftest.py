# This file was auto-generated by Fern from our API Definition.

from seed import SeedBearerTokenEnvironmentVariable
import os
import pytest
from seed import AsyncSeedBearerTokenEnvironmentVariable


@pytest.fixture
def client() -> SeedBearerTokenEnvironmentVariable:
    return SeedBearerTokenEnvironmentVariable(
        api_key=os.getenv("ENV_API_KEY", "api_key"),
        base_url=os.getenv("TESTS_BASE_URL", "base_url"),
    )


@pytest.fixture
def async_client() -> AsyncSeedBearerTokenEnvironmentVariable:
    return AsyncSeedBearerTokenEnvironmentVariable(
        api_key=os.getenv("ENV_API_KEY", "api_key"),
        base_url=os.getenv("TESTS_BASE_URL", "base_url"),
    )
