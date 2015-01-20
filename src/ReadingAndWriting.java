import java.io.File;
import javax.swing.JFileChooser;

//Program koji koiristi JFileChooser za pisanje i èitanje filea.
//Napisan je "univerzalni" path, koji æe raditi na bilo kojem operativnom sistemu.

public class ReadingAndWriting {
	
public static void main(String[] args) {
		
		JFileChooser filePicker = new JFileChooser();
		String homeDir = System.getProperty("user.home");
		String path = homeDir + File.separator + "Documents" + File.separator + "workspace";
		filePicker.setCurrentDirectory(new File(path));
		int open = filePicker.showOpenDialog(filePicker);
		if (open != filePicker.APPROVE_OPTION)
		{
			filePicker.showOpenDialog(filePicker);
		}
		filePicker.showSaveDialog(filePicker);

	}
}
