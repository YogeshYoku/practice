package hello;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;

public class Files {
	
	
	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\orton\\eclipse-workspace\\Hello\\yogesh\\hai.feature");
		boolean mkdir = file.mkdir();
		System.out.println(mkdir);
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
		String[] list = file.list();
		System.out.println(list);
		boolean exists = file.exists();
		System.out.println(exists);
		File[] listFiles = file.listFiles();
		System.out.println(listFiles);
		
		for (File file2 : listFiles) {
file.getName().equals(listFiles);	
System.out.println("File is Created");
break;
}
StringSelection selection=new StringSelection("file path");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

	
	}

}
