public class DocFileHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void process(File file) {
        if (file.getFileType().equalsIgnoreCase("doc")) {
            System.out.println("Processing and saving doc file: " + file.getFileName());
        } else {
            passToNextHandler(file, nextHandler);
        }
    }
}
