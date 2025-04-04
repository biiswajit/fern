/**
 * This file was auto-generated by Fern from our API Definition.
 */

import express from "express";
import { UserService } from "./api/resources/user/service/UserService";

export function register(
    expressApp: express.Express | express.Router,
    services: {
        user: UserService;
    },
): void {
    (expressApp as any).use("/", services.user.toRouter());
}
