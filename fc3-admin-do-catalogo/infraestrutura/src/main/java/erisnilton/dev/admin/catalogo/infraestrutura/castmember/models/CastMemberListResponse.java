package erisnilton.dev.admin.catalogo.infraestrutura.castmember.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CastMemberListResponse(
        @JsonProperty("id") String id,
        @JsonProperty("name") String name,
        @JsonProperty("type") String type,
        @JsonProperty("created_at") String createdAt
) {
}