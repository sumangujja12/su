package generic;

import java.sql.Timestamp;

public class TestTimeStamp {

	public String getTimeStamp()  {
		
        Long datetime = System.currentTimeMillis();
        Timestamp ts1 = new Timestamp(datetime);
        System.out.println("Current Time Stamp: "+ts1);
        String str=ts1.toString();  
        System.out.println("New Timespan : "+str);
		return str;  
        
    }
}
