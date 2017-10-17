package by.tc.task01.filecreator;

public class FileCreateException extends Exception {
    FileCreateException() {

    }

    FileCreateException(String message) {
        super(message);
    }

    FileCreateException(Throwable th) {
        super(th);
    }

    FileCreateException(String message, Throwable th) {
        super(message, th);
    }
}
