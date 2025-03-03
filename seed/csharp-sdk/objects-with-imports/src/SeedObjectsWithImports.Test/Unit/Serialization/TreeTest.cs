using System.Text.Json;
using System.Text.Json.Serialization;
using FluentAssertions.Json;
using Newtonsoft.Json.Linq;
using NUnit.Framework;
using SeedObjectsWithImports;

namespace SeedObjectsWithImports.Test;

[TestFixture]
public class TreeTest
{
    [Test]
    public void TestSerialization()
    {
        var inputJson =
            @"
        {
          ""nodes"": [
            {
              ""id"": ""node-8dvgfja2"",
              ""label"": ""left"",
              ""metadata"": {
                ""id"": ""metadata-kjasf923"",
                ""data"": {
                  ""foo"": ""bar"",
                  ""baz"": ""qux""
                }
              }
            },
            {
              ""id"": ""node-cwda9fi2x"",
              ""label"": ""right"",
              ""metadata"": {
                ""id"": ""metadata-lkasdfv9j"",
                ""data"": {
                  ""one"": ""two"",
                  ""three"": ""four""
                }
              }
            }
          ]
        }
        ";

        var serializerOptions = new JsonSerializerOptions
        {
            DefaultIgnoreCondition = JsonIgnoreCondition.WhenWritingNull,
        };

        var deserializedObject = JsonSerializer.Deserialize<Tree>(inputJson, serializerOptions);

        var serializedJson = JsonSerializer.Serialize(deserializedObject, serializerOptions);

        JToken.Parse(inputJson).Should().BeEquivalentTo(JToken.Parse(serializedJson));
    }
}
