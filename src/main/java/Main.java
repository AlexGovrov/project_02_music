import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.UnsupportedTagException;
import service.FileService;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InvalidDataException, UnsupportedTagException {
        String path = "D:\\Моя музыка\\2015_Oxxxymiron_Gorgorod";
        System.out.println(path);
        FileService fileService = new FileService(path);
        fileService.parseDirectories();
        fileService.genHTML(path,"task 1");
        fileService.genDuplHTMLList(path,"task 2");
        fileService.geneDupSongInflList(path,"task 3");
    }
}