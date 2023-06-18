package in.stackroute.dto;

import org.springframework.http.HttpStatus;

public record ResponseDto(HttpStatus status, String message) {
}
