public interface Handler {

    void setNextHandler(Handler nextHandler);

    void process(File file);

    default void passToNextHandler(File file, Handler nextHandler) {
        if (nextHandler != null) {
            nextHandler.process(file);
        } else {
            System.out.println("File format not supported: " + file.getFileName());
        }
    }
}
