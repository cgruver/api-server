package org.labmonkeys.apiserver.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class MessageDto {
    UUID messageId;
    String message;
}
