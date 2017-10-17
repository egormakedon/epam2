package by.tc.task01.filecreator;

public class FileExistException extends Exception {
    FileExistException() {

    }

    FileExistException(String message) {
        super(message);
    }

    FileExistException(Throwable th) {
        super(th);
    }

    FileExistException(String message, Throwable th) {
        super(message, th);
    }
}
