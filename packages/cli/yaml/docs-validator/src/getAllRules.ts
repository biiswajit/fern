import { Rule } from "./Rule";
import { AccentColorContrastRule } from "./rules/accent-color-contrast";
import { AllRolesMustBeDeclaredRule } from "./rules/all-roles-must-be-declared";
import { FilepathsExistRule } from "./rules/filepaths-exist";
import { OnlyVersionedNavigation } from "./rules/only-versioned-navigation";
import { PlaygroundEnvironmentsExistRule } from "./rules/playground-environments-exist";
import { ValidDocsEndpoints } from "./rules/valid-docs-endpoints";
import { ValidFileTypes } from "./rules/valid-file-types";
import { ValidMarkdownLinks } from "./rules/valid-markdown-link";
import { ValidateVersionFileRule } from "./rules/validate-version-file";

export function getAllRules(): Rule[] {
    return [
        FilepathsExistRule,
        OnlyVersionedNavigation,
        ValidateVersionFileRule,
        AccentColorContrastRule,
        ValidMarkdownLinks,
        ValidFileTypes,
        PlaygroundEnvironmentsExistRule,
        ValidDocsEndpoints,
        AllRolesMustBeDeclaredRule
    ];
}
