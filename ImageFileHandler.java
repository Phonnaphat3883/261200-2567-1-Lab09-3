public class ImageFileHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void process(File file) {
        if (file.getFileType().equalsIgnoreCase("jpg")) {
            System.out.println("Processing and saving image file: " + file.getFileName());
        } else {
            passToNextHandler(file, nextHandler);
        }
    }
}
