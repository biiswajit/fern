/**
 * This file was auto-generated by Fern from our API Definition.
 */

/**
 * @example
 *     SeedObjectsWithImports.FileInfo.Regular
 *
 * @example
 *     SeedObjectsWithImports.FileInfo.Directory
 */
export type FileInfo =
    /**
     * A regular file (e.g. foo.txt). */
    | "REGULAR"
    /**
     * A directory (e.g. foo/). */
    | "DIRECTORY";
export const FileInfo = {
    Regular: "REGULAR",
    Directory: "DIRECTORY",
} as const;
