package entities.exception;

import java.io.Serial;

public class bException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public bException(String msg) {
        super(msg);
    }
}
