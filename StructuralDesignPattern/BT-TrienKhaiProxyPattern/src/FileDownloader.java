import java.net.URLConnection;

public class FileDownloader implements Downloader {
    private String url;

    public  FileDownloader(String url){
        this.url=url;
        System.out.println("File loaded: "+ this.url);
    }
    @Override
    public void download() {
        URLConnection
    }
}
