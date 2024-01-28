# This file was auto-generated by Fern from our API Definition.

import abc
import functools
import inspect
import logging
import typing
import uuid

import fastapi
import starlette

from ....core.abstract_fern_service import AbstractFernService
from ....core.exceptions.fern_http_exception import FernHTTPException
from ....core.route_args import get_route_args
from ....security import ApiAuth, FernAuth
from .create_payment_request import CreatePaymentRequest


class AbstractPaymentService(AbstractFernService):
    """
    AbstractPaymentService is an abstract class containing the methods that you should implement.

    Each method is associated with an API route, which will be registered
    with FastAPI when you register your implementation using Fern's register()
    function.
    """

    @abc.abstractmethod
    def create(self, *, body: CreatePaymentRequest, auth: ApiAuth) -> uuid.UUID:
        ...

    @abc.abstractmethod
    def delete(self, *, payment_id: str, auth: ApiAuth) -> None:
        ...

    """
    Below are internal methods used by Fern to register your implementation.
    You can ignore them.
    """

    @classmethod
    def _init_fern(cls, router: fastapi.APIRouter) -> None:
        cls.__init_create(router=router)
        cls.__init_delete(router=router)

    @classmethod
    def __init_create(cls, router: fastapi.APIRouter) -> None:
        endpoint_function = inspect.signature(cls.create)
        new_parameters: typing.List[inspect.Parameter] = []
        for index, (parameter_name, parameter) in enumerate(endpoint_function.parameters.items()):
            if index == 0:
                new_parameters.append(parameter.replace(default=fastapi.Depends(cls)))
            elif parameter_name == "body":
                new_parameters.append(parameter.replace(default=fastapi.Body(...)))
            elif parameter_name == "auth":
                new_parameters.append(parameter.replace(default=fastapi.Depends(FernAuth)))
            else:
                new_parameters.append(parameter)
        setattr(cls.create, "__signature__", endpoint_function.replace(parameters=new_parameters))

        @functools.wraps(cls.create)
        def wrapper(*args: typing.Any, **kwargs: typing.Any) -> uuid.UUID:
            try:
                return cls.create(*args, **kwargs)
            except FernHTTPException as e:
                logging.getLogger(f"{cls.__module__}.{cls.__name__}").warn(
                    f"Endpoint 'create' unexpectedly threw {e.__class__.__name__}. "
                    + f"If this was intentional, please add {e.__class__.__name__} to "
                    + "the endpoint's errors list in your Fern Definition."
                )
                raise e

        # this is necessary for FastAPI to find forward-ref'ed type hints.
        # https://github.com/tiangolo/fastapi/pull/5077
        wrapper.__globals__.update(cls.create.__globals__)

        router.post(
            path="/payment",
            response_model=uuid.UUID,
            description=AbstractPaymentService.create.__doc__,
            **get_route_args(cls.create, default_tag="payment"),
        )(wrapper)

    @classmethod
    def __init_delete(cls, router: fastapi.APIRouter) -> None:
        endpoint_function = inspect.signature(cls.delete)
        new_parameters: typing.List[inspect.Parameter] = []
        for index, (parameter_name, parameter) in enumerate(endpoint_function.parameters.items()):
            if index == 0:
                new_parameters.append(parameter.replace(default=fastapi.Depends(cls)))
            elif parameter_name == "payment_id":
                new_parameters.append(parameter.replace(default=fastapi.Path(...)))
            elif parameter_name == "auth":
                new_parameters.append(parameter.replace(default=fastapi.Depends(FernAuth)))
            else:
                new_parameters.append(parameter)
        setattr(cls.delete, "__signature__", endpoint_function.replace(parameters=new_parameters))

        @functools.wraps(cls.delete)
        def wrapper(*args: typing.Any, **kwargs: typing.Any) -> None:
            try:
                return cls.delete(*args, **kwargs)
            except FernHTTPException as e:
                logging.getLogger(f"{cls.__module__}.{cls.__name__}").warn(
                    f"Endpoint 'delete' unexpectedly threw {e.__class__.__name__}. "
                    + f"If this was intentional, please add {e.__class__.__name__} to "
                    + "the endpoint's errors list in your Fern Definition."
                )
                raise e

        # this is necessary for FastAPI to find forward-ref'ed type hints.
        # https://github.com/tiangolo/fastapi/pull/5077
        wrapper.__globals__.update(cls.delete.__globals__)

        router.delete(
            path="/payment/{payment_id}",
            response_model=None,
            status_code=starlette.status.HTTP_204_NO_CONTENT,
            description=AbstractPaymentService.delete.__doc__,
            **get_route_args(cls.delete, default_tag="payment"),
        )(wrapper)