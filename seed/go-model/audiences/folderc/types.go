// This file was auto-generated by Fern from our API Definition.

package folderc

import (
	fmt "fmt"
	core "github.com/audiences/fern/core"
	uuid "github.com/google/uuid"
)

type Foo struct {
	BarProperty uuid.UUID `json:"bar_property" url:"bar_property"`
}

func (f *Foo) String() string {
	if value, err := core.StringifyJSON(f); err == nil {
		return value
	}
	return fmt.Sprintf("%#v", f)
}