package org.labmonkeys.apiserver.dto;

import java.util.UUID;

public record MessageDto(UUID messageId, String message){}
