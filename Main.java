public class Main {
    public static void main(String[] args) {
        // Create the chain of handlers
        Handler textHandler = new TextFileHandler();
        Handler docHandler = new DocFileHandler();
        Handler imageHandler = new ImageFileHandler();

        // Setting up the chain
        textHandler.setNextHandler(docHandler);
        docHandler.setNextHandler(imageHandler);

        // Create some files and process them
        File file1 = new File("example.txt", "txt");
        File file2 = new File("example.doc", "doc");
        File file3 = new File("example.jpg", "jpg");
        File file4 = new File("example.pdf", "pdf"); // Unsupported file

        // Process files through the chain
        textHandler.process(file1);
        textHandler.process(file2);
        textHandler.process(file3);
        textHandler.process(file4); // This file will not be supported
    }
}
