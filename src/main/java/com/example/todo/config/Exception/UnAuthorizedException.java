package com.example.todo.config.Exception;

public class UnAuthorizedException extends IllegalArgumentException {
    private static final String MESSAGE = "접근 권한이 없습니다.";
    public UnAuthorizedException() {
        super(MESSAGE);
    }
}
