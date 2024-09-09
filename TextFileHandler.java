public class TextFileHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void process(File file) {
        if (file.getFileType().equalsIgnoreCase("txt")) {
            System.out.println("Processing and saving text file: " + file.getFileName());
        } else {
            passToNextHandler(file, nextHandler);
        }
    }
}
