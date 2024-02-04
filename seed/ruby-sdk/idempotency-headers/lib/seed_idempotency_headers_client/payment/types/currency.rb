# frozen_string_literal: true

module SeedIdempotencyHeadersClient
  module Payment
    # @type [Hash{String => String}]
    CURRENCY = { usd: "USD", yen: "YEN" }.frozen
  end
end