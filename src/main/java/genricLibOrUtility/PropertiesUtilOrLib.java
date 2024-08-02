package genricLibOrUtility;
import java.io.FileInputStream;
import java.util.Properties;
/**
 * this is generic class to read data from properties file
 * @author Aniruddha Das
 * @version 7.1.24
 */
public class PropertiesUtilOrLib {
	/**
	 * this is a generic method to read data from properties file
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public String getDataFromProperties(String data) throws Exception {
		FileInputStream fis = new FileInputStream(IconstantUtility.propertiesPath);
		Properties pobj = new Properties();
		pobj.load(fis);
		String info = pobj.getProperty(data);
		return info;
	}
}
