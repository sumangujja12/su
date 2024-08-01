package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfile {
public static Properties Propertiesfileload() throws IOException
{
	File f=new File("../WIDEAPI/Environment.properties");
	FileInputStream fi=new FileInputStream(f);
	Properties pr=new Properties();
	pr.load(fi);
	return pr;
}
}
