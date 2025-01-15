package org.koreait.board.exceptions;

import org.koreait.global.exceptions.scripts.AlertException;
import org.springframework.http.HttpStatus;

public class CommentNotFoundException extends AlertException {
    public CommentNotFoundException() {
        super("NotFound.comment", HttpStatus.NOT_FOUND);
        setErrorCode(true);
    }
}
