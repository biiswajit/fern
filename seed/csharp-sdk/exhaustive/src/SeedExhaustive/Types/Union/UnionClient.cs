using SeedExhaustive;

namespace SeedExhaustive.Types;

public class UnionClient
{
    private RawClient _client;

    public UnionClient(RawClient client)
    {
        _client = client;
    }
}